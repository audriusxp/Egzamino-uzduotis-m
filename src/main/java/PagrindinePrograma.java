import dbveiksmai.DuonbazesVeiksmai;
import dbveiksmai.ReceptoVeiksmai;
import entity.Indigrientas;
import entity.Receptai;
import utility.KonsolesVeiksmai;
import utility.PapildomiVeiksmai;

import java.sql.Connection;
import java.util.ArrayList;

public class PagrindinePrograma {
    public static void main(String[] args) {
        DuonbazesVeiksmai DuombazesVeiksmai = null;
        Connection jungtis = DuombazesVeiksmai.prisijungtiPrieDuombazes();

        ArrayList<Receptai> visiReceptai = new ArrayList<>();
        ArrayList<Indigrientas> visiIngredijentai= new ArrayList<>();

       int pasirinkimas = KonsolesVeiksmai.meniuPasirinkimai();

        switch (pasirinkimas) {
            case 1:
                visiReceptai = ReceptoVeiksmai.grazintiVisusReceptai(jungtis);
                PapildomiVeiksmai.isvestiListaEilutemis(visiReceptai);
                break;

        }
    }

}
