//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
public class z3 {

    public static boolean reverse(String str) {
        return str.toLowerCase().replaceAll("\\W","")
        .equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) {
        System.out.println(reverse("abba"));
    }
}
