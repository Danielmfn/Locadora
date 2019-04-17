package br.edu.uniceub.locadora.principal;

import br.edu.uniceub.locadora.entity.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {
        EntityManager em = Persistence
                .createEntityManagerFactory("LocadoraHibernatePU")
                .createEntityManager();
        em.getTransaction().begin();


        Cliente isaac = new Cliente();
        isaac.setCpf(215478244L);

        em.persist(isaac);
        em.getTransaction().commit();
        em.close();
    }




//    EntityManager em = Persistence
//            .createEntityManagerFactory("VeiculoHibernatePU")
//            .createEntityManager();
//
////	Inclusão dos Fabricantes
//em.getTransaction().begin();
//
//    Fabricante f1 = new Fabricante();
//f1.setCNPJ(65478920145632L);
//f1.setNome("Ford");
//f1.setRazaoSocial("Ford Motor Company Brasil Ltda");
//em.persist(f1);
//
//    Fabricante f2 = new Fabricante();
//f2.setCNPJ(65478920145632L);
//f2.setNome("Volkswagen");
//f2.setRazaoSocial("VOLKSWAGEN DO BRASIL INDUSTRIA DE VEICULOS AUTOMOTORES LTDA");
//em.persist(f2);
//
//    Fabricante f3 = new Fabricante();
//f3.setCNPJ(65478920145632L);
//f3.setNome("Volvo");
//f3.setRazaoSocial("VOLVO DO BRASIL VEICULOS LTDA");
//em.persist(f3);
//em.getTransaction().commit();
//
////	Inclusão dos Veículos
//em.getTransaction().begin();
//
//    Veiculo v1 = new Veiculo();
//v1.setAno(2019);
//v1.setModelo("volvo xc40 ");
//v1.setFabricante("Volvo");
//em.persist(v1);
//
//    Veiculo v2 = new Veiculo();
//v2.setAno(2018);
//v2.setModelo("Golf GTI R Line");
//v2.setFabricante("Volkswagen");
//em.persist(v2);
//
//    Veiculo v3 = new Veiculo();
//v3.setAno(2018);
//v3.setModelo("Ka");
//v3.setFabricante("Ford");
//em.persist(v3);
//
//em.getTransaction().commit();
//em.close();
//}

}
