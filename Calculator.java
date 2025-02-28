package calculator;

public class Calculator {
    //속성
    double result;

//생성자

    //기능 더하기 빼기 곱하기 나누기

    public double sum(double nuber1, double number2) {
        this.result = nuber1 + number2;
        return this.result;
    }

    public double sub(double nuber1, double number2) {
        this.result = nuber1 - number2;
        return this.result;
    }

    public double mul(double nuber1, double number2) {
        this.result = nuber1 * number2;
        return this.result;
    }

    public double div(double nuber1, double number2) {
        this.result = nuber1 / number2;
        return this.result;
    }

    public double getResult() {
        return this.result;
    }
}