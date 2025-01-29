import java.util.Arrays;

public class Main {
    public static int[] Union(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] temp = new int[n1 + n2];
        int k = 0;

        for (int i = 0; i < n1; i++) {
            temp[k++] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < n1; j++) {
                if (arr2[i] == arr1[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[k++] = arr2[i];
            }
        }

        int[] unionArray = new int[k];
        for (int i = 0; i < k; i++) {
            unionArray[i] = temp[i];
        }
        return unionArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        
        int[] union = findUnion(arr1, arr2);
        
    }
}
