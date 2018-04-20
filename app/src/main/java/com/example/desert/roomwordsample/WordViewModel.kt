package com.example.desert.roomwordsample

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel

class WordViewModel(private val wordRepository: WordRepository) : ViewModel() {

    fun getAllWords() : LiveData<List<Word>>? = wordRepository.getAllWords()

    fun insert(word: Word) = wordRepository.insert(word)
}
