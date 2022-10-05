/*
Billy Achmad Bachrudin
Kelas : TI21F
NIM   : 20210040100
*/
public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    String getJenisHp(){
        return this.jenis_hp;
    }

    int getTahunPembuatan(){
        return this.tahun_pembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("Iphone 14 Pro Max", 2022);
        System.out.println(hp.getJenisHp());
        System.out.println(hp.getTahunPembuatan());
    }
}