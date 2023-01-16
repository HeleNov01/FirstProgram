import java.util.Scanner;
public class Main {
    /*public static void main(String[] args) {

        calc(21, 3, "+");

        calc(21, 3, "-");

        calc(21, 3, "/");

        calc(21, 3, "*");

        calc(21, 3, "%");
    }
    static void calc(double param1, double param2, String operation){

        double result;
        if(operation == "+"){
            result = param1 + param2;
            System.out.println("Результат операции: " + operation + " равен: " + result);

        } else if(operation == "-") {
            result = param1 - param2;
            System.out.println("Результат операции: " + operation + " равен: " + result);

        } else if(operation == "/") {
            result = param1 / param2;
            System.out.println("Результат операции: " + operation + " равен: " + result);

        } else if(operation == "*") {
            result = param1 * param2;
            System.out.println("Результат операции: " + operation + " равен: " + result);

        } else {
            System.out.println("Извините, такой операции нет");
        }*/

    public static void main(String[] args) {
        double param1;
        double param2;
        double result;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Выберите два числа: ");
        param1 = reader.nextDouble();
        param2 = reader.nextDouble();
        System.out.print("\nВыберие операцию (+, -, *, /): ");
        op = reader.next().charAt(0);

        switch(op) {
            case '+': result = param1 + param2;
                break;
            case '-': result = param1 - param2;
                break;
            case '*': result = param1 * param2;
                break;
            case '/': result = param1 / param2;
                break;
            default:  System.out.printf("Извините, такой операции нет");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(param1 + " " + op + " " + param2 + " = " + result);
    }
}

