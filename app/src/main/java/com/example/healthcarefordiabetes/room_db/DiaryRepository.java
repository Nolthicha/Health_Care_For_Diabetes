package com.example.healthcarefordiabetes.room_db;

import android.content.Context;
import android.os.AsyncTask;

import com.example.healthcarefordiabetes.model.Diary;

import java.util.List;

public class DiaryRepository {

    private Context mContext;

    public DiaryRepository(Context mContext) {
        this.mContext = mContext;
    }

    public void getDiary(Callback callback) {
        GetTask getTask = new GetTask(mContext, callback);
        getTask.execute();
    }

    public void insertDiary(Diary diary, InsertCallback callback) {
        InsertTask insertTask = new InsertTask(mContext, callback);
        insertTask.execute(diary);
    }

    private static class GetTask extends AsyncTask<Void, Void, List<Diary>> {

        private Context mContext;
        private Callback mCallback;

        public GetTask(Context context, Callback callback) {
            this.mContext = context;
            this.mCallback = callback;
        }

        @Override
        protected List<Diary> doInBackground(Void... voids) {
            AppDatabase db = AppDatabase.getInstance(mContext);
            List<Diary> itemList = db.diaryDao().getAll();
            return itemList;
        }

        @Override
        protected void onPostExecute(List<Diary> ledgerItemList) {
            super.onPostExecute(ledgerItemList);

            mCallback.onGetLedger(ledgerItemList);
        }
    } // ปิด GetTask

    public interface Callback {
        void onGetLedger(List<Diary> itemList);
    }

    private static class InsertTask extends AsyncTask<Diary, Void, Void> {

        private Context mContext;
        private InsertCallback mCallback;

        public InsertTask(Context context, InsertCallback callback) {
            this.mContext = context;
            this.mCallback = callback;
        }

        @Override
        protected Void doInBackground(Diary... diary) {
            AppDatabase db = AppDatabase.getInstance(mContext);
            db.diaryDao().insert(diary[0]);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            mCallback.onInsertSuccess();
        }
    } // ปิด InsertTask

    public interface InsertCallback {
        void onInsertSuccess();
    }
}
