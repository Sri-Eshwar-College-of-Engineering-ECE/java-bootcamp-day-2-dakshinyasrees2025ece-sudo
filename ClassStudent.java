public class ClassStudent {
		    String name;
		    int rollNo;
		    void display() {
		        String college = "ABC Engineering College";
		        System.out.println("Name: " + name);
		        System.out.println("Roll No: " + rollNo);
		        System.out.println("College: " + college);
		    }
		    public static void main(String[] args) {
		        ClassStudent s = new ClassStudent();
		        s.name = "Raj";
		        s.rollNo = 101;
		        s.display();
		    }
		}
