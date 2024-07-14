public class Stempel {
    private String ukuran;
    private String warna;
    private String motifKaret;
    private String kegunaan;

    public Stempel(){
        System.out.println("Object Telah Diciptakan, Constructor Berjalan");
    }

    public String getUkuran(){
        return this.ukuran;
    }

    public String getWarna(){
        return this.warna;
    }

    public String getMotifKaret(){
        return this.motifKaret;
    }

    public String getKegunaan(){
        return this.kegunaan;
    }

    public void setUkuran(String ukuran){
        this.ukuran=ukuran;
    }

    public void setWarna(String warna){
        this.warna=warna;
    }

    public void setMotifKaret(String motifKaret){
        this.motifKaret=motifKaret;
    }

    public void bonusPembelian(){
        System.out.println("Ini Method Bonus Pembeli");
    }

    public void bonusPembelian(String bonus){
        System.out.println("Ini Bonus Barang Lain Jika Membeli Stempel");
    }

    public void penjualan(){
        System.out.println("Ini Method Penjualan Stempel");
    }

    public void desainKaret(){
        System.out.println("Ini Method Untuk Mendesain Karet Stempel");
    }

    public void potonganHarga(){
        System.out.println("Ini Method Diskon Harga");
    }
}