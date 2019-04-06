package com.epam.pool.task4_prototype;

public interface Encyclopedia {

    public void addArticle(Article article);

    public Article getArticle(int id);

    public void updateArticle(Article article);

    public void printAll();
}
