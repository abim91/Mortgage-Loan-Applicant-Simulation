import java.time.LocalDate;

public class client {
    private String name;
    private String id;
    private LocalDate dob;
    private int creditScore;
    private double lastYearTaxableIncome;
    private double incomePastThreeMonths;
    private double requestedLoan;

    public client(String name, String id, LocalDate dob, int creditScore,
                  double lastYearTaxableIncome, double incomePastThreeMonths, double requestedLoan) {
            this.name = name;
            this.id = id;
            this.dob = dob;
            this.creditScore = creditScore;
            this.lastYearTaxableIncome = lastYearTaxableIncome;
            this.incomePastThreeMonths = incomePastThreeMonths;
            this.requestedLoan = requestedLoan;
        }

    public int getCreditScore() {
        return creditScore;
    }

    public LocalDate getDob() {
        return dob;
    }

    public double getLastYearTaxableIncome() {
        return lastYearTaxableIncome;
    }

    public double incomePastThreeMonths() {
        return incomePastThreeMonths;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRequestedLoan() {
        return requestedLoan;
    }


}
