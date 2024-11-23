package Toko;

public class Product {
    private int number;
    private String nama;
    private int quantity;
    private double price;

    public Product() {
        number = 0;
        nama = "";
        quantity = 0;
        price = 0.0;
    }

    public Product(int number, String nama, int quantity, double price) {
        //variable class = parameter method
        this.number=number;
        this.nama=nama;
        this.quantity=quantity;
        this.price=price;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void print() {
        System.out.println("Number\t:"+number);
        System.out.println("Nama\t:"+nama);
        System.out.println("Quantity\t:"+quantity);
        System.out.println("Price\t:"+price);
    }


    
}
