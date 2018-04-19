package com.example.desert.roomwordsample

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "word_table")
data class Word(@PrimaryKey(autoGenerate = true) val word: String)
