import java.util.Scanner;

/*
Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
 */

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-e число:");
        int number_1 = sc.nextInt();
        System.out.println("Введите знак :");
        char sign = sc.next().charAt(0);
        System.out.println("Введите 2-e число:");
        int number_2 = sc.nextInt();
        sc.close();
        int res = 0;
        if (sign == '+') res = number_1 + number_2;
        if (sign == '-') res = number_1 - number_2;
        if (sign == '*') res = number_1 * number_2;
        if (sign == '/') res = number_1 / number_2;
        
        System.out.printf("%d %c %d = %d", number_1, sign, number_2, res);
    }
}
