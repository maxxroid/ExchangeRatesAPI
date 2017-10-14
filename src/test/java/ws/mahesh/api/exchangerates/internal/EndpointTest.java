/*
 * Copyright (c) 2017.
 *
 * Created by Mahesh for CurrencyConverterAPI on 14.10.2017.
 *
 * Last Modified 14/10/17 1:52 PM.
 */
package ws.mahesh.api.exchangerates.internal;

import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

/**
 * Test Cases for testing endpoint.
 *
 * @author Mahesh.
 */
public class EndpointTest {

    @Test
    public void testBasicEndpoint() throws IOException {
        FixerService service = Services.getFixerService();
        Call<Exchange> call = service.getLatestRates();

        Response<Exchange> response = call.execute();
        assertNotNull(response);
        assertNotNull(response.body());
        assertNotNull(response.body().getRates());
        assertNotNull(response.body().getRates().getAUD());
    }
}