/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

final class zzx {
    public static int zza(int n3) {
        int[] nArray;
        int n4 = 6;
        int n7 = 1;
        int[] nArray2 = nArray = new int[n4];
        int[] nArray3 = nArray;
        nArray2[0] = 1;
        nArray3[1] = 2;
        nArray2[2] = 3;
        nArray3[3] = 4;
        nArray2[4] = 5;
        nArray3[5] = 6;
        for (int i3 = 0; i3 < n4; i3 += n7) {
            int n8 = nArray[i3];
            int n10 = n8 + -1;
            if (n8 != 0) {
                if (n10 != n3) continue;
                return n8;
            }
            throw null;
        }
        return n7;
    }
}

