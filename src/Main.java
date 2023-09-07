import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
      /*  System.out.print("1) "); //Random из лекции
        int n = 10;
        int[] array = new int[n];
           Random rand = new Random();

        for(int i=0; i<n; i++)
        {
            array[i]=rand.nextInt(n);
            for (int j=0; j<i; j++)
            {
                if (array[i]==array[j])
                {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        //остальную часть кода не успела написать.

       */

        System.out.print("2)");
        Scanner kb = new Scanner(System.in);
        System.out.print(" Введите десятичное число: ");
        int decimal = kb.nextInt();
        int i = 0;
        char[] hexadecimal = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexdecnum= "";

        while(decimal>0) {
            i = decimal %16;
            decimal /=16;
            hexdecnum =  hexadecimal[i] + hexdecnum;
        }
            System.out.print(hexdecnum);
    }
}
