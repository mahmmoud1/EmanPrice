package com.example.android.emanprice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BabyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create an array of words
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("1050", "012 بيبي", R.drawable.ic_012_));
        words.add(new Word("1250", "035بى بى", R.drawable.ic_035_));
        words.add(new Word("1500", "1019 بيبي", R.drawable.ic_1019_));
        words.add(new Word("1500", "1065 بيبي", R.drawable.ic_1065_));
        words.add(new Word("1500", "1089 بيبي", R.drawable.ic_1089_));
        words.add(new Word("1200", "1093 بيبي", R.drawable.ic_1093_));
        words.add(new Word("1500", "1095 بيبي", R.drawable.ic_1095_));
        words.add(new Word("1500", "1098 بيبي", R.drawable.ic_1098_));
        words.add(new Word("1500", "1099 بيبي", R.drawable.ic_1099_));
        words.add(new Word("1500", "1105 بيبي", R.drawable.ic_1105_));
        words.add(new Word("900", "1602 بيبي", R.drawable.ic_1602_));
        words.add(new Word("900", "1775 بيبي", R.drawable.ic_1775_));
        words.add(new Word("900", "1783 بيبي", R.drawable.ic_1783_));
        words.add(new Word("850", "1888 بيبي", R.drawable.ic_1888_));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_baby);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }


}
