package com.blockchain.morph.homebrew

import com.blockchain.morph.exchange.mvi.Quote
import com.blockchain.morph.quote.ExchangeQuoteRequest
import io.reactivex.Observable

interface QuoteService {

    fun subscribe(quoteRequest: ExchangeQuoteRequest)

    val quotes: Observable<Quote>
}