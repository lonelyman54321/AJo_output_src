/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvq;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgvr
extends zzhbo
implements zzhdf {
    private static final zzgvr zza;
    private static volatile zzhdm zzb;

    static {
        zzgvr zzgvr2;
        zza = zzgvr2 = new zzgvr();
        zzhbo.zzca(zzgvr.class, zzgvr2);
    }

    private zzgvr() {
    }

    public static /* synthetic */ zzgvr zza() {
        return zza;
    }

    public static zzgvr zzc() {
        return zza;
    }

    public static zzgvr zzd(zzhac zzhac2, zzhay zzhay2) {
        return (zzgvr)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn object, Object clazz, Object object2) {
        clazz = zzhbn.zza;
        int n3 = object.ordinal();
        clazz = null;
        switch (n3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 6: {
                object = zzb;
                if (object != null) return object;
                clazz = zzgvr.class;
                synchronized (clazz) {
                    try {
                        object = zzb;
                        if (object != null) return object;
                        object2 = zza;
                        object = new zzhbj((zzhbo)object2);
                        zzb = object;
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
                return new zzgvq(null);
            }
            case 3: {
                return new zzgvr();
            }
            case 2: {
                return zzhbo.zzbR(zza, "\u0000\u0000", null);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return (byte)1;
    }
}

