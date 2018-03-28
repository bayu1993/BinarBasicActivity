package io.github.bayu1993.binarbasicactivity;

import android.util.Log;

/**
 * Created by dell on 3/26/18.
 */

public class MySerializable {
    MySerializable(){
        /*String text = null;

        if (text.compareTo("ini text") != -1){
            Log.d("binar", "sama ");
        }else {
            Log.d("binar", "tidak sama ");
        }*/
    }
    public void convertException(){
        String text = "12";
        int angka = Integer.parseInt(text);
        Log.d("binar", "convertException: "+angka);
    }
}
