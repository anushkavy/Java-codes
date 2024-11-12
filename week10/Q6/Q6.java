package week10.Q6;


public class Q6 {

    public static void main(String[] args) {
        Department CS = new Department("Aligarh Muslim University", 1, "Science", "Computer Science", "Dr. Armaan Rasool Faridi");
        CS.Display();
        System.out.println("University Ranking: "+ CS.getRanking());
    }
    
}
