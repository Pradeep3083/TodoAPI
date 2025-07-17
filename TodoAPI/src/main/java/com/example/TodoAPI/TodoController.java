package com.example.TodoAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> createTodo(@RequestBody Todo todo){
        Todo createdTodo = todoService.createTodo(todo);
        return new ResponseEntity<>("Todo created successfully!", HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllTodos(){
        List<Todo> todos = todoService.getAllTodos();
        if(todos.isEmpty()){
            return new ResponseEntity<>("No Todos added yet.",HttpStatus.OK);
        }else{
            return new ResponseEntity<>(todos,HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTodoById(@PathVariable Integer id){
        Optional<Todo> todoOptional = todoService.getTodoById(id);
        if(todoOptional.isPresent()){
            Todo todo = todoOptional.get();
            return new ResponseEntity<>(todo, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Todo with ID "+id+" not found.",HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTodo(@PathVariable Integer id, @RequestBody Todo todoDetails){
        Optional<Todo> todoOptional = todoService.getTodoById(id);
        if (todoOptional.isPresent()){
            todoService.updateTodo(id, todoDetails);
            return new ResponseEntity<>("Todo with ID " + id + " updated successfully!",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Todo with ID "+id+" not found.",HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable Integer id){
        if (todoService.getTodoById(id).isPresent()){
            todoService.deleteTodo(id);
            return new ResponseEntity<>("Todo with ID " + id + " deleted successfully",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Todo with ID "+id+" not found.",HttpStatus.NOT_FOUND);
        }
    }

}
