package com.example.dikta_pc.sentimenanalis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dikta_pc.sentimenanalis.adapter.Wisata;
import com.example.dikta_pc.sentimenanalis.adapter.WisataViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    private RecyclerView mRecyclerVi;
    private WisataViewAdapter mWisataAdapter;
    private List<Wisata> mWisataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mRecyclerVi = findViewById(R.id.main_recycler);
        mRecyclerVi.setHasFixedSize(false);
        mRecyclerVi.setLayoutManager( new LinearLayoutManager(Home.this, LinearLayoutManager.VERTICAL,false));

        //isi
        loadData();

        mWisataAdapter = new WisataViewAdapter( Home.this, mWisataList);
        mRecyclerVi.setAdapter(mWisataAdapter);
    }

    private void loadData() {
        mWisataList = new ArrayList<>();
        mWisataList.add( new Wisata("Coban Rondo","Malang","Jawa Timur","https://chibirentalmotormalang.com/wp-content/uploads/2019/01/kaliwutu.jpg",100,230) );
        mWisataList.add( new Wisata("Coban Rondo","Malang","Jawa Timur","https://chibirentalmotormalang.com/wp-content/uploads/2019/01/kaliwutu.jpg",100,230) );
        mWisataList.add( new Wisata("Coban Rondo","Malang","Jawa Timur","https://chibirentalmotormalang.com/wp-content/uploads/2019/01/kaliwutu.jpg",100,230) );
        mWisataList.add( new Wisata("Coban Rondo","Malang","Jawa Timur","https://chibirentalmotormalang.com/wp-content/uploads/2019/01/kaliwutu.jpg",100,230) );
        mWisataList.add( new Wisata("Coban Rondo","Malang","Jawa Timur","https://chibirentalmotormalang.com/wp-content/uploads/2019/01/kaliwutu.jpg",100,230) );
        mWisataList.add( new Wisata("Coban Rondo","Malang","Jawa Timur","https://chibirentalmotormalang.com/wp-content/uploads/2019/01/kaliwutu.jpg",100,230) );
        mWisataList.add( new Wisata("Coban Rondo","Malang","Jawa Timur","https://chibirentalmotormalang.com/wp-content/uploads/2019/01/kaliwutu.jpg",100,230) );
    }
}
