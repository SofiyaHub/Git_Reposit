package ua.com.sun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="magazin")

public class Shop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="shop_name")
	private String name;
	@Column(length=30)
	private String adress;
	
	public Shop() {
		// TODO Auto-generated constructor stub
	}

	public Shop(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	
	
	

}
