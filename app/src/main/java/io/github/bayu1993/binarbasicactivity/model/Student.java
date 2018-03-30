package io.github.bayu1993.binarbasicactivity.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by dell on 3/23/18.
 */

public class Student implements Parcelable{
    private String nama;
    private Integer umur;

    public Student(String nama, Integer umur) {
        this.nama = nama;
        this.umur = umur;
    }

    protected Student(Parcel in) {
        nama = in.readString();
        if (in.readByte() == 0) {
            umur = null;
        } else {
            umur = in.readInt();
        }
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public Integer getUmur() {
        return umur;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        if (umur == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(umur);
        }
    }
}
