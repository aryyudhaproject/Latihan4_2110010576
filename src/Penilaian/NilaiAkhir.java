
package Penilaian;


public class NilaiAkhir extends Mahasiswa {
   private int uas,uts,tugas;
   
        public NilaiAkhir (String nama, String npm, int uts,int uas, int tugas){
            super (nama,npm);
            this.uas = uas;
            this.uts = uts;
            this.tugas = tugas;
            
        }

    public int getUas() {
        return uas;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }

    public int getUts() {
        return uts;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public int getTugas() {
        return tugas;
    }

    public void setTugas(int tugas) {
        this.tugas = tugas;
    }
        
  public double hitungNilaiAkhir(){
      return (0.30*uts) +(0.30*uas)+ (0.40*tugas);
  }
}
