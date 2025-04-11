package method.perubahan;
import javax.swing.JOptionPane;
/**
 *
 * @author ThinkPad
 */
public class MethodPerubahan {
    
    public double luas_lingkaran(int diameter){
    double jari2 = diameter / 2.0;
    return Math.PI * Math.pow(jari2,2);
}
public double volume_tabung(int diameter, double tinggi){
    double jari2 = diameter / 2.0;
    return Math.PI * Math.pow(jari2,2);   
    }
public double volume_kerucut(int diameter, double tinggi){
    double jari2 = diameter / 2.0;
    return (1.0 / 3) * Math.PI * Math.pow(jari2,2)*tinggi;     
}
public double volume_bola(int diameter){
    double jari2 = diameter / 2.0;
    return (1.0 / 3) * Math.PI * Math.pow(jari2,3);     
}
    public static void main(String[] args) {
        MethodPerubahan mtp = new MethodPerubahan();
        try {
            //ambil input diameter
            String inputDiameter = JOptionPane.showInputDialog(null, "Masukkan diameter lingkaran:");
            int diameter  = Integer.parseInt(inputDiameter);
            
            //ambil input tinggi
            String inputTinggi = JOptionPane.showInputDialog(null, "Masukkan tinggi bangun (untuk tabung/kerucut):");
            int tinggi  = Integer.parseInt(inputTinggi);
            
            //hitung hasil
            double luas = mtp.luas_lingkaran(diameter);
            double volTabung = mtp.volume_tabung(diameter, tinggi);
            double volKerucut = mtp.volume_kerucut(diameter, tinggi);
            double volBola = mtp.volume_bola(diameter);
            
            //tampilkan hasil
            String hasil = "Hasil Semua Perhitungan \n"
                        +"Luas Lingkaran   : " + String.format("%.2f",luas)+"\n"
                        +"Volume Tabung    : " + String.format("%.2f",volTabung)+"\n"
                        +"Volume Kerucut   : " + String.format("%.2f",volKerucut)+"\n"
                        +"Volume Bola      : " + String.format("%.2f",volBola);
            JOptionPane.showMessageDialog(null, hasil, "Hasil hitung", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Input tidak valid! Mohon masukkan angka yang benar.","Error",JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}