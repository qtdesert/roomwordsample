package com.example.desert.roomwordsample

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "word_table")
data class WordEntity(@PrimaryKey(autoGenerate = true) val word: String)
