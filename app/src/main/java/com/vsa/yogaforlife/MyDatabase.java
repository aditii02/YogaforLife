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
                "YOGA FOR KIDS (Reverse Warrior Pose)",0,R.drawable.viparita,"rRbLJZ6-VSw");


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

        insertDataYoga(db,"Shavasana",0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,
                "Step 1- Lie flat on the floor, ensuring that there will be no disturbance for the duration of the pose. Make sure you are comfortable, but don’t use any pillows or cushions. It will be best if you lie on a hard surface.\n" +
                        "\n" +
                        "Step 2- Close your eyes.","This pose is usually practiced after an active yoga session. It instills deep healing and completely relaxes your body. You can also practice this pose whenever you are extremely tired and need to get back to work quickly." +
                        " It is refreshing and rejuvenating.","1. This asana is absolutely safe and can be practiced by anyone and everyone. Unless your doctor has advised you not to lie on your back, you can practice this asana.\n" +
                        "\n" +
                        "2. If you are pregnant, it might be a good idea to rest your head and chest on a bolster for comfort.",0,R.drawable.shavasana,"fP4-KNIZEb0");

        insertDataYoga(db,"Halasana",0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,"Step 1- Lie flat on your back, with your arms placed beside your body and your palms facing downwards.\n" +
                        "Step 2- Inhale, and lift your feet off the ground using your abdominal muscles. Your legs should be at a 90-degree angle.Use your hands to support your hips and lift them off the floor.\n" +
                        "Step 3- Bring your feet in an 180-degree angle, such that your toes are placed over and beyond your headMake sure your back is perpendicular to the ground.\n" +
                        "Step 4- Hold the position for a minute while focusing on your breathing. Exhale, and gently bring down your legs. Avoid jerking your legs while releasing the pose.\n.","Just like the other yoga poses, the Halasana is named so because the basic shape of the pose resembles a typical plow used in Tibet and India. ",
                "Avoid practicing this asana if you have the following problems:\n" +
                        "a. Diarrhea\n" +
                        "b. Menstruation\n" +
                        "c. Neck injury",0,R.drawable.halasana,"fP4-KNIZEb0");
        insertDataYoga(db,"Dhanurasana",0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,"Step 1- Lie flat on your stomach, keeping your feet hip-width apart and your arms beside your body.Now, gently fold your knees and hold your ankles.\n" +
                        "Step 2- , and lift your chest and legs off the ground. Pull your legs back.Look straight and keep your face stress-free. A smile should help.\n" +
                        "Step 3- Hold the pose as you concentrate on breathing. Your body should be as taut as a bow.\n" +
                        "Step 4- As you get comfortable in the pose, breathe long and deep.\n" +
                        "Step 5- About 15-20 seconds later, exhale and release the pose","Dhanurasana or the Bow Pose is one of the 12 basic Hatha Yoga poses. It is also one of the three main back stretching exercises. It gives the entire back a good stretch, thus imparting flexibility as well as strength to the back.",
                "1. These are some points of caution you must keep in mind before you do this asana.\n" +
                        "2. Women should avoid this asana during pregnancy.\n",0,R.drawable.dhanu,"fP4-KNIZEb0");

        insertDataYoga(db,"Padmasna",0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,
                "Step 1- Sit on a flat surface on the ground with your spine erect and your legs stretched out.\n" +
                        "Step 2- Gently bend the right knee, and use your hands to place it on your left thigh. Your soles must point upward, and the heels must be close to your abdomen." +
                        "Step 3- Do the same with the other leg.\n" +
                        "Step 4- Now that both your legs are crossed, and your feet are comfortably placed on the opposite thighs, model your hands into a mudra of your choice and place it in position. Typically, the hands are placed on the knees." +
                        "Step 5- Remember that your head must be straight and the spine erect at all times.\n" +
                        "Step 6- Breathe long and deep. Hold the position for a few minutes. Release.\n" +
                        "Step 7- Repeat the pose with the other leg on top.","This asana is a meditative pose, so it is best if you practice this pose in the morning. But having said that, there is no rule that you cannot meditate in the evening.",
                "1. Avoid doing this asana if you have a knee or ankle injury.\n" +
                        "2. This asana must be practiced under the guidance of an experienced teacher, especially if you are a novice to this pose. It might look simple, but it is not.",0,R.drawable.padamasna,"fP4-KNIZEb0");

        insertDataYoga(db,"Adho Mukha Svanasana",0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,"Step 1- Stand on four limbs, such that your body forms a table-like structure.\n" +
                        "Step 2- Exhale and gently lift your hips and straighten your elbows and knees. You need to ensure your body forms an inverted ‘V’.\n" +
                        "Step 3- Your hands should be in line with your shoulders, and your feet in line with your hips. Make sure that your toes point outwards.\n" +
                        "Step 4- Now, press your hands into the ground and lengthen your neck. Your ears should touch your inner arms, and you should turn your gaze to your navel.\n" +
                        "Step 5- Hold for a few seconds, and then, bend your knees and return to the table position.\n","he Adho Mukha Svanasana looks similar to a how a dog looks when it bends forward. This asana has numerous amazing benefits that make it extremely essential for you to practice it every day. ",
                "It is best to consult a professional trainer or medical practitioner before you do this asana. Avoid practicing this asana if you suffer from:\n" +
                        "High blood pressure\n" +
                        "A detached retina\n" +
                        "A dislocated shoulder\n" +
                        "Weak eye capillaries\n" +
                        "Diarrhea.",0,R.drawable.mukha,"fP4-KNIZEb0");
        // yoga for hair

        insertDataYoga(db,"Sirsasana",0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,
                "Step 1- Place a sturdy, soft blanket on the floor to cushion your head. Then, kneel down on the floor, and interlace your fingers after you place your forearms on the floor. Make sure your elbows are shoulder width apart. Gently nudge your upper arms outward, and firmly press your inner wrists on the floor.\n" +
                        "Step 2- Place the crown of your head on the blanket. Set the base of both your palms together, and fit your crown against your clasped hands." +
                        "Step 3- Breathe in, and lift your knees. Then, walk towards your elbows with your heels lifted off the floor. Now, lift through your thighs such that your body forms an inverted ‘V’. Push your shoulder blades against your back. Then, lift them towards your tailbone so that the front part of your torso is lengthened. This will keep the weight of the shoulders from affecting your head and neck.\n" +
                        "Step 4- As you breathe out, lift your feet off the floor. It is important to lift both the feet together, even if your knees bend slightly as you lift up. Place the legs perpendicular to the floor, and firm up your tailbone against the back portion of your pelvis. Push your heels up towards the ceiling. Your body should be aligned in a straight line.\n",
                "This pose entails a complete inversion of the body, with only the support of the forearms. This asana is said to be the king of all asanas.","Avoid this asana at all costs if you suffer from the following issues:\n" +
                        "Back injury\n" +
                        "Headaches\n" +
                        "A heart condition\n" +
                        "High blood pressure\n" +
                        "If you are menstruating\n" +
                        "A neck injury",0,R.drawable.khopadi,"fP4-KNIZEb0");

        insertDataYoga(db,"Vajrasna",0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,
                "Step 1- Kneel down, stretching your lower legs backward and keeping them together. Your big toes should cross each other.\n" +
                        "Step 2- Gently lower your body such that your buttocks are resting on your heels and your thighs on your calf muscles.\n" + "Place your hands on your knees, and set your gaze forward with your head absolutely straight.\n" +
                        "Turn your attention to your breathing. Be fully aware of how you breathe and carefully observe as you inhale and exhale.\n" +"You could close your eyes to concentrate on your breathing and to calm your mind.\n" +
                        "Try to stay in this position for a minimum of 5 to 10 minutes.\n","Vajrasana is a kneeling pose, and it takes its name from the Sanskrit word Vajra (वज्), which means diamond or thunderbolt.","1. It is best to avoid this asana if you have a knee problem or have undergone surgery in your knees recently.\n" +
                        "2. Pregnant women should keep their knees slightly apart when they practice this asana so that they avoid putting pressure on their abdomen.\n" +
                        "3. If you are suffering from any spinal column ailments on the lower vertebrae, it is best to avoid this pose.",0,R.drawable.vajres  ,"fP4-KNIZEb0");

        insertDataYoga(db,"Pawanmuktasana",0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,
                "Step 1- Lie flat on your back on a smooth surface, ensuring that your feet are together, and your arms are placed beside your body.\n" +
                        "Step 2- Take a deep breath. As you exhale, bring your knees towards your chest, and press your thighs on your abdomen. Clasp your hands around your legs as if you are hugging your knees.\n" +
                        "Step 3- Hold the asana while you breathe normally. Every time you exhale, make sure you tighten the grip of the hands on the knee, and increase the pressure on your chest. Every time you inhale, ensure that you loosen the grip.\n" +
                        "Step 4- Exhale and release the pose after you rock and roll from side to side about three to five times. Relax.","The Wind-Relieving Pose is a reclined posture that is suitable for everyone, whether they are beginners or advanced practitioners. This pose helps to release digestive gases from the intestines and stomach with great ease.",
                "1. This asana must be avoided if you have had an abdominal surgery recently. Also, people suffering from hernia or piles must avoid this asana.\n" +
                        "2. This asana must not be practiced by pregnant women. Menstruating women can avoid this asana if they are not comfortable.\n" +
                        "3. If you are suffering from heart problems, hyperacidity, high blood pressure, slip disc, hernia, back and neck problems, or a testicle disorder, you must avoid this asana.",0,R.drawable.pawansss,"fP4-KNIZEb0");

        insertDataYoga(db,"Sarvangasana",0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,
                "Step 1- Start by lying flat on your back, keeping your legs together and your arms by your side.\n" +
                        "Step 2- With one swift movement, lift your legs, buttocks, and back, such that your elbows support your lower body, and you stand high on your shoulders. Use your hands to support your back.\n" +
                        "Step 3- As you settle down in the pose, make sure you move your elbows closer to each other. Straighten your spine and legs. Your body weight should lie on your shoulders and upper arms. Do not support your body on your neck or head.Firm up your legs and point your toes out. Hold the posture for about 30 to 60 seconds. Breathe deeply while you do so. If you feel any strain on your neck, release immediately.\n" +
                        "Step 4- To release, lower your knees, and bring your hands to the floor. Then, lie flat and relax.",
                "This asana is called the “mother” or “queen” of all the asanas. It literally translates into all limb pose. But it is called a shoulder stand, only because the weight of your body rests on the bony part of your shoulders.","Avoid practicing this asana if you have the following conditions.\n" +
                        "a. Diarrhea\n" +
                        "b. Headache\n" +
                        "c. High blood pressure\n" +
                        "d. Menstruation\n" +
                        "e. Neck injury",0,R.drawable.sarvaniii,"fP4-KNIZEb0");
        // yoga for eye

        insertDataYoga(db,"Palming",0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,"To do Palming, sit in a comfortable position. Rub your palms against each other, vigorously until you can feel the heat radiating from them. Place the palms over your closed eyes and feel the warmth spreading.",
                " Palming is warming up your eyes for better circulation. It is a quick and easy way to relax your eyes. It improves blood circulation and keeps tiredness and puffiness at bay.","Do it gently",0,R.drawable.palm,"fP4-KNIZEb0");

        insertDataYoga(db,"Trataka",0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,"Sit down comfortably, either in Padmasana or Vajrasana. Place a candle at about two feet from where you are sitting. Light the candle and gaze at the flame without blinking. You can count numbers in your head to keep track of time and for your mind to not waver. Look as long as you can. The longer you do, the better.\n",
                "Trataka means to gaze at an object continuously for a fixed period. Doing so improves your concentration and vision. This eye exercise lowers high myopic eye powers.","Do it gently",0,R.drawable.tratakk,"fP4-KNIZEb0");

        insertDataYoga(db,"Eye-Rotation- Sideways",0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,"To do sideway rotation, sit down in Padmasana keeping your head and back erect. Stretch your arms forward with your fists clasped and closed and thumbs facing upwards, replicating the Linga mudra. Keep your gaze fixed on the thumbs. Bring the clasped fists closer to your eyes, placing them in between your eyebrows. Move the fists to the right, with your eyeballs following the path. The head should remain straight while doing so. Bring the fists back to in between the eyebrows with your eyes following back." +
                " Repeat the same on the left side. Repeat the entire procedure ten times, closing your eyes for 10 seconds after every repetition."," Side movement of eyeballs is good for people with myopia and hypermetropia.","Do it gently",0,R.drawable.sideways,"fP4-KNIZEb0");

        insertDataYoga(db,"Anuloma – Viloma Pranayama",0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,"Sitting in Padmasana or Sukhasana, stretch out your hands, resting the palms on your knees in yoga mudra.Lift your right hand in Pranayama mudra.Using the thumb, close the right nostril.Take a deep inhalation with the left nostril.Closing the left nostril, allow exhalation through the right nostril.Now, inhale through the right nostril and allow exhalation via left nostril.This completes one round of Anuloma – Viloma Pranayama." +
                "Repeat for 10 to 15 times to start with, increasing to 50 to 75 times, gradually.\n","This is the easiest of the pranayamas and is also known as the alternate nostril breathing exercise.","Do it gently",0,R.drawable.anuu,"fP4-KNIZEb0");

        //yoga for liver

        insertDataYoga(db," Ardha Matsyendrasana",0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,
                "Step 1- This asana is performed by sitting cross-legged and crossing your left foot over the right one.\n" +
                        "Step 2- Your knees should be raised above the surface and pointing upwards.\n" +
                        "Step 3- Move your right hand over your left leg and hold your left foot, press your left leg gently against your abdomen, turning your head to the right side at the same time.","This is a pose that is also known as the King of the Fish Pose. It is known to be highly beneficial for the liver. It helps in putting pressure on the liver," +
                        " which in turn strengthens and stimulates the liver that is damaged by fibrosis, apoptosis, inflammation and stress.","By practicing yoga and being careful about what you eat every day, you can improve your liver’s health and keep diseases away. You also gain a healthy body that is full of strength and vitality.",
                0,R.drawable.ardha,"fP4-KNIZEb0");

        insertDataYoga(db,"Gomukhasana",0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,
                "Step 1- The first step to performing this exercise is to squat on the surface with one leg crossed over the other.\n" +
                        "Step 2- Allow your spine to stretch out.\n" +
                        "Step 3- Place your hands on your back with one over your shoulder and the other over your rib area.\n" +
                        "Step 4- Clasp your hands at the back and hold the pose.","This pose is also known as the Cow Face Pose. It is one of the best asanas for the treatment of cirrhosis. When you suffer from liver cirrhosis, oxygenation and blood flow are prevented by scar tissues.","By practicing yoga and being careful about what you eat every day, you can improve your liver’s health and keep diseases away. You also gain a healthy body that is full of strength and vitality.",0,R.drawable.mukha,"fP4-KNIZEb0");
        insertDataYoga(db,"Naukasana",0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,
                "Step 1- You can perform this asana by lying on your back.\n" +
                        "Step 2- Raise both the upper and lower portions of your body, making your body rest on your buttocks.\n" +
                        "Step 3- Remain in this pose for as long as possible.\n" +
                        "Step 4- Return to the resting position and repeat it.","This is another pose that is known as the Boat Pose, and it is a simple yet effective asana for helping treat liver cancer. By performing this exercise, you help in the stimulation and strengthening of your liver, allowing it to clean all the harmful toxins in your body.",
                "By practicing yoga and being careful about what you eat every day, you can improve your liver’s health and keep diseases away. You also gain a healthy body that is full of strength and vitality.",
                0, R.drawable.naukasa,"fP4-KNIZEb0");

        // yoga for body detox

        insertDataYoga(db,"Trikonasana (Triangle Pose)",0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,
                "Step 1- Stand straight. Separate your feet comfortably wide apart (about 31/2 to 4 feet).\n" +
                        "Step 2- Turn your right foot out 90 degrees and left foot in by 15 degrees.\n" +
                        "Step 3- Now align the center of your right heel with the center of your arch of left foot.\n" +
                        "Step 4- Ensure that your feet are pressing the ground and the weight of your body is equally balanced on both the feet.\n" +
                        "Step 5- Inhale deeply and as you exhale, bend your body to the right, downward from the hips, keeping the waist straight, allowing your left hand to come up in the air while your right hand comes down towards floor. Keep both arms in straight line.\n" +
                        "Step 6- Rest your right hand on your shin, ankle, or the floor outside your right foot, whatever is possible without distorting the sides of the waist. Stretch your left arm toward the ceiling, in line with the tops of your shoulders. Keep your head in a neutral position or turn it to the left, eyes gazing softly at the left palm.\n" +
                        "Step 7- Ascertain that your body is bent sideways and not backward or forward. Pelvis and chest are wide open.\n" +
                        "Step 8- Stretch maximum and be steady. Keep taking in long deep breaths. With each exhalation, relax the body more and more. Just be with the body and the breath.\n" +
                        "Step 9- As you inhale, come up, bring your arms down to your sides, and straighten your feet.\n" +
                        "Step 10- Repeat the same on the other side.","The asana is pronounced as Tree-kone-nah -sah-nah\n" +
                        "Unlike most yoga postures, the Triangle Pose requires keeping the eyes open in order to maintain body balance.","1. Make sure you have done a good warm up exercise of the whole body before you do the asana.\n" +
                        "2. While bending forward do it slowly and gently so as not to lose balance.",0,R.drawable.trikoooo,"fP4-KNIZEb0");

        insertDataYoga(db,"Paschimottanasana",0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,
                "Step 1- Sit up with the legs stretched out straight in front of you, keeping the spine erect and toes flexed toward you.\n" +
                        "Step 2- Breathing in, raise both arms above your head and stretch up.\n" +
                        "Step 3- Breathing out, bend forward from the hip joints, chin moving toward the toes. Keep the spine erect focusing on moving forwards towards the toes, rather than down towards the knees.\n" +
                        "Step 4- Place your hands on your legs, wherever they reach, without forcing. If you can, take hold of your toes and pull on them to help you go forward.Breathing in, lift your head slightly and lengthen your spine.\n" +
                        "Step 5- Breathing out, gently move the navel towards the knees.\n" +
                        "Step 6- Repeat this movement two or three times.\n" +
                        "Step 7- Drop your head down and breathe deeply for 20-60 seconds.\n" +
                        "Step 8- Stretch the arms out in front of you.\n" +
                        "Step 9- Breathing in, with the strength of your arms, come back up to the sitting position.\n" +
                        "Step 10- Breathe out and lower the arms.","Paschim = west; uttana = stretched out; asana = pose","Make sure you have done a good warm up exercise of the whole body before you do the asana.",
                0,R.drawable.paschim,"fP4-KNIZEb0");

        insertDataYoga(db,"Setu Bandhasana",0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,
                "Step 1- To begin, lie on your back.\n" +
                        "Step 2- Fold your knees and keep your feet hip distance apart on the floor, 10-12 inches from your pelvis, with knees and ankles in a straight line.\n" +
                        "Step 3- Keep your arms beside your body, palms facing down.\n" +
                        "Step 4- Inhaling, slowly lift your lower back, middle back and upper back off the floor; gently roll in the shoulders; touch the chest to the chin without bringing the chin down, supporting your weight with your shoulders, arms and feet. Feel your bottom firm up in this pose. Both the thighs are parallel to each other and to the floor.\n" +
                        "Step 5- If you wish, you could interlace the fingers and push the hands on the floor to lift the torso a little more up, or you could support your back with your palms.\n" +
                        "Step 6- Keep breathing easily.\n" +
                        "Step 7- Hold the posture for a minute or two and exhale as you gently release the pose.","Setu – Bridge; Bandha – Bind, Lock; Asana – Pose, Posture\n" +
                        "This asana is pronounced as SAY-tuh-bun-DHAHS-ana."+ "The pose resembles a bridge, hence the name.\n","Avoid doing this pose if you are suffering from neck and back injuries.",
                0,R.drawable.setu,"fP4-KNIZEb0");

        // yoga for energy
        insertDataYoga(db,"Badhakonasana",0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                "Step 1- Sit with your spine erect and legs spread straight out.\n" +
                        "Step 2- Now bend your knees and bring your feet towards the pelvis. The soles of your feet should touch each other.\n" +
                        "Step 3- Grab your feet tightly with your hands. You may place the hands underneath the feet for support.\n" +
                        "Step 4- Make an effort to bring the heels as close to the genitals as possible.\n" +
                        "Step 5- Take a deep breath in. Breathing out, press the thighs and knees downward towards the floor. Make a gentle effort to keep pressing them downward.\n" +
                        "Step 6- Now start flapping both the legs up and down like the wings of a butterfly. Start slow and gradually increase the speed. Keep breathing normally throughout.\n" +
                        "Step 7- Fly higher and higher, as fast as you comfortably can. Slow down and then stop. Take a deep breath in and as you exhale, bend forward, keeping the chin up and spine erect.\n" +
                        "Step 8- Press your elbows on the thighs or on the knees, pushing the knees and thighs closer to the floor.\n" +
                        "Step 9- Feel the stretch in the inner thighs and take long, deep breaths, relaxing the muscles more and more.\n" +
                        "Step 10- Take a deep breath in and bring the torso up.\n" +
                        "Step 11- As you exhale, gently release the posture. Straighten the legs out in front of you and relax.","Badha = Bound or Restrained, Kona = Angle, Asana = Pose or Posture \n" +
                        "\n" +
                        "This pose is pronounced as BAH-dah-cone-AHS-ana\n" +
                        "\n" +
                        "The posture is named Badhakonasana because of the way it is carried out – both the feet tucked close to the groin, clasped tightly with the hands as though tied or bound together in a particular angle.",
                "f you are suffering from groin or knee injury, make sure you keep a blanket under the outer thighs for support. Do not perform this pose without blanket support. Also, sciatica patients should either completely avoid the pose or sit on a cushion to raise the hips.",
                0,R.drawable.baddha,"fP4-KNIZEb0");

        insertDataYoga(db,"Poorvottanasana",0,0,0,0,0,
                0,0,0,0,0,0,0,0,1,0,
                "Step 1- Sit up with the legs stretched out straight in front of you, keeping the feet together and the spine erect. .\n" +
                        "Step 2- Place the palms on the floor around the waist or at shoulder level, fingertips pointing away from you. Do not bend the arms. .\n" +
                        "Step 3- Lean back and support the weight of your body with your hands. .\n" +
                        "Step 4- Breathing in, raise the pelvis up, keeping the whole body straight. .\n" +
                        "Step 5- Keep your knees straight and bring the feet flat to the floor. Place the toes on the ground and the sole will then tend to be on the ground. Let the head fall back towards the floor. .\n" +
                        "Step 6- Hold the pose and continue breathing. .\n" +
                        "Step 7- As you exhale, come back to a sitting position and relax. .\n" +
                        "Step 8- Repeat the posture with your fingers pointing in the opposite direction.","The literal meaning of this asana (posture) is to stretch towards the east. However, this has nothing to do with stretching in the east direction. Poorvottanasana specifically refers to the flow of pranaic subtle energies in the \"eastern\" frontal side.",
                "Since the whole weight of the body is to be supported mainly by the hands and wrists, people with wrist injuries should avoid this asana. Also, those suffering from any neck injury should either completely avoid doing this posture or use the support of a chair while practicing the pose.",
                0,R.drawable.poorviiiii,"fP4-KNIZEb0");

        insertDataYoga(db,"Shishuasana",0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                "Step 1- Sit on your heels. Keeping your hips on the heels, bend forward, and lower your forehead to the floor.\n" +
                        "Step 2- Keep the arms alongside your body with hands on the floor, palms facing up. (If this is not comfortable, you can place one fist on top of another and rest your forehead on them.)\n" +
                        "Step 3- Gently press your chest on the thighs.\n" +
                        "Step 4- Hold.\n" +
                        "Step 5- Slowly come up to sit on the heels, uncurling vertebra by vertebra and relax.\n","Deeply relaxing for the back.\n" +
                        "Relieves constipation.\n" +
                        "Calms down the nervous system.","In case of serious back or knee injuries avoid this pose.\n" +
                        "Pregnant women should avoid doing this pose.\n" +
                        "Avoid this pose if you suffering from are or had recently suffered from diarrhea.",0,R.drawable.shishu,"fP4-KNIZEb0");

        insertDataYoga(db,"Janu Shirasasan",0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
                "Step 1- Sit up with the legs stretched out straight in front of you, keeping the spine erect.\n" +
                        "Step 2- Bend the left knee and place the left foot against the right thigh, keeping the left knee on the floor.\n" +
                        "Step 3- Breathing in, raise both arms above your head and stretch up, and twist a little to the right from the waist.\n" +
                        "Step 4- Breathing out, bend forward from the hip joints keeping the spine straight, directing your chin to the toes.\n" +
                        "Step 5- If you can, hold on to your big toes and, pointing your elbows to the ground, move forward as you pull on your toes.\n" +
                        "Step 6- Hold. Keep breathing.\n" +
                        "Step 7- Breathing in, come up and breathing out, bring the arms down to the sides.\n" +
                        "Step 8- Repeat on the other side.","Stretches lower back\n" +
                        "Massages the abdominal organs and tones the shoulders",
                "Those suffering from any neck injury should completely avoid doing this posture",0,R.drawable.januu,"fP4-KNIZEb0");

        //yoga for ortho

        insertDataYoga(db,"Locust Pose (Salabhasana)",0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,
                "To perform this pose, begin by raising your legs and the upper torso. Hold this pose for 10 seconds and repeat it thrice. The locust pose also helps relieve you of back pain.","The grasshopper or the locust pose is a great exercise for the back and the legs. It also helps strengthen your bones.",
                " Ensure you are properly hydrated.Use your yoga mat.",0,R.drawable.locustttt,"fP4-KNIZEb0");

        insertDataYoga(db,"Ardha Chandrasana",0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,
                " Begin standing in Tadasana (Mountain Pose) in the center of your mat. Step your feet hip width apart, keeping them parallel to the outer edges of your mat. Inhale and extend your arms out parallel to the floor.",
                "This pose helps tone the legs, abdomen, spine and glutes. It also helps cure osteoporotic pain and helps strengthen the bones. You can use a block for any variations to the normal pose.","Ensure you are properly hydrated.Use your yoga mat.",0,R.drawable.ardha,"fP4-KNIZEb0");

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
