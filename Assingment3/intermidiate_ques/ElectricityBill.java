package Assingment3.intermidiate_ques;

public class ElectricityBill {
    public static void main(String[] args){
        int units = 380;
        double billToPay = 0;
        if (units <100)
        {
            billToPay = units * 1.20;

        }
        else if(units < 300)
        {
            billToPay = 100* 1.20+(units -100)*2; 
        }
        else
        {
            billToPay = 100*1.20+200*2+(units -300)*3;

        }
        System.out.println(billToPay);
    }
}
/*UNIT CONSUMED = Present KWH Reading- Previous KWH reading

ENERGY CHARGE (EC)= UNIT CONSUMED * Unit Rate

FIXED CHARGE (FC) = MAXIMUM DEMAND * Fixed rate charge

ELECTRICITY DUTY (ED) = (ENERGY CHARGE + FIXED CHARGE)* Tax Rate (in %)/100*/