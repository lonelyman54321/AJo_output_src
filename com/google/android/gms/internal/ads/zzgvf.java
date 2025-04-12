/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgve;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgvf
extends zzhbo
implements zzhdf {
    private static final zzgvf zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;

    static {
        zzgvf zzgvf2;
        zza = zzgvf2 = new zzgvf();
        zzhbo.zzca(zzgvf.class, zzgvf2);
    }

    private zzgvf() {
    }

    public static zzgve zzd() {
        return (zzgve)zza.zzaZ();
    }

    public static /* synthetic */ zzgvf zze() {
        return zza;
    }

    public static zzgvf zzf(zzhac zzhac2, zzhay zzhay2) {
        return (zzgvf)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static /* synthetic */ void zzg(zzgvf zzgvf2, int n3) {
        zzgvf2.zzc = n3;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
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
                clazz = zzgvf.class;
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
                return new zzgve(null);
            }
            case 3: {
                return new zzgvf();
            }
            case 2: {
                object = new Object[2];
                object[0] = "zzc";
                object[by2] = "zzd";
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", object);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

