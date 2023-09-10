
package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListaCanciones {
    

    public Map<String, List<Canciones>> ConsultaLista() {
        List<Canciones> ListaCanciones= new ArrayList<>();
        ListaCanciones.add(new Canciones("1", "Amorfoda", "Calladita", "Efecto"));
        ListaCanciones.add(new Canciones("2", "Waka Waka", "La Tortura", "Hips Don't Lie"));
        ListaCanciones.add(new Canciones("3", "Hey Jude", "Let It Be", "Blackbird"));
        ListaCanciones.add(new Canciones("4", "Someone Like You", "Rolling in the Deep", "Hello"));
        ListaCanciones.add(new Canciones("5", "Lose Yourself", "Stan", "Love the Way"));
        ListaCanciones.add(new Canciones("6", "Single Ladies", "Halo", "Crazy in Love"));
        ListaCanciones.add(new Canciones("7", "Billie Jean", "Thriller", "Beat It"));
        ListaCanciones.add(new Canciones("8", "Love Story", "Blank Space", "Shake It Off"));
        ListaCanciones.add(new Canciones("9", "Bohemian Rhapsody", "Another One Bites the Dust", "We Will Rock You"));
        ListaCanciones.add(new Canciones("10", "Thank U, Next", "7 Rings", "No Tears Left to Cry"));
        ListaCanciones.add(new Canciones("11", "Uptown Funk", "Just the Way You Are", "Locked Out of Heaven"));
        ListaCanciones.add(new Canciones("12", "Umbrella", "Diamonds", "We Found Love"));
        ListaCanciones.add(new Canciones("13", "Viva la Vida", "Fix You", "Yellow"));
        ListaCanciones.add(new Canciones("14", "Shape of You", "Thinking Out Loud", "Photograph"));
        ListaCanciones.add(new Canciones("15", "Sorry", "Love Yourself", "Baby"));
        ListaCanciones.add(new Canciones("16", "Firework", "Roar", "Teenage Dream"));
        ListaCanciones.add(new Canciones("17", "Rocket Man", "Your Song", "Tiny Dancer"));
        ListaCanciones.add(new Canciones("18", "I Will Always Love You", "Greatest Love of All", "I Wanna Dance with Somebody"));
        ListaCanciones.add(new Canciones("19", "Can't Help Falling in Love", "Jailhouse Rock", "Love Me Tender"));
        ListaCanciones.add(new Canciones("20", "Like a Prayer", "Material Girl", "Vogue"));
        ListaCanciones.add(new Canciones("21", "Purple Rain", "When Doves Cry", "Kiss"));
        ListaCanciones.add(new Canciones("22", "With or Without You", "Beautiful Day", "Sunday Bloody Sunday"));
        ListaCanciones.add(new Canciones("23", "Comfortably Numb", "Wish You Were Here", "Another Brick in the Wall"));
        ListaCanciones.add(new Canciones("24", "Born to Run", "Dancing in the Dark", "The River"));
        ListaCanciones.add(new Canciones("25", "Stayin' Alive", "How Deep Is Your Love", "Night Fever"));
        ListaCanciones.add(new Canciones("26", "Heroes", "Space Oddity", "Let's Dance"));
        ListaCanciones.add(new Canciones("27", "Paint It Black", "Angie", "Sympathy for the Devil"));
        ListaCanciones.add(new Canciones("28", "Like a Rolling Stone", "Blowin' in the Wind", "The Times They Are A-Changin'"));
        ListaCanciones.add(new Canciones("29", "No Woman, No Cry", "Three Little Birds", "Redemption Song"));
        ListaCanciones.add(new Canciones("30", "Smells Like Teen Spirit", "Come as You Are", "Lithium"));
        ListaCanciones.add(new Canciones("31", "Creep", "Karma Police", "No Surprises"));
        ListaCanciones.add(new Canciones("32", "Stairway to Heaven", "Whole Lotta Love", "Immigrant Song"));
        ListaCanciones.add(new Canciones("33", "Enter Sandman", "Nothing Else Matters", "Master of Puppets"));
        ListaCanciones.add(new Canciones("34", "Sweet Child o' Mine", "November Rain", "Welcome to the Jungle"));
        ListaCanciones.add(new Canciones("35", "Hotel California", "Take It Easy", "Desperado"));
        ListaCanciones.add(new Canciones("36", "What About Us", "Just Give Me a Reason", "So What"));
        ListaCanciones.add(new Canciones("37", "Baba O'Riley", "My Generation", "Pinball Wizard"));
        ListaCanciones.add(new Canciones("38", "Under the Bridge", "Californication", "Scar Tissue"));
        ListaCanciones.add(new Canciones("39", "Alison", "Everyday I Write the Book", "Oliver's Army"));
        ListaCanciones.add(new Canciones("40", "Superstition", "Isn't She Lovely", "I Just Called to Say I Love You"));
        ListaCanciones.add(new Canciones("41", "Imagine", "Woman", "Give Peace a Chance"));
        ListaCanciones.add(new Canciones("42", "Every Breath You Take", "Roxanne", "Message in a Bottle"));
        ListaCanciones.add(new Canciones("43", "Summer of '69", "Everything I Do", "Heaven"));
        ListaCanciones.add(new Canciones("44", "Light My Fire", "Riders on the Storm", "Break On Through"));
        ListaCanciones.add(new Canciones("45", "Baby Love", "Stop! In the Name of Love", "You Can't Hurry Love"));
        ListaCanciones.add(new Canciones("46", "Together Again", "That's the Way Love Goes", "Nasty"));
        ListaCanciones.add(new Canciones("47", "How Deep Is Your Love", "Stayin' Alive", "Night Fever"));
        ListaCanciones.add(new Canciones("48", "Can't Help Falling in Love", "Love Me Tender", "Jailhouse Rock"));
        ListaCanciones.add(new Canciones("49", "Dancing Queen", "Mamma Mia", "Take a Chance on Me"));
        ListaCanciones.add(new Canciones("50", "Your Song", "Rocket Man", "Tiny Dancer"));

       Map<String, List<Canciones>> CancionesMap = new HashMap<>();
        CancionesMap.put("Lista de Canciones", ListaCanciones);

        return CancionesMap;
    }
}