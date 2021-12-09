package com.example.simpletodo.reminder.model;

import com.example.simpletodo.category.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reminder implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @JsonIgnoreProperties()
    private Category category;
    private String title;
    private String content;

    public Reminder(Category category, String title, String content) {
        this.category = category;
        this.title = title;
        this.content = content;
    }
}
