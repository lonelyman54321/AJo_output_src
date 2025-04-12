/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgpc;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgpd {
    private static final zzgpd zza;
    private final Map zzb;

    static {
        zzgpd zzgpd2;
        zza = zzgpd2 = new zzgpd();
    }

    public zzgpd() {
        HashMap hashMap;
        this.zzb = hashMap = new HashMap();
    }

    public static zzgpd zza() {
        return zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzgpc object, Class object2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object3;
                try {
                    boolean bl2;
                    object3 = this.zzb;
                    object3 = object3.get(object2);
                    object3 = (zzgpc)object3;
                    if (object3 != null && !(bl2 = object3.equals(object))) {
                        object2 = "Different key creator for parameters class already inserted";
                        object = new GeneralSecurityException((String)object2);
                        throw object;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object3 = this.zzb;
                object3.put(object2, object);
                return;
            }
            throw throwable2;
        }
    }
}

