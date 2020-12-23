package com.company;

public class Main {

    public static void main(String[] args) {
        int  sizeOfArray =10;
        int count =0;
        Circle arrCircle [] = new Circle[sizeOfArray];
        for (int i = 0; i< arrCircle.length; i++){
            arrCircle[i] =new Circle(i+1);
            if (arrCircle[i].getArea(i+1)%3 == 0) {
                count++;
            }

        }
        System.out.println("Количество кругов с площадью кратною 3 равен :" +count);

    }
}
