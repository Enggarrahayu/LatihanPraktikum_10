/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpraktikum_10;
import javax.swing.JOptionPane;
/**
 *
 * @author Enggar R S
 */
class setor {
    
        private int saldo;

    public void menabung(int bal, int s) {
        if (s%100!=0) 
        JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin\nSilahkan ulangi kembali!","Transaksi Gagal!", 0);
        else if(s<50000)
            JOptionPane.showMessageDialog(null,
                    "Besaran minimal setor adalah Rp 50000,00");
        else if(s>=50000)
        {
            saldo = bal +s;
            JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar : "+saldo);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public int getsaldo() {
       return saldo;
   }
    
}
