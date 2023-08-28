package ru.netology.geo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    void byIp_should_be_Russia() {
        final String rusIP = "172.0.32.16";

        GeoServiceImpl geoService = new GeoServiceImpl();
        assertEquals(Country.RUSSIA, geoService.byIp(rusIP).getCountry());
    }

    @Test
    void byIp_should_be_USA() {
        final String usaIP = "96.0.32.11";

        GeoServiceImpl geoService = new GeoServiceImpl();
        assertEquals(Country.USA, geoService.byIp(usaIP).getCountry());
    }
}