import java.util.ArrayList;
import java.util.List;
public class ToDoList{
    private List<Task> tasks;
    private int taskCounter;
    public ToDoList(){
        tasks = new ArrayList<>(); 
        taskCounter = 1;
    }
    public void addTask(String description){
        Task task = new Task(taskCounter++, description, false);
        tasks.add(task);
        System.out.println("Task added :"+ task);
    }
    public void listTasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks available.");
            return;
        }else{
            for(Task task : tasks){
                System.out.println(task);
            }
        }
    }
    public void markTaskCompleted(int id){
    boolean found = false;
    for(Task task : tasks){
        if(task.getId() == id){
            task.markCompleted();
            System.out.println("Task marked as completed:" + task);
            found = true;
            break;
        }
    }
    if(!found){
        System.out.println("Task with id " + id + " not found.");
    }
 }
    public void removeTask(int id){
        Task toRemove = null;
        for(Task task: tasks){
            if(task.getId() == id){
                toRemove = task;
                break;
            }
        }
        if(toRemove != null){
            tasks.remove(toRemove);
            System.out.println("Task removed successfully.");
        }else{
            System.out.println("Task with id" + id + " not found.");
        }
    }

}