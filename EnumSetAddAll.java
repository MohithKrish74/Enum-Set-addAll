package com.keyword;

import java.util.EnumSet;
enum Game{CRICKET,FOOTBALL,VOLLEYBALL,BASKETBALL,HOCKEY}

public class EnumSetAddAll
{
    public static void main(String[] args)
    {
        EnumSet<Game> set1 = EnumSet.allOf(Game.class);
        EnumSet<Game> set2 = EnumSet.noneOf(Game.class);
        System.out.println("The set 1 is "+set1);
        set2.addAll(set1);
        System.out.println("The set 2 is "+set2);
    }
}
