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
        System.out.println("2 - Išvesti visų ingredientų kainų vidurkį");
        System.out.println("3 - Išvesti visus ingredientus pigesnius už X (X - kaina)");
        System.out.println("4 -Išvesti TOP X brangiausių ingredientų. (X - kelis)");
        System.out.println("5 - Išvesti kokie ingredientai yra n-ajame recepte. (n - id)\n");
        System.out.println("6 - Pridėti naują receptą ");
        return skait.nextInt();

    }

    public static Indigrientas nuskaitytiIndigrientai() {
        skait.nextLine();
        System.out.println("Įveskite indigriento pavadinima: ");
        String pavadinimas = skait.nextLine();
        System.out.println("Įveskite kaina: ");
        Double kaina = skait.nextDouble();

        return new Indigrientas(pavadinimas, kaina);


    }


    public static int nuskaitytiPigesniuIngdirijentuUzX() {
        System.out.println("Iveskite kaina ,kad suzinoti ingridientus pigesnius uz");
        return skait.nextInt();
    }

    public static int nuskaitytiBrangesniuX() {
        System.out.println("Iveskite kaina ,kad suzinoti ingridientus pigesnius uz");
        return skait.nextInt();


    }
    public static int nuskaitytiReceptoNr(){
        System.out.println("Iveskite recepto id nr ,kad suzinoti ingridientus ");
        return skait.nextInt();

    }
}
