package br.edu.uniceub.locadora.principal;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactorySingleton {

    private static FactorySingleton instance;
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TesteHibernateSQLitePU");

    private FactorySingleton() {}

    public static FactorySingleton getInstance() {
        if(instance == null){
            instance = new FactorySingleton();
        }
        return instance;
    }

    public static EntityManagerFactory getEntityManagerFacory(){
        return emf;
    }

}