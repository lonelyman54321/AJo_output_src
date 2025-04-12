/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabp;
import com.google.android.gms.internal.gtm.zzaby;
import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzadl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzabq {
    static final zzabq zza;
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzabq zzd;
    private final Map zze;

    static {
        zzabq zzabq2;
        zza = zzabq2 = new zzabq(true);
    }

    public zzabq() {
        HashMap hashMap;
        this.zze = hashMap = new HashMap();
    }

    public zzabq(boolean bl2) {
        Map map2;
        this.zze = map2 = Collections.emptyMap();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzabq zza() {
        Object object = zzd;
        if (object != null) {
            return object;
        }
        object = zzabq.class;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                try {
                    object2 = zzd;
                    if (object2 != null) {
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object2 = zzabq.class;
                {
                    zzd = object2 = zzaby.zzb((Class)object2);
                    return object2;
                }
            }
            throw throwable2;
        }
    }

    public zzace zzb(zzadl zzadl2, int n3) {
        zzabp zzabp2 = new zzabp(zzadl2, n3);
        return (zzace)this.zze.get(zzabp2);
    }
}

