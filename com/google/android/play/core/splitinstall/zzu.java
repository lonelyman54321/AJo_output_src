/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzbr;
import com.google.android.play.core.splitinstall.zzac;
import com.google.android.play.core.splitinstall.zzc;
import com.google.android.play.core.splitinstall.zzp;

public final class zzu {
    private static zzp zza;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzp zza(Context object) {
        Class<zzu> clazz = zzu.class;
        synchronized (clazz) {
            try {
                Object object2 = zza;
                if (object2 != null) return zza;
                zzac zzac2 = null;
                object2 = new zzc(null);
                object = zzbr.zza(object);
                zzac2 = new zzac((Context)object);
                ((zzc)object2).zza(zzac2);
                object = ((zzc)object2).zzb();
                zza = object;
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

