package com.Computer_v1;

public class Solver {
    Expression expression;

    public Solver(Expression expression) {
        this.expression = expression;
        if (expression.polynomialDegree == 1 && expression.expression[1].mult != 0) {
            solveLinear();
        } else if (expression.polynomialDegree == 2) {
            solveParabola();
        } else if (expression.polynomialDegree == 3) {
			solveCube();
        } else {
            System.out.println("It cannot solve higher degree yet or Division by zero exception");
        }
    }

    private void solveLinear() {
        System.out.println("The solution is:");
        System.out.println((expression.expression[0].mult * -1) / expression.expression[1].mult);
    }

    private void solveParabola() {
        double d = (expression.expression[1].mult * expression.expression[1].mult) - (4 * (expression.expression[2].mult * expression.expression[0].mult));
        if (d > 0) {
            System.out.println("Discriminant is strictly positive, the two solutions are:");
            System.out.println(((expression.expression[1].mult * -1) + Math.sqrt(d)) / (expression.expression[0].mult * 2));
            System.out.println(((expression.expression[1].mult * -1) - Math.sqrt(d)) / (expression.expression[0].mult * 2));
        } else if (d == 0) {
            System.out.println("The solution is:");
            System.out.println((expression.expression[1].mult * -1) / (expression.expression[0].mult * 2));
        } else {
            System.out.println("There is no solution");
        }
    }

    private void solveCube() {
		for (int x = -100; x <= 100; x++) {
			double result = expression.expression[3].mult * Math.pow(x, 3) + expression.expression[2].mult * x * x + expression.expression[1].mult * x + expression.expression[0].mult;
			if (result == 0){
				System.out.println(x);
			}
		}
	}

}
