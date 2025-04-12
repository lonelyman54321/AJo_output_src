/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzai;
import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzj;

public abstract class zza {
    private static zza zza;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zza zza(Context object) {
        Class<zza> clazz = zza.class;
        synchronized (clazz) {
            try {
                Object object2 = zza;
                if (object2 != null) return zza;
                object2 = new zzai(null);
                object = object.getApplicationContext();
                object = (Application)object;
                ((zzai)object2).zzb((Application)object);
                object = ((zzai)object2).zza();
                zza = object;
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public abstract zzj zzb();

    public abstract zzbn zzc();
}

