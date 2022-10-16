import java.util.Scanner;
public class z1 {  
    public static void main(String[] args) {
        int s = 0;
        int pr = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input N ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            s += i;
            pr *= i;
        }

        System.out.printf("Sum = %d\nFactorial = %d", s, pr);
        scan.close();
    }
}
