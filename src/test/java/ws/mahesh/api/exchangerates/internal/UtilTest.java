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

import java.util.Arrays;

/**
 * Test cases for Util class.
 *
 * @author Mahesh.
 */
public class UtilTest {

    @Test
    public void testCreateSymbols() {
        Currency[] bases = {Currency.AUD, Currency.USD, Currency.INR};
        String symbols = Util.createSymbolsString(Arrays.asList(bases));
        assert symbols.equals("AUD,USD,INR");
    }
}
