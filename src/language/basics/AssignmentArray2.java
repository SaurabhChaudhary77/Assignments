package language.basics;

public class AssignmentArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/** Create a 3D array to represent the following data:
			o Semesters as the first dimension.
			o Subjects and Status/Marks as the second dimension.
			o Actual values for Subject Names and Marks as the third dimension.*/
		
		String[][][] data = {
	            {   // Semester 1
	                {"Mathematics I", "Pass(78)"},
	                {"Physics", "Pass(85)"},
	                {"Chemistry", "Fail(21)"},
	                {"Computer Programming", "Pass(74)"},
	                {"Engineering Drawing", "Pass(88)"},
	                {"Basic Electrical Eng.", "Pass(79)"}
	            },
	            {   // Semester 2
	                {"Mathematics II", "Pass(82)"},
	                {"Mechanics", "Pass(77)"},
	                {"Environmental Sci.", "Pass(93)"},
	                {"Basic Electronics", "Fail(19)"},
	                {"Engineering Physics", "Fail(24)"},
	                {"Engineering Graphics", "Pass(90)"}
	            },
	            {   // Semester 3
	                {"Data Structures", "Pass(88)"},
	                {"Discrete Mathematics", "Pass(81)"},
	                {"Digital Electronics", "Pass(76)"},
	                {"Operating Systems", "Fail(32)"},
	                {"Signals and Systems", "Pass(85)"},
	                {"Object-Oriented Prog.", "Pass(78)"}
	            },
	            {   // Semester 4
	                {"Algorithms", "Pass(91)"},
	                {"Computer Networks", "Pass(73)"},
	                {"Database Systems", "Fail(19)"},
	                {"Microprocessors", "Pass(80)"},
	                {"Communication Eng.", "Pass(76)"},
	                {"Software Engineering", "Pass(87)"}
	            },
	            {   // Semester 5
	                {"Probability & Stats", "Pass(86)"},
	                {"Machine Learning", "Pass(88)"},
	                {"Compiler Design", "Pass(84)"},
	                {"Theory of Computation", "Pass(95)"},
	                {"Embedded Systems", "Pass(73)"},
	                {"Computer Graphics", "Pass(90)"}
	            }
	        };
	        
	        // 1. Semester 2 Subject 4 and Subject 5 names
	        System.out.println("Semester 2 Subject 4 Name: " + data[1][3][0]);
	        System.out.println("Semester 2 Subject 5 Name: " + data[1][4][0]);

	        // 2. Semester 4 Subject 3 and Subject 6 Status/Marks
	        System.out.println("Semester 4 Subject 3 Status/Marks: " + data[3][2][1]);
	        System.out.println("Semester 4 Subject 6 Status/Marks: " + data[3][5][1]);
	}

}
