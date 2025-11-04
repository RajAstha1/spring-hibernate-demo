package com.example.bean;

/**
 * Sample Bean class for dependency injection demonstration
 */
public class Bean {
    
    private String message;
    private AnotherBean anotherBean;
    
    // Default constructor
    public Bean() {
        this.message = "Default Message";
    }
    
    // Constructor injection
    public Bean(String message) {
        this.message = message;
    }
    
    // Setter injection
    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
    
    public void displayMessage() {
        System.out.println("Bean Message: " + message);
    }
    
    public void callAnotherBean() {
        if (anotherBean != null) {
            anotherBean.printInfo();
        }
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public AnotherBean getAnotherBean() {
        return anotherBean;
    }
}
