package week9.Q2;


public class q2 {

    public static void main(String[] args) {
        Department CS = new Department("Aligarh Muslim University", 1, "Science", "Computer Science", "Dr. Armaan Rasool Faridi");
        CS.Display();
        System.out.println("University Ranking: "+ CS.getRanking());
    }
}