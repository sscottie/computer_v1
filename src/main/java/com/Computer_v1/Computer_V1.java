package com.Computer_v1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Computer_V1 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("./usage");
			return;
		}
		if (args.length == 1) {
			Expression expression = new Expression(args[0]);
			String[] expression_parts = args[0].split(" = ");
			expression.parse_left(expression_parts[0].replace(" ", ""));
			expression.parse_right(expression_parts[1].replace(" ", ""));
			expression.formatedPrint();
			Solver solver = new Solver(expression);
			return;
		}
	}
}
