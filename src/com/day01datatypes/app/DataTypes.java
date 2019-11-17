package com.day01datatypes.app;

import java.util.Scanner;

/*
 * HackerRank 30 Days of Code
 * ========== Day 01 Data Type ===========
 * You must:
 * 1. Declare 3 variables: one of type int, one of type double, and one of type String.
 * 2. Read 3 lines of input from stdin (according to the sequence given in the input Format sections below) and initialize your 3 variables.
 * 3. Use the + operator to perform the following operations:
 *		1. Print the sum of i plus your int variable on a new line
 *		2. Print the sum of d plus your double variable to a scale of one decimal place on a new line
 *		3. Concatenate s with the string you read as input and print the result on a new line.
 * Input Format
 * - The first line contains an integer that you must sum with i.
 * - The second line contains a double that you must sum with d.
 * - The third line contains a string that you must concatenate with s.
 */
public class DataTypes {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		
		Scanner scan = new Scanner(System.in);
		
		int inputInteger = 0;
		double inputDouble = 0;
		String inputString = "";
		System.out.print("Input your integer: ");
		inputInteger = scan.nextInt();
		System.out.print("Input your double: ");
		inputDouble = scan.nextDouble();
		System.out.print("Input your String: ");
		scan.nextLine();
		inputString = scan.nextLine();
		scan.close();
		System.out.println(i + inputInteger);
		System.out.println(d + inputDouble);
		System.out.println(s + inputString);	
	}
}
