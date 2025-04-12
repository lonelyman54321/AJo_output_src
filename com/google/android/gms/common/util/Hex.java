/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.util;

public class Hex {
    private static final char[] zza;
    private static final char[] zzb;

    static {
        char[] cArray;
        char[] cArray2;
        int n3 = 16;
        char[] cArray3 = cArray2 = new char[n3];
        char[] cArray4 = cArray2;
        cArray3[0] = 48;
        cArray4[1] = 49;
        cArray3[2] = 50;
        cArray4[3] = 51;
        cArray3[4] = 52;
        cArray4[5] = 53;
        cArray3[6] = 54;
        cArray4[7] = 55;
        cArray3[8] = 56;
        cArray4[9] = 57;
        cArray3[10] = 65;
        cArray4[11] = 66;
        cArray3[12] = 67;
        cArray4[13] = 68;
        cArray3[14] = 69;
        cArray4[15] = 70;
        zza = cArray2;
        char[] cArray5 = cArray = new char[n3];
        char[] cArray6 = cArray;
        cArray5[0] = 48;
        cArray6[1] = 49;
        cArray5[2] = 50;
        cArray6[3] = 51;
        cArray5[4] = 52;
        cArray6[5] = 53;
        cArray5[6] = 54;
        cArray6[7] = 55;
        cArray5[8] = 56;
        cArray6[9] = 57;
        cArray5[10] = 97;
        cArray6[11] = 98;
        cArray5[12] = 99;
        cArray6[13] = 100;
        cArray5[14] = 101;
        cArray6[15] = 102;
        zzb = cArray;
    }

    public static String bytesToStringLowercase(byte[] object) {
        int n3;
        int n4 = ((byte[])object).length;
        n4 += n4;
        char[] cArray = new char[n4];
        int n7 = 0;
        for (int i3 = 0; i3 < (n3 = ((byte[])object).length); ++i3) {
            n3 = object[i3];
            int n8 = n3 & 0xFF;
            int n10 = n7 + 1;
            char[] cArray2 = zzb;
            n8 >>>= 4;
            cArray[n7] = n8 = cArray2[n8];
            n3 &= 0xF;
            cArray[n10] = n3 = cArray2[n3];
            n7 += 2;
        }
        object = new String;
        object(cArray);
        return object;
    }

    public static String bytesToStringUppercase(byte[] byArray) {
        return Hex.bytesToStringUppercase(byArray, false);
    }

    public static String bytesToStringUppercase(byte[] byArray, boolean bl2) {
        char c2;
        int n3 = byArray.length;
        int n4 = n3 + n3;
        StringBuilder stringBuilder = new StringBuilder(n4);
        for (n4 = 0; !(n4 >= n3 || bl2 && n4 == (c2 = n3 + -1) && (c2 = byArray[n4] & 0xFF) == '\u0000'); ++n4) {
            char[] cArray = zza;
            int n7 = (byArray[n4] & 0xF0) >>> 4;
            n7 = cArray[n7];
            stringBuilder.append((char)n7);
            n7 = byArray[n4] & 0xF;
            c2 = cArray[n7];
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static byte[] stringToBytes(String object) {
        int n3 = ((String)object).length();
        int n4 = n3 % 2;
        if (n4 == 0) {
            n4 = n3 / 2;
            byte[] byArray = new byte[n4];
            int n7 = 0;
            String string2 = null;
            while (n7 < n3) {
                int n8 = n7 / 2;
                int n10 = n7 + 2;
                string2 = ((String)object).substring(n7, n10);
                int n14 = 16;
                byArray[n8] = n7 = (int)((byte)Integer.parseInt(string2, n14));
                n7 = n10;
            }
            return byArray;
        }
        object = new IllegalArgumentException("Hex string has odd number of characters");
        throw object;
    }
}

