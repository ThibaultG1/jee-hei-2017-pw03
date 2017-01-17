package hei.tp03.entity;

import java.util.List;

/**
 * Created by thiba on 17/01/2017.
 */
public class Commande {



    private Long id;
    private Boolean validee;
    private Client client;
    private List<Produit> produits;

    public Commande() {
    }

    public Commande(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }
}
