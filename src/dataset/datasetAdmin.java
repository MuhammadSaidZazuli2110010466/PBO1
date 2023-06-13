/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class datasetAdmin {
     private ArrayList<String>admin; 
    private ArrayList<String>namaadmin;
    private ArrayList<String>password;
  
  public datasetAdmin(){
    admin= new ArrayList<>();
    namaadmin= new ArrayList<>();
    password= new ArrayList<>();
  }
  
  public void addNAMAADMIN(String value){
        this.admin.add(value);
    }
    
    public ArrayList<String> getDataNAMAADMIN(){
        return this.admin;
    }
    
    public void addNamaAdmin(String value){
        this.namaadmin.add(value);
    }
    
    public ArrayList<String> getDataNamaAdmin(){
        return this.namaadmin;
    }
    public void addPassword(String value){
        this.password.add(value);
    }
    
    public ArrayList<String> getDataPassword(){
        return this.password;
    }
}
