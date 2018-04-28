package com.vsa.yogaforlife;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Favourate extends Fragment {

    String yoganames[];
    int images[];

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView)inflater.inflate(R.layout.fragment_favourate,container,false);

        SQLiteOpenHelper sqLiteOpenHelper = new MyDatabase(container.getContext());

        try {
            SQLiteDatabase db = sqLiteOpenHelper.getReadableDatabase();
            String s = "select NAME,IMAGE_RESOURCE_ID from YOGA where YOGA.FAV == 1";
            Cursor cursor = db.rawQuery(s,null);
            cursor.moveToFirst();
            Toast.makeText(container.getContext(), cursor.getCount(), Toast.LENGTH_SHORT).show();
            yoganames = new String[cursor.getCount()];
            images = new int[cursor.getCount()];
            for (int i= 0;cursor.moveToNext();i++){
                yoganames[i] = cursor.getString(0);
                images[i] = cursor.getInt(1);
            }
            db.close();
        }catch (Exception e){
            Toast toast = Toast.makeText(container.getContext(), "Data unavailable", Toast.LENGTH_SHORT);
        }
//        yoganames[0] = "syx";
//        images[0] = R.drawable.zen;
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(yoganames,images);
        recyclerView.setAdapter(adapter);
        StaggeredGridLayoutManager layoutManager =
              new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
//        LinearLayoutManager  = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(linearLayoutManager);
//        // Inflate the layout for this fragment

        // implement the interface listener created in Captioned images adapter

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(),YogaList.class);
                intent.putExtra(YogaList.CATEGORY_TYPE, position);
                getActivity().startActivity(intent);
            }
        });
        return recyclerView;
    }


}
