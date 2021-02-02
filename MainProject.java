import java.util.Scanner;

public class MainProject {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    addProjects();
                    break;
                case 1:
                    listProjects();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    removeEmployee();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    listEmployee();
                    break;


            }
        }
    }

    public static void printInstruction() {
        System.out.println("\t 0 - To add projects");
        System.out.println("\t 1 - To list projects");
        System.out.println("\t 2 - To add employee to the projects");
        System.out.println("\t 3 - To remove employee from the projects");
        System.out.println("\t 4 - To delete projects");
        System.out.println("\t 5 - To list employees of the given project");


    }

    public static void addProjects(){
        System.out.println("enter the projects");
      Project.addProjects(scanner.next());
    }
    public static void listProjects(){
        System.out.println("list projects");

    }
    public static void addEmployee(){
        System.out.println("enter the projects");
        Project.addProjects(scanner.next());

    }
    public static void removeEmployee(){
        System.out.println("remove employee from the project :");
        int employeeNo = scanner.nextInt();
        scanner.nextLine();
        Project.removeProject(employeeNo);

    }
    public static void delete(){
        System.out.println("delete");
        int projectNo = scanner.nextInt();
        scanner.nextLine();
        project.deleteProject(projectNo);

    }
    public static void listEmployee(){
        System.out.println("enter the listEmployee");
        String searchItem = scanner.nextLine();
        if(Project.list(searchEmployee)!=null){
            System.out.println("found" + search +"in our Employee list");
        }else
        {
            System.out.println(searchEmployee+"is not in the  list");
        }



    }
}