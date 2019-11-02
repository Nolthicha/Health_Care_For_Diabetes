package com.example.healthcarefordiabetes.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.healthcarefordiabetes.R;

public class Care_DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "care_db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_DIABETES2 = "care";





    public static final String COL_ID2 = "_id";
    public static final String COL_NAME2 = "name";
    public static final String COL_DESCRIPTION2 = "description";
    public static final String COL_IMAGE2 = "image";

    private static final String SQL_CREATE_DIABETES1 =
            "CREATE TABLE " + TABLE_DIABETES2 + " ("
                    + COL_ID2 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_NAME2 + " TEXT, "
                    + COL_DESCRIPTION2 + " TEXT, "
                    + COL_IMAGE2 + " INTEGER )";






    public Care_DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_DIABETES1);



        ContentValues cv = new ContentValues();

        cv = new ContentValues();
        cv.put(COL_NAME2, "วิธีดูแลตนเองให้ห่างไกลเบาหวาน");
        cv.put(COL_DESCRIPTION2, "     ควบคุมอาหาร ทานผักให้มากขึ้น ลดการกินของหวาน และไขมันอิ่มตัว\n" +
                " \n" +
                "     ออกกำลังกายอย่างสม่ำเสมอรักษาน้ำหนักตัวให้อยู่ในเกณฑ์ปกติ\n" +
                " \n" +
                "     พักผ่อนให้เพียงพอ ทำจิตใจให้แจ่มใส\n" +
                " \n" +
                "     หมั่นตรวจระดับน้ำตาลในเลือดและปัจจัยเสี่ยงอื่นๆ ที่อาจพบร่วมด้วย");
        cv.put(COL_IMAGE2, R.drawable.careyourself);
        db.insert(TABLE_DIABETES2, null, cv);

        cv.put(COL_NAME2, "การปฏิบัติตัวเมื่อเป็นโรคเบาหวาน");
        cv.put(COL_DESCRIPTION2, "     1. พบแพทย์และตรวจเลือดตามนัด\n" +
                "     2. พักผ่อนให้เพียงพอ\n" +
                "     3. กินยาลดน้ำตาลหรือฉีดอินซูลินตามขนาดที่แพทย์สั่ง\n" +
                "     4. ควรเลิกสูบบุหรี่โดยเด็ดขาด\n" +
                "     5. ออกกำลังกายอย่างสม่ำเสมอ\n" +
                "     6. ควรไปพบแพทย์ก่อนนัด เมื่อขาดยาหรือมีอาการไม่สบาย\n" +
                "     7. ควบคุมอาหารการกินอย่างเคร่งครัด\n" +
                "     8. หมั่นดูแลเท้า");
        cv.put(COL_IMAGE2, R.drawable.makeyourself);
        db.insert(TABLE_DIABETES2, null, cv);

        cv.put(COL_NAME2, "อาหารในผู้ป่วยโรคเบาหวาน");
        cv.put(COL_DESCRIPTION2, "# รับประทานได้ไม่จำกัดปริมาณ\n" +
                "     ผักทุกชนิด (ยกเว้นประเภทที่มีแป้งมาก เช่น ฟักทอง ถั่ว)\n" +
                " \n" +
                "# รับประทานได้แต่จำกัดปริมาณ\n" +
                "     อาหารพวก แป้ง ข้าว ก๋วยเตี๋ยว บะหมี่ ผลไม้ที่มีรสหวานปานกลาง\n" +
                " \n" +
                "# ห้ามรับประทาน\n" +
                "     น้ำตาลทุกชนิด รวมทั้งน้ำผึ้งด้วย ขนมหวาน ขนมเชื่อมต่างๆ น้ำหวานต่างๆ");
        cv.put(COL_IMAGE2, R.drawable.foodfood);
        db.insert(TABLE_DIABETES2, null, cv);


        cv.put(COL_NAME2, "โรคเบาหวานต้องกินแบบลด...");
        cv.put(COL_DESCRIPTION2, "# ลดหวาน\n" +
                "     \"ลด\" การกินข้าว แป้ง ข้าวเหนียว ข้าวโพด\n" +
                "     \"ชิม\" ก่อนปรุง ไม่ใส่น้ำตาลเพิ่ม\n" +
                "     \"หลีกเลี่ยง\" เครื่องดื่มรสหวาน น้ำอัดลม\n" +
                "     \"ไม่กิน\" ขนมหวาน\n" +
                " \n" +
                "# ลดมัน\n" +
                "กินน้ำมันที่ใช้ประกอบอาหาร ไม่เกิน 6 ช้อนชา ต่อวัน โดย... \"เน้น\" อาหารต้ม ตุ๋น นึ่ง ย่าง ยำ");
        cv.put(COL_IMAGE2, R.drawable.foodless);
        db.insert(TABLE_DIABETES2, null, cv);

        cv.put(COL_NAME2, "ออกกำลังกายอย่างไรในผู้ป่วยเบาหวาน");
        cv.put(COL_DESCRIPTION2, "# การออกกำลังกาย สำหรับผู้ป่วยเบาหวาน\n" +
                "     การเดิน ขี่จักรยาน\n" +
                "     ออกกำลังกายแบบมีแรงต้าน หรือการฝึกทรงตัว\n" +
                " \n" +
                "# ข้อควรระวัง\n" +
                "     ถ้าเคยมีภาวะน้ำตาลต่ำ หรือใช้ยากลุ่มอินซูลิน ควรมีการตรวจสอบระดับน้ำตาลในเลือดเป็นระยะ รวมถึงเตรียมอาหารว่างติดตัวเพื่อแแก้ไขหากมีภาวะน้ำตาลในเลือดต่ำ");
        cv.put(COL_IMAGE2, R.drawable.exercise);
        db.insert(TABLE_DIABETES2, null, cv);

        cv.put(COL_NAME2, "เบาหวานกับการดูแลเท้า");
        cv.put(COL_DESCRIPTION2, "ทำไม? ผู้ป่วยเบาหวานเกิดแผลที่เท้าง่าย\n" +
                "1. การเสื่อมของประสาทส่วนปลายที่ไปเลี้ยงมือและเท้า\n" +
                "ทำให้เท้าผิดปกติ รับน้ำหนักไม่สม่ำเสมอ จนกดทับเกิดเป็นแผล\n" +
                "2. การไหลเวียนของเลือดที่ไปสู่ขาลดลง ออกซิเจนที่ผิวหนังบาง แผลจึงหายช้า\n" +
                "3. น้ำตาลในเลือดสูง ทำให้ติดเชื้อได้ง่าย\n" +

        "การป้องกันการเกิดแผลที่เท้า\n" +
                "1. สำรวจเท้าทุกวัน เช่น รอยบวมแดง ผื่นคัน\n" +
                "2. ถ้ามีแผลเล็กน้อย ล้างด้วยน้ำสะอาด ระวังอย่าให้แผลถลอก\n" +
                "3. ไม่เดินเท้าเปล่า ใส่รองเท้าที่สวมใส่สบาย\n");
        cv.put(COL_IMAGE2, R.drawable.foot);
        db.insert(TABLE_DIABETES2, null, cv);







    }





    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
