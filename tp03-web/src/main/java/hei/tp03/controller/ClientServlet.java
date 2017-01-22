package hei.tp03.controller;

import hei.tp03.entity.Client;
import hei.tp03.service.ClientService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by thiba on 22/01/2017.
 */
@WebServlet(name = "ClientServlet")
public class ClientServlet extends javax.servlet.http.HttpServlet {

    private ClientService clientService;
    private ConfigurableApplicationContext context;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*List<Client> all = clientService.findAll();
        for (int i = 0; i < all.size() ; i++) {
            response.getWriter().println(all.get(i));
        }*/
        /*List<Client> listeClients = clientService.findAll();
        resp.setHeader("Content-Type","application/json");
        ObjectMapper mapper = new ObjectMapper();
        String jsonAAfficher = mapper.writeValueAsString(listeClients);
        resp.getWriter().println(jsonAfficher);*/
        PrintWriter out = response.getWriter();
        List<Client> listeClients = clientService.findAll();
        for (Client c : listeClients)
            out.write(c.getNom());
    }

    @Override
    public void init() {
        //   super.init();
        context = new AnnotationConfigApplicationContext("hei.tp03.config");
        //clientService = context.getBean(ClientService);
        clientService = (ClientService) context.getBean(ClientService.class);
    }

    @Override
    public void destroy() {
        // super.destroy();
        context.close();
    }
}
