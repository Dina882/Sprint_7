package org.example.courier;

import org.junit.Test;


public class CourierTest {

    private final CourierGenerator generator = new CourierGenerator();
    private final CourierClient client = new CourierClient();

    @Test
    public void courier() {
        var courier = generator.random();
        boolean created = client.create(courier)
                .assertThat()
                .statusCode(201)
                .extract()
                .path("ok")
                ;
        assert created;

        Credentials creds = Credentials.from(courier);
        int id = client.login(creds)
                .assertThat()
                .statusCode(200)
                .extract()
                .path("id")
                ;
        assert id !=0;
    }
}