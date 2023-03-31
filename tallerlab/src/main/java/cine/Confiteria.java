
package cine;

public class Confiteria {
    private int product_ammount;
    private int workers;
    private String area;
    private boolean popcorn;

    public Confiteria(int product_ammount, int workers, String area, boolean popcorn) {
        this.product_ammount = product_ammount;
        this.workers = workers;
        this.area = area;
        this.popcorn = popcorn;
    }

    public Confiteria() {
    }

    public int getProduct_ammount() {
        return product_ammount;
    }

    public int getWorkers() {
        return workers;
    }

    public String getArea() {
        return area;
    }

    public boolean isPopcorn() {
        return popcorn;
    }

    public void setProduct_ammount(int product_ammount) {
        this.product_ammount = product_ammount;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPopcorn(boolean popcorn) {
        this.popcorn = popcorn;
    }
    
    
    
    
}
