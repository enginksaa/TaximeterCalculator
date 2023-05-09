import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        double kmUcret = 2.20;
        double mesafe;
        float minUcret = 20;
        double toplamUcret;

        Scanner userEntry = new Scanner(System.in);
        System.out.println("Lütfen gidilecek mesafeyi giriniz :");
        mesafe = userEntry.nextDouble();
        System.out.println("KM basina ücret" + kmUcret);
        System.out.println("Minimum Ücret :" + minUcret);
        toplamUcret = mesafe * kmUcret;
        if (toplamUcret < minUcret) {

            toplamUcret = minUcret;
        } else {
            toplamUcret = mesafe * kmUcret;
        }
        System.out.println("Toplam tutar :" + toplamUcret);

    }
}
