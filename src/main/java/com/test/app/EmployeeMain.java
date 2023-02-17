/**
 * 
 */
package com.test.app;

import java.util.Date;

/**
 * @author varsh
 *
 */
public class EmployeeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setFirstName("Varsha");
		emp.setLastName("B");
		emp.setBirtDate(new Date());
		emp.setMobileNo(123456789);
		System.out.println("FirsName:" + emp.getFirstName());
		System.out.println("LastName:" + emp.getLastName());
		System.out.println("BirtDate:" + emp.getBirtDate());
		System.out.println("MobileNo:" + emp.getMobileNo());
	}

}
