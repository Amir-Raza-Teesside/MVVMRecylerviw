package uk.ac.tees.aad.mvvminrecyclerview;

import java.util.ArrayList;
import java.util.List;

public class provide {







    public static List<Hj> getlist()
    {
        List<Hj>mylist = new ArrayList<>();

        mylist.add(new Hj("aa","aaa",R.drawable.ic_launcher_background));
        mylist.add(new Hj("aa","aaa",R.drawable.ic_launcher_foreground));
        mylist.add(new Hj("rrr","rrr",R.drawable.ic_launcher_background));
        mylist.add(new Hj("lll","lll",R.drawable.pak));

        return mylist;
    }
}
