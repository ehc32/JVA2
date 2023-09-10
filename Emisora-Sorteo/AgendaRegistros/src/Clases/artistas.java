package Clases;

public class artistas {
    private String id;
    private String Artista;

    public artistas(String id, String Artista) {
        this.id = id;
        this.Artista = Artista;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

}