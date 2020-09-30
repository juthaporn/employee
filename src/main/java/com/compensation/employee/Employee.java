package com.compensation.employee;

public class Employee {
	private String empId;
	private String empName;
	private double sell;
	private double salary = 0;
	private double compensation;
	
	public Employee() {
		
	}
	
	public Employee(String empId,String empName,double salary){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.compensation = salary;
	}
	
	public boolean isSellInBoundary(double sell) {
		boolean isResult;
		if(sell >= 1 && sell <= 50000) 
			isResult = true;
		else if(sell >= 50001)
			isResult = true;
		else
			isResult = false;
		return isResult;
	}
	
	public boolean isSalaryInBoundary(double salary) {
		boolean isResult;
		if(salary >= 1) 
			isResult = true;
		else
			isResult = false;
		return isResult;
	}
	
	
	public double calCompensation() {
		double commission;
		if(this.sell>=1 && this.sell<=50000) {
			commission = Math.round(this.salary + (this.sell*0.05));
		}
		else if(this.sell>=50001) {
			commission = Math.round(this.salary + (this.sell*0.1));
		}
		else {
			commission = Math.round(this.salary);
		}
		return commission;
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCompensation() {
		return this.compensation;
	}
	
	public double getSell() {
		return this.sell;
	}

	public void setSell(double sell) {
		this.sell = sell;
		this.compensation = this.calCompensation();
	}
	public String displayEmployee() {
		return "\nID: "+this.getEmpId()+"\nName: "+this.getEmpName()+"\nSalary: "+this.getSalary()+"\nSell: "
				+this.getSell()+"\nCompensation: "+this.getCompensation();
    }	
	public String toString() {
		return "\nEmployee Name: "+this.getEmpName()+"\nCompensation: "+this.getCompensation();
	}
	
	
}
