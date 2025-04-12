/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 */
package com.google.android.gms.internal.icing;

import android.content.ContentResolver;
import android.database.ContentObserver;
import java.util.Map;

public final class zzbe {
    public static final String[] zza;
    private static final Map zzb;
    private final ContentResolver zzc;
    private final ContentObserver zzd;

    static {
        Jp jp = new Jp();
        zzb = jp;
        zza = new String[]{"key", "value"};
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zza() {
        Class<zzbe> clazz = zzbe.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                Object object;
                Object object2;
                try {
                    object2 = zzb;
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
                object2 = (zzbe)object2;
                object2 = ((zzbe)object2).zzc;
                object2 = null;
                throw null;
            }
            throw throwable2;
        }
    }
}

