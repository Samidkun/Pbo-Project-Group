package praktikum10;
public class Pegawai {
    public String nip; //define variable
    public String nama;

    // Default constructor
    public Pegawai() {
    }

    // Constructor with parameters
    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
    }
}
