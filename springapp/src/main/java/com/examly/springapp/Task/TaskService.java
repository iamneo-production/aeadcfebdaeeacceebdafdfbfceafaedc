package com.examly.springapp.Task;
// business logic

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    // Fake Data
    private List<Task> tasks = new ArrayList<>(Arrays.asList(
            new Task(1, "complete Projects", "12/12/2020", "In Progress", "Mark"),
            new Task(2, "PR pending", "11/12/2020", "In Progress", "Laya"),
            new Task(3, "Merge Pending", "11/12/2020", "In Progress", "Adam")));

    public List<Task> getAllList() {
        return tasks;
    }

    public Task getTask(Integer id) {
        return tasks.stream().filter(t -> t.getTaskId().equals(id)).findFirst().get();
    }


    // logic for createTask Request
    public void createTask(Task task) {
        tasks.add(task);
    }

    // logic for updateStatus Request
    public void updateStatus(Integer id, Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            if (t.getTaskId().equals(id)) {
                tasks.set(i, task);
                return ;
            }
        }
    }

    public void deleteTask(Integer id) {
        tasks.removeIf(t-> t.getTaskId().equals(id));
    }
}