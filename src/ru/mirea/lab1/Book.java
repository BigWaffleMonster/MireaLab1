package ru.mirea.lab1;

public class Book {
    private String author;
    private int cost;

    public Book(String author, int cost){
        this.author = author;
        this.cost = cost;
    }

    public Book(String author){
        this.author = author;
        cost = 33;
    }

    public Book(int cost){
        author = "";
        this.cost = cost;
    }

    public Book(){
        author = "John Doe";
        cost = 33;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getAuthor(){
        return author;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", cost=" + cost +
                '}';
    }
}
