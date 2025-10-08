package language.basics;

public class Assignment5 {

	public static void main(String[] args) {

		// Applicant details

		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 40.0;

		System.out.println("Evaluating loan application for: " + customerName);

		// Checking credit score
		if (creditScore >= 750) {
			System.out.println("Loan Approved: Excellent credit score.");
		} else if (creditScore >= 650 && creditScore <= 750) {
			//System.out.println("Additional checks are performed.");
		}
		if (creditScore <= 650) {
			System.out.println("credit score is below 650, the loan is denied.");
		} else {
			System.out.println("Good credit score");
		}
		if (income >= 55000.0) {
			System.out.println("The loan to be considered.");
		} 
		if (isEmployed) {
			//System.out.println("The loan to be considered.");
		} 
		if (debtToIncomeRatio >= 40.0 ) {
			//System.out.println("The loan to be considered.");
		}
	}
}