package entity;

public class Indigrientas {
    private int id;
    private String pavadinimas;
    private Double kaina;

    public Indigrientas(int id, String pavadinimas, Double kaina) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
    }

    public Indigrientas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }

    @Override
    public String toString() {
        return "Indigrientas{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", kaina=" + kaina +
                '}';
    }
}
