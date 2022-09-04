package com.lens.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	
	private String customerName;
	@Id
	@GeneratedValue(generator = "customer_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "customer_gen", sequenceName = "customer_seq",initialValue = 1,allocationSize = 1)
	private Integer customerId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	private Integer orderId;
	
//	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
//	@JoinColumn(name = "frame_gen")
//	private Frame frame;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, Address address, Integer orderId) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.orderId = orderId;
	}

	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

//	public Frame getFrame() {
//		return frame;
//	}
//
//	public void setFrame(Frame frame) {
//		this.frame = frame;
//	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", address=" + address + ", orderId=" + orderId + "]";
	}
	
	
	

}
