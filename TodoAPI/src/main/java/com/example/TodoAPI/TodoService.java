package com.example.TodoAPI;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private TodoRepository todoRepository;
    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public Todo createTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public List<Todo> getAllTodos(){
        List<Todo> todos = todoRepository.findAll();
        if(todos.isEmpty()){
            System.out.println("No To-Do items found");
        }
        return todos;
    }

    public Optional<Todo> getTodoById(Integer id){
        Optional<Todo> todo = todoRepository.findById(id);
        if(todo.isEmpty()){
            System.out.println("Todo with ID "+id+" not found");
            return Optional.empty();
        }
        return todo;
    }

    public Optional<Todo> updateTodo(Integer id, Todo todoDetails){
        Optional<Todo> todoOptional = todoRepository.findById(id);
        if(todoOptional.isEmpty()){
            System.out.println("Todo with ID "+id+" not found");
            return Optional.empty();
        }
        Todo existingTodo = todoOptional.get();
        existingTodo.setTodo(todoDetails.getTodo());
        existingTodo.setCompleted(todoDetails.isCompleted());
        return Optional.of(todoRepository.save(existingTodo));
    }

    public void deleteTodo(Integer id){
        Optional<Todo> todo = todoRepository.findById(id);
        if(todo.isEmpty()){
            System.out.println("Todo with ID "+id+" not found");
            return;
        }
        todoRepository.deleteById(id);
    }

}
