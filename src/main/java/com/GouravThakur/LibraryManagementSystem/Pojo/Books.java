package com.GouravThakur.LibraryManagementSystem.Pojo;




import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Data
@Entity
public class Books {

    @Id
    private int bookId;
    private String title;
    private String author;
    private String publishDate;
    private double price;
    private String status;
    private int availableCount;

    public Books() {
}
    public Books(int  bookId, String title, String author, String publishDate, double price, String status, int availableCount) {
        this.bookId= bookId;
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.price = price;
        this.status = status;
        this.availableCount = availableCount;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", availableCount=" + availableCount +
                '}';
    }
}




