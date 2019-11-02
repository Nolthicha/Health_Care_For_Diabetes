package com.example.healthcarefordiabetes.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.healthcarefordiabetes.R;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_DIABETES1 = "diabetes";





    public static final String COL_ID1 = "_id";
    public static final String COL_NAME1 = "name";
    public static final String COL_DESCRIPTION1 = "description";
    public static final String COL_IMAGE1 = "image";

    private static final String SQL_CREATE_DIABETES1 =
            "CREATE TABLE " + TABLE_DIABETES1 + " ("
                    + COL_ID1 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_NAME1 + " TEXT, "
                    + COL_DESCRIPTION1 + " TEXT, "
                    + COL_IMAGE1 + " INTEGER )";






    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_DIABETES1);



        ContentValues cv = new ContentValues();
        cv.put(COL_NAME1, "โรคเบาหวานคืออะไร?");
        cv.put(COL_DESCRIPTION1, "     โรคเบาหวานคืออะไร? โรคเบาหวาน คือภาวะตับอ่อนไม่สามารถสร้างฮอร์โมนอินซูลินให้พอเพียง เพื่อช่วยนำน้ำตาล (ที่ได้จากอาหาร จำพวกแป้ง และของหวาน) ไปใช้ให้เกิดพลังงานแก่ร่างกาย ทำให้ระดับน้ำตาลในเลือดสูงเกินไป \n" +
                "     ถ้าผลของน้ำตาลในเลือดสูงอยู่นานๆ จะเป็นสาเหตุให้อวัยวะต่างๆ ของร่างกายทำงานผิดปกติ และเกิดโรคแทรกซ้อนโดยเฉพาะที่บริเวณ ไต ตา เท้า ประสาทส่วนกลาง หัวใจ และหลอดเลือด");
        cv.put(COL_IMAGE1, R.drawable.d1);
        db.insert(TABLE_DIABETES1, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME1, "สถิติเกี่ยวกับโรคเบาหวาน");
        cv.put(COL_DESCRIPTION1, "     ในแต่ละปี ทั่วโลก มีผู้เสียชีวิตจาก โรคเบาหวาน กว่า 5 ล้านคน คาดการณ์ว่าปี 2583 ผู้ป่วยโรคเบาหวาน จะเพิ่มขึ้น 642 ล้านคน อีก 415 ล้านคน เผชิญกับโรคเบาหวาน และเสี่ยงต่อการเกิดโรคแทรกซ้อน\n" +
                "     ในประเทศไทยกับผู้ป่วยโรคเบาหวาน เสียชีวิต ปีละ 1,000 คน เฉลี่ยเพิ่มขึ้นปีละ 2 แสนคน มีค่าใช้จ่ายในการรักษา สูงถึง 47,596 ล้านบาทต่อปี\n");
        cv.put(COL_IMAGE1, R.drawable.youknow);
        db.insert(TABLE_DIABETES1, null, cv);


        cv.put(COL_NAME1, "ชนิดของโรคเบาหวาน");
        cv.put(COL_DESCRIPTION1, "     เบาหวาน ชนิดที่ 1 มักเกิดจากภูมคุ้มกันทำลายตับอ่อนตัวเอง(เป็นอาการเฉียบพลัน รุนแรง)\n" + "     เบาหวาน ชนิดที่ 2 มักเกิดจากพฤติกรรมการกิน(คนที่มีไขมันที่พุงมาก ยิ่งมีความเสี่ยง)\n" + "     เบาหวาน ชนิดที่ 3 เป็นเบาหวานระหว่างตั้งครรภ์\n" + "     เบาหวาน ชนิดที่ 4 เป็นเบาหวานชนิดที่เกิดจากสาเหตุอื่นๆ เช่น ความผิดปกติของสารพันธุกรรม จากยา , โรคของทางตับอ่อน");
        cv.put(COL_IMAGE1, R.drawable.typediabetes);
        db.insert(TABLE_DIABETES1, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME1, "อาการของโรคเบาหวาน");
        cv.put(COL_DESCRIPTION1, " \n" +
                "     -  ปัสสาวะบ่อยและมาก\n" +
                "     -  คอแห้ง กระหายน้ำ ดื่มน้ำบ่อยและมาก\n" +
                "     -  หิวบ่อย กินจุ แต่น้ำหนักลด\n" +
                "     -  เป็นแผลหรือฝีง่าย แต่หายยาก\n" +
                "     -  ชาตามปลายมือปลายเท้า\n" +
                "     -  ตาพร่ามัว\n" +
                "     -  เวียนศีรษะ\n" +
                "     -  ฉุนเฉียวง่าย");
        cv.put(COL_IMAGE1, R.drawable.symptom);
        db.insert(TABLE_DIABETES1, null, cv);


        cv.put(COL_NAME1, "โรคเบาหวานกับภาวะแทรกซ้อน");
        cv.put(COL_DESCRIPTION1, "     -  เสี่ยงต่อการเกิดโรคหลอดเลือดสมองอัมพาต สมองเสื่อม\n" +
                "     -  เบาหวานขึ้นจอประสาทตา ทำให้เสื่อม เป็นต้อกระจก\n" +
                "     -  โรคหัวใจขาดเลือด หัวใจวาย ตายเฉียบพลัน\n" +
                "     -  โรคไตจากเบาหวาน\n" +
                "     -  การสูญเสียเท้า จากบาดแผลที่เกิดขึ้นซึ่งเป็นผลจากโรคเบาหวาน\n");
        cv.put(COL_IMAGE1, R.drawable.between);
        db.insert(TABLE_DIABETES1, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME1, "การตรวจหาโรคเบาหวาน");
        cv.put(COL_DESCRIPTION1, "     ตรวจแบบ FBS (ต้องอดอาหารเช้า)\n" +
                "        วัดจากน้ำตาลทั่วไป\n" +
                "           -  ผู้ตรวจต้องอดอาหารมาก่อน\n" +
                "              8 ชม.\n" +
                " \n" +
                "     ตรวจแบบ A1C (ไม่ต้องอดอาหาร)\n" +
                "        วัด % ฮีโมโกบิน ที่มีน้ำตาลไปจับ\n" +
                "           -  ผู้ตรวจไม่ต้องอดอาหารและ\n" +
                "              ได้ผลตรวจที่แม่นยำกว่า\n" +
                "           -  เป็นการตรวจวัดระดับน้ำตาล\n" +
                "              เฉลี่ยใน 2-3 เดือนที่ผ่านมา");
        cv.put(COL_IMAGE1, R.drawable.finddiabetes);
        db.insert(TABLE_DIABETES1, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME1, "พุงใหญ่กับเบาหวาน");
        cv.put(COL_DESCRIPTION1, "     -  กินตามใจปากและไม่ออกกำลังกาย\n" +
                "     -  ทำให้อ้วนสะสม ไขมันในช่องท้องมาก\n" +
                "     -  ฮอร์โมนอินซูลินทำงานได้อย่างไม่มีประสิทธิภาพ (ดื้ออินซูลิน)\n" +
                "     -  ไขมันในช่องท้อง ปล่อยสารที่ก่อกวนฮอร์โมนต่างๆ\n" +
                "     -  ไม่สามารถลดระดับน้ำตาลในเลือดได้\n" +
                "     -  เป็นเบาหวาน");
        cv.put(COL_IMAGE1, R.drawable.why);
        db.insert(TABLE_DIABETES1, null, cv);








    }





    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
