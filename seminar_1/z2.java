public class z2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean check = i > 2;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
        if (check) System.out.println(i);
        }
    }
}


