import java.util.Scanner;
public class laba_8_1 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Введите текст:");
    String str = scan.nextLine();
    int cif = 0;
    int zn = 0;

    for (char i : str.toCharArray()) {
        if (Character.isDigit(i)) {
            cif++;
        } else if (Character.isWhitespace(i)) {
            continue;
        } else if (Character.isLetter(i)) {
            continue;
        } else {
            zn++;
        }
    }
    System.out.println("Количество цифр: " + cif);
    System.out.println("Количество знаков препинания: " + zn);
    }
}


