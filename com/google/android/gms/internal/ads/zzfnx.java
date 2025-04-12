/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfnu;
import com.google.android.gms.internal.ads.zzfnw;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzfnx
extends zzhbo
implements zzhdf {
    private static final zzfnx zza;
    private static volatile zzhdm zzb;
    private zzhca zzc;

    static {
        zzfnx zzfnx2;
        zza = zzfnx2 = new zzfnx();
        zzhbo.zzca(zzfnx.class, zzfnx2);
    }

    private zzfnx() {
        zzhca zzhca2;
        this.zzc = zzhca2 = zzhbo.zzbK();
    }

    public static /* synthetic */ zzfnx zza() {
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
                clazz = zzfnx.class;
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
                return new zzfnw(null);
            }
            case 3: {
                return new zzfnx();
            }
            case 2: {
                object = new Object[2];
                object[0] = "zzc";
                object[by2] = zzfnu.class;
                return zzhbo.zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

