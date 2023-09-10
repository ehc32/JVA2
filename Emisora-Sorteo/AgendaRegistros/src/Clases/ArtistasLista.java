package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArtistasLista {

    public Map<String, List<artistas>> ConsultaLista() {
        List<artistas> listaArtistas = new ArrayList<>();

        listaArtistas.add(new artistas("1", "Bad Bunny"));
        listaArtistas.add(new artistas("2", "Shakira"));
        listaArtistas.add(new artistas("3", "The Beatles"));
        listaArtistas.add(new artistas("4", "Adele"));
        listaArtistas.add(new artistas("5", "Eminem"));
        listaArtistas.add(new artistas("6", "Beyoncé"));
        listaArtistas.add(new artistas("7", "Michael Jackson"));
        listaArtistas.add(new artistas("8", "Taylor Swift"));
        listaArtistas.add(new artistas("9", "Queen"));
        listaArtistas.add(new artistas("10", "Ariana Grande"));
        listaArtistas.add(new artistas("11", "Bruno Mars"));
        listaArtistas.add(new artistas("12", "Rihanna"));
        listaArtistas.add(new artistas("13", "Coldplay"));
        listaArtistas.add(new artistas("14", "Ed Sheeran"));
        listaArtistas.add(new artistas("15", "Justin Bieber"));
        listaArtistas.add(new artistas("16", "Katy Perry"));
        listaArtistas.add(new artistas("17", "Elton John"));
        listaArtistas.add(new artistas("18", "Whitney Houston"));
        listaArtistas.add(new artistas("19", "Elvis Presley"));
        listaArtistas.add(new artistas("20", "Madonna"));
        listaArtistas.add(new artistas("21", "Prince"));
        listaArtistas.add(new artistas("22", "U2"));
        listaArtistas.add(new artistas("23", "Pink Floyd"));
        listaArtistas.add(new artistas("24", "Bruce Springsteen"));
        listaArtistas.add(new artistas("25", "Bee Gees"));
        listaArtistas.add(new artistas("26", "David Bowie"));
        listaArtistas.add(new artistas("27", "The Rolling Stones"));
        listaArtistas.add(new artistas("28", "Bob Dylan"));
        listaArtistas.add(new artistas("29", "Bob Marley"));
        listaArtistas.add(new artistas("30", "Nirvana"));
        listaArtistas.add(new artistas("31", "Radiohead"));
        listaArtistas.add(new artistas("32", "Led Zeppelin"));
        listaArtistas.add(new artistas("33", "Metallica"));
        listaArtistas.add(new artistas("34", "Guns N' Roses"));
        listaArtistas.add(new artistas("35", "The Eagles"));
        listaArtistas.add(new artistas("36", "Pink"));
        listaArtistas.add(new artistas("37", "The Who"));
        listaArtistas.add(new artistas("38", "Red Hot Chili Peppers"));
        listaArtistas.add(new artistas("39", "Elvis Costello"));
        listaArtistas.add(new artistas("40", "Stevie Wonder"));
        listaArtistas.add(new artistas("41", "John Lennon"));
        listaArtistas.add(new artistas("42", "The Police"));
        listaArtistas.add(new artistas("43", "Bryan Adams"));
        listaArtistas.add(new artistas("44", "The Doors"));
        listaArtistas.add(new artistas("45", "The Supremes"));
        listaArtistas.add(new artistas("46", "Janet Jackson"));
        listaArtistas.add(new artistas("47", "Bee Gees (otra vez)"));
        listaArtistas.add(new artistas("48", "Elton John (otra vez)"));
        listaArtistas.add(new artistas("49", "ABBA"));
        listaArtistas.add(new artistas("50", "Elvis Presley (otra vez)"));

        Map<String, List<artistas>> artistasMap = new HashMap<>();
        artistasMap.put("Lista de artistas", listaArtistas);

        return artistasMap;
    }
}
