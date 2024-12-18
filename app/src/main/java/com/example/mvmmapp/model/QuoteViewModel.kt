package com.example.mvmmapp.model
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuoteViewModel:ViewModel (){
    val quoteModel = MutableLiveData<QuoteModel>()
    fun randomQuote(){
        val currentQuote: QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}