
package Clases;

public class Canciones {
    
    private String Id;
    private String Cancion1;
    private String Cancion2;
    private String Cancion3;

    public Canciones(String Id, String Cancion1, String Cancion2, String Cancion3) {
        this.Id = Id;
        this.Cancion1 = Cancion1;
        this.Cancion2 = Cancion2;
        this.Cancion3 = Cancion3;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getCancion1() {
        return Cancion1;
    }

    public void setCancion1(String Cancion1) {
        this.Cancion1 = Cancion1;
    }

    public String getCancion2() {
        return Cancion2;
    }

    public void setCancion2(String Cancion2) {
        this.Cancion2 = Cancion2;
    }

    public String getCancion3() {
        return Cancion3;
    }

    public void setCancion3(String Cancion3) {
        this.Cancion3 = Cancion3;
    }
    
    

    
    
}
