package com.vsa.yogaforlife;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabase extends SQLiteOpenHelper {

    private static final String DB_NAME = "yoga";
    private static final int DB_VERSION = 1;

    // constructer
    public MyDatabase(Context context){
        super(context,DB_NAME,null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db)     {
        db.execSQL("CREATE TABLE YOGA("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "KIDS NUMERIC, "
                + "ADULT NUMERIC, "
                + "OLDAGE NUMERIC, "
                + "BODYDETOX NUMERIC, "
                + "SKIN NUMERIC, "
                + "LIVER NUMERIC, "
                + "PREG NUMERIC, "
                + "HEART NUMERIC, "
                + "KIDNEY NUMERIC, "
                + "EYE NUMERIC, "
                + "HAIR NUMERIC, "
                + "ORTHO NUMERIC, "
                + "STRESS NUMERIC, "
                + "MIND NUMERIC, "
                + "ENERGY NUMERIC, "
                + "STEPS TEXT, "
                + "DESCRIPTION TEXT, "
                + "CAUTION TEXT, "
                + "FAV NUMERIC, "
                + "IMAGE_RESOURCE_ID INTEGER,"
                + "CODE TEXT);");

        db.execSQL("CREATE TABLE MEDI("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "BUDD NUMERIC, "
                + "HIND NUMERIC, "
                + "CHIN NUMERIC, "
                + "CHRI NUMERIC, "
                + "GUID NUMERIC, "
                + "DESCRI TEXT,"
                + "STEPS TEXT,"
                + "CAUTION TEXT,"
                + "INTEND TEXT,"
                + "FAV NUMERIC, "
                + "IMAGE_RESOURCE_ID INTEGER,"
                + "CODE TEXT);");

        insertDataMedi(db,"Zen Meditation (Zazen)",1,0,0,0,0,"Zazen means seated Zen, or seated meditation, in Japanese." +
                " It has its roots in the Chinese Zen Buddhism tradition," +
                " tracing back to Indian monk Bodhidharma (6th century CE).",
                "It is generally practiced seated on the floor over a mat and cushion, with crossed legs." +
                        " Traditionally it was done in lotus or half-lotus position, but this is hardly necessary.The most important aspect, as you see in the pictures, is keeping the back completely straight, from the pelvis to the neck." +
                        " Mouth is kept close and eyes are kept lowered, with your gaze resting on the ground about two or three feet in front of you." +
                        "As to the mind aspect of it, it is usually practiced in two ways:\n" +
                        "\n" +
                        "Focusing on breath — focus all your attention on the movement of the breath going in and out through the nose." +
                        " This may be aided by counting the breath in your mind." +
                        " Each time you inhale you count one number, starting with 10, and then moving backward to 9, 8, 7, etc." +
                        " When you arrive in 1, you resume from 10 again. If you get distracted and lose your count, gently bring back the attention to 10 and resume from there.\n" +
                        "Shikantaza (just sitting) — in this form the practitioner does not use any specific object of meditation;" +
                        " rather, practitioners remain as much as possible in the present moment," +
                        " aware of and observing what passes through their minds and around them," +
                        " without dwelling on anything in particular." +
                        " It is a type of Effortless Presence meditation","Zazen is a very sober meditation style." +
                        "There is a lot of emphasis in keeping the right posture, as an aid for concentration.","Anyone",
                1,R.drawable.zen,"5GSMRUl9UPo");
        insertDataMedi(db,"Vipassana Meditation",1,0,0,0,0,"Vipassana is a Pali word thaTypes of meditation - Vipassanat means insight or clear seeing." +
                        " It is a traditional Buddhist practice, dating back to 6th century BC." +
                        " It has its roots in the Chinese Zen Buddhism tradition," +
                        " tracing back to Indian monk Bodhidharma (6th century CE).",
                "Starting with mindfulness of breath in the first stages, to stabilize the mind and achieve access concentration." +
                        " This is more like focused attention meditation. Then the practice moves on to developing clear insight on the bodily" +
                        " sensations and mental phenomena, observing them moment by moment and not clinging to any. Here goes an introduction," +
                        " aimed for beginners.\n" +
                        "Ideally, one is to sit on a cushion on the floor, cross-legged, with your spine erect;" +
                        " alternatively, a chair may be used, but the back should not be supported.\n" +
                        "\n" +
                        "The first aspect is to develop concentration, through samatha practice. This is typically done through breathing awareness.\n" +
                        "\n" +
                        "Focus all your attention, from moment to moment, on the movement of your breath." +
                        " Notice the subtle sensations of the movement of the abdomen rising and falling." +
                        " Alternatively, one can focus on the sensation of the air passing through the nostrils and" +
                        " touching the upper lips skin – though this requires a bit more practice, and is more advanced.\n" +
                        "\n" +
                        "As you focus on the breath, you will notice that other perceptions and sensations continue to appear: " +
                        "sounds, feelings in the body, emotions, etc. Simply notice these phenomena as they emerge in the field of awareness," +
                        " and then return to the sensation of breathing. The attention is kept in the object of concentration (the breathing)," +
                        " while these other thoughts or sensations are there simply as “background noise”.\n" +
                        "\n" +
                        "The object that is the focus of the practice (for instance, the movement of the abdomen) is called the primary object." +
                        " And a secondary object is anything else that arises in your field of perception – " +
                        "either through your five senses (sound, smell, itchiness in the body, etc.) or through the mind (thought, memory, feeling, etc.)." +
                        " If a secondary object hooks your attention and pulls it away, or if it causes desire or aversion to appear," +
                        " you should focus on the secondary object for a moment or two, labeling it with a mental note, like thinking,  memory, hearing, desiring." +
                        " This practice is often called noting.\n" +
                        "\n" +
                        "A mental note identifies an object in general but not in detail. When you are aware of a sound," +
                        " for example, label it hearing instead of motorcycle, voices." +
                        "If an unpleasant sensation arises, note pain or feeling instead of knee pain or my back pain." +
                        " Then return your attention to the primary meditation object." +
                        " When aware of a fragrance, say the mental note smelling for a moment or two. You don not have to identify the scent.\n" +
                        "\n" +
                        "When one has thus gained “access concentration”, the attention is then turned to the object of practice, which is normally thought or bodily sensations. One observes the objects of awareness without attachment, letting thoughts and sensations arise and pass away of their own accord. Mental labeling (explained above) is often use as a way to prevent you from being carried away by thoughts, and keep you in more objectively noticing them.\n" +
                        "\n" +
                        "As a result one develops the clear seeing that the observed phenomena is pervaded by the three marks of existence:" +
                        " impermanence (annica), insatisfactoriness (dukkha) and emptiness of self (annata)" +
                        ". As a result, equanimity, peace and inner freedom is developed in relation to these inputs.",
                "If you are completely new to meditation, Vipassana or Mindfulness are probably good ways for you to start",
                        "Anyone", 0,R.drawable.vipamedi,"JehQATmna7k");


        insertDataYoga(db,"Viparita Virabhadrasana",
                1,0,0,1,0,
                0, 0, 0, 0, 0,
                0, 1,0,0,1,"Step 1- Stand erect and breathe in.\n" +
                        "Step 2- Slide your right leg outwards, but both your legs should be in the same line.\n" +
                        "Step 3- You can slightly bend your right knee while the left knee should be straight and locked.\n" +
                        "Step 4- Keep your right hand upwards.\n" +
                        "Step 5- Bend your right hand towards your left side. Keep in mind that your palm should be towards the ceiling.\n" +
                        "Step 6- Keep your left hand downwards and straight.\n" +
                        "Step 7- Place your left palm on your left knee.\n" +
                        "Step 8- Bend your body a little towards your right side.\n" +
                        "Step 9- Look upwards and keep your breathing normal.\n" +
                        "Step 10- Stay in this position for 30 seconds.\n" +
                        "Step 11- Return to the original position by putting your right hand down, straightening your left leg and standing erect." +
                        " Repeat the same with the other side.\n","Benefits: This posture helps to open the ribs and makes the body more flexible. It also gives a boost to self-confidence.",
                "YOGA FOR KIDS (Reverse Warrior Pose)",0,R.drawable.viparita,"rRbLJZ6");


        insertDataYoga(db,"Navasana",
                1,0,0,1,0,
                0, 0, 0, 0, 0,
                0, 1,1,0,1,"Step 1- Sit down facing your partner.\n" +
                        "Steps 2- Both of you raise your legs slightly upwards. Join your toes with the partner’s toes.\n" +
                        "Step 3- Now, raise your hands and hold each other’s hands.\n" +
                        "Step 4- Use some pressure and push your partner’s soles.\n" +
                        "Step 5- Breathe normally and return to the original state by first putting your feet down slowly and then, releasing your hands.\n" +
                        "Step 6- Finally, sit in a relaxed position.\n","This is really a fun yoga for your kids. Your kids will surely love this one.\n" +
                        "Benefits: It improves the digestion system, strengthens your back bone and helps you to learn teamwork. It is a great stress-buster pose.\n",
                "YOGA FOR KIDS (Partner Boat Pose/Double Boat Pose)",0,R.drawable.nava,"8KsyQvwi85Q");
//

        insertDataYoga(db,"Urdhva Mukha Svanasana",
                1,1,0,1,0,
                0, 0, 0, 0, 0,
                0, 1,1,1,0, "Step 1- Lie on the floor with your face down.\n" +
                        "Step 2- Place your palms on the ground.\n" +
                        "Step 3- Raise your hands up by your shoulders, keeping your elbows locked.\n" +
                        "Step 4- Now, use a little strength and push your body from head to waist, upwards.\n" +
                        "Step 5- Breathe normally.\n" +
                        "Step 6- Keep your legs straightened, and knees should be straight and locked.\n" +
                        "Step 7- Stay in this posture for 25-30 seconds.\n","This is really a fun yoga for your kids. Your kids will surely love this one.\n" +
                        "Benefits: It makes the spinal cord strong. This posture not only opens your chest but stretches it too. It decreases the stress level and helps in asthma.",
                "YOGA FOR KIDS(Upward Facing Dog Pose)",0,R.drawable.urdhva,"cQtfujS");

        insertDataYoga(db,"Dekasana",
                1,0,0,0,0,
                0, 0, 0, 0, 0,
                0, 1,1,1,1, "Step 1- Breathe in and stand straight.\n" +
                        "Step 2- Put your right leg forward. Both your knees should be straight and locked.\n" +
                        "Step 3- Lean your body a little forward.\n" +
                        "Step 4- Raise your arms upwards on either side to maintain your balance. Your body pose should be like a flying aeroplane.\n" +
                        "Step 5- Stay in this posture for a few seconds.\n" +
                        "Step 6- Put your arms down and stand straight.\n","Benefits: This yoga posture helps to increase the concentration level. It teaches kids to maintain balance and helps to strengthen the legs, the chest and hands.",
                "YOGA FOR KIDS (Airplane Pose)",0,R.drawable.dekas,"fP4-KNIZEb0");

        insertDataYoga(db,"Balasana",
                1,0,0,0,0,
                0, 0, 0, 0, 0,
                0, 1,1,1,1, "Step 1- Sit on the floor and keep your spinal cord straight.\n" +
                        "Step 2- Bend your legs and both your knees should be pointed in the opposite direction.\n" +
                        "Step 3- Hold your legs with your hands.\n" +
                        "Step 4- Now, slowly lift your legs upwards.\n" +
                        "Step 5- Stay in this position for a few seconds.\n" +
                        "Step 6- Lower down your legs, gently.\n","Benefits: Flower pose helps to build strength, as well as helps to improve balance.",
                "YOGA FOR KIDS (Flower Pose)",0,R.drawable.balasa,"fP4-KNIZEb0");

        insertDataYoga(db,"Adho Mukha Svanasana",
                1,0,0,0,0,
                0, 0, 0, 0, 0,
                0, 1,1,1,1, "Step 1- Take a deep breath and stand erect.\n" +
                        "Step 2- Now, bend your body from waist to head, downwards.\n" +
                        "Step 3- Place your palms on the floor.\n" +
                        "Step 4- Push your butt upwards. Your elbows shouldn’t be bent.\n" +
                        "Step 5- Pull your soles upwards.\n" +
                        "Step 6- Breathe normally and stay in this pose for a few seconds.\n" +
                        "Step 7- Return to the original posture while exhaling.\n","Benefits: This yoga posture helps to calm your mind and provides energy to your body. It stretches the upper body area, which helps to relieve headaches and back pain.",
                "YOGA FOR KIDS (Downward Facing Dog Pose)",0,R.drawable.adho,"fP4-KNIZEb0");

        insertDataYoga(db,"Star Pose",
                1,0,0,0,0,
                0, 0, 0, 0, 0,
                0, 1,0,0,0,
                "Step 1- Start with the star pose.\n" +
                        "Step 2- Slide your right leg backwards and raise it a little bit upwards from the floor.\n" +
                        "Step 3- Shift your body weight on your left leg.\n" +
                        "Step 4- Lean towards your left leg.\n" +
                        "Step 5- Stay in this position for 5-10 seconds.\n" +
                        "Step 6- Lower your hands down and stand straight.\n","Benefits: Star pose helps to improve your balance and also helps in stretching the chest and shoulders. This pose also helps to build-up the strength.",
                "YOGA FOR KIDS",0,R.drawable.adho,"fP4-KNIZEb0");

        insertDataYoga(db,"Kite Pose",
                1,0,0,0,0,
                0, 0, 0, 0, 0,
                0, 1,0,0,0, "Step 1- Take a deep breath and stand erect.\n" +
                        "Step 2- Slide your legs apart from each other.\n" +
                        "Step 3- Raise your hands upwards on either side. Your elbows should not be bent.\n" +
                        "Step 4- Your body posture should be in a star shape. Breathe normally.\n" +
                        "Step 5- Stay in this posture for a few seconds.\n" +
                        "Step 6- Lower down your hands and stand straight.\n","Benefits: Star pose helps to improve your balance and also helps in stretching the chest and shoulders. This pose also helps to build-up the strength.",
                "YOGA FOR KIDS (Falling Star)",0,R.drawable.kite,"fP4-KNIZEb0");

        insertDataYoga(db,"Ananda Balasana",
                1,0,0,0,0,
                0, 0, 0, 0, 0,
                0, 1,1,1,0,
                "Step 1- Inhale and lay down supine on the floor.\n" +
                        "Step 2- Breathe out and bend your knees towards your belly.\n" +
                        "Step 3- Hold your feet with your palms.\n" +
                        "Step 4- Stay in this position for 5 to 7 seconds.\n" +
                        "Step 5- Gently, lower down your legs.\n","Benefits: Happy baby pose helps to pacify the mind and body, and decreases the level of stress. It also stretches the spinal cord.",
                "YOGA FOR KIDS (Happy Baby Pose)",0,R.drawable.anand,"fP4-KNIZEb0");


        // for Seniors

        insertDataYoga(db,"Mountain Pose",
                0,1,1,0,0,
                0,0,0,0,0,
                0, 1,0,0,0,
                "Step 1- Stand tall with big toes touching and heels together.\n"+
                        "Step 2- Draw your abdominals in and up and relax your shoulders down and back.\n" +
                        "Step 3- Breathe five to eight breaths while actively engaging your leg muscles.\n",
                "Helps with balance and grounding through the feet.",
                "YOGA FOR Seniors",0,R.drawable.mountain,"fP4-KNIZEb0");
//
        insertDataYoga(db,"Tree Pose",
                0,1,1,0,0,
                0,0,0,0,0,
                0, 1,0,1,0,
                "Good for seniors to do for balance and concentration. " +
                        "It’s ok for the leg to be lower on the inner standing leg.\n Start with Baby Tree or use a chair for support.",
                "Excellent for leg and abdominal strength.",
                "YOGA FOR Seniors",0,R.drawable.tree,"fP4-KNIZEb0");

        insertDataYoga(db,"Bird Dog",
                0,1,1,0,0,
                0, 0, 0, 0, 0,
                0, 1,0,1,0,
                "Step 1- Start kneeling, and stretch one arm forward and the opposite leg back.\n"+
                "Step 2- Imagine you have a tea cup on your back and draw your belly button towards your spine.\n"+
                "Step 3- Stay for a breath, then switch sides.\n",
                "Good for abdominals and back support. The health of the spine is extremely important as we age. Bird Dog is great for strengthening the transverse abdominals and the back body. Also keeps brain healthy.",
                "YOGA FOR Seniors",0,R.drawable.bird,"fP4-KNIZEb0");

//
    }

    private void insertDataMedi(SQLiteDatabase db, String s, int budd,
                                int hind, int chin, int chri, int guid,String desc,
                                String steps, String caution, String intended, int fav, int image,String code) {
        ContentValues contentValues = new ContentValues();


        contentValues.put("NAME", s);
        contentValues.put("BUDD", budd);
        contentValues.put("HIND", hind);
        contentValues.put("CHIN", chin);
        contentValues.put("CHRI", chri);
        contentValues.put("GUID", guid);
        contentValues.put("DESCRI", desc);
        contentValues.put("STEPS", steps);
        contentValues.put("CAUTION", caution);
        contentValues.put("INTEND", intended);
        contentValues.put("FAV", fav);
        contentValues.put("IMAGE_RESOURCE_ID", image);
        contentValues.put("CODE", code);
        db.insert("MEDI", null, contentValues);
    }

    // inserting data to database
     private  static void insertDataYoga(SQLiteDatabase db, String name, int kids, int adult, int oldage,
                                     int bodydetox,int skin,int liver,int preg,int heart,int kidney,int eye,int hair,int ortho,int stress,
                                     int mind,int energy, String steps, String desc, String caution,int fav,int res,String code){
         ContentValues values = new ContentValues();
         // putting values
         values.put("NAME", name);
         values.put("KIDS", kids);
         values.put("ADULT", adult);
         values.put("OLDAGE", oldage);
         values.put("BODYDETOX", bodydetox);
         values.put("SKIN", skin);
         values.put("LIVER", liver);
         values.put("PREG", preg);
         values.put("HEART", heart);
         values.put("KIDNEY", kidney);
         values.put("EYE", eye);
         values.put("HAIR", hair);
         values.put("ORTHO", ortho);
         values.put("STRESS", stress);
         values.put("MIND", mind);
         values.put("STEPS", steps);
         values.put("DESCRIPTION", desc);
         values.put("CAUTION", caution);
         values.put("FAV", fav);
         values.put("IMAGE_RESOURCE_ID", res);
         values.put("CODE", code);
         db.insert("YOGA",null,values);
     }

     // insertion of data to the data base 2


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
