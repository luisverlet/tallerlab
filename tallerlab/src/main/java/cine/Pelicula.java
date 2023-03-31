
package cine;

public class Pelicula {
    private String MDA;
    private String movie_name;
    private double price;
    private int ID;

    public Pelicula(String MDA, String movie_name, double price, int ID) {
        this.MDA = MDA;
        this.movie_name = movie_name;
        this.price = price;
        this.ID = ID;
    }

    public Pelicula() {
    }

    public String getMDA() {
        return MDA;
    }

    public void setMDA(String MDA) {
        this.MDA = MDA;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
}
