package org.example.interest;

public class Interest
{
    double principal,rate,time;

    public Interest(double p, double r, double t)
    {
        principal = p;
        rate = r;
        time = t;
    }

    public double calculate_SI()
    {
        return (principal*rate*time)/100;
    }

    public double calculate_CI()
    {
        double amount=principal*(Math.pow(1+(rate/100.0),time));
        return amount-principal;
    }
}