package cl.evilgenius.recycleview_project2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    //variable
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String>mImageUrls= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "On create: Strated");

        initImageBitmaps();

    }

    private void initImageBitmaps(){
        Log.e(TAG, "initImageBitmaps: Preparaing BITMAPS.xD");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Big_Mac_hamburger.jpg/1200px-Big_Mac_hamburger.jpg");
        mNames.add("Sandwich");

        mImageUrls.add("https://c8.alamy.com/comp/D7DDKB/soft-drink-cans-D7DDKB.jpg");
        mNames.add("Bebidas");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrnQl0sUjO7RBWNsscFeUyAvAEslSrFaynBWSoy3R5dRdBdFg__w");
        mNames.add("Postre");

        mImageUrls.add("http://i2.wp.com/www.foodrepublic.com/wp-content/uploads/2016/11/7417277946_9241b1443a_b.jpg?resize=700%2C%20506");
        mNames.add("Te, Cafe");

        mImageUrls.add("http://www.dateate.cl/web/wp-content/uploads/2017/05/DoggisD%C3%ADadelCompleto2017.jpg");
        mNames.add("Completo");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSotv-IJ2oLfAnRpxyisNTkEY_KvSXAwzWGoShWePKuDjsPjnY");
        mNames.add("Ensaladas");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJm1WfKOI6L-tHFFyaF7zBALd_IUmxhBj-Z2glauqbkrOj5BLjgQ");
        mNames.add("Cervezas");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ773ete2Ls2Vqg9pMLidHnBl0ALvZrk-p5Sg9h3bh2nV5vyFXvUg");
        mNames.add("Tablas Calientes");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTh8ZA-kVuU0K_S7XZbX3J-FD3adNib8l2tqsnhufB7CC3khkrm");
        mNames.add("Extras");


        initRecycleView();
    }

    private void initRecycleView(){
        Log.e(TAG,"intiRecycleview: init Recycleview Just started");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecycleViewAdapter adapter = new RecycleViewAdapter( mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }

}
