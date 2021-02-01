package com.computer;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression extends ArrayList<Variable> {
	public ArrayList<Variable> expression;
	private int size;

	public Expression() {
		this.expression = new ArrayList<Variable>();
	}

	public void parse(String args) {
		Pattern pattern = Pattern.compile("(-?\\d+(?:\\.\\d+)?)\\*X\\^(\\d+)");
		Matcher matcher = pattern.matcher(args);
		while (matcher.find()) {
			expression.add(Integer.parseInt(matcher.group(2)),
					new Variable(Integer.parseInt(matcher.group(2)), Double.parseDouble(matcher.group(1))));
			System.out.println(args.substring(matcher.start(), matcher.end())
					+ " ; mult = "
					+ matcher.group(1)
					+ " ; pow = "
					+ matcher.group(2));
		}
	}

	public void formatedPrint() {
		for (Variable vars : this.expression) {
			if (vars.pow != 0 && vars.mult >= 0) {
				System.out.print(" + ");
			}
			System.out.print(vars);
		}
		System.out.println(" = 0");
	}

	@Override
	public void add(int index, Variable element) {
		try {
			expression.get(index);
			expression.get(index).mult -= element.mult;
		} catch (Exception e) {
			super.add(index, element);
		}
	}
}
