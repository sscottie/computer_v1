package com.computer;

public class Variable {
	private int pow;
	private double mult;

	public Variable() {
		this.mult = 1.0;
		this.pow = 1;
	}

	public Variable(int pow, double mult) {
		this.pow = pow;
		this.mult = mult;
	}

	@Override
	public String toString() {
		return (this.mult + " * X ^ " + this.pow);
	}
}
