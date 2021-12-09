package com.example.simpletodo.reminder.repository;

import com.example.simpletodo.reminder.model.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Integer> {

}
