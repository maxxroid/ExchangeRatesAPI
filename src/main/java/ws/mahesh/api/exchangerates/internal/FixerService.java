/*
 * Copyright (c) 2017.
 *
 * Created by Mahesh for CurrencyConverterAPI on 14.10.2017.
 *
 * Last Modified 14/10/17 1:52 PM.
 */
package ws.mahesh.api.exchangerates.internal;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Service for api.fixer.io.
 *
 * @author Mahesh
 */
interface FixerService {

    @GET("latest")
    Call<Exchange> getLatestRates();

    @GET("latest")
    Call<Exchange> getLatestRatesByBase(@Query("base") String base);

    @GET("latest")
    Call<Exchange> getLatestRatesBySymbols(@Query("symbols") String symbols);

    @GET("latest")
    Call<Exchange> getLatestRatesByBase(@Query("base") String base, @Query("symbols") String symbols);

    @GET("{date}")
    Call<Exchange> getHistoricRates(@Path("date") String date);

}
