import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "abc1235edsiCSaAAAAECSsiero";
        int UpperCase = 0;
        int LowerCase = 0;
        int numbers = 0;
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                UpperCase++;
            }
            else if(ch >= 'a' && ch<='z'){
                LowerCase++;
            }
            else if(ch>= '0' && ch<= '9'){
                numbers++;
            }
        }
        System.out.println(UpperCase);
        System.out.println(LowerCase);
        System.out.println(numbers);
    }
}