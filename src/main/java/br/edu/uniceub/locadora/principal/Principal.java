package br.edu.uniceub.locadora.principal;

import br.edu.uniceub.locadora.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        EntityManager em = Persistence
                .createEntityManagerFactory("LocadoraHibernatePU")
                .createEntityManager();
        em.getTransaction().begin();

        // Cliente
        Cliente c = new Cliente();
        c.setNome("Daniel Pereira");
        c.setCpf("021365789");
        c.setDtMatricula(LocalDateTime.now());
        em.persist(c);

        Cliente c2 = new Cliente();
        c2.setNome("Renata de Oliveira");
        c2.setCpf("658987458");
        c2.setDtMatricula(LocalDateTime.now());
        em.persist(c2);

        Cliente c3 = new Cliente();
        c3.setNome("Pablo Alisson");
        c3.setCpf("698745874");
        c3.setDtMatricula(LocalDateTime.now());
        em.persist(c3);

        // Genero
        Genero genero1 = new Genero();
        genero1.setNome("Terror");
        em.persist(genero1);

        Genero genero2 = new Genero();
        genero2.setNome("Comédia");
        em.persist(genero2);

        Genero genero3 = new Genero();
        genero3.setNome("Ação");
        em.persist(genero3);

        // Tipo midia
        TipoMidia tipomidia1 = new TipoMidia ();
        tipomidia1.setTpMidia("DVD");
        em.persist(tipomidia1);

        TipoMidia tipomidia2 = new TipoMidia ();
        tipomidia2.setTpMidia("CD");
        em.persist(tipomidia2);

        TipoMidia tipomidia3 = new TipoMidia ();
        tipomidia3.setTpMidia("K7");
        em.persist(tipomidia3);

        // Midia
        Midia midia1 = new Midia();
        midia1.setNome("A Bruxa do Século");
        midia1.setFaixaEtaria(18);
        midia1.setGeneros(new ArrayList<>());
        midia1.getGeneros().add(genero1);
        midia1.setTpMidia(tipomidia1);
        em.persist(midia1);

        Midia midia2 = new Midia();
        midia2.setNome("Taxi 2");
        midia2.setFaixaEtaria(10);
        midia2.setGeneros(new ArrayList<>());
        midia2.getGeneros().add(genero2);
        midia2.setTpMidia(tipomidia2);
        em.persist(midia2);

        Midia midia3 = new Midia();
        midia3.setNome("007 Cassino Royale");
        midia3.setFaixaEtaria(10);
        midia3.setGeneros(new ArrayList<>());
        midia3.getGeneros().add(genero3);
        midia3.setTpMidia(tipomidia3);
        em.persist(midia3);

        // locacao
        Locacao locacao1 = new Locacao();
        locacao1.setDtLocacao(LocalDateTime.of(2001, Month.MARCH, 25, 0, 0, 0));
        locacao1.setClientes(c);
        locacao1.setMidia(midia1);
        em.persist(locacao1);

        Locacao locacao2 = new Locacao();
        locacao2.setDtLocacao(LocalDateTime.of(2010, Month.JUNE, 10, 0, 0, 0));
        locacao2.setClientes(c2);
        locacao2.setMidia(midia2);
        em.persist(locacao2);

        Locacao locacao3 = new Locacao();
        locacao3.setDtLocacao(LocalDateTime.of(2008, Month.APRIL, 15, 0, 0, 0));
        locacao3.setClientes(c3);
        locacao3.setMidia(midia3);

        em.persist(locacao3);
        em.getTransaction().commit();
        em.close();
    }

}