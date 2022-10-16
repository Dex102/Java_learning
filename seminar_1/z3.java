import java.util.Scanner;
public class z3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number one ");
        int number1 = scan.nextInt();
        System.out.print("Input arithmetic operation ");
        String oper = scan.next();
        System.out.print("Input number two ");
        int number2 = scan.nextInt();

        switch(oper) {
            case "+": System.out.printf("%d + %d = %d", number1, number2, number1 + number2);
            break;
            case "-": System.out.printf("%d - %d = %d", number1, number2, number1 - number2);
            break;
            case "*": System.out.printf("%d * %d = %d", number1, number2, number1 * number2);
            break;
            case "/": System.out.printf("%d / %d = %d", number1, number2, number1 / number2);
            break;
        }
        
        scan.close();
    } 
}
