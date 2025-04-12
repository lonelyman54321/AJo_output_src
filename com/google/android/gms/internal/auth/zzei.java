/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzeh;

public class zzei {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public /* synthetic */ zzei(zzeh zzeh2) {
    }

    public static int zzb(int n3) {
        int n4 = n3 >>> 1;
        return -(n3 & 1) ^ n4;
    }

    public static long zzc(long l2) {
        long l3 = l2 >>> 1;
        return -(l2 & 1L) ^ l3;
    }
}

