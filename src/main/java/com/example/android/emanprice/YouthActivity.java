package com.example.android.emanprice;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class YouthActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create an array of words
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("600", "6606", R.drawable.ic_6606));
        words.add(new Word("1150", "001 محير", R.drawable.ic_001_));
        words.add(new Word("2000", "3180W", R.drawable.ic_3180w));
        words.add(new Word("2150", "6262 محير", R.drawable.ic_6262_));
        words.add(new Word("2000", "665 محير", R.drawable.ic_665_));
        words.add(new Word("2100", "703-6 محير", R.drawable.ic_703_6_));
        words.add(new Word("2000", "7623 محير", R.drawable.ic_7623_));
        words.add(new Word("1200", "7782 محير", R.drawable.ic_7782));
        words.add(new Word("2150", "781-1 محير", R.drawable.ic_781_1_));
        words.add(new Word("2150", "781-2 محير", R.drawable.ic_781_2_));
        words.add(new Word("1700", "80-1 محير", R.drawable.ic_80_1_));
        words.add(new Word("1800", "87N محير", R.drawable.ic_87n_));
        words.add(new Word("1650", "BM16-2", R.drawable.ic_bm16_2));
        words.add(new Word("1800", "KM18-136", R.drawable.ic_km18_136));
        words.add(new Word("2000", "KM18-139", R.drawable.ic_km18_139));
        words.add(new Word("2100", "KM18-140", R.drawable.ic_km18_140));
        words.add(new Word("1800", "KM18-141", R.drawable.ic_km18_141));
        words.add(new Word("2100", "KM18-142", R.drawable.ic_km18_142));
        words.add(new Word("1800", "KM18-143", R.drawable.ic_km18_143));
        words.add(new Word("1800", "KM18-144", R.drawable.ic_km18_144));
        words.add(new Word("2100", "KM18-145", R.drawable.ic_km18_145));
        words.add(new Word("1950", "KM18-146", R.drawable.ic_km18_146));
        words.add(new Word("2100", "NIKE ZOOM", R.drawable.ic_nike_zoom));
        words.add(new Word("2100", "NK-3", R.drawable.ic_nk_3));
        words.add(new Word("2200", "VM18-130", R.drawable.ic_vm18_130));
        words.add(new Word("2200", "VM18-131", R.drawable.ic_vm18_131));
        words.add(new Word("2200", "VM18-132", R.drawable.ic_vm18_132));
        words.add(new Word("1790", "W2588-محير", R.drawable.ic_w2588));
        words.add(new Word("1650", "WAN2A-1 بوت محير", R.drawable.ic_wan2a_1__));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_youth);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }


}
