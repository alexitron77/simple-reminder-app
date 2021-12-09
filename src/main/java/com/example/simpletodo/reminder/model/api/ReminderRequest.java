package com.example.simpletodo.reminder.model.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReminderRequest {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Integer category;
    private String title;
    private String content;
}
