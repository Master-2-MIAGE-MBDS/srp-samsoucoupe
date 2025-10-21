import java.util.List;

public class TaskReporter {
    

    public void printCompletedTasks(List<Task> tasks) {
        printPendingTasks(tasks, true);
    }

    public void printPendingTasks(List<Task> tasks) {
        printPendingTasks(tasks, false);
    }

    public void printPendingTasks(List<Task> tasks, boolean completed) {
        if (!completed) {
            System.out.println("Pending tasks:");
        }
        else {
            System.out.println("Completed tasks:");
        }
        for (Task task : tasks) {
            if (task.isCompleted() == completed) {
                System.out.println(task);
            }
        }
    }
}
