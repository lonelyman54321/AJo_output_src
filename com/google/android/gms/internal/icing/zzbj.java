/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
package com.google.android.gms.internal.icing;

import android.content.SharedPreferences;
import java.util.Map;

public final class zzbj {
    private static final Map zza;
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    static {
        Jp jp = new Jp();
        zza = jp;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zza() {
        Class<zzbj> clazz = zzbj.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                Object object;
                Object object2;
                try {
                    object2 = zza;
                    object = object2.values();
                    object = object.iterator();
                    boolean bl2 = object.hasNext();
                    if (!bl2) {
                        object2.clear();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = object.next();
                object2 = (zzbj)object2;
                object2 = ((zzbj)object2).zzb;
                object2 = null;
                throw null;
            }
            throw throwable2;
        }
    }
}

