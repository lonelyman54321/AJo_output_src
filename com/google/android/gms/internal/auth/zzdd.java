/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.google.android.gms.internal.auth.zzcc;
import com.google.android.gms.internal.auth.zzcl;
import java.util.Map;

public final class zzdd
implements zzcl {
    private static final Map zza;
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    static {
        Jp jp = new Jp();
        zza = jp;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzdd zza(Context object, String string2, Runnable object2) {
        boolean bl2 = zzcc.zzb();
        string2 = null;
        if (bl2) {
            throw null;
        }
        object = zzdd.class;
        synchronized (object) {
            Throwable throwable22222;
            block8: {
                object2 = zza;
                object2 = object2.get(null);
                object2 = (zzdd)object2;
                if (object2 != null) {
                    return object2;
                }
                {
                    catch (Throwable throwable22222) {
                        break block8;
                    }
                    object2 = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    }
                    catch (Throwable throwable3) {}
                    {
                        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)object2);
                        throw throwable3;
                    }
                }
            }
            throw throwable22222;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzc() {
        Class<zzdd> clazz = zzdd.class;
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
                object2 = (zzdd)object2;
                object2 = ((zzdd)object2).zzb;
                object2 = null;
                throw null;
            }
            throw throwable2;
        }
    }

    public final Object zzb(String string2) {
        throw null;
    }
}

