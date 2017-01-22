package hei.tp03.entity;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.*;
import java.util.List;

/**
 * Created by thiba on 17/01/2017.
 */
@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="validee")
    private Boolean validee;

    @ManyToOne
    private Client client;

    @OneToMany(cascade={CascadeType.ALL}, mappedBy="commande")
    private List<Produit> produits;

    public Commande() {
    }

    public Commande(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public Boolean getValidee() {
        return validee;
    }

    public void setValidee(Boolean validee) {
        this.validee = validee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
