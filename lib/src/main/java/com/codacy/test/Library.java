/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.codacy.test;

import javax.annotation.Nonnull;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NullCipher;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    @Nonnull
    public Object testObject(Object o, byte[] plainText) throws IllegalBlockSizeException, BadPaddingException{
        Cipher doNothingCihper = new NullCipher();
        byte[] cipherText = doNothingCihper.doFinal(plainText);

        return o;
    }
}
