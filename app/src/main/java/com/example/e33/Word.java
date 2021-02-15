package com.example.e33;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int pk;

    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public void pk(@NonNull int pk) {this.pk = pk;}

    public int getPk(){return this.pk;}

    public Word(@NonNull String word) {this.mWord = word;}

    public String getWord(){return this.mWord;}
}

