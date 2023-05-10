package com.project.librarymanagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "IssuedBookandReturn")
public class IssueAndReturnBookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentname")
    private String Studentname;

    @Column(name = "bookissue")
    private String bookName;

    @Column(name = "issueDate")
    private String issueDate;

    @Column(name = "book_returned")
    private boolean bookReturned;

}