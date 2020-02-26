package org.example.homecost;

public class Home
{
    String material_standard;
    double total_area_of_house;
    Boolean fully_automated;

    public Home(String material, double area, Boolean auto)
    {
        material_standard = material;
        total_area_of_house = area;
        fully_automated = auto;
    }

    public double totalCost()
    {
        double cost = 0.0;
        if(fully_automated == true)
        {
            cost = 700;
        }
        switch(material_standard)
        {
            case "s" :
            case "S" :
                cost += 1200;
                return cost*total_area_of_house;


            case "a" :
            case "A" :
                cost += 1500;
                return cost*total_area_of_house;

            case "h" :
            case "H" :
                cost += 1800;
                return cost*total_area_of_house;

            default :
                return 0;
        }
    }
}