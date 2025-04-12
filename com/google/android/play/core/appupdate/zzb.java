/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.appupdate.internal.zzz;
import com.google.android.play.core.appupdate.zza;
import com.google.android.play.core.appupdate.zzab;
import com.google.android.play.core.appupdate.zzi;

public final class zzb {
    private static zza zza;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zza zza(Context object) {
        Class<zzb> clazz = zzb.class;
        synchronized (clazz) {
            try {
                Object object2 = zza;
                if (object2 != null) return zza;
                zzi zzi2 = null;
                object2 = new zzab(null);
                object = zzz.zza(object);
                zzi2 = new zzi((Context)object);
                ((zzab)object2).zzb(zzi2);
                object = ((zzab)object2).zza();
                zza = object;
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

