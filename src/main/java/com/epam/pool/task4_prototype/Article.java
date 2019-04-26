package com.epam.pool.task4_prototype;

public class Article implements Copyable {
    private int id;
    private String title;
    private String text;
    private String lastModified;

    public Article(int id, String title, String text, String lastModified) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.lastModified = lastModified;
    }

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getLastModified() {
        return lastModified;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", lastModified='" + lastModified + '\'' +
                '}';
    }

    public Article copy() {
        return new Article(id, title, text, lastModified);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        if (id != article.id) return false;
        if (title != null ? !title.equals(article.title) : article.title != null) return false;
        if (text != null ? !text.equals(article.text) : article.text != null) return false;
        return lastModified != null ? lastModified.equals(article.lastModified) : article.lastModified == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (lastModified != null ? lastModified.hashCode() : 0);
        return result;
    }
}
