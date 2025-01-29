public class BankAccount {
    public static void main(String[] args){

        //Bob's Checking Account
        // Start at $2175.37 (it's money, so it should be a double)
        double bobby_checkingAcc = 2175.37;
        //Bob then withdraws $302.50
        bobby_checkingAcc -= 302.50;
        //Bob deposits $50.03
        bobby_checkingAcc += 50.03;
        //He proceeds to withdraw half of his current balance
        bobby_checkingAcc /= 2.00;
        //Then he deposits $20.00
        bobby_checkingAcc += 20.00;
        //He withrdaws $1
        bobby_checkingAcc -= 1.00;
        //Bob deposits a paycheck that doubles his current balance (infinite money glitch?)
        bobby_checkingAcc *= 2.00;
        //Bro deposits $1
        bobby_checkingAcc += 1.00;

        //Print out Bob's new balance
        //I didn't like that the number was so long so I used this method but it rounded from 1961.8999999 to 1961.90 so i hope that's not a problem
        System.out.println("Bob, your current balance is: $" + String.format("%.2f", bobby_checkingAcc));
        
        

    }
}
