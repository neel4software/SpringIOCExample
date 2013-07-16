package com.beingjavaguys.domain;

public class StudentImpl implements Student {

	private StudentAddress studentAddress;
	private StudentPhoneNumber studentPhone;
	
	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}

	public StudentImpl(StudentPhoneNumber studentPhone){
		this.studentPhone =  studentPhone;
	}
	
	@Override
	public String getStudentDetails() {
		// TODO Auto-generated method stub
		return "Address : "+studentAddress.getStudentAddress()+" and Phone : "+studentPhone.getStudentPhone();
	}
	
	
}
