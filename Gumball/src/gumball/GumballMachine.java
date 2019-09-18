/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gumball;
import java.util.Scanner;
/**
 *
 * @author foy
 */
public class GumballMachine
{
    private int num_gumballs = 0;
    private int nickleCount = 0;
    private int dimeCount = 0;
    private int quarterCount = 0;
    private int totalPaid = 0;
    private int numberToDispense = 0;
    private String userMessage = "";

    public GumballMachine( int size )
    {
        this.num_gumballs = size;
    }
    public int getNum_gumballs()
    {
        return this.num_gumballs;
    }
    public int getNickleCount()
    {
        return this.nickleCount;
    } 
    public int getDimeCount()
    {
        return this.dimeCount;
    } 
    public int getQuarterCount()
    {
        return this.quarterCount;
    }
    public int getTotalPaid()
    {
        return this.totalPaid;
    }

    public int getNumberToDispense()
    {
        return this.numberToDispense;
    }
    public String getUserMessage()
    {
        return this.userMessage;
    }
    public void setNickleCount(int myNickleCount)
    {
         this.nickleCount =  myNickleCount;
    } 
    public void setDimeCount(int myDimeCount)
    {
         this.dimeCount = myDimeCount;
    } 
    public void setQuarterCount(int myQuarterCount)
    {
         this.quarterCount = myQuarterCount;
    }
    public void setTotalPaid (int myTotalPaid)
    {
        this.totalPaid = myTotalPaid;
    }
    public void setUserMessage (String myUserMessage)
    {
        this.userMessage = myUserMessage;
    }
    public void setNum_gumballs(int myNum_gumballs)
    {
        this.num_gumballs = myNum_gumballs;
    }
    public void setNumberToDispense(int myNumberToDispense)
    {
        this.numberToDispense = myNumberToDispense;
    }
        
    public void insertCoins(String coinType)
    {
        if (coinType.equals("Quarter"))
        {
            quarterCount +=1;
        }else if (coinType.equals("Dime"))
        {
            dimeCount +=1;
        }else if (coinType.equals("Nickle"))
        {
            nickleCount += 1;
        }
    }

    public void turnCrank()
    {
        if (getQuarterCount() + getDimeCount() + getNickleCount() == 0)
        {
            setUserMessage("Please insert money");
            return;
        }
        if (( getNum_gumballs() - getNumberToDispense() < 0 ))
        {
            setUserMessage("No More Gumballs!  Sorry, can't return your money." );
            return;
        }
        setTotalPaid(getNickleCount() * 5 + getDimeCount() * 10 + getQuarterCount() * 25);   
    }
    
    public void dispense()
    {
        setNum_gumballs(getNum_gumballs() - getNumberToDispense());
    
    }    
    public void reset()
    {
        setNickleCount(0);
        setDimeCount(0);
        setQuarterCount(0); 
        setUserMessage("");
    }
}

class OneQuarter extends GumballMachine
{
    public OneQuarter( int size )
    {
        super(size);
        this.setNumberToDispense(1);
    }
    public void retrieve()
    {
        if(getUserMessage().equals(""))
        {
            if (this.getTotalPaid() == 25 && this.getQuarterCount() == 1)
            {
                setUserMessage("Here's one gumball\n");
                dispense();
            }
            else
            {
                setUserMessage("You paid " + getTotalPaid() + " cents but the cost is 25 cents");
            }
        }
        System.out.println(getUserMessage());
        reset();
    }    
}

class TwoQuarters extends GumballMachine
{
    public TwoQuarters( int size )
    {
        super(size);
        this.setNumberToDispense(2);
    }
    public void retrieve()
    {
        if(getUserMessage().equals(""))
        {
            if (this.getTotalPaid() == 50 && this.getQuarterCount() == 2)
            {
                setUserMessage("Here's two gumballs\n");
                dispense();
            }
            else
            {
                setUserMessage("You paid " + getTotalPaid() + " cents but the cost is 50 cents");
            }
        }
        System.out.println(getUserMessage());
        reset();
    } 
}

class AllCoins extends GumballMachine
{
    public AllCoins( int size )
    {
        super(size);
        this.setNumberToDispense(5);
    }
    public void retrieve()
    {
        if(getUserMessage().equals(""))
        {
            if (this.getTotalPaid() == 50)
            {
                setUserMessage("Here's a bunch of Sweet Tarts\n");
                dispense();
            }
            else
            {
                setUserMessage("You paid " + getTotalPaid() + " cents but the cost is 50 cents");
            }
        }
        System.out.println(getUserMessage());
        reset();
    } 
}

