package com.shadow.todolist;

import com.shadow.todolist.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John",
                LocalDate.of(2016, Month.APRIL, 25));

        TodoItem item2 = new TodoItem("Doctor's Appointment", "Buy a 30th birthday card for John",
                LocalDate.of(2016, Month.APRIL, 22));

        TodoItem item3 = new TodoItem("Finish design proposal for client", "Buy a 30th birthday card for John",
                LocalDate.of(2016, Month.APRIL, 23));

        TodoItem item4 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John",
                LocalDate.of(2016, Month.APRIL, 24));

        TodoItem item5 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John",
                LocalDate.of(2016, Month.APRIL, 29));

        todoItems  = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
    }
}
