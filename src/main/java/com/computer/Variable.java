package com.computer;

public class Variable {
	public int pow;
	public double mult;

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
		if (this.mult < 0) {
			if (this.pow == 0)
				return ("- " + this.mult * -1 + " * X^" + this.pow);
			else {
				return (" - " + this.mult * -1 + " * X^" + this.pow);
			}
		}
		else {
			return (this.mult + " * X^" + this.pow);
		}
	}
}
