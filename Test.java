 import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = input.nextInt();
        int a = sayi;
        int basamakSayisi = 0;
        int basamakDegeri =0;
        int basPow;
        int result = 0;
        int deger = 0;

        while ( a != 0){
            a = a/10;
            basamakSayisi ++;

        }
        a = sayi;
        while (a != 0){
            basamakDegeri = a % 10;

            deger += basamakDegeri;
            System.out.println(deger);



            a /= 10;

        }
        System.out.println("Sayinin basamak sayilarinin toplami : " + deger );









        /*System.out.println("Sayi giriniz : ");
        int sub = input.nextInt();
        System.out.println("Ussu yasiniz : ");
        int sup = input.nextInt();


        int result = 1;
        for (int i = 1; i <= sup; i++){
            result = result * sub;
        }
        System.out.println(result);*/

    }
}