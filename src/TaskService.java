import java.util.List;

public class TaskService {

    public void completeTask(List<Task> tasks, int index) {
        tasks.get(index).markCompleted();
    }
}