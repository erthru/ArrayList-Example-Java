/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erthru.arraylistexamplejava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author supriantodjamalu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    Scanner sc = new Scanner(System.in);
    ArrayList<People> data = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Main main = new Main();
        main.prepare();
        
    }
    
    private void prepare(){
        
        System.out.println(
                "Welcome to contact App.\n"
                        + "----------------------------\n"
                        + "1. All Contact\n"
                        + "2. New Contact\n"
        );
        System.out.print("Option(1/2) : ");
        String option = sc.nextLine();
        
        switch(option){
            case "1":
                allData();
                break;
            case "2":      
                System.out.print("Input name : ");
                String name = sc.nextLine();
                System.out.print("Input phone number : ");
                String phone = sc.nextLine();
                saveData(new People(name,phone));
                break;
            default:
                System.out.println("Option invalid.");
                break;
        }
        
    }
    
    private void saveData(People people){
        data.add(people);
        System.out.println("Contact added.\n");
        prepare();
    }
    
    private void allData(){
        if(data.size() == 0){
            System.out.println("Empty.\n");
            prepare();
        }else{
            
            for(int i=0; i<data.size(); i++){
                System.out.println((i+1)+". "+data.get(i).getName()+" - "+data.get(i).getPhone());
            }
            System.out.println("\n");
            prepare();
            
        }
    }
    
}
