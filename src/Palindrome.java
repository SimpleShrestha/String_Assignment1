import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = sc.next();
        string = string.toLowerCase();
        int length = string.length();

        boolean check = true;

        for(int i = 0; i <= length; i++){
            if(string.charAt(length - i) != string.charAt(i)){
                check = false;
            }
        }

        System.out.println(check);
    }
}
