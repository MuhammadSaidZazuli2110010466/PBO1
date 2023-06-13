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
public class datasetRumah {
    private ArrayList<String>tipe; 
    private ArrayList<String>norumah; 
    private ArrayList<String>detail;
    private ArrayList<String>harga;
    private ArrayList<String>jumlah;
   
    public datasetRumah(){
       tipe = new ArrayList<>();
        norumah = new ArrayList<>();
        detail = new ArrayList<>();
        harga = new ArrayList<>();
        jumlah = new ArrayList<>();
        
}
      public void addTipe(String value){
        this.tipe.add(value);
    }
    
    public ArrayList<String> getDataTipe(){
        return this.tipe;
    }
      public void addNoRumah(String value){
        this.norumah.add(value);
    }
    
    public ArrayList<String> getDataNoRumah(){
        return this.norumah;
    }
       public void addDetail(String value){
        this.detail.add(value);
    }
    
    public ArrayList<String> getDataDetail(){
        return this.detail;
    }
      public void addHarga(String value){
        this.harga.add(value);
    }
    
    public ArrayList<String> getDataHarga(){
        return this.harga;
    }
}
