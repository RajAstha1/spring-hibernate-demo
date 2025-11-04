package com.example.bean;

/**
 * Another sample Bean class for dependency injection demonstration
 */
public class AnotherBean {
    
    private String info;
    
    public AnotherBean() {
        this.info = "AnotherBean Default Info";
    }
    
    public AnotherBean(String info) {
        this.info = info;
    }
    
    public void printInfo() {
        System.out.println("AnotherBean Info: " + info);
    }
    
    public String getInfo() {
        return info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }
}
