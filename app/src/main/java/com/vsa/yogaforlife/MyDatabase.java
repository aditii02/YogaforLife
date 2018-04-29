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

        // diet db

        db.execSQL("CREATE TABLE DIET("
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
                + "DESCRIPTION TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER);");


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
                0,0,1,0,0,
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

        insertDataYoga(db,"Twisted Utkatasana (Chair pose)", 0 ,1 ,0 ,0,0,0,1,0
                  ,0,0,0,0,0,0,0,
                "Step 1- Stand erect with feet 12 inches apart. Keep your feet parallel to each other.\n" +
                        "\n" +
                        "Step 2- Inhale for 2 seconds and raise your heels and arms at shoulder level, palms facing down simultaneously.\n" +
                        "\n" +
                        "Step 3- Exhale slowly; sit in squat pose, on your toes. If not comfortable standing on your toes, stand normally keeping feet flat on the ground.\n" +
                        "\n" +
                        "Step 4- Keeping your hands in the same position, inhaling, get up slowly and stand on your toes.\n" +
                        "\n" +
                        "Step 5- Exhale, hands down and heels down simultaneously.\n",
                        "Strengthens thigh and pelvic muscles.\n","perform on a yoga mat",0,R.drawable.twistedchairpose,"fP4-KNIZEb0");

        insertDataYoga(db,"Virabhadrasana I",0,0,0,0,0,0,1,0,0,0
                ,0,0,0,0,0,
                "Step 1- Start off by placing both your feet hip-width apart.\n" +
                        "Step 2- Now, pivot on your left foot, and let the right foot face forward. \n" +
                        "Step 3- The arch of the left foot must be in line with the right foot.\n" +
                        "Step 4- Lower the pelvis and assume a lunge.\n" +
                        "Step 5- Lift your arms above your head and look forward. \n" +
                        "Step 6- Hold the pose only for as long as it is comfortable.\n" +
                        "Step 7- Release and repeat with the left foot forward.\n",
                "– This asana lets you explore your upper body. Your chest opens up, and your legs are strengthened. It also restores the health of the spine and prepares it to take the weight of the growing uterus. " +
                        "It also relaxes the mind and helps you focus and balance.",
                " Make sure you practice this asana next to a wall or with a chair beside you for instant support in case you lose balance." +
                        " Also, as your pregnancy progresses, lessen the widening of your feet to reduce the strain on your pelvic floor.",0,R.drawable.virabhadrasana1,"fP4-KNIZEb0");
        insertDataYoga(db,"Virabhadrasana II",0,0,0,0,0,0,1,0,0,0,0,0
                ,0,0,0,
                "Step 1- Widen your legs such that they are hip-width apart. Twist the right heel and point the toes outward. \n" +
                        "Step 2- Use the left heel to ground yourself. The arch of your left heel should be in line with the right foot.\n" +
                        "Step 3-  Lower the hips and radiate all your energy out as you stretch out your arms. \n" +
                        "Step 4- The arms must be in line with the shoulders.\n" +
                        "Step 5- Look forward. \n" +
                        "Step 6- Breathe long and deep and hold the pose only until you are comfortable. \n" +
                        "Step 7- Release, and repeat on the other side.\n",
                "Much like the Warrior I, this asana also allows you to explore your upper body. It helps you open up your chest and widen your upper and lower body. Your legs are strengthened too. The Virabhadrasana II also works on the back and strengthens the spine. This helps it bear the weight of the growing uterus. " +
                        "You learn to focus, balance, and above all, your body learns to calm down.",
                "1. Make sure you practice this asana next to a wall or with a chair beside you for instant support in case you lose balance. " +
                        "Also, as your pregnancy progresses, lessen the widening of your feet to reduce the strain on your pelvic floor.\n" +
                        "2. Turn your gaze to your left hand.\n" +
                        "3. Hold the pose till you are comfortable, and then release. Repeat on the other side.\n",0,R.drawable.virabhadrasana2,"fP4-KNIZEb0");
        insertDataYoga(db,"Bitilasana",0,0,0,0,0,0,1,0,0,0,0,0,
                0,0,0,
                "Step 1- Ideally, this asana is done in combination with the Marjariasana, and together, the asanas are called the Cat-Cow.\n" +
                        "Step 2- To do the Bitilasana, you must first come onto your fours. \n" +
                        "Step 3- Inhale and lift your chin to look up as your back goes into a convex position.\n" +
                        "Step 4- Then, move into the Marjariasana by inhaling and lifting your spine to round it so that it becomes concave. \n" +
                        "Step 5- Then, bring your chin to your chest. Repeat the two asanas alternatively in coordination with your breath. The asanas must be done at least five times each for best results.\n",
                "This asana, at the outset, relieves the back. It stretches the spine, and allows for the circulation of blood and spinal fluids. \n" +
                        "This reduces the pressure that the weight of the abdomen adds to the spine.\n" +
                        "Initially, this asana calms your mind and reduces the effects of morning sickness.\n" +
                        "As you inch towards your final trimester, it helps the baby move in the right direction with its head towards the cervix.\n" +
                        "It also encourages the push that the baby needs to move towards the cervix.\n",
                "– Make sure you do not feel any strain on your back or abdomen when you practice this asana. Stop as soon as you do. You can also use this asana to bond with your unborn child. Imagine wrapping yourself around your child as you do this asana.\n" +
                        "Best To Practice In – Trimesters 1 & 3\n",0,R.drawable.cowpose,"fP4-KNIZEb0");

        insertDataYoga(db," Balasana",0,0,0,0,0,0,1,0,0,0,0,0,0
                ,0,0,
                "Step 1- Come onto your fours.\n" +
                        "Step 2- Bring your feet together, and widen your knees. \n" +
                        "Step 3- Rest the abdomen on your thighs and place your buttocks on your feet. \n" +
                        "Step 4- Allow your forehead to touch the ground. \n" +
                        "Step 5- Stretch out your arms, \n",
                "– This asana is a relaxing pose. It relaxes both the back and the mind. The best part about it is that it does so without putting any pressure on your abdomen. This asana also flexes and massages the internal organs, thereby stimulating them. It also releases trapped stress in the muscles and improves blood circulation. " +
                        "It helps battle dizziness, fatigue, and nausea that the first trimester of pregnancy brings with it.",
                "Perform on a yoga mat",0,R.drawable.cowpose,"fP4-KNIZEb0");

        insertDataYoga(db,"Big Toe Pose",0,0,0,0,0,0,0,0,1,0,0,0,0
                        ,0,0,
                "Step 1- The first step is to stand upright with your feet parallel to each other. The feet should be at least six inches apart. Your legs also need to be straight.\n" +
                        "Step 2- Now contract your thigh muscles, which will lift your knee caps outward.\n" +
                        "Step 3- Keep your legs straight as you now bend forward with an aim of touching your forehead to your knee. Your torso and head should move together.\n" +
                        "Step 4- Once you are in this position, grip your big toes with fingers of each foot. Grip your toes firmly with your fingers.\n" +
                        "Step 5- Then press your toes into your hand. If you are not able to catch your toes with changing your posture, you can also use a band or a strap to hook under your toes and hold that instead.\n" +
                        "Step 6- Now, as you inhale, lift your torso and straighten your elbows.\n" +
                        "Step 7- Do this for as high as you can without stressing any other part like your neck for instance.\n" +
                        "Step 8- Exhale when you release your torso and bend towards your toes again. Do this repeatedly.\n" +
                        "Step 9- Straighten as if going back to the starting position but holding your toes. Do this cycle of inhalation and exhalation a few times, increasing the stretch of the torso every time you stretch.\n" +
                        "Step 10- Come back to the starting position by slowly releasing the band and straightening up.\n",
                "•\tA beginner’s tip for big toe pose includes the all-important strap. This strap or band will make it easier for you to do the pose the first few times. " +
                        "As your body becomes limber it will become easier for you to catch your toes.",
                "1. Like any yoga asana or pose and for any beginner it is important to know the limits of your own body.\n" +
                        "2. If while doing any asana at any point of time, you feel any awkward pain or pull, it makes sense to stop doing it.\n" +
                        "3. Most beginners should start yoga in the presence of a trained instructor.\n" +
                        "4. That way they not only learn the correct way of the pose but can immediately seek relief should there be any pain.\n" +
                        "5. If you have any lower back or neck injuries or pain, this pose is not advisable.\n" +
                        "6. If you have weak ankles, you should not do the advanced versions of the big toe pose.\n",0,R.drawable.bigtoepose,"fP4-KNIZEb0");

        insertDataYoga(db,"paripurna navasana(boat pose)",0,0,0,0,0,0,0,0,1,0,0
                ,0,0,0,0,
                "Step 1- You will need to first get into a table top position with your hands and knees on the floor. Posture wise, it is important for your knees to be directly below the hips and the wrists, elbows and shoulders in line with each other as well as perpendicular to the floor. Your head must be positioned in the center with your focus locked firmly on the floor.\n" +
                        "Step 2- The next phase of the pose is to exhale while rounding your spine towards the ceiling. Ensure that your hands and knees remain in their original position and do not move at all at this time.\n" +
                        "Step 3- You must then release your head towards the floor, but avoid forcing the chin towards the chest.\n" +
                        "Step 4- The next part of the cat pose steps is to inhale while returning your body to the tabletop position that you originally started from and repeat as many times as your want.\n" +
                        "Most scenarios will see the cat pose combined with the cow pose on the inhale phase for a better, gentler flowing movement.\n"
                        ,"It Strengthens the abdomen, hip flexors, and spine\n" +
                        "Stimulates the kidneys, thyroid and prostate glands, and intestines\n" +
                        "Helps relieve stress\n" +
                        "Improves digestion\n",
                "1. Strain on certain muscles in the body is generally as far as it goes when it comes to possibilities of something going wrong and, as a result, means that you avoid straining your body beyond more than its capacity and ability.\n" +
                        "2. In the event that you are already suffering from a head injury, you should ensure that your head is maintained in direct line with your torso.\n",0,R.drawable.boatpose,"fP4-KNIZEb0");

        insertDataYoga(db,"Mariayasana(Cat pose)",0,0,0,0,0,0,0,0,1,0,0
                ,0,0,0,0,
                "Step 1- tYou will need to first get into a table top position with your hands and knees on the floor. Posture wise, it is important for your knees to be directly below the hips and the wrists, elbows and shoulders in line with each other as well as perpendicular to the floor. Your head must be positioned in the center with your focus locked firmly on the floor.\n" +
                        "Step 2- The next phase of the pose is to exhale while rounding your spine towards the ceiling. Ensure that your hands and knees remain in their original position and do not move at all at this time.\n" +
                        "Step 3- You must then release your head towards the floor, but avoid forcing the chin towards the chest.\n" +
                        "Step 4- The next part of the cat pose steps is to inhale while returning your body to the tabletop position that you originally started from and repeat as many times as your want.\n" +
                        "Most scenarios will see the cat pose combined with the cow pose on the inhale phase for a better, gentler flowing movement.\n",
                "Stretches the back torso and neck.\n" +
                        "Provides a gentle massage to the spine and belly organs\n",
                "1. In the event that you are already suffering from a head injury, you should ensure that your head is maintained in direct line with your torso.\n" +
                        "2. It will also help to have a trained yoga professional to guide you with the movements so that you perform the poses in the right manner and not stress out your body.\n" +
                        "3. Begin with preparatory poses in order to flex your muscles and prepare them to perform the difficult yoga postures.\n",0,R.drawable.catpose,"fP4-KNIZEb0");

        insertDataYoga(db,"Baddha kanasana(bound angle pose)",0,0,0,0,0,0,0,0,1,0,
0,0,0,0,0,
                        "Step 1- Bending your knees, join the soles of the feet\n" +
                        "Step 2- tHold your feet or ankles and move your heels to the groin as far as possible\n" +
                        "Step 3- Exhale and let your knees drop to the floor\n" +
                        "Step 4- Keep your arms and shoulders relaxed\n" +
                        "Step 5- Press the sitting bones in the floor and let the crown of the head point to the ceiling to lengthen the spinen Imagine your knees opening like the wings of the butterfly\n" +
                        "Step 6- Remain in this pose for upto 2 minutes before returning to staff pose\n",
                "Stretches groin and inner thighs.Increases the flexibility of hips, ankles, knees and feete Improves circulation. Opens pelvic region. Excellent prenatal exercise and relieves menstrual problems\n","- Knee or hip problems\n",0,
R.drawable.boundangle,"fP4-KNIZEb0");

        insertDataYoga(db,"Bitilasana (Cow Pose)",0,0,0,0,0,0,0,0,1,0
                ,0,0,0,0,0,
                "Step 1- First get into the position of Tabletop position.\n" +
                        "Step 2- Ensure that your knees are kept right under your hips.\n" +
                        "Step 3- Keep your wrists in the same line to your shoulders.\n" +
                        "Step 4- Keep your head in normal position, gazing towards the floor.\n" +
                        "Step 5- Breathe in, and raise your hips up towards the roof at the time that you open your chest.\n" +
                        "Step 6- Now let down your stomach towards the ground.\n" +
                        "Step 7- Raise your head up and gaze in forward direction.\n" +
                        "Step 8- Remain in the position for 15 to 20 seconds.\n" +
                        "Step 9- After that, exhale and come get back into the starting position.\n","This asana helps to stretch the neck and the front part of the torso. \n" + "It is also a stress relieving pose.\n" +
                        "It massages the internal organs and also helps increase blood circulation throughout the body.\n","1. If you have a sensitive neck, do not crunch the back of the neck too much as you look up. " +
                        "It is best to look forward to avoiding the strain. Also, make sure your shoulders are away from your ears.\n" +
                        "2. Consult a doctor before you do this pose in case you have a neck injury. It is best to practice yoga under the supervision of doctor.\n",0,R.drawable.lidneycowpose,"fP4-KNIZEb0");


        insertDataYoga(db,"Tadasana",0,0,0,0,0,0,0,1,0,0,0,0,0
                ,0,0,
                "Step 1- Stand on the ground. Align your feet and heels in such a way that they touch each other\n" +
                        "Rest your palms on any side of the body you think is comfortable for you\n" +
                        "Step 2- Inhale deeply. Lift your hands and position in front of your chest\n" +
                        "Step 3- Join your palms in prayer position. This position, in yoga, is known as ‘Anjali mudra’\n" +
                        "Step 4- Lift your body and bring it on your toes. As you maintain your balance, try to remain steady\n" +
                        "Step 5- Close your eyes. Concentrate and hold on to your pose\n" +
                        "Step 6- Exhale slowly\n" +
                        "Step 7- Return back to the normal state. Release\n",
                "Practice this asana for 15 minutes every day for excellent results\n","1. Women during pregnancy should skip this Asana.\n" +
                        "2. The patient of varicose vein should avoid it.\n" +
                        "3. In case of dizziness, it is better to perform this.\n" +
                        "4. This Asana shouldn’t be held for a longer period who have headache, insomnia and low blood pressure.\n" +
                        "5. Excess extension may cause knee problems.\n",0,R.drawable.tad,"fP4-KNIZEb0");

        insertDataYoga(db,"Utkatasana",0,0,0,0,0,0,0,1,0,0,0,0,
0,0,0,"Step 1- Stand on the floor in a straight position\n" +
                        "Step 2- Move your feet slightly apart\n" +
                        "Step 3- Join your hands in prayer position, stretch them upwards\n" +
                        "Step 4- Bend your knees. Bring your thighs in a parallel line with the floor\n" +
                        "Step 5- Look straight. Close your eyes\n" +
                        "Step 6- Remain steady and relax\n","Utkatasana, Chair Pose, Fierce Pose, Hazardous Pose, Lightning Bolt Pose, Wild Pose in which the knees are hips-width apart, the knees are bent, hips are back, chest is forward, and arms are above head, in line with the ears. ",
                "The pose should be avoided if you are suffering from\n" +
                        "Arthritis\n" +
                        "Headaches\n" +
                        "Knee problems\n" +
                        "Insomnia\n" +
                        "Low blood pressure",0,R.drawable.utkat,"fP4-KNIZEb0");
        insertDataYoga(db,"Bhujangasana",0,0,0,0,0,0,0,1,0,0
                ,0,0,0,0,0,"Step 1- Lie down on the floor on your stomach. Rest your face on your chin\n" +
                        "Step 2- Close your eyes\n" +
                        "Step 3- Keep your hands beside your body, resting your palms on the floor\n" +
                        "Step 4- Exhale deeply\n" +
                        "Step 5- Lift up your chest and your face off the floor\n" +
                        "Step 6- Close your eyes\n" +
                        "Step 7- Remain steady and relax\n" +
                        "Step 8- Release yourself from the pose\n","Bhujangasana or Cobra Pose is a back-bending yoga asana.","The person who is suffering from peptic ulcers, hernia, intestinal tuberculosis, and hypothyroidism shouldn't practice this asana.",
                   0,R.drawable.bhujan,"fP4-KNIZEb0");

        // call functions here to add data //


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

    private  static void insertDataDiet(SQLiteDatabase db, String name, int kids, int adult, int oldage,
                                        int bodydetox,int skin,int liver,int preg,int heart,int kidney,int eye,int hair,int ortho,int stress,
                                        int mind,int energy,String desc,int res){
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
        values.put("DESCRIPTION", desc);
        values.put("IMAGE_RESOURCE_ID", res);
        db.insert("DIET",null,values);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
