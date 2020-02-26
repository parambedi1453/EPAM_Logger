
package org.example;

import java.util.*;
import org.example.homecost.*;
import org.example.interest.*;
import org.apache.logging.log4j.LogManager;

public class App1
{
    public static void main( String[] args )
    {
        final org.apache.logging.log4j.Logger logger = LogManager.getLogger(org.example.App.class);

        Scanner sc = new Scanner(System.in);

        logger.info("Enter I or i to calculate SI or CI \nEnter C or c to calculate cost of construction\n");
        String choice = sc.nextLine();
        switch(choice)
        {
            case "I" :
            case "i" :
                double principal,rate,time;
                int option;

                logger.info("Enter Principal\n");
                principal = sc.nextDouble();

                logger.info( "Enter Rate Of Interest\n");
                rate = sc.nextDouble();

                logger.info("Enter Time\n");
                time = sc.nextDouble();

                Interest ob = new Interest(principal,rate,time);

                logger.info("Enter 1 for SI and 2 for CI\n");
                option = sc.nextInt();

                if(option == 1)
                    logger.info(ob.calculate_SI());
                else if(option == 2)
                    logger.info(ob.calculate_CI());
                else
                    logger.info("Wrong choice");
                break;

            case "C" :
            case "c" :
                logger.info("Enter S or s for Standard Material\nEnter A or a for Above Standard Material\nEnter H or h for High Standard Material\n");
                String material = sc.next();

                logger.info("Enter Total Area Of House\n");
                double area = sc.nextDouble();

                logger.info( "Want Fully Automated Home ? (True/False)\n");
                Boolean opt = sc.nextBoolean();
                Home home = new Home(material, area, opt);
                double cost = home.totalCost();
                if(cost == 0)
                {
                    logger.info("Wrong Choice");
                }
                else {
                    logger.info("Total cost is "+cost);
                }
                break;

            default :
                logger.info( "Wrong Choice");
                break;
        }
    }
}