import java.util.*;
class Main {
    public static void count (String str){
        int n = str.length();
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(!visited[i]){
                continue;
            }
            int count = 1;
            for(int j = i + 1; j < n; j++){
                char c = str.charAt(j);
                if(ch == c){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(ch + "="+ count);
        }
    }
    public static void main(String[] args) {
        String str = "abascdeofnlsafjoeal";
        count(str);
    }
}