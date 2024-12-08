import service.TodoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoService todoService = new TodoService();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("To-do list aplication");
            System.out.println("1.- Add Task");
            System.out.println("2.- View Task");
            System.out.println("3.- Update Task");
            System.out.println("4.- Delete Task");
            System.out.println("5.- Exit");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.println("Escribe una nueva tarea");
                String description = scanner.nextLine();
                todoService.addTask(description);
                }
                case 2 -> {
                    todoService.viewTask();
                }

                case 3 -> {
                    System.out.println("Ingresa el Id del Task");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Escribe la nueva descripcion");
                    String description = scanner.nextLine();
                    todoService.updateTask(id,description);
                }
                case 4 -> {
                    System.out.println("Ingresa el Id del Task que quieres eliminar");
                    int id = scanner.nextInt();
                    todoService.deleteTask(id);
                }
                case 5 -> {
                    System.out.println("Cerrando aplicacion");
                }
                default -> {
                    System.out.println("Opcion invalida: elija un numero entre 1 y 5");
                }

            }


        } while (option != 5);
    }
}