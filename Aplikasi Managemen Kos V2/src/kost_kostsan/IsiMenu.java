package kost_kostsan;

import java.util.Scanner;

public class IsiMenu extends Jenis{
    Scanner cin = new Scanner(System.in);
    Data[] arrayData = new Data[50];
    int jum ;
    int tanggal;
    int bulan;
    int tahun;
    String namapem = "Nour Haqiki";
    String nopem = "08123321123";
    String alamat = "jl.semolowaru Gg.1 no.90 kodepos : 61168";
    
    public void tpemilik(){
        System.out.println("nama pemilik \t\t: " + namapem);
        System.out.println("no.telepon pemilik \t: " + nopem);
        System.out.println("alamat pemilik \t\t: " + alamat);
    }
    
    public void inputngekost(){
        System.out.print("masukkan tanggal sekarang");
        tanggal = cin.nextInt();
        System.out.print("masukkan bulan sekarang");
        bulan = cin.nextInt();
        System.out.print("masukkan tahun sekarang");
        tahun = cin.nextInt();
        System.out.print("masukkan jumlah pengekost = ");
        jum = cin.nextInt();
        for (int i = 0; i < jum; i++){
            Data data = new Data();
            System.out.print("masukkan nama = ");
            data.setNama(cin.next());
            System.out.print("masukkan jenis harga (harga(1.hari) - harga(1.bulan) - harga(1.tahun)) = ");
            data.setJenis(cin.nextInt());
            System.out.print("masukkan no.handphone = ");
            data.setNop(cin.next());
            System.out.print("masukkan tanggal masuk = ");
            data.setTgl(cin.nextInt());
            System.out.print("masukkan bulan masuk = ");
            data.setBln(cin.nextInt());
            System.out.print("masukkan tahun masuk = ");
            data.setThn(cin.nextInt());
            
            arrayData[i] = data;
        }
    }
    
    public void namapengekost(String nama){
        for (int i = 0; i<jum; i++){
        if (nama.equals(arrayData[i].getNama())){            
            System.out.println("======================================");
            System.out.println("nama : "+arrayData[i].getNama());
            System.out.println("jenis : "+arrayData[i].getJenis());
            System.out.println("no.handphone : "+arrayData[i].getNop());
            System.out.println("tanggal masuk : "+arrayData[i].getTgl() +" - "+arrayData[i].getBln()+ " - " +arrayData[i].getThn());
            System.out.println("======================================");
         }
        }  
    }
    
    public void outputpengekost(){
        for (int i = 0; i<jum; i++){
            System.out.println("======================================");
            System.out.println("nama : "+arrayData[i].getNama());
            System.out.println("jenis : "+arrayData[i].getJenis());
            System.out.println("no.handphone : "+arrayData[i].getNop());
            System.out.println("tanggal masuk : "+arrayData[i].getTgl() +" - "+arrayData[i].getBln()+ " - " +arrayData[i].getThn());
            System.out.println("======================================");
            
        }       
    }
    
    public void hargakost(String nama){
        for (int i = 0; i<jum; i++){
            if(nama.equals(arrayData[i].getNama())){
                System.out.println("harga kost anda adalah : Rp."+ cekhargakost(arrayData[i].getJenis()));
                return;
            }
        }
        System.out.println("Data tidak ada");
    }
    
    public void bayarkost(String nama){
        Bayar bayar;
        for (int i = 0; i<jum; i++){
            if(nama.equals(arrayData[i].getNama())){
                bayar = new Bayar(arrayData[i]);
                System.out.println("harga kost anda adalah : Rp."+ cekhargakost(arrayData[i].getJenis()));
                System.out.print("masukkan Nominal = Rp.");
                int nominal = cin.nextInt();
                if(nominal<cekhargakost(arrayData[i].getJenis())){
                    System.out.println("nominal kurang");
                }else{
                    arrayData[i] =  bayar.lakukanPembayaran();
                    System.out.println("Pembayaran anda berhasil");
                    int kembalian = nominal - cekhargakost(arrayData[i].getJenis());
                    if(kembalian!=0){
                    System.out.println("Kembalian anda adalah Rp "+kembalian);
                    }
                }               
                return;
            }
        }
        System.out.println("Data tidak ada");
    }
    
    public void laporanPendapatan(){
        int jumlahPendapatan=0;
        for (int i = 0; i<jum; i++){
            if(arrayData[i].isBayar()){
                jumlahPendapatan+=cekhargakost(arrayData[i].getJenis());
            }
        }
        System.out.println("Laporan Pendapat hasil pembayaran kost adalah = Rp."+jumlahPendapatan);
    }
    
    public void cekwaktu(String nama){
        int wkt1 , wkt2 , wkt3;
        for (int i = 0; i<jum; i++){
              if(nama.equals(arrayData[i].getNama())){
                  wkt1 = arrayData[i].getTgl() - tanggal;
                  wkt2 = arrayData[i].getBln() - bulan;
                  wkt3 = arrayData[i].getThn() - tahun;
                  
                  if (wkt1 < 1 && wkt2 < 1 && wkt3 < 1){
                      System.out.println("sudah waktunya bayar kost");
                  }
                  else{
                  System.out.println("waktu bayar kost tinggal " + wkt1 + " - " + wkt2 + " - " + wkt3 + " - ");
            
                  }
            }
        }
    }
    
    public void sudahbelumbayar(){
        System.out.println("cek data yang sudah atau belum bayar");
        for (int i = 0 ; i < jum ; i++){
            if(arrayData[i].isBayar() == true){
                System.out.println("sudah bayar = " + arrayData[i].getNama());
            } 
            else {
                 System.out.println("belum bayar = " + arrayData[i].getNama());
            }
        }
    }
}
