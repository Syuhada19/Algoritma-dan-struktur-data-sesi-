import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String kata;
        String kataPalindrome = "";
        int panjang;


        System.out.println("Masukkan kata: ");
        kata = input.nextLine();
        panjang = kata.length();
        
        for(int i = panjang-1; i >= 0; i--){
            char c = kata.charAt(i);
            kataPalindrome += String.valueOf(c);
        }

        if(kata.equals(kataPalindrome)){
            System.out.println(kata + " adalah Palindrome");
        } else {
            System.out.println(kata + " bukan Palindrome");
        }

        input.close();
    }
}
