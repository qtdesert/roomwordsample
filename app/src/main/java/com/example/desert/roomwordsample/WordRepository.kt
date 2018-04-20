package com.example.desert.roomwordsample

import android.arch.lifecycle.LiveData
import android.content.Context
import io.reactivex.Completable

class WordRepository(var wordDao: WordDao?, var allWords: LiveData<List<Word>>?, context: Context) {

    init {
        val wordRoomDatabase: WordRoomDatabase? = WordRoomDatabase.getInstance(context)
        wordDao = wordRoomDatabase?.wordDao()
        allWords = wordDao?.getAllWords()
    }

    fun insert(word: Word) : Completable =
        Completable.fromCallable { wordDao?.insert(word) }
}
