public class lesson2 {

    public static void main(String[] args) {
        createArrayInt();
        createArrayIntLength();
        createArrayIntNumber6();
        createArrayIntSquare(2,2);
        createArrayIntMinMax();
        int[] arrInt = {2, 2, 4, 2, 3, 7};
        checkBalance(arrInt);
    }

    public static void createArrayInt() {
        int[] arrInt = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] == 1) {
                arrInt[i] = 0;
            } else {
                arrInt[i] = 1;
            }
        }
    }

    public static void createArrayIntLength() {
        int[] arrInt = new int[8];
        int x = 0;
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = x;
            x += 3;
        }

    }

    public static void createArrayIntNumber6(){
        int[] arrInt = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrInt.length; i++) {
            if(arrInt[i] < 6){
                arrInt[i] = arrInt[i] * 2;
            }
        }
    }

    public static void createArrayIntSquare(int a,int b){
        if (a==b) {
            int[][] arrInt = new int[a][b];
            int startPos = 0;
            int endPos = arrInt[0].length - 1;
            for (int i = 0; i < arrInt.length; i++) {
                for (int j = 0; j < arrInt[i].length; j++) {
                    if (j == startPos) {
                        arrInt[i][j] = 1;
                    }
                    if (j == endPos) {
                        arrInt[i][j] = 1;
                    }
                }
                startPos++;
                endPos--;
            }
        }else {
            System.out.println("Переданы не равные значения для равномерного массива");
        }
    }

    public static void createArrayIntMinMax() {
        int[] arrInt = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = arrInt[0];
        int min = arrInt[0];
        for (int i = 0; i < arrInt.length; i++) {
            if (max < arrInt[i]) {
                max = arrInt[i];
            }
            if (min > arrInt[i]){
                min = arrInt[i];
            }
        }
        System.out.println("min = " + min + " max = " + max);
    }

    public static boolean checkBalance(int[] arr){
        int x = arr.length-2;
        int y = arr.length-1;
        int left = 0;
        int right = 0;
        for(int i = 0; i < arr.length;i++){
            if(i == x || i == y){
              right = right + arr[i];
            }else {
                left = left + arr[i];
            }
        }

        if (left == right) {
            return true;
        }else {
            return false;
        }
    }

}



