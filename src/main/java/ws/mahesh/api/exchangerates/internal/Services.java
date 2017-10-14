/*
 * Copyright (c) 2017.
 *
 * Created by Mahesh for CurrencyConverterAPI on 14.10.2017.
 *
 * Last Modified 14/10/17 1:52 PM.
 */
package ws.mahesh.api.exchangerates.internal;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Factory class for Available Services.
 *
 * @author Mahesh.
 */
class Services {
    private static final String ROOT_URL = "http://api.fixer.io";

    static FixerService getFixerService() {
        return getRetrofitInstance().create(FixerService.class);
    }

    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
