
    import java.util.Scanner;

    /**
     * Created by tahakirca on 25/09/16.
     */
    public class NumberGuess {

        public static void main(String args[]) {
            int sayi = (int) (Math.random() * 101); //0 ile 100 arasında bir sayı üretir 100'de olabilir

            Scanner input = new Scanner(System.in); //Kullanıcıdan sayı alabilmek için Scanner sınıfını kullandık

            int tahmin = -1; //0 ile 100 arasında olmaması için -1 verdik

            while (sayi != tahmin) { // sayı tahmine eşit olmadığı sürece true dönecek ve bu işlem tekrarlanacak . Sayı işleme eşit olduğunda false dönecek ve döngüye girmiyecek

                System.out.print("Tahmin ettiğiniz sayıyı giriniz: ");

                tahmin = input.nextInt(); // Sayı kullanıcıdan alınır

                if (tahmin == sayi) {
                    System.out.println("Doğru Tahmin");

                } else if (tahmin > sayi) {
                    System.out.println("Tahmininizi Azaltın");

                } else {
                    System.out.println("Tahmininizi Arttırın");

                }
            }

        }
    }