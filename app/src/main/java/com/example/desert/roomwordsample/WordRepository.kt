package com.example.desert.roomwordsample

import android.arch.lifecycle.LiveData
import android.content.Context
import io.reactivex.Completable

class WordRepository(private var wordDao: WordDao?, private val context: Context) {

    fun getAllWords(): LiveData<List<Word>>? {
        val wordRoomDatabase: WordRoomDatabase? = WordRoomDatabase.getInstance(context)
        wordDao = wordRoomDatabase?.wordDao()
        return wordDao?.getAllWords()
    }

    fun insert(word: Word) : Completable =
        Completable.fromCallable { wordDao?.insert(word) }
}
