package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");

        try {
            double numberA = scanner.nextDouble();
            while (true) {
                System.out.print("사칙연산 기호를 입력하세요(exit 입력 시 종료): ");

                String text = scanner.next();

                if (text.equals("exit")) {
                    break;
                } else if (
                        text.equals("+") || text.equals("-") || text.equals("*") || text.equals("/")) {

                    char operator = text.charAt(0);
                    System.out.print("숫자를 입력하세요(exit 입력 시 종료): ");
                    String textNumberB = scanner.next();

                    if (textNumberB.equals("exit")) {
                        break;
                    } else {
                        try {
                            double numberB = Double.parseDouble(textNumberB);

                            switch (operator) {
                                case '+':
                                    numberA += numberB;
                                    System.out.println("result : " + numberA);
                                    break;
                                case '-':
                                    numberA -= numberB;
                                    System.out.println("result : " + numberA);
                                    break;
                                case '*':
                                    numberA *= numberB;
                                    System.out.println("result : " + numberA);
                                    break;
                                case '/':
                                    if (numberB == 0) {
                                        System.out.println("0 이외에 다른 수를 다시 입력하세요");
                                        continue;
                                    } else {
                                        numberA /= numberB;
                                        System.out.println("result : " + numberA);
                                        break;
                                    }
                            }
                        } catch (Exception e) {
                            System.out.println("올바르지 않은 입력입니다.");
                            continue;
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

