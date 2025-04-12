/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzmb;

final class zzlc {
    static final /* synthetic */ int[] zza;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        zzmb zzmb2;
        int n3 = zzmb.values().length;
        int[] nArray = new int[n3];
        zza = nArray;
        try {
            zzmb2 = zzmb.zzb;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
        int n4 = zzmb2.ordinal();
        int n7 = 1;
        nArray[n4] = n7;
    }
}

