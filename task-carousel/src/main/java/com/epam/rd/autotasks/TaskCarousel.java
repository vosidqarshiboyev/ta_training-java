package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskCarousel {
    private int counter = -1;
    private int capacity;
    public List<Task> tasks;

    public TaskCarousel(int capacity) {
        this.capacity = capacity;
        tasks = new ArrayList<>(capacity);
    }

    public boolean addTask(Task task) {
        if (tasks.size() > capacity || task.isFinished()) return false;
        tasks.add(task);
        return true;
    }

    public boolean execute() {
        if (!isEmpty()) {counter++;
            if(counter == tasks.size()) counter = 0;
            Task task = tasks.get(counter);

            task.execute();

            if(task.isFinished()) {
                tasks.remove(task);
                counter--;
            }
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return tasks.size() == capacity;
    }

    public boolean isEmpty() {
        return tasks.size() < 1;
    }
}
