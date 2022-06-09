package Array;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int bienDem  =0;
        for (int a : nums) {
            // kiểm tra số chữ số của a
            // nếu như số chữ số là chẳn thì thăng biến đếm lên 1
       int soLuongChuSo = tinhSoChuSo(a);
       if (  soLuongChuSo%2==0){
           bienDem++;
       }
        }

        return bienDem;
    }

    private static int tinhSoChuSo(int a) {
        int bienDem = 0;
        int kq = a;
        while (kq !=0){
            kq = a/10;
            a = kq;
            bienDem++;
        }
        return bienDem;
    }


    public static void main(String[] args) {
        int[] nums = {1, 22, 33, 4444};

      /*  System.out.println(intSoChuSo(1));*/
        System.out.println(findNumbers(nums));

    }

}
