/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.zzv;

class zzw {
    private static final zzw zze;
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    static {
        zzw zzw2;
        zze = zzw2 = new zzw(true, 3, 1, null, null);
    }

    private zzw(boolean bl2, int n3, int n4, String string2, Throwable throwable) {
        this.zza = bl2;
        this.zzd = n3;
        this.zzb = string2;
        this.zzc = throwable;
    }

    public /* synthetic */ zzw(boolean bl2, int n3, int n4, String string2, Throwable throwable, zzv zzv2) {
        this(false, 1, 5, null, null);
    }

    public static zzw zzb() {
        return zze;
    }

    public static zzw zzc(String string2) {
        zzw zzw2 = new zzw(false, 1, 5, string2, null);
        return zzw2;
    }

    public static zzw zzd(String string2, Throwable throwable) {
        zzw zzw2 = new zzw(false, 1, 5, string2, throwable);
        return zzw2;
    }

    public static zzw zzf(int n3) {
        zzw zzw2 = new zzw(true, n3, 1, null, null);
        return zzw2;
    }

    public static zzw zzg(int n3, int n4, String string2, Throwable throwable) {
        zzw zzw2 = new zzw(false, n3, n4, string2, throwable);
        return zzw2;
    }

    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        int n3;
        Object object;
        boolean bl2 = this.zza;
        if (!bl2 && (bl2 = Log.isLoggable((String)(object = "GoogleCertificatesRslt"), (int)(n3 = 3)))) {
            object = this.zzc;
            if (object != null) {
                this.zza();
                return;
            }
            this.zza();
        }
    }
}

