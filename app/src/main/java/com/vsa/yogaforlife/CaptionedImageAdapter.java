package com.vsa.yogaforlife;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

 class CaptionedImagesAdapter extends
        RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>{

    private String[] captions;
    private int[] imageIds;
    private Listener listener;


    interface Listener {
        void onClick(int position);

    }

    // constructer
    public CaptionedImagesAdapter(String[] captions, int[] ids){
        this.captions = captions;
        this.imageIds = ids;
    }
    // define type of data to display using adapter
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView v){
            super(v);
            cardView = v;
        }

    }

    // construct the view


    @NonNull
    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // creating the cardview
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_cationed_image, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public int getItemCount() {
        int len = 0;
        try {
            len = captions.length;
        }catch (Exception e){
            len = 0;
        }
        return len;
    }

    // set listener
    public void setListener(Listener listener){
        this.listener = listener;
    }
    // populate the view with data

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.info_image);
        //Drawable drawable =
        imageView.setImageDrawable(ContextCompat.getDrawable(cardView.getContext(),imageIds[position]));
        imageView.setContentDescription(captions[position]);
        TextView textView = (TextView)cardView.findViewById(R.id.info_text);
        textView.setText(captions[position]);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null){
                    listener.onClick(position);
                }
            }
        });
    }

}