package com.mobileapps.jera.listtworows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        final ListViewItem[] items = new ListViewItem[40];

        for (int i = 0; i < items.length; i++) {
             if (i % 2 == 0) {
                items[i] = new ListViewItem("EVEN " + i, CustomAdapter.TYPE_EVEN);
            } else {
                items[i] = new ListViewItem("ODD " + i, CustomAdapter.TYPE_ODD);
            }
        }

        CustomAdapter customAdapter = new CustomAdapter(this, R.id.text, items);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), items[i].getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
