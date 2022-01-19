import java.util.Locale;
import java.util.Scanner;

public class gOgO {
    //method
    public static void intro(){
        System.out.println ("===================GG===================");
        System.out.println ("|||    SELAMAT DATANG/ WELCOME TO    |||");
        System.out.println ("|||               gOgO               |||");
        System.out.println ("|||                                  |||");
        System.out.println ("----------------------------------------");
    }
    //method
    public static void bhs(){
        System.out.println("PILIH BAHASA/ LANGUAGE PREFERENCE");
        System.out.println("1. INDONESIA");
        System.out.println("2. ENGLISH");
        System.out.print("PILIHAN/ OPTION -> ");
    }
    public static void main(String[] args) {
        //variable
        String username;
        int password, menu, bahasa, login, pilihan, pilih1, pilih2, pilih3;
        //array
        String[] user = {"daniel"};
        int[] pass = {101296};
        String[] kota = {"Seoul", "Busan", "Jeju"};
        String[] makanan = {"Samyang", "Ramyeon", "Mie"};
        String[] barang = {"Kain", "Plastik", "Kaca"};
        Scanner input = new Scanner(System.in);
        //looping
        do {
            intro();
            System.out.println("\t\t\tMASUK/ LOGIN");
            System.out.print("Masukkan Username/ Enter Username : ");
            username = input.nextLine();
            String u = username.toLowerCase(Locale.ROOT);
            System.out.print("Masukkan Password/ Enter Password : ");
            password = input.nextInt();
            //percabangan
            if (u.equals(user[0]) && password == pass[0]) {
                //looping
                do {
                    //exception handling
                    try {
                        bhs();
                        pilihan = input.nextInt();
                        //percabangan
                        switch (pilihan) {
                            case 1 -> {
                                //looping
                                do {
                                    //exception handling
                                    try {
                                        System.out.println("Silahkan Pilih Menu ");
                                        System.out.println("1. gOride");
                                        System.out.println("2. gOfood");
                                        System.out.println("3. gOsend");
                                        System.out.println("4. Keluar");
                                        System.out.print("Masukkan Pilihan : ");
                                        int pilih = input.nextInt();
                                        //percabangan
                                        switch (pilih) {
                                            case 1 -> {
                                                System.out.println("Anda Memilih Menu gOride Silahkan Pilih");
                                                System.out.println("1. Seoul - Busan");
                                                System.out.println("2. Busan - Jeju");
                                                System.out.println("3. Jeju - Seoul");
                                                System.out.println("4. Kembali");
                                                System.out.print("Masukkan Pilihan : ");
                                                pilih1 = input.nextInt();
                                                //percabangan
                                                switch (pilih1) {
                                                    case 1 -> {
                                                        gOride a = new gOride(kota[0], kota[1], 2000, 7);
                                                        a.tampilan();
                                                    }
                                                    case 2 -> {
                                                        gOride b = new gOride(kota[1], kota[2], 2000, 5);
                                                        b.tampilan();
                                                    }
                                                    case 3 -> {
                                                        gOride c = new gOride(kota[2], kota[0], 2000, 3);
                                                        c.tampilan();
                                                    }
                                                    case 4 -> {}
                                                    default -> System.out.println("Pilihan Anda Salah");
                                                }
                                            }
                                            case 2 -> {
                                                System.out.println("Anda Memilih Menu gOfood Silahkan Pilih");
                                                System.out.println("1. Samyang");
                                                System.out.println("2. Ramyeon");
                                                System.out.println("3. Mie");
                                                System.out.println("4. Kembali");
                                                System.out.print("Masukkan Pilihan : ");
                                                pilih2 = input.nextInt();
                                                switch (pilih2) {
                                                    case 1 -> {
                                                        gOfood a = new gOfood(makanan[0], 15000);
                                                        a.tampilan();
                                                    }
                                                    case 2 -> {
                                                        gOfood b = new gOfood(makanan[1], 10000);
                                                        b.tampilan();
                                                    }
                                                    case 3 -> {
                                                        gOfood c = new gOfood(makanan[2], 5000);
                                                        c.tampilan();
                                                    }
                                                    case 4 -> {}
                                                    default -> System.out.println("Pilihan Anda Salah");
                                                }
                                            }
                                            case 3 -> {
                                                System.out.println("Anda Memilih Menu gOsend Silahkan Pilih");
                                                System.out.println("1. Barang Kain");
                                                System.out.println("2. Barang Plastik");
                                                System.out.println("3. Barang Kaca");
                                                System.out.println("4. Kembali");
                                                System.out.print("Masukkan Pilihan : ");
                                                pilih3 = input.nextInt();
                                                switch (pilih3) {
                                                    case 1 -> {
                                                        gOsend a = new gOsend(barang[0], 5.5, 1);
                                                        a.tampilan();
                                                    }
                                                    case 2 -> {
                                                        gOsend b = new gOsend(barang[1], 5.5, 2);
                                                        b.tampilan();
                                                    }
                                                    case 3 -> {
                                                        gOsend c = new gOsend(barang[2], 5.5, 3);
                                                        c.tampilan();
                                                    }
                                                    case 4 -> {}
                                                    default -> System.out.println("Pilihan Anda Salah");
                                                }
                                            }
                                            case 4 -> {System.out.println("TERIMAKASIH SUDAH MENGGUNAKAN gOgO");
                                                System.exit(0);}
                                            default -> System.out.println("Pilihan Anda Salah");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Masukkan Angka Bukan Huruf!");
                                    }
                                    input.nextLine();
                                    System.out.println("\nTEKAN 0 UNTUK KEMBALI KE MENU");
                                    System.out.print("-> ");
                                    menu = input.nextInt();
                                    ++menu;
                                }
                                while (menu <= 1);
                            }
                            case 2 -> {
                                //looping
                                do {
                                    //exception handling
                                    try {
                                        System.out.println("Please Select Menu ");
                                        System.out.println("1. gOride");
                                        System.out.println("2. gOfood");
                                        System.out.println("3. gOsend");
                                        System.out.println("4. Exit");
                                        System.out.print("Enter Option : ");
                                        int pilih = input.nextInt();
                                        //percabangan
                                        switch (pilih) {
                                            case 1 -> {
                                                System.out.println("You Select the gOride menu, Please Select");
                                                System.out.println("1. Seoul - Busan");
                                                System.out.println("2. Busan - Jeju");
                                                System.out.println("3. Jeju - Seoul");
                                                System.out.println("4. Back");
                                                System.out.print("Enter Option : ");
                                                pilih1 = input.nextInt();
                                                //percabangan
                                                switch (pilih1) {
                                                    case 1 -> {
                                                        gOride a = new gOride(kota[0], kota[1], 2000, 7);
                                                        a.tampilan();
                                                    }
                                                    case 2 -> {
                                                        gOride b = new gOride(kota[1], kota[2], 2000, 5);
                                                        b.tampilan();
                                                    }
                                                    case 3 -> {
                                                        gOride c = new gOride(kota[2], kota[0], 2000, 3);
                                                        c.tampilan();
                                                    }
                                                    case 4 -> {}
                                                    default -> System.out.println("Your Choice is Wrong");
                                                }
                                            }
                                            case 2 -> {
                                                System.out.println("You Select the gOfood menu, Please Select");
                                                System.out.println("1. Samyang");
                                                System.out.println("2. Ramyeon");
                                                System.out.println("3. Mie");
                                                System.out.println("4. Back");
                                                System.out.print("Enter Option : ");
                                                pilih2 = input.nextInt();
                                                //percabangan
                                                switch (pilih2) {
                                                    case 1 -> {
                                                        gOfood a = new gOfood(makanan[0], 15000);
                                                        a.tampilan();
                                                    }
                                                    case 2 -> {
                                                        gOfood b = new gOfood(makanan[1], 10000);
                                                        b.tampilan();
                                                    }
                                                    case 3 -> {
                                                        gOfood c = new gOfood(makanan[2], 5000);
                                                        c.tampilan();
                                                    }
                                                    case 4 -> {}
                                                    default -> System.out.println("Your Choice is Wrong");
                                                }
                                            }
                                            case 3 -> {
                                                System.out.println("You Select the gOsend menu, Please Select");
                                                System.out.println("1. Cloth Goods");
                                                System.out.println("2. Pastic Goods");
                                                System.out.println("3. Glass Goods");
                                                System.out.println("4. Back");
                                                System.out.print("Enter Option : ");
                                                pilih3 = input.nextInt();
                                                //percabangan
                                                switch (pilih3) {
                                                    case 1 -> {
                                                        gOsend a = new gOsend(barang[0], 5.5, 1);
                                                        a.tampilan();
                                                    }
                                                    case 2 -> {
                                                        gOsend b = new gOsend(barang[1], 5.5, 2);
                                                        b.tampilan();
                                                    }
                                                    case 3 -> {
                                                        gOsend c = new gOsend(barang[2], 5.5, 3);
                                                        c.tampilan();
                                                    }
                                                    case 4 -> {}
                                                    default -> System.out.println("Your Choice is Wrong");
                                                }
                                            }
                                            case 4 -> {System.out.println("THANK YOU FOR USING gOgO");
                                                System.exit(0);}
                                            default -> System.out.println("Your Choice is Wrong");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Enter Number Not Letter!");
                                    }
                                    input.nextLine();
                                    System.out.println("\nPRESS 0 TO RETURN TO MENU");
                                    System.out.print("-> ");
                                    menu = input.nextInt();
                                    ++menu;
                                }
                                while (menu <= 1);
                            }
                            default -> System.out.println("Pilihan Anda Salah/ Your Choice is Wrong");
                        }
                    } catch (Exception e) {
                        System.out.println("Masukkan Angka Bukan Huruf!/ Enter Number Not Letter!");
                    }
                    input.nextLine();
                    System.out.println("\nTEKAN 0 UNTUK KEMBALI KE MENU/ PRESS 0 TO RETURN TO MENU");
                    System.out.print("-> ");
                    bahasa = input.nextInt();
                    ++bahasa;
                } while (bahasa <= 1);
            } else if (u.equals(user[0])) {
                System.out.println("Password Anda Salah/ Your Password is Wrong");
            } else if (password == pass[0]) {
                System.out.println("Username Anda Salah/  Your Username is Wrong");
            } else {
                System.out.println("Your Username and Password are Wrong");
            }
            System.out.println("\nTEKAN 0 UNTUK KEMBALI KE LOGIN/ PRESS 0 TO RELOGIN");
            System.out.println("TEKAN 1 UNTUK SELESAI/ PRESS 1 TO DONE");
            System.out.print("-> ");
            login = input.nextInt();
            input.nextLine();
            ++login;
        }
        while (login <= 1);
        System.out.println("TERIMAKASIH SUDAH MENGGUNAKAN gOgO/THANK YOU FOR USING gOgO");
    }
}