import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        TaskAdder taskAdder = new TaskAdder();
        TaskService taskService = new TaskService();
        List<Task> tasks = taskManager.getTasks();
        taskAdder.addTask(tasks, "Tache 1", "Description de la tache 1");
        taskAdder.addTask(tasks, "Tache 2", "Description de la tache 2");
        taskAdder.addTask(tasks, "Tache 3", "Description de la tache 3");


        taskService.completeTask(tasks, 1);

        TaskReporter reporter = new TaskReporter();
        reporter.printCompletedTasks(tasks);
        reporter.printPendingTasks(tasks);
    }
}
