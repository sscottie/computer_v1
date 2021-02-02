package com.Computer_v1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
	public Variable[] expression;
	int polynomialDegree;

	public Expression(String arg) {
		int max_pow = 0;
		Pattern pattern = Pattern.compile("\\^(\\d+)");
		Matcher matcher = pattern.matcher(arg);
		while (matcher.find()) {
			int buf = Integer.parseInt(matcher.group(1));
			if (buf > max_pow) {
				max_pow = buf;
			}
		}
		this.polynomialDegree = max_pow;
		this.expression = new Variable[max_pow + 1];
	}

	public void parse_left(String args) {
		Pattern pattern = Pattern.compile("(-?\\d+(?:\\.\\d+)?)\\*X\\^(\\d+)");
		Matcher matcher = pattern.matcher(args);
		while (matcher.find()) {
			Variable buf = new Variable(Integer.parseInt(matcher.group(2)), Double.parseDouble(matcher.group(1)));
			add_left(Integer.parseInt(matcher.group(2)), buf);
//			System.out.println(args.substring(matcher.start(), matcher.end())
//					+ " ; mult = "
//					+ matcher.group(1)
//					+ " ; pow = "
//					+ matcher.group(2));
		}
	}

	public void parse_right(String args) {
		Pattern pattern = Pattern.compile("(-?\\d+(?:\\.\\d+)?)\\*X\\^(\\d+)");
		Matcher matcher = pattern.matcher(args);
		while (matcher.find()) {
			Variable buf = new Variable(Integer.parseInt(matcher.group(2)), Double.parseDouble(matcher.group(1)));
			add_right(Integer.parseInt(matcher.group(2)), buf);
		}
	}

	public void formatedPrint() {
		System.out.print("Reduced form: ");
		for (int i = 0; i < this.expression.length; i++) {
			if (expression[i].pow != 0 && expression[i].mult >= 0) {
				System.out.print(" + ");
			}
			System.out.print(expression[i]);
		}
		System.out.println(" = 0");
		System.out.println("Polynomial Degree: " + this.polynomialDegree);
	}

	public void add_left(int index, Variable var) {
		try {
			expression[var.pow].mult += var.mult;
		} catch (NullPointerException e) {
			expression[var.pow] = var;
		}

	}

	public void add_right(int index, Variable var) {
		try {
			expression[var.pow].mult -= var.mult;
		} catch (NullPointerException e) {
			expression[var.pow] = var;
		}
	}
}
