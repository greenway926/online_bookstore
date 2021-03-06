package com.sekolahbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "book_category")
@Where(clause = "status = 'ACTIVE'")
public class BookCategory extends Persistence {
    @Column(length = 100)
    private String name;
    @Column(length = 50)
    private String code;
}

