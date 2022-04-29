package com.GouravThakur.LibraryManagementSystem.Pojo;



import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Students {

    @Id
    private int studentId;
    private String name;
    private int bookId;
    private String date;



    public Students(int studentId, String name, int bookId, String date) {
        this.studentId = studentId;
        this.name = name;
        this.bookId = bookId;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", bookId=" + bookId +
                ", date='" + date + '\'' +
                '}';
    }
}