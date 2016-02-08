package com.webservices.rest;

public class Greeting {	
  
    private String greeting;
     
    public Greeting() {
    	this.greeting = "Hello World !";
    }
     
    public Greeting(String name) {
    	if (name != null) {
    		this.greeting = "Hello " + name;    		
    	}
    	else {
    		this.greeting = "Hello World !";
    	}        
    } 
 
    public String getMessage() {
        return greeting;
    }
 
    public void setMessage(String name) {
        this.greeting = name;
    }
     
    @Override
    public String toString() {
        return "Employee [greeting=" + greeting + "]";
    }
}
