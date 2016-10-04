package ua.com.sun.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.com.sun.entity.Customer;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("primary");
		
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		Customer customer=new Customer("anton", "pepe", 40);
		
		
		
		
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		

	}

}
