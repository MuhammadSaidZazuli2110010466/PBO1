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
public class datasetBayar {
    private ArrayList<String>idbayar; 
   private ArrayList<String>idbook; 
   private ArrayList<String>bayar;
 private ArrayList<String>nmbank; 
   private ArrayList<String>norek; 
   private ArrayList<String>jmlh;//jumlah bayar
   private ArrayList<String>bukti;//Bukti Bayar
   
   public datasetBayar(){
       idbayar = new ArrayList<>();
        idbook = new ArrayList<>();
        bayar = new ArrayList<>();
        nmbank = new ArrayList<>();
        norek = new ArrayList<>();
        jmlh = new ArrayList<>();
        bukti = new ArrayList<>();
}
 public void addIDBayar(String value){
        this.idbayar.add(value);
    }
    
    public ArrayList<String> getDataIDBayar(){
        return this.idbayar;
    }
     public void addIDBook(String value){
        this.idbook.add(value);
    }
    
    public ArrayList<String> getDataIDBook(){
        return this.idbook;
    }
     public void addBayar(String value){
        this.bayar.add(value);
    }
    
    public ArrayList<String> getDataBayar(){
        return this.bayar;
    }
     public void addNMBank(String value){
        this.nmbank.add(value);
    }
    
    public ArrayList<String> getDataNMBank(){
        return this.nmbank;
    }
     public void addNOREK(String value){
        this.norek.add(value);
    }
    
    public ArrayList<String> getDataNOREK(){
        return this.norek;
    }
     public void addJMLH(String value){
        this.jmlh.add(value);
    }
    
    public ArrayList<String> getDataJMLH(){
        return this.jmlh;
    }
     public void addBukti(String value){
        this.bukti.add(value);
    }
    
    public ArrayList<String> getDataBukti(){
        return this.bukti;
    }

    public void AddNOREK(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object addBayar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}