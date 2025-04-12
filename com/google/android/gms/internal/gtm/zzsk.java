/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzach;
import com.google.android.gms.internal.gtm.zzaci;
import com.google.android.gms.internal.gtm.zzsj;

public final class zzsk
extends Enum
implements zzach {
    public static final /* enum */ zzsk zza;
    public static final /* enum */ zzsk zzb;
    public static final /* enum */ zzsk zzc;
    private static final zzaci zzd;
    private static final /* synthetic */ zzsk[] zze;
    private final int zzf;

    static {
        zzsk zzsk2;
        zzsk zzsk3;
        Object object = new zzsk("INT52", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzsk3 = new zzsk("NUMBER", n3, n3);
        int n4 = 2;
        zzc = zzsk2 = new zzsk("STRING", n4, n4);
        zzsk[] zzskArray = new zzsk[3];
        zzskArray[0] = object;
        zzskArray[n3] = zzsk3;
        zzskArray[n4] = zzsk2;
        zze = zzskArray;
        zzd = object = new zzsj();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzsk() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzf = var3_2;
    }

    public static zzsk[] values() {
        return (zzsk[])zze.clone();
    }

    public static zzaci zzb() {
        return zzd;
    }

    public final String toString() {
        return Integer.toString(this.zzf);
    }

    public final int zza() {
        return this.zzf;
    }
}

