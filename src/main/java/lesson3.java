import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 5;
        int max = 10;
        int num = 0;
//        do {
//            System.out.println("Enter number");
//            if (sc.hasNextInt()) {
//              num = sc.nextInt();
//            }
//            sc.nextLine();
//        }while (num <= min || num >= max);

        Random random = new Random();
        boolean sort = false;
        int [] arr = new int [40];
        int tmp;
        for (int i = 0; i <arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        while (!sort){
            sort = true;
            for (int i = 0; i <arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    sort = false;
                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
