/*
 * Copyright (c) 2017.
 *
 * Created by Mahesh for CurrencyConverterAPI on 14.10.2017.
 *
 * Last Modified 14/10/17 1:52 PM.
 */
package ws.mahesh.api.exchangerates;

import ws.mahesh.api.exchangerates.internal.InternalAPI;
import ws.mahesh.api.exchangerates.model.Currency;
import ws.mahesh.api.exchangerates.model.ExchangeRates;

import java.util.Collection;

/**
 * Currency Rate API.
 *
 * @author Mahesh.
 */
public class ExchangeRatesAPI {
    private InternalAPI internalAPI;

    public ExchangeRatesAPI() {
        internalAPI = new InternalAPI();
    }

    /**
     * Fetches latest currency exchanges rates for EUR.
     *
     * @return ExchangeRates object containing exchange rate information.
     */
    public ExchangeRates fetchLatestExchangeRates() {
        return internalAPI.fetchLatestExchangeRates();
    }

    /**
     * Fetches latest currency exchange rates for given a base currency.
     *
     * @param baseCurrency
     *         Base currency.
     *
     * @return ExchangeRates object containing exchange rate information.
     */
    public ExchangeRates fetchLatestExchangeRates(Currency baseCurrency) {
        return internalAPI.fetchLatestExchangeRates(baseCurrency);
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
        return internalAPI.fetchLatestExchangeRatesBySymbols(symbols);
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
        return internalAPI.fetchLatestExchangeRatesByBase(baseCurrency, symbols);
    }
}
