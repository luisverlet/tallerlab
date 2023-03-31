
package cine;

public class Sala {
    private int ID;
    private String cinema_room;
    private int capacity;
    private boolean screen_movie;

    public Sala(int ID, String cinema_room, int capacity, boolean screen_movie) {
        this.ID = ID;
        this.cinema_room = cinema_room;
        this.capacity = capacity;
        this.screen_movie = screen_movie;
    }

    public Sala() {
    }

    public int getID() {
        return ID;
    }

    public String getCinema_room() {
        return cinema_room;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isScreen_movie() {
        return screen_movie;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCinema_room(String cinema_room) {
        this.cinema_room = cinema_room;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setScreen_movie(boolean screen_movie) {
        this.screen_movie = screen_movie;
    }
    
    
    
}
