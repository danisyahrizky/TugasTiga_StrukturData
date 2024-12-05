import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int target = scanner.nextInt();
        int result = search(arr, target);

        if (result == -1) {
            System.out.println("angka tidak ditemukan");
        } else {
            System.out.println ("angka : " + target + ", ditemukan pada index : " + result);
        }

        scanner.close();
    }

    public static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    


}
