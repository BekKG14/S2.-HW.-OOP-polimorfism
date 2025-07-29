package org.skypro.skyshop.article;

import org.skypro.skyshop.search.Searchable;

public final class Article implements Searchable {
    private String title;
    private String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String toString() {
        return "Название статьи: " + this.title + ". Текст статьи: " + this.text;
    }

    public String getSearchTerm() {
        return this.title + " " + this.text;
    }

    public String getSearchType() {
        return "ARTICLE";
    }
}
