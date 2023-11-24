import java.util.Scanner;

class SumOfNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String string = sc.next();

        int sum = 0;

        for(int i = 0; i < string.length(); i++){
            int eachNum = Character.getNumericValue(string.charAt(i));
            sum = sum + eachNum;
        }

        System.out.println("the sum is "+ sum);
    }
}