
//  This class is used for general testing purposes of other classes

package JavaExamples;

import JavaExamples.Abstraction.Loan;

public class Main {

    public static void main(String[] args) {
        Loan testLoan = new Loan(4,2,5);
        System.out.println(testLoan.getLoanAmount());
        System.out.println(testLoan.getMonthlyPayment());
        System.out.println(testLoan.getTotalPayment());
    }
}
