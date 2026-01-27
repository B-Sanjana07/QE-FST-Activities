package com.example;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);  // Pass message to Exception class
    }
}
public class Activity8 {
     public static void exceptionTest(String str) throws CustomException {
        if (str == null) {
            throw new CustomException("Error: String value is null!");
        } else {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        try {
            exceptionTest("Will print to console");
            exceptionTest(null);

        } catch (CustomException e) {
    
            System.out.println(e.getMessage());
        }
    }
}


