package be.ehb.beestjes.model;

public class Beast {

    private String naam;
    private String ras;

    public Beast() {
    }

    public Beast(String naam, String ras) {
        this.naam = naam;
        this.ras = ras;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    @Override
    public String toString() {
        return "Beast{" +
                "naam='" + naam + '\'' +
                ", ras='" + ras + '\'' +
                '}';
    }
}
