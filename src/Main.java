public class Main {
    public static void main(String[] args) {
        //1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] doubles = {1.57, 7.654, 9.986};
        int[] myArr = {2, 5, 10, 20};
        //2
        for (int i = 0; i < 3; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < doubles.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(doubles[i]);
                break;
            }
            System.out.print(doubles[i] + ", ");
        }
        for (int i = 0; i < myArr.length; i++) {
            if (i == myArr.length - 1) {
                System.out.println(myArr[i]);
                break;
            }
            System.out.print(myArr[i] + ", ");
        }
        //3
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int i = doubles.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubles[i]);
                break;
            }
            System.out.print(doubles[i] + ", ");
        }
        for (int i = myArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(myArr[i]);
                break;
            }
            System.out.print(myArr[i] + ", ");
        }
        //4
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                arr[i] += 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
            
        }
    }
}