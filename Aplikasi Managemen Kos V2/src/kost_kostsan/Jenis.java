package kost_kostsan;

public class Jenis{         
    int jenis;
    public int cekhargakost(int jenis){
        if (jenis == 1){
            return 20000 ;
        }      
        else if (jenis == 2){
            return  400000;
        }          
        else if (jenis == 3){
            return 4300000;
        }          
        return 0;
    }
}
