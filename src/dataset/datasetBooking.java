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
public class datasetBooking {
    private ArrayList<String>idbk; 
   private ArrayList<String>idk; 
   private ArrayList<String>admin;
 private ArrayList<String>tgl; 
   private ArrayList<String>status; 
   private ArrayList<String>verifikasi;
   
   public datasetBooking(){
       idbk = new ArrayList<>();
        idk = new ArrayList<>();
        admin = new ArrayList<>();
        tgl = new ArrayList<>();
        status = new ArrayList<>();
        verifikasi = new ArrayList<>();
}
    public void addIDBK(String value){
        this.idbk.add(value);
    }
    
    public ArrayList<String> getDataNAMAADMIN(){
        return this.idbk;
    }
     public void addIDK(String value){
        this.idk.add(value);
    }
    
    public ArrayList<String> getDataIDK(){
        return this.idk;
    }
     public void addAdmin(String value){
        this.admin.add(value);
    }
    
    public ArrayList<String> getDataAdmin(){
        return this.admin;
    }
     public void addTanggal(String value){
        this.tgl.add(value);
    }
    
    public ArrayList<String> getDataTanggal(){
        return this.tgl;
    }
     public void addStatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    public void addVerif(String value){
        this.verifikasi.add(value);
    }
    
    public ArrayList<String> getDataVerif(){
        return this.verifikasi;
    }
}
