package com.computer;

public class Computer_V1 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("./usage");
			return ;
		}
		if (args.length == 1) {
			Expression expression = new Expression();
			String[] expression_parts = args[0].split(" = ");
			expression.parse(expression_parts[0].replace(" ", ""));
			expression.parse(expression_parts[1].replace(" ", ""));
			expression.formatedPrint();
			return ;
		}
	}
}
