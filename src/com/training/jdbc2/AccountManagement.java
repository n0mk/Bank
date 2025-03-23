package com.training.jdbc2;


import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class AccountManagement {

    private Connection connect() {
        Connection conn = null;
        try {
            Properties props = new Properties();
            FileInputStream input = new FileInputStream("db.properties");
            props.load(input);
            String url = props.getProperty("db.url");
            String username = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return conn;
    }

    // Create Account
    public void createAccount(String accountHolder, double balance) {
        String sql = "INSERT INTO bank_account (account_holder, balance) VALUES (?, ?)";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, accountHolder);
            pstmt.setDouble(2, balance);
            pstmt.executeUpdate();
            System.out.println("Account Created Successfully!");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Deposit Money
    public void deposit(int accountId, double amount) {
        String sql = "UPDATE bank_account SET balance = balance + ? WHERE account_id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, amount);
            pstmt.setInt(2, accountId);
            int rows = pstmt.executeUpdate();
            if (rows > 0) System.out.println("Deposit Successful!");
            else System.out.println("Account Not Found.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Withdraw Money
    public void withdraw(int accountId, double amount) {
        String checkBalanceSql = "SELECT balance FROM bank_account WHERE account_id = ?";
        String updateSql = "UPDATE bank_account SET balance = balance - ? WHERE account_id = ?";
        try (Connection conn = connect(); 
             PreparedStatement checkStmt = conn.prepareStatement(checkBalanceSql);
             PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {

            checkStmt.setInt(1, accountId);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getDouble("balance") >= amount) {
                updateStmt.setDouble(1, amount);
                updateStmt.setInt(2, accountId);
                updateStmt.executeUpdate();
                System.out.println("Withdrawal Successful!");
            } else {
                System.out.println("Insufficient Balance!");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Transfer Funds
    public void transferFunds(int fromAccount, int toAccount, double amount) {
        try (Connection conn = connect()) {
            conn.setAutoCommit(false);

            // Check balance
            String checkBalanceSql = "SELECT balance FROM bank_account WHERE account_id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkBalanceSql);
            checkStmt.setInt(1, fromAccount);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getDouble("balance") >= amount) {
                // Deduct from sender
                String deductSql = "UPDATE bank_account SET balance = balance - ? WHERE account_id = ?";
                PreparedStatement deductStmt = conn.prepareStatement(deductSql);
                deductStmt.setDouble(1, amount);
                deductStmt.setInt(2, fromAccount);
                deductStmt.executeUpdate();

                // Add to receiver
                String addSql = "UPDATE bank_account SET balance = balance + ? WHERE account_id = ?";
                PreparedStatement addStmt = conn.prepareStatement(addSql);
                addStmt.setDouble(1, amount);
                addStmt.setInt(2, toAccount);
                addStmt.executeUpdate();

                conn.commit();
                System.out.println("Transfer Successful!");
            } else {
                System.out.println("Insufficient Balance!");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Check Balance
    public void checkBalance(int accountId) {
        String sql = "SELECT balance FROM bank_account WHERE account_id = ?";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, accountId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("Account Balance: $" + rs.getDouble("balance"));
            } else {
                System.out.println("Account Not Found.");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
