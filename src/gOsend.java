public class gOsend extends gOjek {
    String nama;
    double jarak,berat,total;
    gOsend(String nama1, double jarak1, double berat1){
        this.nama = nama1;
        this.jarak = jarak1;
        this.berat= berat1;
        total=(berat*2000)+(jarak*1000)+2000;
    }
    void tampilan (){
        System.out.println("Nama barang  : "+nama);
        System.out.println("Berat barang : "+berat+" kg");
        System.out.println("Jarak kirim  : "+jarak+" km");
        System.out.println("Biaya order  : "+total);
    }
}