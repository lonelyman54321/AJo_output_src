/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhfo;
import com.google.android.gms.internal.ads.zzhfp;

public final class zzhfq
extends zzhbo
implements zzhdf {
    private static final zzhfq zza;
    private static volatile zzhdm zzb;
    private zzhca zzc;

    static {
        zzhfq zzhfq2;
        zza = zzhfq2 = new zzhfq();
        zzhbo.zzca(zzhfq.class, zzhfq2);
    }

    private zzhfq() {
        zzhca zzhca2;
        this.zzc = zzhca2 = zzhbo.zzbK();
    }

    public static zzhfp zzc() {
        return (zzhfp)zza.zzaZ();
    }

    public static /* synthetic */ zzhfq zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhfq zzhfq2, zzhfo zzhfo2) {
        zzhfo2.getClass();
        zzhca zzhca2 = zzhfq2.zzc;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            zzhfq2.zzc = zzhca2 = zzhbo.zzbL(zzhca2);
        }
        zzhfq2.zzc.add(zzhfo2);
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
                clazz = zzhfq.class;
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
                return new zzhfp(null);
            }
            case 3: {
                return new zzhfq();
            }
            case 2: {
                object = new Object[2];
                object[0] = "zzc";
                object[by2] = zzhfo.class;
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

