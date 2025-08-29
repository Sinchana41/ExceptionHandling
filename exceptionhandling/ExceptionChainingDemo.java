package com.exceptionhandling;

import java.io.*;

public class ExceptionChainingDemo {

	//Problem 8: Exception Chaining

	// Method that simulates file reading and throws chained exception
	public static void readFile(String fileName) throws Exception {
		try {
			// Trying to read a non-existent file to force IOException
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			br.close();
		} catch (IOException e) {
			// Wrapping IOException inside a new Exception (chaining)
			throw new Exception("Failed to read file: " + fileName, e);
		}
	}

	public static void main(String[] args) {
		try {
			readFile("non_existing_file.txt"); // file does not exist
		} catch (Exception e) {
			// Print the top-level exception
			System.out.println("Caught Exception: " + e.getMessage());

			// Print the original cause (IOException)
			System.out.println("Cause: " + e.getCause());
		}
	}
}
