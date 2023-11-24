import java.util.Scanner;

public class Vowels_Consonants{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = sc.next();
        string = string.toLowerCase();
        int count = 0;

        for(int i = 0; i < string.length(); i++){
            switch(string.charAt(i)){
                case 'a', 'e', 'i', 'o', 'u':
                    count = count + 1;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Vowels " + count);
        System.out.println("Consonant " + string.length() - count);

    }
}