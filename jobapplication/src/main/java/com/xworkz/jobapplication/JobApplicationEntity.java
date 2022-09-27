package com.xworkz.jobapplication;

import java.io.Serializable;

public class JobApplicationEntity implements Serializable {
	
	private String name;
	private String email;
	private String phoneNo;
	private String alternativePhonNo;
	private String redio;
	private String qualification;
	private String yop;
	private String university;
	private String address;
	private String skill;
	private String salary;
	private String exp;
	private String idProof;
	private String idProofNumber;
	
	public JobApplicationEntity() {
		System.out.println("Entity default constructor");
	}

	public JobApplicationEntity(String name, String email, String phoneNo, String alternativePhonNo, String redio,
			String qualification, String yop, String university, String address, String skill, String salary,
			String exp, String idProof, String idProofNumber) {
		//super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.alternativePhonNo = alternativePhonNo;
		this.redio = redio;
		this.qualification = qualification;
		this.yop = yop;
		this.university = university;
		this.address = address;
		this.skill = skill;
		this.salary = salary;
		this.exp = exp;
		this.idProof = idProof;
		this.idProofNumber = idProofNumber;
	}

	@Override
	public String toString() {
		return "JobApplicationEntity [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", alternativePhonNo=" + alternativePhonNo + ", redio=" + redio + ", qualification=" + qualification
				+ ", yop=" + yop + ", university=" + university + ", address=" + address + ", skill=" + skill
				+ ", salary=" + salary + ", exp=" + exp + ", idProof=" + idProof + ", idProofNumber=" + idProofNumber
				+ "]";
	}
	
	
   
}
