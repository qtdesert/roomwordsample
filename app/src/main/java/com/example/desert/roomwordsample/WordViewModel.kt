package com.example.desert.roomwordsample

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

class WordViewModel(private val wordRepository: WordRepository) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    fun getAllWords() : LiveData<List<Word>>? = wordRepository.getAllWords()

    fun insert(word: Word) {
        compositeDisposable.add(wordRepository.insert(word)
                .subscribe({ insertSuccess() }, { insertError() }))
    }

    private fun insertSuccess() {
        print("Insert success")
    }

    private fun insertError() {
        print("Insert error")
    }

    override fun onCleared() {
        super.onCleared()
        if (compositeDisposable.isDisposed) {
            compositeDisposable.dispose()
        }
    }
}
