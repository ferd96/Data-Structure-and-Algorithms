public class InsertionSort {
    public static void main(String[] args) {
        int[] myArray = {6,5,3,1,8,7,2,4};
        printArray(myArray);

        int len = myArray.length;

        for(int i = 1; i < len; i++){
            //Nhấc quân bài lên
            int tmp = myArray[i];

            System.out.println("Tại vị trí i: " + i + " nhấc lên được số: " + tmp);

            int j = i - 1;

            //Tìm ra vị trí chính xác để chèn quân bài vừa nhấc lên
            while (j >= 0 && tmp < myArray[j]){
                System.out.println("J là: " + j);
                System.out.println(tmp + " < " + myArray[j]);
                //Dịch chuyển các quân bài lên phía trước
                myArray[j + 1] = myArray[j];
                j--;
                printArray(myArray);
            }

            System.out.println("Chèn vào vị trí: " + (j + 1));
            //Chèn quân bài vừa nhấc lên vào vị trí đã tìm (j)
            myArray[j + 1] = tmp;
            printArray(myArray);
        }

        printArray(myArray);


        //5 6 3

        //i = 2, tmp = 3
        //j = i - 1 = 1, 3 < 6 => 5 6 6, j--
        //j = 0, 3 < 5 => 5 5 6
        //myArray[0] = tmp, => 3 5 6

    }

    /**
     * In mảng ra màn hình
     * @param x Mảng cần in
     */
    private static void printArray(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}
