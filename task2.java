/*
Вывести все простые числа от 1 до 1000 
*/

public class task2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i+=2){
            // System.out.println(i);
            int count = 0;
            for (int j = 3; j <= i - 2; j +=2) {
                double modulo = i % j;
                // System.out.println(modulo);
                
            if (modulo == 0)
                count++;
                // System.out.println(count);
            }
            if (count == 0)
                System.out.println(i);
                    // System.out.println(modulo);

                
            }
        }
    }
