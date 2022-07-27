package utility;

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


        return new Receptai( pavadinimas,kaina,nurodymai);
    }

/*

    public static Autorius nuskaitytiAutoriu() {
        skait.nextLine();
        System.out.println("Įveskite autoriaus vardą: ");
        String vardas = skait.nextLine();
        System.out.println("Įveskite autoriaus pavardę: ");
        String pavarde = skait.nextLine();
        System.out.println("Įveskite autoriaus šalį: ");
        String salis = skait.nextLine();
        return new Autorius(vardas, pavarde, salis);
    }*/

    public static int meniuPasirinkimai() {
        System.out.println("Meniu pasirinkimai:");
        System.out.println("1 - išvesti visus Receptus");


        return skait.nextInt();
    }






}
