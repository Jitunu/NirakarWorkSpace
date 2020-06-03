package Day2;

public class Student {
	
	int stdID ;
	String stdName;
	String stdClass ;
	
	
	void setData(int StudentID, String studentName,String studentClass) { // stores the input data
		stdID = StudentID;
		stdName = studentName;
		stdClass=studentClass;
	      }
	      void getData() { // displays the stored data
	          System.out.println("Student Info :- ");
	          System.out.println("Sudenr ID : " + stdID + ",  Student Name : " + stdName);
	      }
		public static void main(String[] args) {
			
			Student student = new Student();
			student.setData(12, "Nirakar", "2nd");
			student.getData();
		}
	}

