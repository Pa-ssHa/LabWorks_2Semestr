import java.util.Scanner;

public class laba_8_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = scan.nextLine();
        String[] text = str.split("(?<=\\b|\\s)|(?=\\b|\\s)|(?<=\\p{Punct})|(?=\\p{Punct})");
        int ind = -1;
        String kr = ".";
        for (int i = 0; i < text.length; i++)
            if (Character.isLetter(text[i].codePointAt(0))) {
                kr = text[i];
                ind = i;
                break;
            }
        if (ind == -1)
            System.out.println("текст: " + String.join("", text));
        else {
            for (int i = 0; i < text.length; i++)
                if (text[i].length() < kr.length() && Character.isLetter(text[i].codePointAt(0))) {
                    kr = text[i];
                    ind = i;
                }
            int f = -1;
            for (int i = text.length - 1; i >= 0; i--)
                if (Character.isLetter(text[i].codePointAt(0))) {
                    f = i;
                    break;
                }
            String l = text[f];
            text[f] = kr;
            text[ind] = l;
            System.out.println("текст: " + String.join("", text));
        }
    }
}
