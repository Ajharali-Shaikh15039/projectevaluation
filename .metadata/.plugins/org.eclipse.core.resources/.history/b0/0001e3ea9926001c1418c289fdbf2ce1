package com.mastek.Pizzania.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="pizza_items")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value= {"createdAt","udpatedAt"},allowGetters=true)
public class Pizzania {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int pid;
	private String p_name;
	private int p_amount;
	@Lob
	private byte[] p_image;
	public Pizzania() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pizzania(int pid, String p_name, int p_amount, byte[] p_image) {
		super();
		this.pid = pid;
		this.p_name = p_name;
		this.p_amount = p_amount;
		this.p_image = p_image;
	}

	public byte[] getP_image() {
		return p_image;
	}

	public void setP_image(byte[] p_image) {
		this.p_image = p_image;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_amount() {
		return p_amount;
	}
	public void setP_amount(int p_amount) {
		this.p_amount = p_amount;
	}
	
	
}
