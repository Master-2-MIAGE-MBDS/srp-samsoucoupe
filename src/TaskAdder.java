import java.util.List;

public class TaskAdder {

    public void addTask(List<Task> tasks,String title, String description) {
        tasks.add(new Task(title, description));
    }
    
}
