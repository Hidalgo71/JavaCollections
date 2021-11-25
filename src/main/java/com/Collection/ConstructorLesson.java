package com.Collection;

public class ConstructorLesson
{
    public String nameSn;
    //public String city;
    public int age;

    public ConstructorLesson()
    {
        System.out.println("Yaratıldı");
        age = 22;
    }

    public ConstructorLesson(String nameSn, int age)
    {
        this.nameSn = nameSn;
        this.age = age;
    }

    public void mehmetHocaCokYakisikli(){
        Ogretmen ogrt1 = new Ogretmen();
        ogrt1.nameSn = "asd";
        ogrt1.age = 232;
    }

}
