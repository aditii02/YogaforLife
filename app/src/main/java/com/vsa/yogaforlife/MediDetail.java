package com.vsa.yogaforlife;

public class MediDetail {
    private  String name;
    private int imageResourceId;

    // adding the list to be displayed in the list of yoga
    public static final MediDetail[] medi = {
            new MediDetail("Buddhist Meditation", R.drawable.budhi),
            new MediDetail("Hindu(Vedic & Yogic)", R.drawable.hindu),
            new MediDetail("Chinese Meditation", R.drawable.chinese),
            new MediDetail("Christian Meditation", R.drawable.christian),
            new MediDetail("Guided Meditation", R.drawable.guided)
            };
    private MediDetail(String name, int id){
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
