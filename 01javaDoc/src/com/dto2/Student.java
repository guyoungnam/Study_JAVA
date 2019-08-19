/**
 * 
 */
package com.dto2;

/**
 * @author acorn
 *
 */
public class Student {
	
	private String name;
	private int age;
	
         /**
          * 
          */
	public Student() {}
	
	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * 
	 * @param a
	 * @return
	 */
	public String info(int a) {
		return this.name;
	}
	
	/**
	 * 
	 * @param a
	 * @return
	 * @throws Exception
	 */
	public String info2(int a)throws Exception {
		return this.name;
	
	}
}
