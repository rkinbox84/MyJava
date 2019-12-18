package com.rk.java.collectionspkg.comparatorImpl;

public class Employee {
	

	String userID;
	int age;
	String role;
	
	public Employee(String userID, int age, String role) {
		super();
		this.userID = userID;
		this.age = age;
		this.role = role;
	}
	
	public Employee(EmployeeBuilder builder) {
		super();
		this.userID = builder.userID;
		this.age = builder.age;
		this.role = builder.role;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public Integer getAge() {
		return age;
	}

	public String getRole() {
		return role;
	}
	

	@Override
	public String toString() {
		return "Employee [userID=" + userID + ", age=" + age + ", role=" + role + "]";
	}

	
	public static class EmployeeBuilder {
		
		String userID;
		int age;
		String role;
		

		public EmployeeBuilder setUserID(String userID) {
			this.userID = userID;
			return this;
		}

		public EmployeeBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilder setRole(String role) {
			this.role = role;
			return this;
		}

		
		public Employee build() {
			Employee emp = new Employee(this);
			return emp;
		}
		
		
		
		
	}
	

}
