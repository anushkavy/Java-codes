/*
 Create class Person (Data Member- name, phone). Create two member inner 
classes Address (Data Member- House_No, Street, City, State; Method- 
displayAddr()) and DateOfBirth (Data Member- Day, Month,Year; Method- 
displayDOB()). Display() is the method of Person class which will display 
name, address and date of birth of a Person object.
 */
package week10.Q1;


public class Person {
    private String Name;
    private String Phone;
    class Address{
        private String H_no;
        private String Street;
        private String City;
        private String State;

        public Address(String H_no, String Street, String City, String State) {
            this.H_no = H_no;
            this.Street = Street;
            this.City = City;
            this.State = State;
        }
        
        public void displayAddr(){
            System.out.println("Address: " + this.H_no + ", " + this.Street + ", " +this.City + ", " + this.State +".");
        }
    }
    
    class DateOfBirth{
        private int Day;
        private int Month;
        private int Year;

        public DateOfBirth(int Day, int Month, int Year) {
            this.Day = Day;
            this.Month = Month;
            this.Year = Year;
        }
        
        public void displayDOB(){
            System.out.println("Date of Birth: " + this.Day + "-" + this.Month + "-" +this.Year);
        }
    }
    
    Address a;
    DateOfBirth dob;

    public Person(String Name, String Phone, String H_no, String Street, String City, String State, int Day, int Month, int Year) {
        this.Name = Name;
        this.Phone = Phone;
        
        a = new Address(H_no, Street, City, State);
        dob = new DateOfBirth(Day, Month, Year);
    }
    
    public void Display(){
        System.out.println("Name: " + this.Name);
        System.out.println("Phone Number: " + this.Phone);
        a.displayAddr();
        dob.displayDOB();
    }
}
