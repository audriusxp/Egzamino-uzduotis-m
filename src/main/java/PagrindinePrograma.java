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
            case 3:
              Receptai naujasReceptas = (KonsolesVeiksmai.nuskaitytiReceptai());
              //int receptoId = KonsolesVeiksmai.nuskaitytiReceptai().getId();
              ReceptoVeiksmai.idetiRecepta(jungtis,naujasReceptas);
              break;
              case 2:
                    Indigrientas naujasIngridentas= (KonsolesVeiksmai.nuskaitytiIngredentas());
                IngridentoVeiksmai.grazintiVisusIngridientus(jungtis,naujasIngridentas);
                break;


              /*
              visiReceptai=ReceptoVeiksmai.grazintiVisusReceptai(jungtis);
              int receptoId = visiReceptai.get(visiReceptai.size() -1)).getId();
              if(receptoId <=0) {
                  Receptai receptai = KonsolesVeiksmai.nuskaitytiReceptai();
                  ReceptoVeiksmai.idetiRecepta(jungtis, receptai);
                  receptai = ReceptoVeiksmai.grazintiVisusReceptai(jungtis);
                  receptoId = receptai.get(receptai.size() - 1).getId();
              }



               break;
         /*  case 3:
                Receptai naujiReceptai = KonsolesVeiksmai.nuskaitytiReceptaiIsKonsoles();

                KonsolesVeiksmai.idetiReceptai(jungtis, naujiReceptai);
                visiReceptai = KonsolesVeiksmai.grazintiVisiReceptai(jungtis);
                int RecaptaiId = visiReceptai.get(visiReceptai.size() - 1).getId();
                if (RecaptaiId <= 0) {
                    ReceptaiId receptas = KonsolesVeiksmai.nuskaitytiReceptaiIsKonsoles();
                    ReceptoVeiksmai.idetiReceptai(jungtis, receptas);
                    receptas = ReceptoVeiksmai.gautiVisusReceptai(jungtis);
                    ReceptaiId= Receptai.get(receptas.size() - 1).getId();
                }*/


        }
    }

}
