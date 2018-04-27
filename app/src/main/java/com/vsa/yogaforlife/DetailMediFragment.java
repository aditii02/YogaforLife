package com.vsa.yogaforlife;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailMediFragment extends Fragment {
    private String cname;
    String medinames[];
    int images[];


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView recyclerView = (RecyclerView)inflater.inflate(R.layout.fragment_detail,container,false);
        // Get database
        SQLiteOpenHelper sqLiteOpenHelper = new MyDatabase(container.getContext());

        MediList mediList = (MediList) getActivity();
        cname = mediList.getId();
        //Toast.makeText(getContext(), cname, Toast.LENGTH_LONG).show();
        try {

            SQLiteDatabase db = sqLiteOpenHelper.getReadableDatabase();

            String s  = "select NAME,IMAGE_RESOURCE_ID from MEDI where "+cname+ " == 1";
            //Toast.makeText(getContext(),s,Toast.LENGTH_LONG).show();
            // code to read the data from the data base
            Cursor cursor = db.rawQuery(s,null);
            int ns = cursor.getColumnCount();
            int n = cursor.getCount();
            //Toast.makeText(getContext(), String.valueOf(ns), Toast.LENGTH_SHORT).show();
            medinames = new String[n];
            images = new int[n];
            boolean status = cursor.moveToFirst();
            for(int i=0;status;i++){

                medinames[i] = cursor.getString(0);
                images[i] = cursor.getInt(1);
                status = cursor.moveToNext();
            }
            db.close();
        }catch (SQLiteException e){
            Toast toast = Toast.makeText(container.getContext(), "Data unavailable", Toast.LENGTH_SHORT);
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(medinames,images);
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(linearLayoutManager);
//        // Inflate the layout for this fragment

        // implement the interface listener created in Captioned images adapter

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(),DescriptionMedi.class);
                intent.putExtra(DescriptionMedi.MEDI_NAME, medinames[position]);
                getActivity().startActivity(intent);
            }
        });
        return recyclerView;
    }

}
