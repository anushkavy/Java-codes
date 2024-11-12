package week9.Q2;

public class Department extends Faculty {

    private String Name;
    private String Chairman;

    public Department(String uni_name, int rank, String faculty_name, String name, String chairman) {
        super(uni_name, rank, faculty_name);
        this.Name = name;
        this.Chairman = chairman;
    }
    
    

    public void Details() {
        System.out.println("These are the details of Department Class.");
        System.out.println("Name = " + Name);
        System.out.println("Chairman= " + Chairman);
    }
    
    public void Display(){
        super.Details();
        Details();
    }
}
