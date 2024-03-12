package org.wincom;

public class Main {
    public static void main(String[] args) {

//        Create instance of Autocomplete
        Autocomplete autocomplete = new Autocomplete();

//        Call getSuggestions method and print them
        System.out.println("Autocomplete suggestions: " + autocomplete.getSuggestions("pro"));
    }
}