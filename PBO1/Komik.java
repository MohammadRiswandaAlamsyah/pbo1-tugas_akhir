public class Komik extends Buku {
    private int volume;
    
    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        this.volume=volume;
    }

    public void naikkanHarga(){
        System.out.println("Menaikkan Harga Komik");
    }

}
