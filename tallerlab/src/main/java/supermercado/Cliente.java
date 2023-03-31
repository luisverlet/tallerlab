
package supermercado;


public class Cliente {
    private double money;
    private String name;
    private int age;
    private int ID;
    private int phone;

    public Cliente(double money, String name, int age, int ID, int phone) {
        this.money = money;
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.phone = phone;
    }

    public Cliente() {
    }
    

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public int getPhone() {
        return phone;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
}
