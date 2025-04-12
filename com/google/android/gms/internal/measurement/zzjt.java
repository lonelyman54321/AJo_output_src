/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt$zza;
import com.google.android.gms.internal.measurement.zzkf;
import com.google.android.gms.internal.measurement.zzkg$zzd;
import com.google.android.gms.internal.measurement.zzlm;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzjt {
    static final zzjt zza;
    private static volatile boolean zzb = false;
    private static volatile zzjt zzc;
    private final Map zzd;

    static {
        zzjt zzjt2;
        zza = zzjt2 = new zzjt(true);
    }

    public zzjt() {
        HashMap hashMap;
        this.zzd = hashMap = new HashMap();
    }

    private zzjt(boolean bl2) {
        Map map2;
        this.zzd = map2 = Collections.emptyMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzjt zza() {
        Object object = zzc;
        if (object != null) {
            return object;
        }
        object = zzjt.class;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                try {
                    object2 = zzc;
                    if (object2 != null) {
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object2 = zzjt.class;
                zzc = object2 = zzkf.zza((Class)object2);
                return object2;
            }
            throw throwable2;
        }
    }

    public final zzkg$zzd zza(zzlm zzlm2, int n3) {
        Map map2 = this.zzd;
        zzjt$zza zzjt$zza = new zzjt$zza(zzlm2, n3);
        return (zzkg$zzd)map2.get(zzjt$zza);
    }
}

