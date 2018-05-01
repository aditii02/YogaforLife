package com.vsa.yogaforlife;

public class YogaDetail {
    private  String name;
    private int imageResourceId;

    // adding the list to be displayed in the list of yoga
    public static final YogaDetail[] yogas = {
            new YogaDetail("Kids", R.drawable.kids),
            new YogaDetail("Adults", R.drawable.adult),
            new YogaDetail("Seniors", R.drawable.old),
            new YogaDetail("Bodydetox", R.drawable.bodydetox),
            new YogaDetail("Skin", R.drawable.skin),
            new YogaDetail("Liver", R.drawable.liver),
            new YogaDetail("Preg..", R.drawable.preg),
            new YogaDetail("Heart", R.drawable.heart),
            new YogaDetail("Kideny", R.drawable.kidney),
            new YogaDetail("Eye", R.drawable.eye),
            new YogaDetail("Hair", R.drawable.hair),
            new YogaDetail("Ortho", R.drawable.ortho),
            new YogaDetail("Stress", R.drawable.stress),
            new YogaDetail("Mind", R.drawable.mind)
            //new YogaDetail("Energy", R.drawable.energy)
    };
    private YogaDetail(String name, int id){
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
