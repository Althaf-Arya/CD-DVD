package Toko;

public class CD extends Product {
    private String artist;
    private int numSong;
    private String label;

    public CD() {
        super(); //constructor dari superclass
        artist = "";
        numSong = 0;
        label = "";
    }

    public CD(int number, String nama, int quantity, double price, String artist, int numSong, String label) {
        super(number, nama, quantity, price);
        this.artist=artist;
        this.numSong=numSong;
        this.label=label;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    //Override
    public void print() {
        super.print();
        System.out.println("Artist\t:"+artist);
        System.out.println("Total Song\t:"+numSong);
        System.out.println("Label\t:"+label);
    }


}
