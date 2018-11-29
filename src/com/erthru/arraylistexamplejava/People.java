/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erthru.arraylistexamplejava;

/**
 *
 * @author supriantodjamalu
 */
public class People {
    
    private String name;
    private String phone;
    
    public People(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public People(){
        
    }
    
}
