package dbveiksmai;

import entity.Indigrientas;

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
                Indigrientas laikiniIndigrientai = new Indigrientas(id,pavadinimas,kaina);
                System.out.println("id = " + id);
                System.out.println("pavadinimas = " + pavadinimas);
                System.out.println("kaina = " + kaina);
                System.out.println("laikiniIndigrientai = " + laikiniIndigrientai);
                visiIndigrientai.add(laikiniIndigrientai); /*isjungtas indigrijentu ivedimas, bet vistiek galima ivesti, tik ju nesaugo*/
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko gauti duomenų (receptu) iš DB");
        }
        return visiIndigrientai;
    }
}
