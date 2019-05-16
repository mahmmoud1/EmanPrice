package com.example.android.emanprice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class KidsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create an array of words
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("1350", "035 أطفال", R.drawable.ic_035_));
        words.add(new Word("1350", "052 أطفال", R.drawable.ic_052));
        words.add(new Word("1350", "053 أطفال", R.drawable.ic_053));
        words.add(new Word("1600", "2098Cأطفال", R.drawable.ic_2098c));
        words.add(new Word("1600", "2131Cأطفال", R.drawable.ic_2131c));
        words.add(new Word("1600", "2133Cأطفال", R.drawable.ic_2133c));
        words.add(new Word("1600", "2138Cأطفال", R.drawable.ic_2138c));
        words.add(new Word("1600", "2150Cأطفال", R.drawable.ic_2150c));
        words.add(new Word("1600", "2153Cأطفال", R.drawable.ic_2153c));
        words.add(new Word("1600", "2156Cباسكت أطفال", R.drawable.ic_2156c));
        words.add(new Word("1600", "2159Cأطفال", R.drawable.ic_2159c));
        words.add(new Word("1500", "2738Cأطفال", R.drawable.ic_2738c));
        words.add(new Word("1500", "2750Cأطفال", R.drawable.ic_2750c));
        words.add(new Word("1800", "3176C", R.drawable.ic_3176c));
        words.add(new Word("1800", "3177C", R.drawable.ic_3177c));
        words.add(new Word("1800", "3178C", R.drawable.ic_3178c));
        words.add(new Word("1800", "3179C", R.drawable.ic_3179c));
        words.add(new Word("1800", "3180C", R.drawable.ic_3180c));
        words.add(new Word("1650", "318-1أطفال", R.drawable.ic_318_1));
        words.add(new Word("1650", "318-2أطفال", R.drawable.ic_318_2));
        words.add(new Word("1650", "318-3 أطفال", R.drawable.ic_318_3));
        words.add(new Word("1650", "318-4 أطفال", R.drawable.ic_318_4));
        words.add(new Word("1650", "318-5 أطفال", R.drawable.ic_318_5));
        words.add(new Word("1500", "80-21 أطفال", R.drawable.ic_80_21_));
        words.add(new Word("1300", "80-6 أطفال", R.drawable.ic_80_6_));
        words.add(new Word("1450", "80-8 كنترة أطفال", R.drawable.ic_80_8));
        words.add(new Word("1700", "8802 أطفال", R.drawable.ic_8802_));
        words.add(new Word("1500", "888 أطفال", R.drawable.ic_888_));
        words.add(new Word("1150", "A002 كنترة أطفال", R.drawable.ic_a002));
        words.add(new Word("950", "A011 أطفال", R.drawable.ic_a011));
        words.add(new Word("1300", "A36 أطفال", R.drawable.ic_a36_));
        words.add(new Word("1150", "A622 أطفال", R.drawable.ic_a622_));
        words.add(new Word("1150", "A67 أطفال", R.drawable.ic_a67_));
        words.add(new Word("1170", "A6716 أطفال", R.drawable.ic_a6716));
        words.add(new Word("1150", "A7006 أطفال", R.drawable.ic_a7006_));
        words.add(new Word("1150", "A781 كنترة أطفال", R.drawable.ic_a781__));
        words.add(new Word("1100", "A82 أطفال", R.drawable.ic_a82_));
        words.add(new Word("1100", "A83 أطفال", R.drawable.ic_a83));
        words.add(new Word("1100", "A9012 كنترة أطفال", R.drawable.ic_a9012));
        words.add(new Word("1150", "A9015 كنترة أطفال", R.drawable.ic_a9015));
        words.add(new Word("1100", "A9017 كنترة أطفال", R.drawable.ic_a9017));
        words.add(new Word("1150", "A9018 كنترة أطفال",R.drawable.ic_a9018));
        words.add(new Word("1200", "C202 أطفال", R.drawable.ic_c202));
        words.add(new Word("1500", "C2588 - اطفال", R.drawable.ic_c2588));
        words.add(new Word("1500", "C2715 - اطفال", R.drawable.ic_c2715));
        words.add(new Word("1600", "KA16-127", R.drawable.ic_ka16_127));
        words.add(new Word("1680", "KA18-136", R.drawable.ic_ka18_136));
        words.add(new Word("1600", "KA18-143", R.drawable.ic_ka18_143));
        words.add(new Word("1650", "KA18-144", R.drawable.ic_ka18_144));
        words.add(new Word("1900", "KA18-146", R.drawable.ic_ka18_146));
        words.add(new Word("1900", "KA18-147", R.drawable.ic_ka18_147));
        words.add(new Word("1650", "KA18-148", R.drawable.ic_ka18_148));
        words.add(new Word("1650", "KA18-149", R.drawable.ic_ka18_149));
        words.add(new Word("1800", "KA18-150", R.drawable.ic_ka18_150));
        words.add(new Word("1300", "L-18 أطفال", R.drawable.ic_l_18_));
        words.add(new Word("1400", "NK-5", R.drawable.ic_nk_5));
        words.add(new Word("1800", "VA18-57", R.drawable.ic_va18_57));
        words.add(new Word("1800", "VA18-58", R.drawable.ic_va18_58));
        words.add(new Word("1800", "VA18-59", R.drawable.ic_va18_59));
        words.add(new Word("1550", "WAN2-D بوت أطفال", R.drawable.ic_wan2_d__));




        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_kids);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }


}
