package com.skyessentials.opensource.service.impl;

import com.skyessentials.opensource.service.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.beans.factory.annotation.Autowired;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class CalculationImplTest {

    @InjectMocks
    CalculationImpl calculation;

    @Test
    void add() {
        int sum = calculation.add(2, 3);
        Assertions.assertEquals(5, sum);
    }
}