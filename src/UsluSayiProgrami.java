/* Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız. */

import java.util.Scanner;

public class UsluSayiProgrami {
    public static void main(String[] args) {

        //değişkenleri giriyorum ve scanner ile kullanıcı girdilerini oluşturuyorum
        int n, k;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        n = inp.nextInt();

        System.out.print("Üs olacak sayıyı giriniz : ");
        k = inp.nextInt();

        int total = 1;

        //Üst hesaplama formülünü for döngüsü ile oluşturuyorum.
        //örnek : 3^4 = 3 * 3 * 3 * 3
        for (int i = 1; i <= k; i++) {
            total *= n;

        }
        System.out.println("Cevap : " + total);

    }
}
