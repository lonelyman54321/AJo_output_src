/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzio$zza;
import com.google.android.gms.internal.vision.zziz;
import com.google.android.gms.internal.vision.zzjb$zze;
import com.google.android.gms.internal.vision.zzkk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzio {
    private static volatile boolean zza = false;
    private static boolean zzb = true;
    private static volatile zzio zzc;
    private static volatile zzio zzd;
    private static final zzio zze;
    private final Map zzf;

    static {
        zzio zzio2;
        zze = zzio2 = new zzio(true);
    }

    public zzio() {
        HashMap hashMap;
        this.zzf = hashMap = new HashMap();
    }

    private zzio(boolean bl2) {
        Map map2;
        this.zzf = map2 = Collections.emptyMap();
    }

    public static zzio zza() {
        zzio zzio2 = new zzio();
        return zzio2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzio zzb() {
        zzio zzio2 = zzc;
        if (zzio2 != null) return zzio2;
        Class<zzio> clazz = zzio.class;
        synchronized (clazz) {
            try {
                zzio2 = zzc;
                if (zzio2 != null) return zzio2;
                zzc = zzio2 = zze;
                return zzio2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzio zzc() {
        Object object = zzd;
        if (object != null) {
            return object;
        }
        object = zzio.class;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                try {
                    object2 = zzd;
                    if (object2 != null) {
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object2 = zzio.class;
                zzd = object2 = zziz.zza((Class)object2);
                return object2;
            }
            throw throwable2;
        }
    }

    public final zzjb$zze zza(zzkk zzkk2, int n3) {
        Map map2 = this.zzf;
        zzio$zza zzio$zza = new zzio$zza(zzkk2, n3);
        return (zzjb$zze)map2.get(zzio$zza);
    }

    public final void zza(zzjb$zze zzjb$zze) {
        Map map2 = this.zzf;
        zzkk zzkk2 = zzjb$zze.zza;
        int n3 = zzjb$zze.zzd.zzb;
        zzio$zza zzio$zza = new zzio$zza(zzkk2, n3);
        map2.put(zzio$zza, zzjb$zze);
    }
}

