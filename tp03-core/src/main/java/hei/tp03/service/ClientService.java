package hei.tp03.service;

import hei.tp03.entity.Client;

import java.util.List;

/**
 * Created by thiba on 17/01/2017.
 */
public interface ClientService{

    List<Client> findByNom(String nom);
    void saveClient(Client client);
    List<Client> findAll();
}
