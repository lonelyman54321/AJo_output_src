/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzht;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.common.base.Optional;

public class zzht$zza {
    private static volatile Optional zza;

    private zzht$zza() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Optional zza(Context object) {
        Object object2 = zza;
        if (object2 != null) return object2;
        Class<zzht$zza> clazz = zzht$zza.class;
        synchronized (clazz) {
            Throwable throwable2;
            block6: {
                block5: {
                    boolean bl2;
                    block4: {
                        try {
                            object2 = zza;
                            if (object2 != null) return object2;
                            object2 = new zzht();
                            object2 = Build.TYPE;
                            String string2 = Build.TAGS;
                            bl2 = zzhu.zza((String)object2, string2);
                            if (bl2) break block4;
                            object = Optional.absent();
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    bl2 = zzhg.zza();
                    if (bl2 && !(bl2 = mI3.a(object))) {
                        object = yx_0.a(object);
                    }
                    object = zzht.zza(object);
                }
                zza = object;
                return object;
            }
            throw throwable2;
        }
    }
}

