/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvt;
import com.google.android.gms.internal.ads.zzgwb;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgwc
extends zzhbo
implements zzhdf {
    private static final zzgwc zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;

    static {
        zzgwc zzgwc2;
        zza = zzgwc2 = new zzgwc();
        zzhbo.zzca(zzgwc.class, zzgwc2);
    }

    private zzgwc() {
    }

    public static zzgwb zzd() {
        return (zzgwb)zza.zzaZ();
    }

    public static /* synthetic */ zzgwc zze() {
        return zza;
    }

    public static zzgwc zzf() {
        return zza;
    }

    public static /* synthetic */ void zzg(zzgwc zzgwc2, zzgvt zzgvt2) {
        int n3;
        zzgwc2.zzc = n3 = zzgvt2.zza();
    }

    public static /* synthetic */ void zzh(zzgwc zzgwc2, int n3) {
        zzgwc2.zzd = n3;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgvt zzc() {
        int n3 = this.zzc;
        zzgvt zzgvt2 = zzgvt.zzb(n3);
        if (zzgvt2 == null) {
            zzgvt2 = zzgvt.zzg;
        }
        return zzgvt2;
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
                clazz = zzgwc.class;
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
                return new zzgwb(null);
            }
            case 3: {
                return new zzgwc();
            }
            case 2: {
                object = new Object[2];
                object[0] = "zzc";
                object[by2] = "zzd";
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", object);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

