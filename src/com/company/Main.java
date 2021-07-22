//Question:-
//X kgs of mixture contains milk and water in the ratio of r1:r2, How much more water is to be added
//to get new mixture containing milk and water in the ratio of r2:r3 ?
//sample Input: 85 27 7 3 1
//sample Output: The amount of water to be added is: 5.0 liters

package com.company;
import java.util.*;

class Data{
    float totalWeight = 0;
    float r1 =0;
    float r2 =0;
    float r3 =0;
    float r4 =0;
    void getValue(float Weight, float r1, float r2, float r3, float r4){
        totalWeight = Weight;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
    }
}

class Calculation extends Data{
    float weightOfWater = 0;
    float weightOfMilk = 0;
    float amountOfWaterToAdd = 0;
    void calculate(){
        float x = totalWeight/(r1+r2);
        weightOfMilk = r1*x;
        weightOfWater = r2*x;
        amountOfWaterToAdd = (weightOfMilk - 3*(weightOfWater))/3;
        System.out.println("The amount of water to be added is: "+amountOfWaterToAdd+" liters");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        float totalWeight = Sc.nextFloat();
        float r1 = Sc.nextFloat();
        float r2 =Sc.nextFloat();
        float r3 =Sc.nextFloat();
        float r4 =Sc.nextFloat();
        Calculation ob = new Calculation();
        ob.getValue( totalWeight, r1, r2, r3, r4);
        ob.calculate();
    }
}

