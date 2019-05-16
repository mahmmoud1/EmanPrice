package com.example.android.emanprice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create an array of words
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("900", "1802 صندل بيبي", R.drawable.ic_1802__));
        words.add(new Word("420", "822 شبشب رجالي", R.drawable.ic_822__));
        words.add(new Word("750", "SM12-34", R.drawable.ic_sm12_34));
        words.add(new Word("660", "SM4315", R.drawable.ic_sm4315));
        words.add(new Word("660", "SM4325", R.drawable.ic_sm4325));
        words.add(new Word("660", "SNM4315", R.drawable.ic_snm4315));
        words.add(new Word("660", "SNM4325", R.drawable.ic_snm4325));
        words.add(new Word("660", "SNM4330", R.drawable.ic_snm4330));
        words.add(new Word("520", "SR17-541", R.drawable.ic_sr17_541));
        words.add(new Word("420", "SR18-553", R.drawable.ic_sr18_553));
        words.add(new Word("420", "SR18-554", R.drawable.ic_sr18_554));
        words.add(new Word("420", "SR18-555", R.drawable.ic_sr18_555));
        words.add(new Word("420", "SR18-556", R.drawable.ic_sr18_556));
        words.add(new Word("900", "SR18-559", R.drawable.ic_sr18_559));
        words.add(new Word("750", "SR18-563", R.drawable.ic_sr18_563));
        words.add(new Word("720", "SR18-567", R.drawable.ic_sr18_567));
        words.add(new Word("540", "SR18-583", R.drawable.ic_sr18_583));
        words.add(new Word("540", "SR18-584", R.drawable.ic_sr18_584));
        words.add(new Word("540", "SR18-585", R.drawable.ic_sr18_585));
        words.add(new Word("720", "SR18-589", R.drawable.ic_sr18_589));
        words.add(new Word("570", "SR18-592", R.drawable.ic_sr18_592));
        words.add(new Word("570", "SR18-594", R.drawable.ic_sr18_594));
        words.add(new Word("570", "SR18-595", R.drawable.ic_sr18_595));
        words.add(new Word("570", "SR18-596", R.drawable.ic_sr18_596));
        words.add(new Word("570", "SR18-597", R.drawable.ic_sr18_597));
        words.add(new Word("850", "SR18-598", R.drawable.ic_sr18_598));
        words.add(new Word("850", "SR18-602", R.drawable.ic_sr18_602));
        words.add(new Word("850", "SR18-603", R.drawable.ic_sr18_603));
        words.add(new Word("850", "SR18-604", R.drawable.ic_sr18_604));
        words.add(new Word("950", "SR18-607", R.drawable.ic_sr18_607));
        words.add(new Word("950", "SR18-608", R.drawable.ic_sr18_608));
        words.add(new Word("850", "SR18-609", R.drawable.ic_sr18_609));
        words.add(new Word("850", "SR18-610", R.drawable.ic_sr18_610));
        words.add(new Word("850", "SR18-611", R.drawable.ic_sr18_611));
        words.add(new Word("850", "SR18-612", R.drawable.ic_sr18_612));
        words.add(new Word("850", "SR18-613", R.drawable.ic_sr18_613));
        words.add(new Word("720", "SR18-614", R.drawable.ic_sr18_614));
        words.add(new Word("780", "SR18-616", R.drawable.ic_sr18_616));
        words.add(new Word("750", "SR18-627", R.drawable.ic_sr18_627));
        words.add(new Word("980", "WA18-28", R.drawable.ic_wa18_28));
        words.add(new Word("980", "WA18-30", R.drawable.ic_wa18_30));
        words.add(new Word("980", "WA18-31", R.drawable.ic_wa18_31));
        words.add(new Word("980", "WA18-32", R.drawable.ic_wa18_32));
        words.add(new Word("950", "WB18-19", R.drawable.ic_wb18_19));
        words.add(new Word("950", "WB18-20", R.drawable.ic_wb18_20));
        words.add(new Word("950", "WB18-21", R.drawable.ic_wb18_21));
        words.add(new Word("950", "WB18-22", R.drawable.ic_wb18_22));
        words.add(new Word("1000", "WM18-10", R.drawable.ic_wm18_10));
        words.add(new Word("1100", "WR18-28", R.drawable.ic_wr18_28));
        words.add(new Word("1100", "WR18-29", R.drawable.ic_wr18_29));
        words.add(new Word("1100", "WR18-30", R.drawable.ic_wr18_30));
        words.add(new Word("1100", "WR18-31", R.drawable.ic_wr18_31));
        words.add(new Word("1250", "WR18-32", R.drawable.ic_wr18_32));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_shoes);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }


}
