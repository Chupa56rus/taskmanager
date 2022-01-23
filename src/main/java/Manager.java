import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Project> projects;
    private List<Task> tasks;

    public Manager() {
        System.out.println("*** WELCOME TO TASK MANAGER ***");
        projects = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    // Projects methods
    public void projectClear(){
        projects.clear();
        System.out.println("[ALL PROJECTS REMOVED]");
        System.out.println();
    }

    public void projectCreate(String name){
        Project project = new Project(name);
        if(projects.contains(project)){
            System.out.println("PROJECT \"" + name + "\" ALREADY EXIST");
        } else {
            projects.add(project);
            System.out.println("[OK]");
        }
        System.out.println();
    }

    public void projectList(){
        System.out.println("[PROJECT LIST]");
        int i = 1;
        for (Project project : projects) {
            System.out.println(i++ + ". " + project.getName());
        }
        System.out.println();
    }

    public void projectRemove(String name){
        Project project = new Project(name);
        if(projects.contains(project)){
            projects.remove(project);
            System.out.println("[PROJECT \""  + name + "\" REMOVED]");
        } else {
            System.out.println("[PROJECT \""  + name + "\" NOT EXIST]");
        }
        System.out.println();
    }


    // Tasks methods
    public void taskClear(){
        tasks.clear();
        System.out.println("[ALL TASKS REMOVED]");
        System.out.println();
    }

    public void taskCreate(String name){
        Task task = new Task(name);
        if(tasks.contains(task)){
            System.out.println("TASK \"" + name + "\" ALREADY EXIST");
        } else {
            tasks.add(task);
            System.out.println("[OK]");
        }
        System.out.println();
    }

    public void taskList(){
        System.out.println("[TASK LIST]");
        int i = 1;
        for (Task task : tasks) {
            System.out.println(i++ + ". " + task.getName());
        }
        System.out.println();
    }

    public void taskRemove(String name){
        Task task = new Task(name);
        if(tasks.contains(task)){
            tasks.remove(task);
            System.out.println("[TASK \""  + name + "\" REMOVED]");
        } else {
            System.out.println("[TASK \""  + name + "\" NOT EXIST]");
        }
        System.out.println();
    }

    public void help(){
        Command.showAllCommand();
        System.out.println();
    }
}
