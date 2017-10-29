/*
 * Copyright (c) 2017.
 *
 * Created by Mahesh for CurrencyRatesAPI on 14.10.2017.
 *
 * Last Modified 14/10/17 2:35 PM.
 */
package ws.mahesh.api.exchangerates.internal;

import ws.mahesh.api.exchangerates.model.Currency;
import ws.mahesh.api.exchangerates.model.ExchangeRates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility Class.
 *
 * @author Mahesh.
 */
class Util {
    private Util() {

    }

    static ExchangeRates convertToCurrencyRates(Exchange exchange) {
        ExchangeRates currencyRates = new ExchangeRates();
        if (exchange == null || exchange.getRates() == null || exchange.getBase() == null) {
            currencyRates.setStatus(ExchangeRates.Status.OK);
            currencyRates.setErrorInformation("Oops. Something went wrong, please try again later.");
            return currencyRates;
        }
        currencyRates.setStatus(ExchangeRates.Status.OK);
        currencyRates.setCurrency(Currency.valueOf(exchange.getBase()));
        currencyRates.setDate(convertToDate(exchange.getDate()));
        currencyRates.setRates(convertToRatesMap(exchange.getRates()));
        return currencyRates;
    }

    private static Map<Currency, Double> convertToRatesMap(Rates rates) {
        Map<Currency, Double> ratesMap = new HashMap<>(Currency.values().length);
        for (Currency currency : Currency.values()) {
            Double conversionRate = extractRateForBase(currency, rates);
            ratesMap.put(currency, conversionRate);
        }
        return ratesMap;
    }

    private static Double extractRateForBase(Currency currency, Rates rates) {
        switch (currency) {
            case EUR:
                return rates.getEUR();
            case AUD:
                return rates.getAUD();
            case BGN:
                return rates.getBGN();
            case BRL:
                return rates.getBRL();
            case CAD:
                return rates.getCAD();
            case CHF:
                return rates.getCHF();
            case CNY:
                return rates.getCNY();
            case CZK:
                return rates.getCZK();
            case DKK:
                return rates.getDKK();
            case GBP:
                return rates.getGBP();
            case HKD:
                return rates.getHKD();
            case HRK:
                return rates.getHRK();
            case HUF:
                return rates.getHUF();
            case IDR:
                return rates.getIDR();
            case ILS:
                return rates.getILS();
            case INR:
                return rates.getINR();
            case JPY:
                return rates.getJPY();
            case KRW:
                return rates.getKRW();
            case MXN:
                return rates.getMXN();
            case MYR:
                return rates.getMYR();
            case NOK:
                return rates.getNOK();
            case NZD:
                return rates.getNZD();
            case PHP:
                return rates.getPHP();
            case PLN:
                return rates.getPLN();
            case RON:
                return rates.getRON();
            case RUB:
                return rates.getRUB();
            case SEK:
                return rates.getSEK();
            case SGD:
                return rates.getSGD();
            case THB:
                return rates.getTHB();
            case TRY:
                return rates.getTRY();
            case USD:
                return rates.getUSD();
            case ZAR:
                return rates.getZAR();
            default:
                return null;
        }
    }

    private static Date convertToDate(String date) {
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        try {
            return df.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    static String createSymbolsString(Collection<Currency> symbolsCollection) {
        String symbols = "";
        if (symbolsCollection == null || symbolsCollection.isEmpty()) {
            return symbols;
        }
        for (Currency currency : symbolsCollection) {
            symbols = symbols + currency.name() + ",";
        }
        symbols = symbols.substring(0, symbols.length() - 1);
        return symbols;
    }
}
