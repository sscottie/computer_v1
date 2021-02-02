package com.Computer_v1;

public class Solver {
    Expression expression;

    public Solver(Expression expression) {
        this.expression = expression;
        if (expression.polynomialDegree == 1) {
            solverLinear();
        } else if (expression.polynomialDegree == 2) {
            solverParabola();
        } else {
            System.out.println("It cannot solve higher degree yet");
        }
    }

    private void solverLinear() {

    }

    private void solverParabola() {
        System.out.println("Solving");
    }

}
