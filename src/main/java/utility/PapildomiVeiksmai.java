package utility;

import entity.Indigrientas;
import entity.Receptai;

import java.util.ArrayList;

public class PapildomiVeiksmai {
    public PapildomiVeiksmai() {
    }

    public static <T> void isvestiListaEilutemis(ArrayList<T> visiReceptai) {
        for (T t : visiReceptai) {
            System.out.println("visiReceptai = " + t);
        }
    }

    public static <N> void isvestiListaEilutemis2(ArrayList<Indigrientas> receptoXindigrientai){
        for (Indigrientas pavadinimas:receptoXindigrientai){
            System.out.println(" receptoXin = " + pavadinimas);
        }
    }
}


