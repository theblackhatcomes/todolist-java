public class Task {
    int id;
    String description;
    boolean completed;
    public Task(int id,String description,boolean completed){
        this.id = id;
        this.description = description;
        this.completed = false;
    }
    public int getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }
    public boolean isCompleted(){
        return completed;
    }
    public void markCompleted(){
        this.completed = true;
    }
    @Override
    public String toString(){
        return id+"."+description + (completed ? "[Done]" : "[Pending]");
    }

}