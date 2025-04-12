/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

public final class zzd {
    public static int zza(int n3) {
        int n4 = 1;
        int n7 = 2;
        int n8 = 3;
        int[] nArray = new int[]{n4, n7, n8};
        for (int i3 = 0; i3 < n8; ++i3) {
            int n10 = nArray[i3];
            int n14 = n10 + -1;
            if (n10 != 0) {
                if (n14 != n3) continue;
                return n10;
            }
            throw null;
        }
        return n4;
    }
}

