/**
 * ProjectClassTest
 */
public class ProjectTest {

    public static void main(String[] args) {
        // using constructor number one and getters and setter
        System.out.println("using first constructor");
        Project firstProject = new Project();
        firstProject.setName("First project");
        firstProject.setDescription("This is the test for the first project");
        System.out.println("Project Name: "+firstProject.returnName());
        System.out.println("Project Description: " + firstProject.returnDescription());

        // using constuctor number 2
        System.out.println("using second constructor");
        Project secondProject = new Project("Second Project");
        secondProject.setDescription("This is the test for the second project");
        System.out.println("Project Name: "+secondProject.returnName());
        System.out.println("Project Description: " + secondProject.returnDescription());

        // using constructor number 3
        System.out.println("using third constructor");
        Project thirdProject = new Project("Third Project", "This is the test for the third constructor");
        System.out.println("Project Name: "+thirdProject.returnName());
        System.out.println("Project Description: " + thirdProject.returnDescription());
    }
}