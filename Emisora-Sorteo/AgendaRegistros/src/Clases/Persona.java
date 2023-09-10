package Clases;



public class Persona {
 private String nombre;
     private String Arstirta;
          private String telefono;

     private String Canciones1;
     private String Canciones2;
     private String Canciones3;
     private String color;
     private String boleta;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     
     
     public Persona(String nombre, String artista, String Telefono ,String cancion1, String cancion2, String cancion3, String color, String boleta) {
    this.nombre = nombre;
    this.Arstirta = artista;
    this.telefono=Telefono;
    this.Canciones1 = cancion1;
    this.Canciones2 = cancion2;
    this.Canciones3 = cancion3;
    this.color = color;
    this.boleta = boleta;
}


    public String getCanciones1() {
        return Canciones1;
    }

    public void setCanciones1(String Canciones1) {
        this.Canciones1 = Canciones1;
    }

    public String getCanciones2() {
        return Canciones2;
    }

    public void setCanciones2(String Canciones2) {
        this.Canciones2 = Canciones2;
    }

    public String getCanciones3() {
        return Canciones3;
    }

    public void setCanciones3(String Canciones3) {
        this.Canciones3 = Canciones3;
    }
   
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArstirta() {
        return Arstirta;
    }

    public void setArstirta(String Arstirta) {
        this.Arstirta = Arstirta;
    }

   

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

}
