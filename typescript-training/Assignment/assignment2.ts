/* A bank evaluates loan applicants based on the following criteria:
1. Credit Score:
o If the credit score is above 750, the loan is automatically approved.
o If the credit score is between 650 and 750, additional checks are performed.
o If the credit score is below 650, the loan is denied.
2. Income:
o For credit scores between 650 and 750, the customer’s income must be at least $50,000
for the loan to be considered.

3. Employment Status:
o If the customer’s income is at least 50,000, the system checks whether the customer is
employed.
o If the customer is unemployed, the loan is denied.
4. Debt-to-Income Ratio:
o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
o If the DTI ratio is less than 40%, the loan is approved.
o If the DTI ratio is 40% or greater, the loan is denied.
*/

function evaluationloan(
    customerName : string = "John Doe",
    creditScore : number = 720,
    income : number = 55000.0,
    isEmployed : boolean = true,
    debtToIncomeRatio : number = 35.0
) : void {
    console.log("Evaluating loan application for:", customerName);

    if (creditScore > 750) {
        console.log("Loan automatically approved for:", customerName);
    } else if (creditScore >= 650) {
        if (income >= 50000) {
            if (isEmployed) {
                if (debtToIncomeRatio < 40) {
                    console.log("Loan approved for:", customerName);
                } else {
                    console.log("Loan denied for:", customerName);
                }
            } else {
                console.log("Loan denied for:", customerName);
            }
        } else {
            console.log("Loan denied for:", customerName);
        }
    } else {
        console.log("Loan denied for:", customerName);
    }
}
