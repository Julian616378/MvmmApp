package com.example.mvmmapp.model

class QuoteProvider {
    companion object {

        fun random():QuoteModel{
            val position: Int=(0..6).random()
            return quote[position]
        }

       private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "ver para creer",
                author = "julian verú"
            ),
           QuoteModel(
               quote = "\"Software Developer\" — An organism that turns caffeine into software",
               author = "Anonymous"
           ),
           QuoteModel(
               quote = "\"If debugging is the process of removing software bugs, then programming must be the process of putting them in.\"",
               author = "Edsger Dijkstra"
           ),
           QuoteModel(
               quote = "\"A user interface is like a joke. If you have to explain it, it’s not that good.\"",
               author = "Anonymous"
           ),
           QuoteModel(
               quote = "\"I don’t care if it works on your machine! We are not shipping your machine!\"",
               author = "Widiu Platon"
           ),
           QuoteModel(
               quote = "\"Measuring programming progress by lines of code is like measuring aircraft building progress by weight.\"",
               author = "Bill Gates"
           ),
           QuoteModel(
               quote = "\"My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why.\"",
               author = "Anonymous"
           )
        )
    }
}