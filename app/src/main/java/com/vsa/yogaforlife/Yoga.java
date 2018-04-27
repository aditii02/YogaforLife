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


/**
 * A simple {@link Fragment} subclass.
 */
public class Yoga extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView)inflater.inflate(R.layout.fragment_yoga,container,false);
        String yoganames[] = new String[YogaDetail.yogas.length];
        for (int i=0;i<yoganames.length;i++){
            yoganames[i] = YogaDetail.yogas[i].getName();
        }
        int images[] = new int[YogaDetail.yogas.length];
        for (int i=0;i<images.length;i++){
            images[i] = YogaDetail.yogas[i].getImageResourceId();
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(yoganames,images);
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
                Intent intent = new Intent(getActivity(),YogaList.class);
                intent.putExtra(YogaList.CATEGORY_TYPE, position);
                getActivity().startActivity(intent);
            }
        });
        return recyclerView;
    }

}
