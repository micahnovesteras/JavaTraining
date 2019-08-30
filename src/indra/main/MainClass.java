package indra.main;

import indra.methods.DohPortal;

public class MainClass {
	public static void main (String[] args) {
		System.out.print("Hello World");
		
		DohPortal portal = new DohPortal();
		String name = portal.getName();
		System.out.println(name);
		
		System.out.println(portal.getAge());
		
		String empInfo = String.format("Employee details %s is %s", portal.getEmployee().getEmployeeFullName(), 
				portal.getEmployee().getStatus());
		System.out.println(empInfo);
		System.out.println('Micah');
	}
}
