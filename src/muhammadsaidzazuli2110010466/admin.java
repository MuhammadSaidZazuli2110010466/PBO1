/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadsaidzazuli2110010466;

/**
 *
 * @author SAID
 */
public class admin {
      private String kodeadmin, namaadmin, passadmin, status;
    private String kodeopr;
    public admin(){}

    public admin(String kodeadmin, String namaadmin, String passadmin, String status) {
    this.kodeadmin = kodeadmin;
    this.namaadmin = namaadmin;
    this.passadmin = passadmin;
    this.status = status;
    }
   public void setKODEOPR(String kodeopr){
        this.kodeopr=kodeopr;
    }
    
    public String getKODEOPR(){
        return this.kodeopr;
    }
    public void setNAMAADMIN(String kodeopr){
        this.namaadmin=namaadmin;
    }
    
    public String getPASSADMIN(){
        return this.passadmin;
    }
    public void setSTATUS(String kodeopr){
        this.kodeopr=status;
    }
    
    public String getSTATUS(){
        return this.status;
    }
}
