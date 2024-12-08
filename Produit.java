
public class Produit {
    private int id;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;


    public Produit() {
        this.id = 0;
        this.libelle = "";
        this.marque = "";
        this.prix = 0.0;
        this.dateExpiration = null;
    }


    public Produit(int id, String libelle, String marque, double prix, Date dateExpiration) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }


    public void afficher() {
        System.out.println("ID: " + this.id);
        System.out.println("Libelle: " + this.libelle);
        System.out.println("Marque: " + this.marque);
        System.out.println("Prix: " + this.prix);
        System.out.println("Date d'expiration: " + (this.dateExpiration != null ? this.dateExpiration.toString() : "Aucune"));
    }


    @Override
    public String toString() {
        return "Produit [id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + ", expiration=" + dateExpiration + "]";
    }


    public void setPrix(double prix) {
        if (prix >= 0) {
            this.prix = prix;
        } else {
            System.out.println("Le prix ne peut pas être négatif.");
        }
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }


}