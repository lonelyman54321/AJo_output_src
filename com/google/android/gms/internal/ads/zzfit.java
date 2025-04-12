/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

public final class zzfit {
    static Task zza;
    public static AppSetIdClient zzb;
    private static final Object zzc;

    static {
        Object object;
        zzc = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Task zza(Context object) {
        Task task2 = null;
        zzfit.zzb(object, false);
        object = zzc;
        synchronized (object) {
            return zza;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzb(Context object, boolean bl2) {
        Object object2 = zzc;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                boolean bl3;
                block4: {
                    try {
                        AppSetIdClient appSetIdClient = zzb;
                        if (appSetIdClient != null) break block4;
                        object = AppSet.getClient((Context)object);
                        zzb = object;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if ((object = zza) == null || (bl3 = ((Task)object).isComplete()) && !(bl3 = ((Task)(object = zza)).isSuccessful()) || bl2 && (bl3 = ((Task)(object = zza)).isComplete())) {
                    object = zzb;
                    String string2 = "the appSetIdClient shouldn't be null";
                    object = Preconditions.checkNotNull(object, string2);
                    object = (AppSetIdClient)object;
                    zza = object = object.getAppSetIdInfo();
                }
                return;
            }
            throw throwable2;
        }
    }
}

