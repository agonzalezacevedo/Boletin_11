package bolt11_2;
// @author agonzalezacevedo

public class Media {

    private String nom;
    private String autor;
    private int duradaSegons;

    public Media() {

    }

    public Media(String Nom, String Autor, int Durada) {
        nom = Nom;
        autor = Autor;
        duradaSegons = Durada;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String Nom) {
        this.nom = Nom;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String Autor) {
        this.autor = Autor;
    }

    public int getDuradaSegons() {
        return duradaSegons;
    }

    public void setDuradaSegons(int Durada) {
        this.duradaSegons = Durada;
    }

}
