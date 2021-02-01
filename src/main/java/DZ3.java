import java.util.Random;
import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        final int changeNumber = 1;
        final int changeWord = 2;
        System.out.println("Сыграем?, введи 1 если хочешь угагадть число");
        if (sc.hasNextInt() && changeNumber == sc.nextInt()){
            changeNumber(sc,random);
        }
        System.out.println("Введи 2 если хочешь угадать слово");
        if (sc.hasNextInt() && changeWord == sc.nextInt()){
            changeWord(sc,random);
        }else {
            System.out.println("Как хочешь(");
        }

    }

    private static void changeWord(Scanner sc,Random random) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Я загадал слово, попробуй угадать");
        int index = random.nextInt(words.length);
        if(sc.next().equals(words[index])){
            System.out.println("Угадал");
        }else {
            System.out.println("Не угадал было слово " + words[index]);
        }
    }

    public static void changeNumber(Scanner sc,Random random){
        System.out.println("Введи 1, чтобы начать, другую цифру чтобы закончить.");
        int var = 1;
        int t = 0;
        while (sc.hasNextInt() && var == sc.nextInt()) {
            System.out.println("Угадай число от 0 до 9, введи число");
            while (t < 3) {
                if (sc.hasNextInt()) {
                    int a = sc.nextInt();
                    int b = random.nextInt(10);
                    if (a == b) {
                        System.out.println("Winner");
                    } else {
                        int x = 2 - t;
                        System.out.println("Попробуй еще раз осталось " + x + " попыток, было число " + b);
                        t++;
                    }
                } else {
                    System.out.println("Ввели не число");
                    sc.nextLine();
                }
            }
            System.out.println("Сыграем еще? Введи 1, если хочешь еще");
        }
        System.out.println("Как хочешь");
    }
}

