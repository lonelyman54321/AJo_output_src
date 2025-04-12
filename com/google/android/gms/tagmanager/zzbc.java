/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.tagmanager.zzbx;
import com.google.android.gms.tagmanager.zzdx;
import com.google.android.gms.tagmanager.zzes;

public final class zzbc {
    private static zzbc zza;
    private static final Object zzb;
    private final zzdx zzc;
    private final zzbx zzd;

    static {
        Object object;
        zzb = object = new Object();
    }

    private zzbc(Context object) {
        object = zzbx.zzb(object);
        zzes zzes2 = new zzes();
        this.zzd = object;
        this.zzc = zzes2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzbc zzb(Context object) {
        Object object2 = zzb;
        synchronized (object2) {
            try {
                zzbc zzbc2 = zza;
                if (zzbc2 != null) return zza;
                zza = zzbc2 = new zzbc((Context)object);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final boolean zza(String string2) {
        Object object = this.zzc;
        boolean bl2 = object.zza();
        if (!bl2) {
            return false;
        }
        object = this.zzd;
        long l2 = System.currentTimeMillis();
        ((zzbx)object).zzf(string2, l2);
        return true;
    }
}

