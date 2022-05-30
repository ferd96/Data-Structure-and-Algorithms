public class BubbleSort {
    public static void main(String[] args) {

          int  array [] ={2,3,6,1,9,66};

          for (int i = 0 ; i <array.length ; i++){
               for ( int j =0 ; j < array.length-1 ;j++){
                if (array[j] > array[j+1]){
                    int temp =  array[j];
                    array[j] = array[j+1];
                    array[j+1]  = temp;
                }
               }
          }

        printArray(array);
    }
    private  static  void  printArray( int[] arry){
        for ( int i = 0; i <arry.length;i ++){
            System.out.print(arry[i] +"  ");
        }

    }
}
