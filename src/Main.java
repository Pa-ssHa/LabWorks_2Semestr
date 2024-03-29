import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] text = str.split("\\s+");
        for( int i = 0; i< text.length;i++)
            System.out.println(text[i]);
    }
}