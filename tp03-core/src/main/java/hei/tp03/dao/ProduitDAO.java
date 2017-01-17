package hei.tp03.dao;

import hei.tp03.entity.Client;
import hei.tp03.entity.Commande;
import hei.tp03.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by thiba on 17/01/2017.
 */
public interface ProduitDAO extends JpaRepository<Produit,Long> {

}
