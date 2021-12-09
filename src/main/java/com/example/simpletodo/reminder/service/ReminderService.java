package com.example.simpletodo.reminder.service;


import com.example.simpletodo.category.exception.CategoryNotFoundException;
import com.example.simpletodo.category.model.Category;
import com.example.simpletodo.category.repository.CategoryRepository;
import com.example.simpletodo.reminder.model.Reminder;
import com.example.simpletodo.reminder.model.api.ReminderRequest;
import com.example.simpletodo.reminder.repository.ReminderRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ReminderService {
    private final @NonNull ReminderRepository reminderRepository;
    private final @NonNull CategoryRepository categoryRepository;

    public List<Reminder> getReminders() {
        return reminderRepository.findAll();
    }

    public Reminder createReminder(ReminderRequest req) throws CategoryNotFoundException {
        Optional<Category> category = categoryRepository.findById(req.getCategory());
        if (category.isEmpty()) {
            throw new CategoryNotFoundException("Category not found");
        }
        Reminder reminder = new Reminder(category.get(), req.getTitle(), req.getContent());
        return reminderRepository.save(reminder);
    }
}
