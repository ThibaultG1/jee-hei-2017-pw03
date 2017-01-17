package hei.tp03.service.impl;

import hei.tp03.dao.ClientDAO;
import hei.tp03.entity.Client;
import hei.tp03.service.ClientService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by thiba on 17/01/2017.
 */
@Named
@Transactional
public class ClientServiceImpl implements ClientService {


    @Inject
    private ClientDAO clientDAO;

    @Override
    public List<Client> findByNom(String nom) {
        return null;
    }

    @Override
    public void saveClient(Client client) {

    }

    @Override
    public List<Client> findAll() {
        return null;
    }
}
