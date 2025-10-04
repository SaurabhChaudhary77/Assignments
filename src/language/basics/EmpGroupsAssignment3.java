package language.basics;

public class EmpGroupsAssignment3 {

	public static void main(String[] args) {
		
		EmployeesAssignment3 obj = new EmployeesAssignment3();

	        // Arrays to store employee names and IDs
	        String[] employeeNames = new String[3];
	        int[] employeeIDs = new int[3];

	        // Retrieve data from Employees object
	        employeeNames[0] = obj.employeeName1;
	        employeeNames[1] = obj.employeeName2;
	        employeeNames[2] = obj.employeeName3;

	        employeeIDs[0] = obj.employeeID1;
	        employeeIDs[1] = obj.employeeID2;
	        employeeIDs[2] = obj.employeeID3;

	        // Print employee details
	        System.out.println("Employee Name: " + employeeNames[0] + ", Employee ID: " + employeeIDs[0]);
	        System.out.println("Employee Name: " + employeeNames[1] + ", Employee ID: " + employeeIDs[1]);
	        System.out.println("Employee Name: " + employeeNames[2] + ", Employee ID: " + employeeIDs[2]);

	}

}
