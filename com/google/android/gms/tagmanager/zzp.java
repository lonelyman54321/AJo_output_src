/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

public final class zzp {
    public static String zza(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int n3 : byArray) {
            int n4 = n3 & 0xF0;
            if (n4 == 0) {
                String string2 = "0";
                stringBuilder.append(string2);
            }
            String string3 = Integer.toHexString(n3 &= 0xFF);
            stringBuilder.append(string3);
        }
        return stringBuilder.toString().toUpperCase();
    }

    public static byte[] zzb(String object) {
        int n3 = ((String)object).length();
        int n4 = n3 % 2;
        if (n4 == 0) {
            n4 = n3 / 2;
            byte[] byArray = new byte[n4];
            for (int i3 = 0; i3 < n3; i3 += 2) {
                int n7 = ((String)object).charAt(i3);
                int n8 = 16;
                n7 = Character.digit((char)n7, n8);
                int n10 = i3 + 1;
                n8 = Character.digit(((String)object).charAt(n10), n8);
                n10 = -1;
                if (n7 != n10 && n8 != n10) {
                    n10 = i3 / 2;
                    byArray[n10] = n7 = (int)((byte)((n7 << 4) + n8));
                    continue;
                }
                object = new IllegalArgumentException("purported base16 string has illegal char");
                throw object;
            }
            return byArray;
        }
        object = new IllegalArgumentException("purported base16 string has odd number of characters");
        throw object;
    }
}

