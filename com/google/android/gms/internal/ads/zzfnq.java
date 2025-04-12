/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfnp;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzfnq
extends zzhbo
implements zzhdf {
    private static final zzfnq zza;
    private static volatile zzhdm zzb;
    private String zzc = "";

    static {
        zzfnq zzfnq2;
        zza = zzfnq2 = new zzfnq();
        zzhbo.zzca(zzfnq.class, zzfnq2);
    }

    private zzfnq() {
    }

    public static /* synthetic */ zzfnq zza() {
        return zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = zzhbn.zza;
        int n3 = object.ordinal();
        object2 = null;
        switch (n3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 6: {
                object = zzb;
                if (object != null) return object;
                clazz = zzfnq.class;
                synchronized (clazz) {
                    try {
                        object = zzb;
                        if (object != null) return object;
                        object2 = zza;
                        zzb = object = new zzhbj((zzhbo)object2);
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zza;
            }
            case 4: {
                return new zzfnp(null);
            }
            case 3: {
                return new zzfnq();
            }
            case 2: {
                object = new Object[by2];
                object[0] = "zzc";
                return zzhbo.zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", object);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

