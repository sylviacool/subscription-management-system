package com.example.Subscription;


public class Self implements User{

    private String name;
    private String memberName = "self";
    private int age;
    private Long contact;
    private String address;
    
	@Override
	public void setUserDetails(String name, int age, Long contact, String address) {
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
		
	}
	@Override
	public void getUserDetails() {
		System.out.println(this.name + memberName + this.age + this.contact + this.address);
		
	}

}
