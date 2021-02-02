package com.Computer_v1;

public class Variable {
	public int pow;
	public double mult;

	public Variable() {
		this.mult = 0;
		this.pow = 0;
	}

	public Variable(int pow, double mult) {
		this.pow = pow;
		this.mult = mult;
	}

	@Override
	public String toString() {
		if (this.mult == (long)this.mult) {
			if ((long)this.mult < 0) {
				if (this.pow == 0)
					return ("- " + (long)this.mult * -1 + " * X^" + this.pow);
				else {
					return (" - " + (long)this.mult * -1 + " * X^" + this.pow);
				}
			}
			else {
				return ((long)this.mult + " * X^" + this.pow);
			}
		} else {
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
}
