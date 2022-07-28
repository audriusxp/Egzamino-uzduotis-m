package utility;

import entity.Receptai;

import java.sql.Connection;
import java.util.Scanner;

public class KonsolesVeiksmai {

    private static final Scanner skait = new Scanner(System.in);

   /* public static Receptai nuskaitytiReceptaiIsKonsoles() {
        skait.nextLine();

        System.out.println("Įveskite recepto pavadinimą: ");
        String pavadinimas = skait.nextLine();
        System.out.println("Įveskite  kainą: ");
        double kaina = skait.nextDouble();
        System.out.println("kaina = " + kaina);
        System.out.println("Įveskite recepto nurodymus: ");
        String nurodymai = skait.nextLine();


        return new Receptai( pavadinimas,kaina,nurodymai);
    }
    */




   public static Receptai nuskaitytiReceptai() {
        skait.nextLine();
        System.out.println("Įveskite recepto pavadinima: ");
        String pavadinimas = skait.nextLine();
        System.out.println("Įveskite kaina: ");
        Double kaina = skait.nextDouble();
        System.out.println("Įveskite recepto nurodymus: ");
        skait.nextLine();
        String nurodymai = skait.nextLine();
        return new Receptai(pavadinimas, kaina,nurodymai);
    }

    public static int meniuPasirinkimai() {
        System.out.println("Meniu pasirinkimai:");
        System.out.println("1 - išvesti visus Receptus");


        return skait.nextInt();
    }

    public static Receptai nuskaitytiRecepta(){
        skait.nextLine();
        System.out.println("Iveskite recepto pavadinima" );
        String pavadinimas = skait.nextLine();
        System.out.println("Iveskite recepto kaina");
        Double kaina = skait.nextDouble();
        System.out.println("Iveskite recepto aprasyma");
        String aprasymas = skait.nextLine();
        return new Receptai(pavadinimas,kaina,aprasymas);



    }


    /*public static void idetiReceptai(Connection jungtis, Receptai naujiReceptai) {
    }*/
}
