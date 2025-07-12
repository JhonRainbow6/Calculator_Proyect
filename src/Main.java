import java.util.Scanner;

public class Main {
    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;

        System.out.print("Number1: ");
        num1 = scanner.nextDouble();

        System.out.print("Operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Number2: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2==0){
                    System.out.println("error");
                }
                else
                    result= num1 / num2;
            }
            case '^' -> result = Math.pow (num1, num2);
        }

        System.out.println(result);

        scanner.close();
    }
}
