package uk.ac.tees.aad.mvvminrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import uk.ac.tees.aad.mvvminrecyclerview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

       activityMainBinding.rec.setLayoutManager(new LinearLayoutManager(this));
       adapter = new MyAdapter(provide.getlist());
       activityMainBinding.rec.setAdapter(adapter);


    }

    public List<Hj> getlist()
    {
        List<Hj> mylist = new ArrayList<>();
        mylist.add(new Hj("aa","aa"));
        mylist.add(new Hj("bb","bb"));
        mylist.add(new Hj("cc","cc"));
        mylist.add(new Hj("dd","dd"));
        mylist.add(new Hj("ee","aee"));
        mylist.add(new Hj("ff","ff"));
        return  mylist;
    }
}