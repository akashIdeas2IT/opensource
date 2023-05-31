package com.skyessentials.opensource.service.impl;

import com.skyessentials.opensource.service.Calculation;
import org.springframework.stereotype.Service;

@Service
public class CalculationImpl implements Calculation {
    @Override
    public int add(int valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }
}
