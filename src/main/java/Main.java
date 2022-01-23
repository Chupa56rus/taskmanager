import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        while (true){
            Command command = Command.getByName(scanner.nextLine());
            if(command == null){
                System.out.println("THIS COMMAND DOES NOT EXIST");
                System.out.println("RUN THE COMMAND \"help\"");
                System.out.println();
                continue;
            }else {
                switch (command){
                    case HELP: manager.help(); continue;

                    case PROJECT_CLEAR: manager.projectClear();continue;
                    case PROJECT_CREATE:
                        System.out.println("[PROJECT CREATE]");
                        System.out.println("ENTER NAME:");
                        manager.projectCreate(scanner.nextLine());
                        continue;
                    case PROJECT_LIST: manager.projectList();continue;
                    case PROJECT_REMOVE:
                        System.out.println("[PROJECT REMOVE]");
                        System.out.println("ENTER NAME:");
                        manager.projectRemove(scanner.nextLine());
                        continue;

                    case TASK_CLEAR: manager.taskClear();continue;
                    case TASK_CREATE:
                        System.out.println("[TASK CREATE]");
                        System.out.println("ENTER NAME:");
                        manager.taskCreate(scanner.nextLine());
                        continue;
                    case TASK_LIST: manager.taskList();continue;
                    case TASK_REMOVE:
                        System.out.println("[TASK REMOVE]");
                        System.out.println("ENTER NAME:");
                        manager.taskRemove(scanner.nextLine());
                        continue;
                }
            }
        }

    }
}
