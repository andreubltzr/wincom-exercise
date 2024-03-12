package org.wincom;

import java.util.ArrayList;
import java.util.List;

public class Autocomplete {

//  Keywords list
    private final String[] keywordsList = {
            "Pandora", "Pinterest", "Paypal", "Pg&e", "Project free tv", "Priceline", "Press democrat",
            "Progressive", "Project runway", "Proactive", "Programming", "Progeria", "Progesterone",
            "Progenex", "Procurable", "Processor", "Proud", "Print", "Prank", "Bowl", "Owl", "River",
            "Phone", "Kayak", "Stamps", "Reprobe"
    };

//  Method to get suggestions
    public List<String> getSuggestions(String input) {
//        Convert input to lowercase to not be case-sensitive
        input = input.toLowerCase();

//        Declare variable with type ArrayList of strings that will hold the suggestions
        ArrayList<String> suggestionsList = new ArrayList<>();

//        For each loop to iterate over the keywords array
        for (String keyword : keywordsList) {
//            In this if block, I check if the keyword starts with the provided input,
//            if true I add to the suggestion list
            if (keyword.toLowerCase().startsWith(input)) {
                suggestionsList.add(keyword);
            }
        }

//        In this line I sort the suggestions in alphabetical order
        suggestionsList.sort(String::compareToIgnoreCase);

//        If block to check if number of suggestion is more than 4, if true return only the first 4,
//        if false, return original list
        if (suggestionsList.size() > 4) {
            return suggestionsList.subList(0, 4);
        } else {
            return suggestionsList;
        }
    }
}
