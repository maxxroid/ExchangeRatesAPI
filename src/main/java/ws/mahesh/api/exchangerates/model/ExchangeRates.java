/*
 * Copyright (c) 2017.
 *
 * Created by Mahesh for CurrencyConverterAPI on 14.10.2017.
 *
 * Last Modified 14/10/17 2:00 PM.
 */
package ws.mahesh.api.exchangerates.model;

import java.util.Date;
import java.util.Map;

/**
 * Currency Rates Object containing Exchange Rate information.
 *
 * @author Mahesh.
 */
public class ExchangeRates {

    private Currency currency;
    private Date date;
    private Map<Currency, Double> rates;
    private Status status = Status.NOK;
    private String errorInformation;

    public ExchangeRates(Currency currency, Date date, Map<Currency, Double> rates, Status status, String errorInformation) {
        this.currency = currency;
        this.date = date;
        this.rates = rates;
        this.status = status;
        this.errorInformation = errorInformation;
    }

    public ExchangeRates() {
        // empty
    }

    @Override
    public int hashCode() {
        int result = currency != null ? currency.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (rates != null ? rates.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (errorInformation != null ? errorInformation.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ExchangeRates that = (ExchangeRates) o;

        if (currency != that.currency) {
            return false;
        }
        if (date != null ? !date.equals(that.date) : that.date != null) {
            return false;
        }
        if (rates != null ? !rates.equals(that.rates) : that.rates != null) {
            return false;
        }
        if (status != that.status) {
            return false;
        }
        return errorInformation != null ? errorInformation.equals(that.errorInformation) : that.errorInformation == null;
    }

    @Override
    public String toString() {
        return "ExchangeRates{" +
                "currency=" + currency +
                ", date=" + date +
                ", rates=" + rates +
                ", status=" + status +
                ", errorInformation='" + errorInformation + '\'' +
                '}';
    }

    public Currency getCurrency() {

        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<Currency, Double> getRates() {
        return rates;
    }

    public void setRates(Map<Currency, Double> rates) {
        this.rates = rates;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getErrorInformation() {
        return errorInformation;
    }

    public void setErrorInformation(String errorInformation) {
        this.errorInformation = errorInformation;
    }

    public enum Status {
        OK, NOK
    }
}
