package calculator;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private     List <Double> results = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public double calculate(double number1, char operator, double number2) throws ArithmeticException {
        if (results.isEmpty()) {
            if (operator == '+') {
                results.add(number1 + number2);
                return number1 + number2;
            } else if (operator == '-') {
                results.add(number1 + number2);
                return number1 + number2;
            } else if (operator == '*') {
                results.add(number1 * number2);
                return number1 * number2;
            } else {
                if (number2 == 0) {
                    throw new ArithmeticException();
                }
                results.add(number1 / number2);
                return number1 / number2;
            }
        } else {
            int lastIndex = results.size() - 1;
            if (operator == '+') {
                results.add(results.get(lastIndex) + number2);
                return results.get(lastIndex) + number2;
            } else if (operator == '-') {
                results.add(results.get(lastIndex) - number2);
                return results.get(lastIndex) - number2;
            } else if (operator == '*') {
                results.add(results.get(lastIndex) * number2);
                return results.get(lastIndex) * number2;
            } else {
                if (number2 == 0) {
                    throw new ArithmeticException();
                }
                results.add(results.get(lastIndex) / number2);
                return results.get(lastIndex) / number2;
            }
        }
    }

    public void printResult() {
        while (true) {
            System.out.println("몇 번째 연산을 조회 하시겠습니까? back 입력시 접근 진행 창으로");
            String index = scanner.next();

            if (index.equals("back")) {
                break;
            } else {
                try {
                    int indexNumber = Integer.parseInt(index) - 1;
                    double searchResult = results.get(indexNumber);
                    System.out.println("조회 결과 : " + searchResult);
                    break;
                } catch (Exception e) {
                    System.out.println("잘못된 입력입니다.");
                }
            }
        }
    }

    public void setResult() {
        while (true) {
            System.out.println("몇 번째 연산을 수정 하시겠습니까? back 입력 시 접근 진행 창으로");
            String index = scanner.next();

            if (index.equals("back")) {
                break;
            } else {
                while (true) {
                    try {
                        int indexNumber = Integer.parseInt(index) - 1;
                        System.out.println("수정 정보를 입력하세요. (back 입력 시 접근 진행 창으로)");
                        String value = scanner.next();
                        if (index.equals("back")) {
                            break;
                        } else {
                            try {
                                double correctionValue = Double.parseDouble(value);
                                results.set(indexNumber, correctionValue);
                                System.out.println("수정이 완료되었습니다.");
                                return;
                            } catch (Exception e) {
                                System.out.println("잘못된 입력입니다.");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("잘못된 입력입니다.");
                    }
                }
            }
        }
    }

    public void removeResult() {
        while (true) {
            System.out.println("몇 번째 연산을 삭제 하시겠습니까? back 입력시 접근 진행 창으로");
            String delete = scanner.next();

            if (delete.equals("back")) {
                break;
            } else {
                try {
                    int deleteIndexNumber = Integer.parseInt(delete) - 1;
                    results.remove(deleteIndexNumber);
                    System.out.println("삭제가 완료되었습니다.");
                    return;
                } catch (Exception e) {
                    System.out.println("잘못된 입력입니다.");
                }
            }
        }
    }

    void clearResult() {
        results.clear();
    }
}

