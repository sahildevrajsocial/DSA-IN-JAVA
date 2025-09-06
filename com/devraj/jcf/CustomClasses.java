package com.devraj.jcf;
class Data {
    public Integer num;
    public String name;
    Data(int _num, String _name) {
        this.num = _num;
        this.name = _name;
    }
}

public class CustomClasses {
    public static void main(String[] args) {
        Data dataObj1 = new Data(7, "Sahil");
        Data dataObj2 = new Data(007, "Devraj");
        dataObj1.name = "Roz Dsa Krle Bhai";
        System.out.println(dataObj2.name);
        System.out.println(dataObj1.name);
    }
}
