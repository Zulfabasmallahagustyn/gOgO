public class gOfood extends gOjek {
    String nama;
    int harga,total;
    int ongkir = 2000;
    gOfood(String nama1, int harga1){
        this.nama =nama1;
        this.harga=harga1;
        total=harga+ongkir;
    }
    void tampilan(){
        System.out.println("Nama makanan  : "+nama);
        System.out.println("Harga makanan : "+harga);
        System.out.println("Biaya order   : "+total);
    }
}