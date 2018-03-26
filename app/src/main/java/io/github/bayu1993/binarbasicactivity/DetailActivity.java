package io.github.bayu1993.binarbasicactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final TextView tvInfo = (TextView)findViewById(R.id.txt_input);

        Intent intentDetail = getIntent();
        if (null != intentDetail){
            //String info = intentDetail.getStringExtra(IntentKey.RESULT);
            //tvInfo.setText(info);
            Student tangkapStudent = intentDetail.getParcelableExtra(IntentKey.DATASTUDENT);
            String nama = tangkapStudent.getNama();
            Integer umur = tangkapStudent.getUmur();

            String combine = "Nama : "+nama +"\nUmur : "+String.valueOf(umur);
            tvInfo.setText(combine);
        }
    }

    public final class IntentKey{
        private IntentKey(){

        }

        //public static final String RESULT = "DetailActivity.RESULT";
        public static final String DATASTUDENT = "DetailActivity.DATASTUDENT";

    }
}
