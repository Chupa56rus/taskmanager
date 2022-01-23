
public enum Command {
    HELP("help", "Show all commands."),
    PROJECT_CLEAR("project-clear", "Remove all projects."),
    PROJECT_CREATE("project-create", "Create new project."),
    PROJECT_LIST("project-list", "Show all projects."),
    PROJECT_REMOVE("project-remove", "Remove selected project"),
    TASK_CLEAR("task-clear", "Remove all tasks."),
    TASK_CREATE("task-create", "Create new task."),
    TASK_LIST("task-list", "Show all tasks."),
    TASK_REMOVE("task-remove", "Remove selected task");

    private String name;
    private String description;

    Command(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    static public Command getByName(String name){
        for(Command command: values()){
            if (command.getName().equals(name)){
                return command;
            }
        }
        return null;
    }

    static public void showAllCommand(){
        for(Command command: values()){
            System.out.println(command.getName() + ": " + command.getDescription());
        }
    }
}
