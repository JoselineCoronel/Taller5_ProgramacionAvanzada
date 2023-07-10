package Entities;

public class Libro {

    private String isbn;
    private String title;
    private String author;
    private String category;
    private int copies;
    private int price;

    public Libro(String isbn, String title, String author, String category, int copies, int price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.copies = copies;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getCopies() {
        return copies;
    }

    public int getPrice() {
        return price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(){

        return "ISBN: " + this.isbn + " Titulo: " + this.title + " Autor: " + this.author + "Categoria: " + this.category + "Copias: " + this.copies + "Precio: " + this.price;
    }
}
