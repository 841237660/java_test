/*
 * right firstdevelop 20220410;
 */
package com.firstdevelop.boot.entity;

import java.io.Serializable;

/**
 * �H�l�̃G���e�B�e�B�N���X.
 * 
 * @author study
 */
public class Worker implements Serializable{
	
	/**
	 * �o�[�W����ID
	 */
	private static final long serialVersionUID = 7569490938641382259L;

	/**
	 * ���O
	 */
	private String name;
	
	/**
	 * �l
	 */
	private String value;
	
	/**
	 * �N��
	 */
	private int age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
		
		
	}

	public Worker(String name, String value, int age) {
		super();
		this.name = name;
		this.value = value;
		this.age = age;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", value=" + value + ", age=" + age + "]";
	}
	
	
}
