package testejä;
import java.util.Scanner;
public class testground {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("Tiskikoneet");

        Tiskikone t1=new Tiskikone();
        Tiskikone t2=new Tiskikone();

        Scanner in = new Scanner(System.in);

        System.out.println("Lisää tiskikoneen tiedot.");

        System.out.println("ID?");
        t1.setId(in.nextInt());

        System.out.println("Merkki?");
        t1.setMerkki(in.nextLine());

        System.out.println("Malli?");
        t1.setMalli(in.nextLine());

        System.out.println("Pesuohjelma?");
        t1.setPesuohjelma(in.nextLine());

        System.out.println("Tiskikoneen 1 ID = " + t1.getId() + ", Merkki = " + t1.getMerkki()
        + ", Malli = " + t1.getMalli() + ", Pesuohjelma = " + t1.getPesuohjelma() + ".");

        System.out.println(" ");

        System.out.println("Lisätäänkö toinen tiskikone? (kyllä/ei)");

        String Vastaus;

        Vastaus = in.nextLine();

        if (Vastaus.equals("kyllä")) {

            System.out.println("Lisää tiskikoneen tiedot.");

            System.out.println("ID?");
            t2.setId(in.nextInt());

            System.out.println("Merkki?");
            t2.setMerkki(in.nextLine());

            System.out.println("Malli?");
            t2.setMalli(in.nextLine());

            System.out.println("Pesuohjelma?");
            t2.setPesuohjelma(in.nextLine());

            System.out.println("Tiivistelmä");
            System.out.println("Tiskikoneen 1 ID = " + t1.getId() + ", Merkki = " + t1.getMerkki()
             + ", Malli = " + t1.getMalli() + ", Pesuohjelma = " + t1.getPesuohjelma() + ".");
            
            System.out.println("Tiskikoneen 2 ID = " + t2.getId() + ", Merkki = " + t2.getMerkki()
              + ", Malli = " + t2.getMalli() + ", Pesuohjelma = " + t2.getPesuohjelma() + ".");

        }

        else
        {
            System.out.println("Toista tiskikonetta ei lisätty");
            System.out.println("Tiivistelmä");
            System.out.println("Tiskikoneen 1 ID = " + t1.getId() + ", Merkki = " + t1.getMerkki()
             + ", Malli = " + t1.getMalli() + ", Pesuohjelma = " + t1.getPesuohjelma() + ".");
        }

        in.close();

    }

}