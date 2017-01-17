package hei.tp03.entity;

/**
 * Created by thiba on 17/01/2017.
 */
public class Produit {

    private Long id;
    private String nom;
    private Commande commande;

    public Produit() {
    }

    public Produit(String nom, Commande commande) {
        this.nom = nom;
        this.commande = commande;
    }

    public Long getId() {
        return id;
    }
}
