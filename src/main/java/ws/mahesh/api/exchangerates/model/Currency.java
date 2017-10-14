/*
 * Copyright (c) 2017.
 *
 * Created by Mahesh for CurrencyConverterAPI on 14.10.2017.
 *
 * Last Modified 14/10/17 1:52 PM.
 */
package ws.mahesh.api.exchangerates.model;

/**
 * Enum for Currencies.
 *
 * @author Mahesh
 */
public enum Currency {
    EUR("Euro", "", ""), AUD("", "", ""), BGN("", "", ""), BRL("", "", ""), CAD("", "", ""), CHF("", "", ""), CNY("", "", ""), CZK("", "", ""), DKK("", "", ""),
    GBP("", "", ""), HKD("", "", ""), HRK("", "", ""), HUF("", "", ""), IDR("", "", ""), ILS("", "", ""), INR("Indian Rupee", "India", ""), JPY("", "", ""),
    KRW("", "", ""), MXN("", "", ""), MYR("", "", ""), NOK("", "", ""), NZD("", "", ""), PHP("", "", ""), PLN("", "", ""), RON("", "", ""), RUB("", "", ""),
    SEK("", "", ""), SGD("", "", ""), THB("", "", ""), TRY("", "", ""), USD("US Dollar", "United States Of America", ""), ZAR("", "", "");


    private String name;
    private String region;
    private String symbol;

    Currency(String name, String region, String symbol) {
        this.name = name;
        this.region = region;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }


    public String getSymbol() {
        return symbol;
    }

}
