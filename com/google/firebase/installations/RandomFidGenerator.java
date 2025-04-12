/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class RandomFidGenerator {
    private static final byte FID_4BIT_PREFIX = 0;
    private static final int FID_LENGTH = 22;
    private static final byte REMOVE_PREFIX_MASK;

    static {
        int n3 = 2;
        FID_4BIT_PREFIX = Byte.parseByte("01110000", n3);
        REMOVE_PREFIX_MASK = Byte.parseByte("00001111", n3);
    }

    private static String encodeFidBase64UrlSafe(byte[] byArray) {
        byArray = Base64.encode((byte[])byArray, (int)11);
        Charset charset = Charset.defaultCharset();
        String string2 = new String(byArray, charset);
        return string2.substring(0, 22);
    }

    private static byte[] getBytesFromUUID(UUID uUID, byte[] object) {
        object = ByteBuffer.wrap((byte[])object);
        long l2 = uUID.getMostSignificantBits();
        ((ByteBuffer)object).putLong(l2);
        l2 = uUID.getLeastSignificantBits();
        ((ByteBuffer)object).putLong(l2);
        return ((ByteBuffer)object).array();
    }

    public String createRandomFid() {
        Object object;
        Object object2 = UUID.randomUUID();
        byte[] byArray = new byte[17];
        object2 = RandomFidGenerator.getBytesFromUUID((UUID)object2, byArray);
        object2[16] = object = object2[0];
        byte by2 = REMOVE_PREFIX_MASK;
        object = object & by2;
        by2 = FID_4BIT_PREFIX;
        object2[0] = object = (Object)((byte)(object | by2));
        return RandomFidGenerator.encodeFidBase64UrlSafe((byte[])object2);
    }
}

