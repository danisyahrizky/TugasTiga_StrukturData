import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int target = scanner.nextInt();
        int result = search(array, target);

        if (result != 1) {
            System.out.println("Angka : " + target + ", ditemukan pada index : " + result);
        }else {
            System.out.println("angka tidak ditemukan.");
        }

        scanner.close();
    }

    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}