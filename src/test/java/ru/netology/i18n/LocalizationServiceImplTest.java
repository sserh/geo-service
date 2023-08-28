package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void locale_test() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        assertEquals("Добро пожаловать", localizationService.locale(Country.RUSSIA));
        assertEquals("Welcome", localizationService.locale(Country.GERMANY));
        assertEquals("Welcome", localizationService.locale(Country.USA));
        assertEquals("Welcome", localizationService.locale(Country.BRAZIL));
    }
}