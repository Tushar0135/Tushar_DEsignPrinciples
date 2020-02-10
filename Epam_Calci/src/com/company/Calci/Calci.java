package com.company.Calci;

import com.company.Operations.Operations;

public class Calci {
    private Operations operation;

    public Calci() {
        operation = new Operations();
    }

    public float opr(char operator, int a, int b) {
        switch (operator) {
            case '+':
                return this.operation.add(a, b);
            case '-':
                return this.operation.sub(a, b);
            case '*':
                return this.operation.mul(a, b);
            case '/':
                return this.operation.divide(a, b);
        }
        System.out.println("Operator not found");
        return -1;
    }
}
