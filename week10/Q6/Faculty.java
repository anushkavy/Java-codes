
package week10.Q6;

public class Faculty extends University{
    private String Name;
    
     public Faculty(String uni_name, int rank, String Name) {
        super(uni_name, rank);
        this.Name = Name;
    }
    
    public void Details(){
        System.out.println("These are the details of Faculty Class.");
        System.out.println("Name = "+ Name);
    }
}