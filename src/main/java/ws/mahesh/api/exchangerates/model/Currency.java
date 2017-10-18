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
 * @author Mahesh.
 */
public enum Currency {
    EUR("Euro", "Euro Member Countries", "\u20AC"), AUD("Australian Dollar", "Australia", ""), BGN("Bulgarian Lev", "Bulgaria", ""),
    BRL("Brazilian Real", "Brazil", ""), CAD("Canadian Dollar", "Canada", ""), CHF("Swiss Franc", "Switzerland", ""), CNY("Chinese Yuan Renminbi", "China", ""),
    CZK("Czech Koruna", "Czechia", ""), DKK("Danish Krone", "Denmark", ""), GBP("British Pound", "United Kingdom", ""),
    HKD("Hong Kong Dollar", "Hong Kong", ""), HRK("Croatian Kuna", "Croatia", ""), HUF("Hungarian Forint", "Hungary", ""),
    IDR(" Indonesian Rupiah", " Indonesia", ""), ILS("Israeli Shekel", " Israel", ""), INR("Indian Rupee", "India", "\u20B9"),
    JPY("Japanese Yen", "Japan", "\u00A5"), KRW("South Korean Won", "Korea (South)", ""), MXN("Mexican Peso", "Mexico", ""),
    MYR("Malaysian Ringgit", "Malaysia", ""), NOK("Norwegian Krone", "Norway", ""), NZD("New Zealand Dollar", "New Zealand", ""),
    PHP("Philippine Peso", "Philippines", ""), PLN("Polish Zloty", "Poland", ""), RON("Romanian Leu", "Romania", ""), RUB("Russian Ruble", "Russia", ""),
    SEK("Swedish Krona", "Sweden", ""), SGD("Singapore Dollar", "Singapore", ""), THB("Thai Baht", "Thailand", "\u0E3F"),
    TRY("Turkish Lira", "Turkey", "\u20BA"), USD("US Dollar", "United States", "\u0024"), ZAR("South African Rand", "South Africa", "");


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
