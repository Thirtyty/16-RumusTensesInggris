package com.example.a16rumustensesinggris;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LvRumus extends AppCompatActivity {
    SearchView searchView;
    ListView listView;

    String[] values = new String[]{
            "Simple Present Tense", "Simple Past Tense", "Simple Future Tense",
            "Simple Past Future Tense", "Present Continuous Tense", "Past Continuous Tense",
            "Future Continuous Tense", "Past Future Continuous Tense", "Present Perfect Tense",
            "Past Perfect Tense", "Future Perfect Tense", "Past Future Perfect Tense",
            "Present Perfect Continuous Tense", "Past Perfect Continuous Tense",
            "Future Perfect Continuous Tense", "Past Future Perfect Continuous Tense"
    };

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv_rumus);

        searchView =findViewById(R.id.search_bar);
        listView  = findViewById(R.id.listview);

        arrayAdapter= new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    Intent intent = new Intent(view.getContext(), Rumus1.class);
                    startActivity(intent);
                }

                if (position==1) {
                    Intent intent = new Intent(view.getContext(), Rumus2.class);
                    startActivity(intent);
                }

                if (position==2) {
                    Intent intent = new Intent(view.getContext(), Rumus3.class);
                    startActivity(intent);
                }

                if (position==3) {
                    Intent intent = new Intent(view.getContext(), Rumus4.class);
                    startActivity(intent);
                }

                if (position==4) {
                    Intent intent = new Intent(view.getContext(), Rumus5.class);
                    startActivity(intent);
                }

                if (position==5) {
                    Intent intent = new Intent(view.getContext(), Rumus6.class);
                    startActivity(intent);
                }

                if (position==6) {
                    Intent intent = new Intent(view.getContext(), Rumus7.class);
                    startActivity(intent);
                }

                if (position==7) {
                    Intent intent = new Intent(view.getContext(), Rumus8.class);
                    startActivity(intent);
                }

                if (position==8) {
                    Intent intent = new Intent(view.getContext(), Rumus9.class);
                    startActivity(intent);
                }

                if (position==9) {
                    Intent intent = new Intent(view.getContext(), Rumus10.class);
                    startActivity(intent);
                }

                if (position==10) {
                    Intent intent = new Intent(view.getContext(), Rumus11.class);
                    startActivity(intent);
                }

                if (position==11) {
                    Intent intent = new Intent(view.getContext(), Rumus12.class);
                    startActivity(intent);
                }

                if (position==12) {
                    Intent intent = new Intent(view.getContext(), Rumus13.class);
                    startActivity(intent);
                }

                if (position==13) {
                    Intent intent = new Intent(view.getContext(), Rumus14.class);
                    startActivity(intent);
                }

                if (position==14) {
                    Intent intent = new Intent(view.getContext(), Rumus15.class);
                    startActivity(intent);
                }

                if (position==15) {
                    Intent intent = new Intent(view.getContext(), Rumus16.class);
                    startActivity(intent);
                }

            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                LvRumus.this.arrayAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                LvRumus.this.arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });

    }
}