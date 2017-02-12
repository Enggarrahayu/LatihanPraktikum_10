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
public class Tarik {
    private int saldo;
    public void ambil (int tab, int t){
        if(t%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uahg koin, Silahkan ulangi lagi","Transaksi Gagagl", 0);
        else{
            if (t>tab)
            JOptionPane.showMessageDialog(null, "Saldo Anda tidak mencukupi\nSilahkan lakukan penyetoran","Transaksi Gagal",0);
            else if(t<50000)
                JOptionPane.showMessageDialog(null, "Besaran pengambilan minimal tunai adalah Rp 50000","Transaksi Gagal",0);
            {
                
            }
        }
    }

    int getsaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
