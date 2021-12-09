package com.example.simpletodo.reminder.controller;

import com.example.simpletodo.category.exception.CategoryNotFoundException;
import com.example.simpletodo.reminder.model.Reminder;
import com.example.simpletodo.reminder.model.api.ReminderRequest;
import com.example.simpletodo.reminder.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/reminders")
public class ReminderController {

    private static ReminderService reminderService;

    @Autowired
    public ReminderController(ReminderService reminderService) {
        this.reminderService = reminderService;
    }

    @GetMapping("")
    public ResponseEntity<List<Reminder>> getReminders() {
        return ResponseEntity.ok(reminderService.getReminders());
    }

    @PostMapping("")
    public ResponseEntity<Reminder> createReminder(
            @RequestBody @Valid ReminderRequest reminder
    ) throws CategoryNotFoundException {
        return ResponseEntity.ok(reminderService.createReminder(reminder));
    }
}
