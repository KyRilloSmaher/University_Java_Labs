package QuestionFour;

import java.util.Comparator;

public class BalanceCompare implements Comparator<BankAccount>
{
    @Override
    public int compare(BankAccount b1, BankAccount b2)
    {
        double p1 = b1.getBalance();
        double p2 = b2.getBalance();
        
        if(p1 == p2)
            return 0;
        else if(p1 > p2)
            return -1;
        else
            return 1;
    }
}
