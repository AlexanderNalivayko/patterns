package com.epam.pool.task4_prototype;

import com.epam.pool.task4_prototype.Util.DateFormatterUtil;

import java.util.Date;
import java.util.HashMap;

public class Wikipedia implements Encyclopedia {

    private HashMap<Integer, Article> articles = new HashMap<>();
    private int counter = 0;

    public void addArticle(Article article) {
        if (article == null) {
            throw new IllegalArgumentException("cannot add null");
        }
        article.setId(counter);
        article.setLastModified(DateFormatterUtil.formatDate(new Date()));
        articles.put(counter, article);
        counter ++;
    }

    //instead of just returning article, we return copy of it
    public Article getArticle(int id) {
        return articles.get(id).copy();
    }

    public void updateArticle(Article article) {
        if (article == null || article.getId() > counter) {
            throw new IllegalArgumentException("cannot update article:" + article);
        }
        articles.remove(article.getId());
        article.setLastModified(DateFormatterUtil.formatDate(new Date()));
        articles.put(article.getId(), article);
    }

    public void printAll() {
        for (Article article : articles.values()) {
            System.out.println(article);
        }
    }
}
