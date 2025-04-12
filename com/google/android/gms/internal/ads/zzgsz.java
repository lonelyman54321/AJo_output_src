/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzgsz {
    public static byte[] zza(byte[] object) {
        int n3 = ((byte[])object).length;
        int n4 = 16;
        if (n3 == n4) {
            byte by2;
            int n7;
            byte[] byArray = new byte[n4];
            int n8 = 0;
            while (true) {
                n7 = 15;
                if (n8 >= n4) break;
                int n10 = n8 + 1;
                byte by4 = object[n8];
                byArray[n8] = by4 = (byte)(by4 + by4 & 0xFE);
                if (n8 < n7) {
                    byArray[n8] = n7 = (int)((byte)(object[n10] >> 7 & 1 | by4));
                }
                n8 = n10;
            }
            n4 = byArray[n7];
            byArray[n7] = by2 = (byte)((byte)(object[0] >> 7 & 0x87) ^ n4);
            return byArray;
        }
        object = new IllegalArgumentException;
        object("value must be a block.");
        throw object;
    }
}

