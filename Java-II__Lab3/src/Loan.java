import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numOfYears;
    private double loanAmount;
    private final Date loanDate;

    /**
     * Default constructor
     */
    public Loan() {
        this(7.5, 30, 100000);
    }

    /**
     * Construct a NewLoan with specified annual interest rate,
     * number of years and loan amount
     */
    public Loan(double annualInterestRate, int numOfYears,
                double loanAmount) {
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Interest rate cannot be less than or equal to 0");
        } else if (numOfYears <= 0) {
            throw new IllegalArgumentException("Number of Years cannot be less than or equal to 0");
        } else if (loanAmount <= 0) {
            throw new IllegalArgumentException("Loan Amount cannot be less than or equal to 0");
        }

        this.annualInterestRate = annualInterestRate;
        this.numOfYears = numOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();

    }

    /**
     * Return annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Set a new annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Return numOfYears
     */
    public int getNumOfYears() {
        return numOfYears;
    }

    /**
     * Set a new numOfYears
     */
    public void setNumOfYears(int numOfYears) {
        this.numOfYears = numOfYears;
    }

    /**
     * Return loanAmount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * Set a newloanAmount
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * Find monthly payment
     */
    public double monthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 -
                (Math.pow(1 / (1 + monthlyInterestRate), numOfYears * 12)));
    }

    /**
     * Find total payment
     */
    public double totalPayment() {
        return monthlyPayment() * numOfYears * 12;
    }

    /**
     * Return loan date
     */
    public Date getLoanDate() {
        return loanDate;
    }
}