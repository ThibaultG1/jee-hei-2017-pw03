package hei.tp03.dao;

import hei.tp03.entity.Client;
import hei.tp03.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by thiba on 17/01/2017.
 */
public interface CommandeDAO  extends JpaRepository<Client,Long> {
    List<Commande> findByNom(String nom);
}
