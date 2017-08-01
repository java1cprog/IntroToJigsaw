package de.codecentric.addresschecker.internal;

import de.codecentric.addresschecker.api.AddressChecker;
import de.codecentric.zipvalidator.api.ZipCodeValidator;
import java.lang.reflect.InvocationTargetException;


/**
 * Created by ftr on 06/11/15.
 */
public class AddressCheckerImpl implements AddressChecker {
    @Override
    public boolean checkZipCode(String zipCode) {
        ClassLoader classLoader = AddressCheckerImpl.class.getClassLoader();
        try {
            Class aClass = classLoader.loadClass("de.codecentric.zipvalidator.internal.ZipCodeValidatorImpl");
            return ((ZipCodeValidator)aClass.getDeclaredConstructor().newInstance()).zipCodeIsValid(zipCode);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new  RuntimeException(e);
        }




    }
}
