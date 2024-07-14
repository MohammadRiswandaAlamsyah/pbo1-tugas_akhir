public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private double harga;

    public Buku(){
        System.out.println("Object Telah Diciptakan, Constructor Berjalan");
    }

    public int getId(){
        return this.id;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getPenulis(){
        return this.penulis;
    }

    public int getJumlahHalaman(){
        return this.jumlah_halaman;
    }

    public double getHarga(){
        return this.harga;
    }

    public void setID(int id){
        this.id=id;
    }

    public void seJudul(String judul){
        this.judul=judul;
    }

    public void setPenulis(String penulis){
        this.penulis=penulis;
    }

    public void setJumlahHalaman(int jumlah_halaman){
        this.jumlah_halaman=jumlah_halaman;
    }

    public void setHarga(double harga){
        this.harga=harga;
    }

    public void naikkanHarga(){
        System.out.println("Ini Method Menaikkan Harga");
    }

    public void naikkanHarga(double kenaikan){
        System.out.println("Ini Menaikkan Harga Menggunakan Pecahan");

    }

    public void penjualan(){
        System.out.println("Ini Method Untukk Penjualan Buku");
    }

    public void pencarianJudul(){
        System.out.println("Ini Method Mencari Judul");
    }

    public void potonganHarga(){
        System.out.println("Ini Method Diskon Harga");
    }
}