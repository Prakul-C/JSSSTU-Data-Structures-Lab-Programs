/* 3) The daily maximum temperatures recorded for 5 cities during the first 6 days of January month have to be tabulated. Develop an application to read the data and find the city and day corresponding to highest temperature and lowest temperature
Name of the program: Temperature.java */

import java.util.*;

class TemperatureInfo {
    void input(double[][] arr) {
        System.out.println("\nEnter the highest temperature (in Celsius) recorded for the first 6 days in the Month of January: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) { //City names can be given here if you need them
            System.out.print("In City -" + (i + 1) + ": ");
            for(int j = 0; j < 6; j++)
                arr[j][i] = sc.nextDouble();
        }
        
    }

    void highestAndLowest(double[][] arr) {
        double high = arr[0][0];
        double low = arr[0][0];
        int i, j, cityH=0, cityL=0, dayH=0, dayL=0; //City with highest and lowest temp and days  with highest and lowest temps
        for(i = 0; i < 6; i++) 
            for(j = 0; j < 5; j++) {
                if (arr[i][j] >= high) {
                    high = arr[i][j];
                    cityH = j + 1 ;
                    dayH = i + 1;
                }
                if(arr[i][j] <= low) {
                    low = arr[i][j];
                    cityL = j + 1 ;
                    dayL = i + 1;
                }
            }
       System.out.println("\nHighest temperature was " + high + " Celsius on day -" + dayH + " in the City -" + cityH +"\n");
       System.out.println("Lowest temperature was " + low + " Celsius on day-" + dayL + " in the City-" + cityL);
    }
}

class Temperature {
    public static void main(String[] args) {
        double[][] arr = new double[10][10];
        TemperatureInfo temp1 = new TemperatureInfo();
        temp1.input(arr);
        temp1.highestAndLowest(arr);
    }
}
