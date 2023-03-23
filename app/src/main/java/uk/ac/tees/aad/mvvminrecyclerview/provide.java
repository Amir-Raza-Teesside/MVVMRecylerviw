package uk.ac.tees.aad.mvvminrecyclerview;

import java.util.ArrayList;
import java.util.List;

public class provide {







    public static List<Hj> getlist()
    {
        List<Hj>mylist = new ArrayList<>();

        mylist.add(new Hj("aa","aaa"));
        mylist.add(new Hj("aa","aaa"));
        mylist.add(new Hj("rrr","rrr"));
        mylist.add(new Hj("lll","lll"));

        return mylist;
    }
}
