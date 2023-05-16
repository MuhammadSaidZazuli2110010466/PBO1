/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammadsaidzazuli2110010466;

/**
 *
 * @author USER
 */
public class MenuUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         konsumen obj = new konsumen();
          obj.setIdIDK("000");
        obj.setNMK("Muhammad Said Zazuli");
        obj.setALMT("Kuala Kapuas");
        obj.setNOTLPN("082159962190");
        obj.setEMAIL("zulozali51@gmail.com");
        obj.setNOKTP("62089192312");
        obj.setKTP("Indonesia");
        obj.setNPWP("121231");
        obj.setPASSWORD("Panjul");
        obj.setNOKK("42091169");
        obj.setKK("Indonesia");
        obj.setSGAJI("90000");
        obj.setPKJ("Modder");
        obj.setPGS("2500000");
        obj.setSK("Hadir");
        
         System.out.println("\n ID Pelanggan : "+ obj.getIdIDK()+"\n Nama Pelanggan : "+ obj.getNMK()+"\n Alamat : " +obj.GetALMT()+"\n No Telpon : " +obj.GetNOTLPN()+"\n Email : " +obj.getEMAIL()+"\n No KTP : " +obj.getNOKTP()+"\n KTP : " +obj.getKTP()+"\n NPWP : "+obj.getNPWP()+"\n Password : " +obj.getPASSWORD()+"\n No KK : "+obj.getNOKK()+"\n KK : "+obj.getKK()+"\n Slip Gaji : " +obj.getSGAJI()+"\n Pekerjaan : "+obj.getPKJ()+"\n Penghasilan : "+obj.getPGS()+"\n Surat Keterangan : "+obj.getSK());

        
        
    }
    
}
