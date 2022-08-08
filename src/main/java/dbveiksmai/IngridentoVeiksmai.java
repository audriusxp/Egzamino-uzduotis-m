package dbveiksmai;

import entity.Indigrientas;
import entity.Receptai;
import utility.KonsolesVeiksmai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IngridentoVeiksmai {

    public static ArrayList<Indigrientas> grazintiVisusIndigrientus(Connection jungtis) {
        ArrayList<Indigrientas> visiIndigrientai = new ArrayList<>();
        String sqlUzklausa = "SELECT * FROM indigrientas";

        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            ResultSet rezultatas = paruostukas.executeQuery();
            while (rezultatas.next()) {
                int id = rezultatas.getInt("id");
                String pavadinimas = rezultatas.getString("pavadinimas");
                Double kaina = rezultatas.getDouble("kaina");
                Indigrientas laikiniIndigrientai = new Indigrientas(id, pavadinimas, kaina);
                visiIndigrientai.add(laikiniIndigrientai);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko gauti duomenų (receptu) iš DB");
        }
        return visiIndigrientai;


    }

    public static void idetiIngridienta(Connection jungtis, Indigrientas indigrientas) {
        String sqlUzklausa = "INSERT INTO indigrientas(pavadinimas,kaina) VALUES (?, ?)";
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            paruostukas.setString(1, indigrientas.getPavadinimas());
            paruostukas.setDouble(2, indigrientas.getKaina());
            paruostukas.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko įdėti duomenų į duomenų bazę");
        }
    }

    public static Double kainuVidurkis(Connection jungtis) {
        String sqlUzklausa = "SELECT AVG(kaina)\n" + "FROM indigrientas";


        double vidurkis = 0;
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            ResultSet rezultatas = paruostukas.executeQuery();
            while (rezultatas.next()) {
                vidurkis = rezultatas.getDouble("AVG(kaina)");
                System.out.println("vidurkis = " + vidurkis);


            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko gauti duomenų  duomenu bazeje");
        }
        return vidurkis;
    }



    public static ArrayList<Indigrientas> grazintiBrangiausiusIngridijentus(Connection jungtis, int x) {
        ArrayList<Indigrientas> brangiausiIndigrijentai = new ArrayList<>();
        String sqlUzklausa = " select * FROM indigrientas ORDER BY kaina DESC LIMIT ? ";
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            paruostukas.setInt(KonsolesVeiksmai.nuskaitytiKiekBrangiausiuIndigrientu(?));
            ResultSet rezultatas = paruostukas.executeQuery();
            int id = rezultatas.getInt("id");
            while (rezultatas.next()) {

                String pavadinimas = rezultatas.getString("pavadinimas");
                Double kaina = rezultatas.getDouble("kaina");
                Indigrientas laikiniIndigrientai = new Indigrientas(id, pavadinimas, kaina);
                brangiausiIndigrijentai.add(laikiniIndigrientai);
            }


             } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko pasiekti duomenų.");
        }
        return brangiausiIndigrijentai;


    }
}
