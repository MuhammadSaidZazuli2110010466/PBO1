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
public class datasetKonsumen {
    private ArrayList<String>idk; 
    private ArrayList<String>nmk; 
    private ArrayList<String>almt;
    private ArrayList<String>notlpn;
    private ArrayList<String>email;
    private ArrayList<String>password;
  
   public datasetKonsumen(){
       idk = new ArrayList<>();
        nmk = new ArrayList<>();
        almt = new ArrayList<>();
        notlpn = new ArrayList<>();
        email = new ArrayList<>();
        password = new ArrayList<>();
   }
        
   public void setIdIDK(String value){
       this.idk = idk;
   } 
    
    public ArrayList<String>getIdIDK(String value){
        return this.idk;
    }
    
    public void setNMK(String value){
        this.nmk = nmk;
    }
    public ArrayList<String> getNMK(String value){
        return this.nmk;
    }
    
    public void setALMT(String value){
        this.almt = almt;
    }
    
    public ArrayList<String>GetALMT(String value){
        return this.almt;
    }
    
    public void setNOTLPN(String value){
        this.notlpn = notlpn;
    }
    public ArrayList<String>GetNOTLPN(String value){
        return this.notlpn;
    }
    public void setEMAIL(String value){
     this.email = email;
    }
 
    public ArrayList<String>getEMAIL(){
     return this.email;
    }
    
    public void setPASSWORD(String value){
        this.password = password;
    }
    
    public ArrayList<String> getPASSWORD(){
        return this.password;
    } 
    
    
    
    
}
