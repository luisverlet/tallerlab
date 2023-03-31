
package supermercado;

public class Verdureria {
    private int products;
    private String area;
    private int area_ID;
    private int tomato_amount;
    private int onion_amount;

    public Verdureria(int products, String area, int area_ID, int tomato_amount, int onion_amount) {
        this.products = products;
        this.area = area;
        this.area_ID = area_ID;
        this.tomato_amount = tomato_amount;
        this.onion_amount = onion_amount;
    }

    public Verdureria() {
    }

    public int getProducts() {
        return products;
    }

    public String getArea() {
        return area;
    }

    public int getArea_ID() {
        return area_ID;
    }

    public int getTomato_amount() {
        return tomato_amount;
    }

    public int getOnion_amount() {
        return onion_amount;
    }

    public void setProducts(int products) {
        this.products = products;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setArea_ID(int area_ID) {
        this.area_ID = area_ID;
    }

    public void setTomato_amount(int tomato_amount) {
        this.tomato_amount = tomato_amount;
    }

    public void setOnion_amount(int onion_amount) {
        this.onion_amount = onion_amount;
    }
    
    
    
}
