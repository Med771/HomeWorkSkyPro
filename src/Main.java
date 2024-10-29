import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task 1
        byte[] arr1 = new byte[3];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (byte) (i + 1);
        }

        float[] arr2 = new float[3];

        arr2[0] = 1.57F;
        arr2[1] = 7.654F;
        arr2[2] = 9.986F;

        int[] arr3 = {1, 1, 2, 3, 5, 8};

        // task 2
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.println(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }

        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.println(arr2[i]);
                break;
            }

            System.out.print(arr2[i] + ", ");
        }

        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.println(arr3[i]);
                break;
            }

            System.out.print(arr3[i] + ", ");
        }

        // task 3
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr1[i]);
                break;
            }

            System.out.print(arr1[i] + ", ");
        }

        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr2[i]);
                break;
            }

            System.out.print(arr2[i] + ", ");
        }

        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr3[i]);
                break;
            }

            System.out.print(arr3[i] + ", ");
        }

        // task 4
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
}
