package com.company;
import java.util.List;
import java.util.ArrayList;
import  com.company.Distance;

public class Main {
    //Находим все расположения слов в данном нам тексте
    public static List<Integer> FindLocation(String[] text, String myWord){
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < text.length; i++)
        {
            if (text[i].equals(myWord))
            {
                myList.add(i);

            }
        }
        return myList;
    }
    //Вычисляем минимальное и максимальное значение
    public  static Distance FindDistance (String t, String word1, String word2){
        String[] text;
        text = t.split(" ");
        List<Integer> myList1 = FindLocation(text, word1);
        List<Integer> myList2 = FindLocation(text, word2);
        int pos = myList2.get(0);
        int positionModule;
        int maxDistance = 0;
        int minDistance = Math.abs(pos - myList1.get(0)) - 1;
        myList2.clear();
        for(int i = 0; i < myList1.size(); i++) {
            //Модуль расстояния
            positionModule = Math.abs(pos - myList1.get(i));
            if (positionModule > maxDistance)
            {
                maxDistance = positionModule - 1;
            }
            if (minDistance > positionModule)
            {
                minDistance = positionModule - 1;
            }
        }
        System.out.println("Max distance = " + maxDistance);
        System.out.println("Min distance = " + minDistance);
        System.out.println("/////////////////////////////////////");
        return new Distance(minDistance, maxDistance);
    }

    public static void main(String[] args) {
	// write your code here
        String text = "Today is very good a sunny day";
        String word1 = "day";
        String word2 = "Today";
        FindDistance(text, word1, word2);
    }
}
