import java.util.*;

public class Main {
    public static int[] remove(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }

        int[] Array = new int[j];
        for (int i = 0; i < j; i++) {
            Array[i] = temp[i];
        }
        return Array;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 6, 5};
        int[] result = remove(arr);
        
        
    }
}
