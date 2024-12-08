

public class TestProduit {
    public static void main(String[] args) {

        Produit produitVide = new Produit();
        produitVide.afficher();


        Produit produit1 = new Produit(1021, "Lait", "Delice", 0.700, new Date());
        produit1.afficher();


        produit1.setPrix(1.200);
        produit1.afficher();
    }
}