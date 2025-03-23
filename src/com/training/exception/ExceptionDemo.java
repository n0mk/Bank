package com.training.exception;

import java.util.InputMismatchException;

public class ExceptionDemo { 
    public static void main(String[] args) throws InputMismatchException {  
        // This method declares that it may throw an InputMismatchException.
        // However, since we are handling exceptions within the try-catch block,
        // this declaration is not strictly necessary but can be useful for informing callers.

        int i = 5;
        int j = 2; 
        int age = 16;
        int result = 0;

        // If j is 0, this will cause ArithmeticException, so it will enter the first catch block.
        // If there is a number, it will skip this catch block. If there is no exception, 
        // it will not enter any catch block, but the finally block will always execute.

    //    try { 
    //        if (j == 0) // When j is 0, this will throw a NumberFormatException.
    //            throw new NumberFormatException(); 

    //        result = i / j;  // This may cause ArithmeticException
    //    } 

        try { 
            if (age < 18) 
                throw new MinimumAgeException("Age should be less than 18"); 

            result = i / j;  // This may cause ArithmeticException
        } 
        catch (ArithmeticException e) {
            System.out.println("An Arithmetic Exception occurred!!");
        }
        catch (MinimumAgeException e) { // Properly handling MinimumAgeException
            System.out.println("Minimum Age Exception occurred: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("A Number Format Exception occurred!!");
        }
        catch (Exception e) {  // This will catch any other exceptions
            System.out.println("A general exception occurred!!");
        }
        finally {
            System.out.println("Inside the finally block.");
        }

        System.out.println("Exception handling resumes.");
    }
}
