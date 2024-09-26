
public class judge {
    client customer;
    public judge(client person){
        this.customer = person;
    }

    public boolean judgeCreditScore(){
        return customer.getCreditScore() >= 600;
    }

    public boolean debtToIncome(){
     return false;
    }

    public boolean maxLoanAmount(){
        double maxLoanAmount = customer.getLastYearTaxableIncome() * 5;
        return customer.getRequestedLoan() < maxLoanAmount;
    }
    public boolean minIncomeLast3Months(){
        return customer.incomePastThreeMonths() >= 12000.00;
    }

    public boolean evaluate(){
        return judgeCreditScore() && maxLoanAmount() && minIncomeLast3Months();
    }

}
