import dbveiksmai.DuonbazesVeiksmai;
import dbveiksmai.IngridentoVeiksmai;
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
            case 2:
                Double kainuVidurkis = IngridentoVeiksmai.kainuVidurkis(jungtis);
                break;

            case 3:
                visiIngredijentai =IngridentoVeiksmai.grazintiPigesniusUz(jungtis,1);
                PapildomiVeiksmai.isvestiListaEilutemis(visiIngredijentai);
                System.out.println("pigesniUzX" + visiIngredijentai.size());

                break;

            case 4:
                visiIngredijentai =IngridentoVeiksmai.grazintiBrangesnius(jungtis,1);
                PapildomiVeiksmai.isvestiListaEilutemis(visiIngredijentai);
                System.out.println("brangesnius uz x" + visiIngredijentai.size());

                break;
            case 5:
                visiIngredijentai= ReceptoVeiksmai.grazintiIndigrijentusRecepteX(jungtis, 1);
                PapildomiVeiksmai.isvestiListaEilutemis(visiIngredijentai);
                System.out.println("Recepto  = " + visiIngredijentai.size());
                break;


            case 6:
              Receptai naujasReceptas = (KonsolesVeiksmai.nuskaitytiReceptai());
              ReceptoVeiksmai.idetiRecepta(jungtis,naujasReceptas);
              break;
             /* case 7:
                    Indigrientas naujasIngridentas= (KonsolesVeiksmai.nuskaitytiIndigrientai());

                IngridentoVeiksmai.idetiIngridienta(jungtis,naujasIngridentas);
                break;*/







        }

    }


}
