package dbveiksmai;

import entity.Indigrientas;
import entity.Receptai;
import utility.KonsolesVeiksmai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReceptoVeiksmai {
    public static ArrayList<Receptai> grazintiVisusReceptai(Connection jungtis) {
        ArrayList<Receptai> visiReceptai = new ArrayList<>();
        String sqlUzklausa = "SELECT * FROM receptai";

        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            ResultSet rezultatas = paruostukas.executeQuery();
            while (rezultatas.next()) {
                int id = rezultatas.getInt("id");
                String pavadinimas = rezultatas.getString("pavadinimas");
                double kaina = rezultatas.getDouble("kaina");
                String nurodymai = rezultatas.getString("nurodymai");
                Receptai laikiniReceptai = new Receptai(id, pavadinimas, kaina, nurodymai);
                visiReceptai.add(laikiniReceptai);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko gauti duomenų (receptu) iš DB");
        }
        return visiReceptai;
    }

    public static void idetiRecepta(Connection jungtis, Receptai receptai) {
        String sqlUzklausa = "INSERT INTO receptai(pavadinimas,kaina,nurodymai) VALUES (?, ?, ?)";
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            paruostukas.setString(1, receptai.getPavadinimas());
            paruostukas.setDouble(2, receptai.getKaina());


            paruostukas.setString(4, receptai.getNurodymai());
            paruostukas.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko įdėti duomenų į duomenų bazę");
        }
    }

    public static ArrayList<Indigrientas> grazintiIndigrijentusRecepteX(Connection jungtis, int x) {
        ArrayList<Indigrientas> receptoXindigrientai = new ArrayList<>();
        String sqlUzklausa = " SELECT indigrientas.pavadinimas\n" +
                " FROM receptu_ingredientai \n" +
                " JOIN receptai ON receptu_ingredientai.recepto_id = receptai.id\n" +
                " JOIN indigrientas ON receptu_ingredientai.indigriento_id= indigrientas.id\n" +
                " WHERE receptai.id = ? ";
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            paruostukas.setInt(1, KonsolesVeiksmai.nuskaitytiReceptoNr());
            ResultSet rezultatas = paruostukas.executeQuery();
            while (rezultatas.next()) {
                receptoXindigrientai.add(new Indigrientas( rezultatas.getString("pavadinimas")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko pasiekti duomenų.");
        }
        return receptoXindigrientai;

    }
}





