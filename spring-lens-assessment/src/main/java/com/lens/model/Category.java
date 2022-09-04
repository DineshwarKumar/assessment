package com.lens.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Category {
	
	@Column(length = 25)
	private String categoryName;
	@Id
	@GeneratedValue(generator = "category_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "category_gen", sequenceName = "category_seq",initialValue = 10,allocationSize = 1)
	private Integer categoryId;
	@Column(length = 20)
	private String lensColour;
	
//	@OneToOne
//	private Frame frame;
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String categoryName, String lensColour) {
		super();
		this.categoryName = categoryName;
		this.lensColour = lensColour;
	}

	

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getLensColour() {
		return lensColour;
	}

	public void setLensColour(String lensColour) {
		this.lensColour = lensColour;
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
		return "Category [categoryName=" + categoryName + ", lensColour=" + lensColour + "]";
	}
	
	
	

}
