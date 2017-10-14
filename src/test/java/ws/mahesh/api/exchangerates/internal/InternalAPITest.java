/*
 * Copyright (c) 2017.
 *
 * Created by Mahesh for CurrencyConverterAPI on 14.10.2017.
 *
 * Last Modified 14/10/17 1:52 PM.
 */
package ws.mahesh.api.exchangerates.internal;

import org.junit.Test;
import ws.mahesh.api.exchangerates.model.Currency;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Test cases fpr Internal API.
 *
 * @author Mahesh.
 */
public class InternalAPITest {

    @Test
    public void fetchLatestExchangeRatesInternal() throws IOException {
        Exchange exchange = new InternalAPI().fetchLatestExchangeRatesInternal();
        assertNotNull(exchange);
        assertNotNull(exchange.getRates());
        assertNotNull(exchange.getBase());
        assertNotNull(exchange.getRates().getINR());
    }

    @Test
    public void fetchLatestExchangeRatesByBaseInternal() throws IOException {
        Exchange exchange = new InternalAPI().fetchLatestExchangeRatesInternal(Currency.USD);
        assertNotNull(exchange);
        assertNotNull(exchange.getRates());
        assertNotNull(exchange.getBase());
        assertEquals(Currency.USD.name(), exchange.getBase());
        assertNotNull(exchange.getRates().getINR());
    }

    @Test
    public void fetchExchangeRateBySymbolsInternal() throws IOException {
        Currency[] symbols = {Currency.USD, Currency.INR};
        Exchange exchange = new InternalAPI().fetchLatestExchangeRatesBySymbolsInternal(Arrays.asList(symbols));
        assertNotNull(exchange);
        assertNotNull(exchange.getRates());
        assertNotNull(exchange.getBase());
        assertNotNull(exchange.getRates().getINR());
        assertNotNull(exchange.getRates().getUSD());
    }

    @Test
    public void fetchLatestExchangeRatesByBaseAndSymbolsInternal() throws IOException {
        Currency[] symbols = {Currency.EUR, Currency.INR};
        Exchange exchange = new InternalAPI().fetchLatestExchangeRatesByBaseInternal(Currency.USD, Arrays.asList(symbols));
        assertNotNull(exchange);
        assertNotNull(exchange.getRates());
        assertNotNull(exchange.getBase());
        assertEquals(Currency.USD.name(), exchange.getBase());
        assertNotNull(exchange.getRates().getINR());
        assertNotNull(exchange.getRates().getEUR());
    }
}
