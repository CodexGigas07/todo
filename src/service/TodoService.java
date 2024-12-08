package service;

import entities.TaskEntity;

import java.util.ArrayList;

public class TodoService {
    private final ArrayList<TaskEntity> taskEntities = new ArrayList<>();

    public void addTask(String description) {
        TaskEntity newTask = new TaskEntity(description);
        taskEntities.add(newTask);
        System.out.println("Tarea agregada:" + newTask);
    }
    public void viewTask() {
        if(taskEntities.isEmpty()){
            System.out.println("Tarea no encontrada");
        }else {
            System.out.println("Tareas encontradas");
            for( TaskEntity task : taskEntities){
                System.out.println(task);
            }
        }
    }
    public void updateTask(int id, String newDescription) {
        for( TaskEntity task : taskEntities){
            if(task.getId() == id){
                task.setDescription(newDescription);
                System.out.println("Tarea actualizada:" + task);
                return;
            }
        }
        System.out.println("Tarea " + id + " no encontrada");
    }
    public void deleteTask(int id) {
        for( TaskEntity task : taskEntities){
            if(task.getId() == id){
                taskEntities.remove(task);
                return;
            }
        }
        System.out.println("Tarea " + id + " no encontrada");
    }
}
