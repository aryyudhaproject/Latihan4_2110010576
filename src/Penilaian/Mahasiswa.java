
package Penilaian;


public class Mahasiswa {
     
    private String nama,npm;
    
    public Mahasiswa(String nama,String npm){
        this.npm = npm;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

}
