/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.codacy.test;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    
    public void getAccessKey() {
        byte[] iv = "secret key in here".getBytes();
        byte[] iv2 = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, };
        byte[] iv3 = "secret iv in here".getBytes();

    }
}
