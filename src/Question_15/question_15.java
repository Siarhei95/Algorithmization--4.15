package Question_15;

import java.util.Scanner;

public class question_15 {

    static void searchIncreasingNumbers(int n){//Находим все натуральные n-знач. числа, цифры в которых возрастающую последовательность
        System.out.println("Natural "+n+"-digit numbers, the numbers in which form a strictly increasing sequence: ");
        for(int j = 1; j<=10; j++){
            if(j+n-1<=10){
                for(int i = 1; i<=n; i++){
                    System.out.print(j+i-1);
                }
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: "); //определяет n-значность чисел
        int n = scanner.nextInt();
        searchIncreasingNumbers(n);
    }
}





