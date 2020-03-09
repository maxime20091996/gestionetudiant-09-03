package com.ensup.Ensup.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ensup.Ensup.domaine.Cours;



public class CoursDao implements ICoursDao {
	// 1 : Ouverture unitÃ© de travail JPA
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ensup");
	EntityManager em = emf.createEntityManager();

	public void creerCours(Cours cours) {
		emf = Persistence.createEntityManagerFactory("ensup");
		em = emf.createEntityManager();
		// 2 : Ouverture transaction 
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		
		// 3 : Instanciation Objet mÃ©tier
		
		// 4 : Persistance Objet/Relationnel : crÃ©ation d'un enregistrement en base
		 em.persist(cours);
		
		// 5 : Fermeture transaction 
		 tx.commit();
		
		// 6 : Fermeture unitÃ© de travail JPA 
		em.close();
		emf.close();
	}
}
