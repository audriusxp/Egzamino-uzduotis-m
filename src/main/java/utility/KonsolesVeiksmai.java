package utility;

import entity.Indigrientas;
import entity.Receptai;

import java.sql.Connection;
import java.util.Scanner;

public class KonsolesVeiksmai {

    private static final Scanner skait = new Scanner(System.in);

    public static Receptai nuskaitytiReceptaiIsKonsoles() {
        skait.nextLine();

        System.out.println("Įveskite recepto pavadinimą: ");
        String pavadinimas = skait.nextLine();
        System.out.println("Įveskite  kainą: ");
        double kaina = skait.nextDouble();
        System.out.println("kaina = " + kaina);
        System.out.println("Įveskite recepto nurodymus: ");
        String nurodymai = skait.nextLine();


        return new Receptai(pavadinimas, kaina, nurodymai);
    }


    public static Receptai nuskaitytiReceptai() {
        skait.nextLine();
        System.out.println("Įveskite recepto pavadinima: ");
        String pavadinimas = skait.nextLine();
        System.out.println("Įveskite kaina: ");
        Double kaina = skait.nextDouble();
        System.out.println("Įveskite recepto nurodymus: ");
        skait.nextLine();
        String nurodymai = skait.nextLine();
        return new Receptai(pavadinimas, kaina, nurodymai);
    }

    public static int meniuPasirinkimai() {
        System.out.println("Meniu pasirinkimai:");
        System.out.println("1 - išvesti visus Receptus");
       
        return skait.nextInt();

    }

    public static Indigrientas nuskaitytiIndigrientai() {
        skait.nextLine();
        System.out.println("Įveskite indigriento pavadinima: ");
        String pavadinimas = skait.nextLine();
        System.out.println("Įveskite kaina: ");
        Double kaina = skait.nextDouble();

        return new Indigrientas(pavadinimas,kaina);


    }



}
