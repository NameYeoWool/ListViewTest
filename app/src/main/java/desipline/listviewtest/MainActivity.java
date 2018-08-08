package desipline.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView1);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                new ArrayList<String>());
        listView.setAdapter(mAdapter);
        initData();
    }

    private void initData(){
        String[] items = getResources().getStringArray(R.array.list_item);
        for(String s: items){
            mAdapter.add(s);
        }
    }
}
