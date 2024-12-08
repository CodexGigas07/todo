package entities;

public class TaskEntity {
    private static int counter = 0;
    private int id;
    private String description;

    public TaskEntity(String description) {
        this.id = ++counter;
        this.description = description;
    }
    public int getId() {
        return id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public String toString() {
        return "Tarea\n ID: " + id + "\n Description: " + description;
    }
}
