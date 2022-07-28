package dbveiksmai;

import entity.Indigrientas;
import entity.Receptai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IngridentoVeiksmai {

    public static ArrayList<Indigrientas> grazintiVisusIngridientus(Connection jungtis) {
        ArrayList<Indigrientas> visiIngredientai = new ArrayList<>();
        String sqlUzklausa = "SELECT * FROM indigrientas";

        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            ResultSet rezultatas = paruostukas.executeQuery();
            while (rezultatas.next()) {
                int id = rezultatas.getInt("id");
                String pavadinimas = rezultatas.getString("pavadinimas");
                Double kaina = rezultatas.getDouble("kaina");
                Indigrientas laikiniIndigrientai = new Indigrientas(id,pavadinimas,kaina);
                visiIngredientai.add(laikiniIndigrientai);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko gauti duomenų (receptu) iš DB");
        }
        return visiIngredientai;


    }
}
