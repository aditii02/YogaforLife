package com.vsa.yogaforlife;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class Nearyou extends Fragment {


    public Nearyou() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView)inflater.inflate(R.layout.fragment_nearyou,container,false);
        String nearnames[] = new String[NearDetail.near.length];
        for (int i=0;i<nearnames.length;i++){
            nearnames[i] = NearDetail.near[i].getName();
        }
        int images[] = new int[NearDetail.near.length];
        for (int i=0;i<images.length;i++){
            images[i] = NearDetail.near[i].getImageResourceId();
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(nearnames,images);
        recyclerView.setAdapter(adapter);
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
        //recyclerView.setLayoutManager(gridLayoutManager);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
//        // Inflate the layout for this fragment
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(),NearList.class);
                intent.putExtra(NearList.CATEGORY_TYPE, position);
                getActivity().startActivity(intent);
            }
        });
        return recyclerView;
    }

}
