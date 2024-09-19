package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        
        double costBefore = cost; // total cost before tip
        double tip = percent * cost/100; // value of tip
        double totalCost = cost + tip; // total cost after tip
        double costEachBefore = cost / people; // cost per person before tip
        double tipEach = tip/people; // tip per person
        double costEachAfter = totalCost / people; // total cost per person


        
        /* Math.round rounds to the nearest int, so I multiply by 100 to convert from dollars and cents to just cents, then round to the nearest
        cent and then divide by 100.0 in order to convert back to dollars and cents. It has to be 100.0 and not 100, because the rounded value
        is an int, so if I divide by an int, it's int division, which gives and int, whereas I need a double.
        I found out about the Math.round method at https://www.w3schools.com/java/ref_math_round.asp*/
        tip = Math.round(tip * 100)/100.0;
        totalCost = Math.round(totalCost * 100)/100.0;
        costEachBefore = Math.round(costEachBefore * 100)/100.0;
        tipEach =Math.round(tipEach * 100)/100.0;
        costEachAfter = Math.round(costEachAfter * 100)/100.0;
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + costBefore + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + tip + "\n");
        result.append("Total Bill with tip: $" + totalCost + "\n");
        result.append("Per person cost before tip: $" + costEachBefore + "\n");
        result.append("Tip per person: $" + tipEach + "\n");
        result.append("Total cost per person: $" + costEachAfter + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6;
        int percent = 25;
        double cost = 52.27;             
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
