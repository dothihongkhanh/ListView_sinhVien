package com.example.listviewth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.listviewth.databinding.ActivityMainBinding;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    ListView lvStudent;
    ArrayList<User> arrayUser;
    ListAdapter adapter;
    CircleImageView civDelete;
    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter = new ListAdapter(this, R.layout.list_item, arrayUser);
        lvStudent.setAdapter(adapter);

        civDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayUser.remove(vitri);
                adapter.notifyDataSetChanged();
            }
        });

    }
    private void AnhXa(){
        lvStudent = (ListView) findViewById(R.id.listviewSinhvien);
        arrayUser = new ArrayList<>();

        arrayUser.add(new User("Do Thi Hong khanh","2050531200212",R.drawable.logo));
        arrayUser.add(new User("Nguyen Van A ","2050531200212",R.drawable.img_avatar1));
        arrayUser.add(new User("Nguyen Van B ","2050531200212",R.drawable.img_avatar2));
        arrayUser.add(new User("Nguyen Van C ","2050531200212",R.drawable.img_avatar3));
        arrayUser.add(new User("Nguyen Van D ","2050531200212",R.drawable.img_avatar4));

        civDelete = (CircleImageView) findViewById(R.id.cimgviewDelete);
    }

}