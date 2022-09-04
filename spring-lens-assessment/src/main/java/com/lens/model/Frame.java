package com.lens.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Frame {
	
	private String frameName;
	
	@Id
	@GeneratedValue(generator = "frame_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "frame_gen", sequenceName = "frame_seq",initialValue = 1000,allocationSize = 1)
	private Integer frameId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Category category;
	
	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "frame_gen")
	private Customer customer;
	private String frameColour;
	private double price;
	public Frame() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Frame(String frameName,  Category category, Customer customer, String frameColour,
			double price) {
		super();
		this.frameName = frameName;
		this.category = category;
		this.customer = customer;
		this.frameColour = frameColour;
		this.price = price;
	}
	public String getFrameName() {
		return frameName;
	}
	public void setFrameName(String frameName) {
		this.frameName = frameName;
	}
	public Integer getFrameId() {
		return frameId;
	}
	public void setFrameId(Integer frameId) {
		this.frameId = frameId;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getFrameColour() {
		return frameColour;
	}
	public void setFrameColour(String frameColour) {
		this.frameColour = frameColour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Frame [frameName=" + frameName + ", frameId=" + frameId + ", category=" + category + ", customer="
				+ customer + ", frameColour=" + frameColour + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}
