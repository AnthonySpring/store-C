import java.util.Scanner;
import java.util.Stack;
public class test {
    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Stack stack = new Stack();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            char[] digit = 
        }
    }
    public static boolean mirror(String str){
         if(!str.isEmpty()){
            String[] word = str.split("\\W+");
            if (word.length == 3){
                if (word[0].substring(0,1).equals("p") && word[1].substring(0, 1).equals("w") && word[2].substring(0,1).equals("q")){
                    return true;
                }
                return false;
            }
            return false;
         }
    }
}
