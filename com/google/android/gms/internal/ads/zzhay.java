/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhax;
import com.google.android.gms.internal.ads.zzhbg;
import com.google.android.gms.internal.ads.zzhbm;
import com.google.android.gms.internal.ads.zzhde;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzhay {
    static final zzhay zza;
    private static volatile boolean zzb = false;
    private static volatile zzhay zzc;
    private final Map zzd;

    static {
        zzhay zzhay2;
        zza = zzhay2 = new zzhay(true);
    }

    public zzhay() {
        HashMap hashMap;
        this.zzd = hashMap = new HashMap();
    }

    public zzhay(boolean bl2) {
        Map map2;
        this.zzd = map2 = Collections.emptyMap();
    }

    public static zzhay zza() {
        return zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzhay zzb() {
        Object object = zzc;
        if (object != null) {
            return object;
        }
        object = zzhay.class;
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
                object2 = zzhay.class;
                zzc = object2 = zzhbg.zzb((Class)object2);
                return object2;
            }
            throw throwable2;
        }
    }

    public final zzhbm zzc(zzhde zzhde2, int n3) {
        zzhax zzhax2 = new zzhax(zzhde2, n3);
        return (zzhbm)this.zzd.get(zzhax2);
    }
}

