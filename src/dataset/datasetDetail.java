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
public class datasetDetail {
    private ArrayList<String>idbk; 
    private ArrayList<String>tipe;
    private ArrayList<String>jumlah;
    private ArrayList<String>harga;
    
    public datasetDetail(){
       idbk = new ArrayList<>();
        tipe = new ArrayList<>();
        jumlah = new ArrayList<>();
        harga = new ArrayList<>();
         
}
 public void addIDBK(String value){
        this.idbk.add(value);
    }
    
    public ArrayList<String> getDataIDBK(){
        return this.idbk;
    }
     public void addTipe(String value){
        this.tipe.add(value);
    }
    
    public ArrayList<String> getDataTipe(){
        return this.tipe;
    }
     public void addJumlah(String value){
        this.jumlah.add(value);
    }
    
    public ArrayList<String> getDataJumlah(){
        return this.jumlah;
    }
     public void addHarga(String value){
        this.harga.add(value);
    }
    
    public ArrayList<String> getDataHarga(){
        return this.harga;
    }
}