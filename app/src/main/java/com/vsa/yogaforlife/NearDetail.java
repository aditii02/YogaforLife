package com.vsa.yogaforlife;

public class NearDetail {

    private  String name;
    private int imageResourceId;

    // adding the list to be displayed in the list of yoga
    public static final NearDetail[] near = {
            new NearDetail("Morarji Desai National Institute Of Yoga",R.drawable.morar),
            new NearDetail("Sivananda Yoga Vedanta Centre",R.drawable.siva),
            new NearDetail("Iyengar Yoga Center Yogakshema",R.drawable.iye),
            new NearDetail("Bikram Yoga Studio",R.drawable.bik),
            new NearDetail("Isha Yoga Center",R.drawable.isha),
            new NearDetail("Art Of Living Yoga And Meditation Centre",R.drawable.art),
            new NearDetail("Patanjali Arogya Kendra",R.drawable.pata),
            new NearDetail("Bharath Thakur’s Artistic Yoga",R.drawable.bhar)
    };
    private NearDetail(String name, int id){
        this.name = name;
        this.imageResourceId = id;
    }

    public String getName() {
        return this.name;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }
}
