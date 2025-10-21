import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Retourne la liste des tâches
    public List<Task> getTasks() {
        return tasks;
    }

}