package kost_kostsan;

public class Bayar {
    Data data;

    public Bayar(Data data) {
        this.data = data;
    }
    
    public Data lakukanPembayaran(){
        data.setBayar(true);        
        return data;
    }
}
