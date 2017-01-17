package hei.tp03.entity;

import javax.print.DocFlavor;
import java.util.List;

/**
 * Created by thiba on 17/01/2017.
 */
public class Client {

    private Long id;
    private String nom;
    private String prenom;
    private List<Commande> commandes;

    public Client() {
    }

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Long getId() {
        return id;
    }
}
