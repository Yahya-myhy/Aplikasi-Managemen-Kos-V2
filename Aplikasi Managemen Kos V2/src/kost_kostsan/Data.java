package kost_kostsan;

public class Data {
    private String nama;
    private String nop;
    private int  jenis;
    private int tgl;
    private int bln;
    private int thn;
    private boolean bayar;
    
    public int getTgl() {
        return tgl;
    }

    public void setTgl(int tgl) {
        this.tgl = tgl;
    }

    public int getBln() {
        return bln;
    }

    public void setBln(int bln) {
        this.bln = bln;
    }

    public int getThn() {
        return thn;
    }

    public void setThn(int thn) {
        this.thn = thn;
    }
    
    public boolean isBayar() {
        return bayar;
    }

    public void setBayar(boolean bayar) {
        this.bayar = bayar;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNop() {
        return nop;
    }

    public void setNop(String nop) {
        this.nop = nop;
    }

    public int getJenis() {
        return jenis;
    }

    public void setJenis(int jenis) {
        this.jenis = jenis;
    }

}