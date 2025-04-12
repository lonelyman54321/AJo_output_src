/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdj;
import com.google.android.gms.internal.auth.zzdn;
import com.google.android.gms.internal.auth.zzhr;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhv;

public final class zzhs
implements zzdj {
    private static final zzhs zza;
    private final zzdj zzb;

    static {
        zzhs zzhs2;
        zza = zzhs2 = new zzhs();
    }

    public zzhs() {
        Object object = new zzhv();
        object = zzdn.zzb(object);
        this.zzb = object = zzdn.zza((zzdj)object);
    }

    public static zzhr zzb() {
        return zza.zzc().zza();
    }

    public static boolean zzd() {
        return zza.zzc().zzb();
    }

    public static boolean zze() {
        return zza.zzc().zzc();
    }

    public final zzht zzc() {
        return (zzht)this.zzb.zza();
    }
}

