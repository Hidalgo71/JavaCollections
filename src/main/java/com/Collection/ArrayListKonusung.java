package com.Collection;

import java.util.*;

public class ArrayListKonusung
{
    public static void main(String[] args)
    {
        String[] cityArray = new String[5];
        cityArray[0] = "Ist";

        List<String> cityList = new ArrayList<>();
        //cityArray.add("Sivas");


        for(int i = 0; i < cityList.size(); i++)
        {
            System.out.println("list: " + cityList.get(i));
        }

        for(String city : cityList)
        {
            System.out.println("City: " + city);
        }

        cityList.remove("Ankara");

        if (cityList.contains("Sivas"))
        {
            System.out.println("var");
        }

        List<String> countryList = new LinkedList<>();
        countryList.add("Italy");

        cityList.addAll(countryList);

        Set<String> citySet = new HashSet<>();
        citySet.add("Ankara");                      //2. ve 3. ... yazdırmaz

        for(String s : citySet)
        {
            System.out.println("Sehir: " + s);
        }
        //MAP objeler içine anahtarla kaydedilir
        //String int fark etmez
        Map<Integer, String> cityMap = new HashMap<>();
        cityMap.put(1,"Giresun");
        cityMap.put(71,"Ankaran");
        cityMap.put(71,"Ankara");       //71 güncellendi

        if (cityMap.containsKey(1))
        {
            System.out.println("1 keyi var");
        }
        //cityMap.containsValue

        for (Map.Entry cityKV : cityMap.entrySet())
        {
            System.out.println("City: " + cityKV.getKey() + " " + cityKV);
        }




    }
}
