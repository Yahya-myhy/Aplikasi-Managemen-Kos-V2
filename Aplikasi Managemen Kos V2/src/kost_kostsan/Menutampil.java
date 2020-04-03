package kost_kostsan;

import java.util.Scanner;

public class Menutampil {
    IsiMenu tampil = new IsiMenu();       
    Scanner cin = new Scanner(System.in);
   
    public static void main(String[] args) {       
        Menutampil modul = new Menutampil(); 
        modul.menuUtama();
    }
    public void menuUtama(){
        
        int a;
        System.out.println("1. pemilik ");
        System.out.println("2. ngekost");
        System.out.print("pilih : ");
        a = cin.nextInt();
        if (a == 1){
          
            System.out.print("username : ");
            String user = cin.next();
            System.out.print("password : ");
            int pass = cin.nextInt(); 
                if(pass == 123 && user.equals("kiki")){
                     System.out.println("pemilik kost");
                     datapemilik();
                     showMenupemilik();
                }
                else 
                 System.out.println("salah");
                menuUtama();
           }
        
        else if (a == 2) {
               System.out.println("pengekost");
               inputDatangekost();
               showmenungekost();
        }
        else {
              System.out.println("inputan salah");
             ulang();
        }
    }
    
    public void datapemilik(){
        tampil.tpemilik();
    }
    
    public void inputDatangekost(){
        tampil.inputngekost();
    }
    
    public void ulang(){
        System.out.println("ulangi");
        String ulang = cin.next();
        if (ulang.equals("y")){
            menuUtama();
        }else {
            System.out.println("keluar");
        }
        
    }
    
    public void ulangiLagi(){
         System.out.println("\nUlangi Lagi : (y/n)");
         String ulang = cin.next();
         if(ulang.equals("y")){
             showMenupemilik();
         }else{
             System.out.print("Selesai");
         }
    }
    
    public void ulangiLagi1(){
         System.out.println("\nUlangi Lagi : (y/n)");
         String ulang = cin.next();
         if(ulang.equals("y")){
             showmenungekost();
         }else{
             System.out.print("Selesai");
         }
    }
    
    public void showmenungekost(){
               System.out.println("Menu : \n1.informasi pemilik\n2.informasi saya\n3.cek harga\n4.bayar\n5.selesai\n");
               int pil = cin.nextInt();
               switch(pil){
                case 1:        
                    System.out.println("informasi pemililk : ");
                    tampil.tpemilik();
                    ulangiLagi1();
                    break;
                case 2:
                    System.out.println("masukkan nama");
                    tampil.namapengekost(cin.next());
                    ulangiLagi1();
                    break;
                case 3:        
                    System.out.println("Masukkan Nama yang dicek : ");
                    tampil.hargakost(cin.next());
                    ulangiLagi1();
                    break;
                case 4:
                    System.out.println("Masukkan Nama yang dicek : ");
                    tampil.bayarkost(cin.next());
                    ulangiLagi1();
                    break;
                case 5:
                    System.out.println("selesai... \nkembali ke menu utama");
                    menuUtama();
                    break;
                default:
                    System.out.println("inputan salah");
                    ulangiLagi1();
                    break;
           }
    }
      
    public void showMenupemilik(){
        System.out.println("Menu\n1.Tampilkan Seluruh Data pengekost\n2.cek waktu bayar kost\n3.Laporan Pendapatan\n"
                + "4.yang sudah bayar\n5.selesai\n");
        System.out.print("Masukkan Pilihan Menu : ");
            int pilihan = cin.nextInt();
            switch(pilihan){
                case 1:
                    tampil.outputpengekost();
                    ulangiLagi();
                    break;
                case 2:
                    System.out.println("Masukkan Nama yang dicek : ");
                    tampil.cekwaktu(cin.next());
                    ulangiLagi();
                    break;
                
                case 3:
                    System.out.println("laporan pendapatan pemilik");
                    tampil.laporanPendapatan();
                    ulangiLagi();
                    break;
                case 4:
                    tampil.sudahbelumbayar();
                    ulangiLagi();
                    break;
                case 5:
                    System.out.println("selesai ... \n masuk ke menu utama lagi");
                    menuUtama();
                    break;
                default:
                    System.out.println("Menu gak ada.....");
                    ulangiLagi();
                    break;     
            }
    }
}