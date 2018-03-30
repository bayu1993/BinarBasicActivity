package io.github.bayu1993.binarbasicactivity.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.github.bayu1993.binarbasicactivity.R;
import io.github.bayu1993.binarbasicactivity.model.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        * instansiasi Button*/
        final Button btnOk = (Button)findViewById(R.id.btn_ok);
        final EditText edtInputnama = (EditText)findViewById(R.id.edt_input_nama);
        final EditText edtInputUmur = (EditText)findViewById(R.id.edt_input_umur);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Ok Button", Toast.LENGTH_SHORT).show();
                //gettext editable bkn string
                String inputNama = edtInputnama.getText().toString();
                String inputUmur = edtInputUmur.getText().toString();
                if (!inputNama.isEmpty() && !inputUmur.isEmpty()){
                    Student student = new Student(inputNama,Integer.valueOf(inputUmur));
                    Log.d("student", "input Nama: "+inputNama);
                    Log.d("student", "input Umur: "+inputUmur);
                    Intent intenPindah = new Intent(MainActivity.this, DetailActivity.class);
                    //intenPindah.putExtra(DetailActivity.IntentKey.RESULT,inputText);
                    intenPindah.putExtra(DetailActivity.IntentKey.DATASTUDENT,student);
                    startActivity(intenPindah);
                    //Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                }
                //Mainactivity.this : dari
                //DetailActivity.class = tujuan
                //biar tidak bisa kembali lagi
                //finish();
            }
        });
    }
}
