package com.sapeint.publicis.services.impl;

import com.sapeint.publicis.services.interfaces.IValidateLocationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidateLocationService implements IValidateLocationService {

    @Value("${location.x}")
    List<String> validX;

    @Value("${location.y}")
    List<String> validY;

    @Override
    public boolean isLocationValid(int x, int y) {
        boolean isValid = false;
        if(validX.contains(String.valueOf(x)) && validY.contains(String.valueOf(y))) {
            isValid = true;
        }
        return isValid;
    }
}
