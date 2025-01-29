import java.util.*;

public class count {
    public static void findFrequency(int[] arr) {
        int n = arr.length;
        boolean[] visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visit[i])
                continue;
            
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visit[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " = " + count +);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 6, 5};
        count(arr);
    }
}
