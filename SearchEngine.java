package org.skypro.skyshop;

import org.skypro.skyshop.search.Searchable;

import java.util.Locale;

public class SearchEngine {
    private Searchable[] searchables;

    public SearchEngine(int capacity) {
        this.searchables = new Searchable[capacity];

    }

    public void add(Searchable item) {
        for (int i = 0; i < searchables.length; i++) {
            if (searchables[i] == null) {
                searchables[i] = item;
                return;
            }
        }
        System.out.println("Места нет");
    }

    public Searchable[] search(String searchTerm) {
        Searchable[] result = new Searchable[5];
        for (int i = 0, size = 0; i < searchables.length; i++) {
            if (searchables[i] != null && searchables[i].getSearchTerm().contains(searchTerm)) {
                result[size++] = searchables[i];
                if (size >= 5) {
                    break;
                }
            }
        }
        return result;
    }
}
