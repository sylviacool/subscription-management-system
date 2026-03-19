package com.example.Subscription;

// Override the User Interface methods in Spouse class
public class Spouse implements User{
    private String name;
    private String memberName = "spouse";
    private int age;
    private Long contact;
    private String address;
    private Plan plan;
    
    
    public Spouse (Plan plan) {
    	this.plan = plan;
    }
    
    @Override
	public void setUserDetails(String name, int age, Long contact, String address) {
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
		
	}
    @Override
    public void getUserDetails() {
        System.out.println("Your details are as follows:");
        System.out.println("Name: " + this.name);
        System.out.println("Member type: " + this.memberName);
        System.out.println("Age: " + this.age);
        System.out.println("Contact: " + this.contact);
        System.out.println("Address: " + this.address);
    }

	@Override
	public Plan getUserPlan() {
		return this.plan;
	}

}
