package hei.tp03.dao;

import hei.tp03.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by thiba on 17/01/2017.
 */
public interface ClientDAO extends JpaRepository<Client,Long> {

    List<Client> findByNom(String nom);
}
