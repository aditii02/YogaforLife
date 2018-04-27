package com.vsa.yogaforlife;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Meditation extends Fragment {


    public Meditation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView recyclerView = (RecyclerView)inflater.inflate(R.layout.fragment_meditation,container,false);
        String medinames[] = new String[MediDetail.medi.length];
        for (int i=0;i<medinames.length;i++){
            medinames[i] = MediDetail.medi[i].getName();
        }
        int images[] = new int[MediDetail.medi.length];
        for (int i=0;i<images.length;i++){
            images[i] = MediDetail.medi[i].getImageResourceId();
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(medinames,images);
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(linearLayoutManager);
//        // Inflate the layout for this fragment
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(),MediList.class);
                intent.putExtra(MediList.CATEGORY_TYPE, position);
                getActivity().startActivity(intent);
            }
        });
        return recyclerView;
    }

}
