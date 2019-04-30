package com.example.brom.listviewjsonapp;

import java.util.HashMap;

public class mountain {
    private String name;
    private String location;
    private int Height;
     public mountain (String stringname, String stringlocation, int inthighet){
         name=stringname;
         location=stringlocation;
         Height=inthighet;
     }
     public String info () {
         String str=name;
         str+="ligger i";
         str+=location;
         str+="har höjden av";
         str+=Integer.toString(Height);
         str+="meter";
         return str;
     }

    public String toString() {return name;}
     
}

