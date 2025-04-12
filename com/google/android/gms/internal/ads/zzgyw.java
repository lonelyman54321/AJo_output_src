/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzgyw {
    public static byte[] zza(String object) {
        int n3 = ((String)object).length() % 2;
        if (n3 == 0) {
            n3 = ((String)object).length() / 2;
            byte[] byArray = new byte[n3];
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4 = i3 + i3;
                int n7 = ((String)object).charAt(n4);
                int n8 = 16;
                n7 = Character.digit((char)n7, n8);
                ++n4;
                n4 = Character.digit(((String)object).charAt(n4), n8);
                n8 = -1;
                if (n7 != n8 && n4 != n8) {
                    n7 = n7 * 16 + n4;
                    byArray[i3] = n4 = (int)((byte)n7);
                    continue;
                }
                object = new IllegalArgumentException("input is not hexadecimal");
                throw object;
            }
            return byArray;
        }
        object = new IllegalArgumentException("Expected a string of even length");
        throw object;
    }
}

