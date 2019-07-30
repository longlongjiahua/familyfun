package com.famfun.springcloudconfigserver;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTags;
import org.bouncycastle.openpgp.*;
import org.bouncycastle.openpgp.examples.ByteArrayHandler;
import org.bouncycastle.openssl.PEMReader;
import org.bouncycastle.util.io.Streams;

import java.io.*;
import java.security.NoSuchProviderException;
import java.security.Security;

public class GPGCript {
//https://www.futureboy.us/pgp.html

    private static final String FOLDER = "";
    private static final String PASS = "";

    public static void main(String[] args) throws IOException, PGPException, NoSuchProviderException {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());

        File encryptedFile = new File(FOLDER + "symmetric.txt.gpg");
        byte[]  encryptedByteArray = FileUtils.readFileToByteArray(encryptedFile);

        byte[] decryptedByteArray = ByteArrayHandler.decrypt(encryptedByteArray, PASS.toCharArray());
        String decryptedString = new String(decryptedByteArray);

        System.out.println(decryptedString);

        System.out.println();

        byte[] encryptedAgain = ByteArrayHandler.encrypt(decryptedByteArray, PASS.toCharArray(), "foobar.txt", SymmetricKeyAlgorithmTags.AES_256, true);
        String encryptedAgainString = new String(encryptedAgain);
        System.out.println(encryptedAgainString);





        byte[] decryptedAgainByteArray = ByteArrayHandler.decrypt(encryptedAgain, PASS.toCharArray());
        String decrypteAgaindString = new String(decryptedAgainByteArray);
        System.out.println(decrypteAgaindString);

    }

}

