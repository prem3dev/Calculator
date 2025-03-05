package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("숫자를 입력하세요\n(\"exit\" 입력 시 - 계산기 종료)\n입력 : ");
            String textNumberA = scanner.next();
            if (textNumberA.equals("exit")) {
                break;
            } else {
                try {
                    double numberA = Double.parseDouble(textNumberA);
                    while (true) {
                        System.out.print("사칙연산 기호를 입력하세요\n(\"clear\" 입력 시 - 초기화)\n(\"조회\" 입력 시 - 조회하기)\n(\"수정\" 입력 시 - 수정하기)\n(\"삭제\" 입력 시 - 삭제하기)\n(\"exit\" 입력 시 - 계산기 종료)\n입력 : ");

                        String textOperator = scanner.next();

                        if (textOperator.equals("clear")) {
                            calculator.clearResult();
                            break;
                        } else if (textOperator.equals("exit")) {
                            return;
                        } else if (textOperator.equals("조회")) {
                            calculator.printResult();
                        } else if (textOperator.equals("수정")) {
                            calculator.setResult();
                        } else if (textOperator.equals("삭제")) {
                            calculator.removeResult();
                        } else if (textOperator.equals("+") || textOperator.equals("-") || textOperator.equals("*") || textOperator.equals("/")) {
                            char operator = textOperator.charAt(0);
                            while (true) {
                                System.out.print("숫자를 입력하세요\n(\"back\" 입력 시 - 이전으로)\n(\"조회\" 입력 시 - 조회하기)\n(\"수정\" 입력 시 - 수정하기)\n(\"삭제\" 입력 시 - 삭제하기)\n(\"exit\" 입력 시 - 계산기 종료)\n입력 : ");
                                String textNumberB = scanner.next();

                                if (textNumberB.equals("back")) {
                                    break;
                                } else if (textNumberB.equals("exit")) {
                                    return;
                                } else if (textNumberB.equals("조회")) {
                                    calculator.printResult();
                                } else if (textNumberB.equals("수정")) {
                                    calculator.setResult();
                                } else if (textNumberB.equals("삭제")) {
                                    calculator.removeResult();
                                } else {
                                    try {
                                        double numberB = Double.parseDouble(textNumberB);
                                        try {
                                            double result = calculator.calculate(numberA, operator, numberB);
                                            System.out.println(result);
                                            ;
                                            break;
                                        } catch (ArithmeticException e) {
                                            System.out.println("0으로 나눌 수 없습니다.");
                                            continue;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("올바르지 않은 입력입니다.");
                                    }
                                }
                            }
                        } else {
                            System.out.println("올바르지않은 기호입니다.");
                            continue;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("올바르지 않은 입력입니다.");
                }
            }
        }
    }
}