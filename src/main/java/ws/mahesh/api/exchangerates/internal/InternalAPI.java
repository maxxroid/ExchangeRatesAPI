/*
 * Copyright (c) 2017.
 *
 * Created by Mahesh for CurrencyConverterAPI on 14.10.2017.
 *
 * Last Modified 14/10/17 1:52 PM.
 */
package ws.mahesh.api.exchangerates.internal;

import retrofit2.Call;
import ws.mahesh.api.exchangerates.model.Currency;
import ws.mahesh.api.exchangerates.model.ExchangeRates;

import java.util.Collection;

/**
 * Internal API for fetching Currency Exchange Rates.
 *
 * @author Mahesh.
 */
public class InternalAPI {

    /**
     * Fetches latest currency exchanges rates for EUR.
     *
     * @return ExchangeRates object containing exchange rate information.
     */
    public ExchangeRates fetchLatestExchangeRates() {
        return Util.convertToCurrencyRates(fetchLatestExchangeRatesInternal());
    }


    /**
     * Fetches latest currency exchange rates for given a base currency.
     *
     * @param baseCurrency
     *         Currency currency.
     *
     * @return ExchangeRates object containing exchange rate information.
     */
    public ExchangeRates fetchLatestExchangeRates(Currency baseCurrency) {
        return Util.convertToCurrencyRates(fetchLatestExchangeRatesInternal(baseCurrency));
    }

    /**
     * Fetches latest currency exchanges rates of given currencies for EUR.
     *
     * @param symbols
     *         Currencies.
     *
     * @return ExchangeRates object containing exchange rate information.
     */
    public ExchangeRates fetchLatestExchangeRatesBySymbols(Collection<Currency> symbols) {
        return Util.convertToCurrencyRates(fetchLatestExchangeRatesBySymbolsInternal(symbols));
    }

    /**
     * Fetches latest currency exchanges rates of given currencies for a given base currency.
     *
     * @param baseCurrency
     *         Base currency.
     * @param symbols
     *         Currencies.
     *
     * @return ExchangeRates object containing exchange rate information.
     */
    public ExchangeRates fetchLatestExchangeRatesByBase(Currency baseCurrency, Collection<Currency> symbols) {
        return Util.convertToCurrencyRates(fetchLatestExchangeRatesByBaseInternal(baseCurrency, symbols));
    }

    Exchange fetchLatestExchangeRatesInternal() {
        return execute(Services.getFixerService().getLatestRates());
    }

    Exchange fetchLatestExchangeRatesInternal(Currency baseCurrency) {
        return execute(Services.getFixerService().getLatestRatesByBase(baseCurrency.name()));
    }

    Exchange fetchLatestExchangeRatesBySymbolsInternal(Collection<Currency> symbols) {
        return execute(Services.getFixerService().getLatestRatesBySymbols(Util.createSymbolsString(symbols)));
    }

    Exchange fetchLatestExchangeRatesByBaseInternal(Currency baseCurrency, Collection<Currency> symbols) {
        return execute(Services.getFixerService().getLatestRatesByBase(baseCurrency.name(), Util.createSymbolsString(symbols)));
    }

    private Exchange execute(Call<Exchange> call) {
        try {
            return call.execute().body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
