package quocvuong.nqv.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvHeDieuHanh;
    ArrayList<String> ArrayCourse;

    GridView gvHeDieuHanh;
    String[] arrayName ={"Android","IOS","WindowPhone","boS","Blackbeery","Sympian"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvHeDieuHanh = (GridView) findViewById(R.id.GridViewHDH);
        ArrayAdapter adapter1 = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayName);
        gvHeDieuHanh.setAdapter(adapter1);

        lvHeDieuHanh = (ListView) findViewById(R.id.ListViewHDH);
        ArrayCourse = new ArrayList<>();
        ArrayCourse.add ("Android");
        ArrayCourse.add ("IOS");
        ArrayCourse.add ("WindowPhone");
        ArrayCourse.add ("boS");
        ArrayCourse.add ("Blackberry");
        ArrayCourse.add ("Sympian");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,ArrayCourse);

        lvHeDieuHanh.setAdapter(adapter);
    }
}