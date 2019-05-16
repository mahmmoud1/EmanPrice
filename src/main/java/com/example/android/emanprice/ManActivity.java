package com.example.android.emanprice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ManActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create an array of words
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("1200", "018-1 رجالى", R.drawable.ic_018_1_));
        words.add(new Word("1100", "054رجالي", R.drawable.ic_054));
        words.add(new Word("1200", "055رجالي", R.drawable.ic_055));
        words.add(new Word("1300", "1133 رجالي", R.drawable.ic_1133_));
        words.add(new Word("1400", "1133Bم. خاصة", R.drawable.ic_1133b__));
        words.add(new Word("1300", "1134 رجالي", R.drawable.ic_1134_));
        words.add(new Word("1300", "1135 رجالي", R.drawable.ic_1135));
        words.add(new Word("2200", "1611M+", R.drawable.ic_1611m));
        words.add(new Word("2300", "1817 رجالي", R.drawable.ic_1817));
        words.add(new Word("2200", "1901 رجالي", R.drawable.ic_1901));
        words.add(new Word("2850", "369 رجالي", R.drawable.ic_369));
        words.add(new Word("2100", "4043 رجالى", R.drawable.ic_4043));
        words.add(new Word("2500", "623-4 رجالي", R.drawable.ic_623_4));
        words.add(new Word("2500", "703-1 رجالي", R.drawable.ic_703_1));
        words.add(new Word("2300", "703-5 رجالي", R.drawable.ic_703_5));
        words.add(new Word("1250", "7781 رجالي", R.drawable.ic_7781));
        words.add(new Word("2100", "908-1 رجالى", R.drawable.ic_908_1));
        words.add(new Word("2200", "A01 رجالى", R.drawable.ic_a01_));
        words.add(new Word("1820", "A1536Z-1رجالي", R.drawable.ic_a1536z_1));
        words.add(new Word("2500", "H366-1 رجالى", R.drawable.ic_h366_1_));
        words.add(new Word("2150", "KR16-343+", R.drawable.ic_kr16_343));
        words.add(new Word("1200", "KR16-352", R.drawable.ic_kr16_352));
        words.add(new Word("2020", "KR18-357", R.drawable.ic_kr18_357));
        words.add(new Word("2100", "KR18-358M+", R.drawable.ic_kr18_358m));
        words.add(new Word("2020", "KR18-361", R.drawable.ic_kr18_361));
        words.add(new Word("2150", "KR18-362", R.drawable.ic_kr18_362));
        words.add(new Word("2400", "KR18-365", R.drawable.ic_kr18_365));
        words.add(new Word("2100", "SK-M5A رجالي", R.drawable.ic_sk_m5a));
        words.add(new Word("2100", "SM01 رجالى", R.drawable.ic_sm01));
        words.add(new Word("1150", "VR16-269", R.drawable.ic_vr16_269));
        words.add(new Word("1300", "VR17-288", R.drawable.ic_vr17_288));
        words.add(new Word("1300", "VR17-289", R.drawable.ic_vr17_289));
        words.add(new Word("1300", "VR17-304", R.drawable.ic_vr17_304));
        words.add(new Word("1400", "VR18-294B M+", R.drawable.ic_vr18_294b_m));
        words.add(new Word("1400", "VR18-294M+", R.drawable.ic_vr18_294m));
        words.add(new Word("1300", "VR18-295", R.drawable.ic_vr18_295));
        words.add(new Word("1400", "VR18-295B", R.drawable.ic_vr18_295b));
        words.add(new Word("1300", "VR18-300M+", R.drawable.ic_vr18_300m));
        words.add(new Word("2500", "VR18-309+", R.drawable.ic_vr18_309));
        words.add(new Word("1350", "ZR01 رجالي", R.drawable.ic_zr01));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_man);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }


}
