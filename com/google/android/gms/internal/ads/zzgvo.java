/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvn;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgvo
extends zzhbo
implements zzhdf {
    private static final zzgvo zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhac zzd;

    static {
        zzgvo zzgvo2;
        zza = zzgvo2 = new zzgvo();
        zzhbo.zzca(zzgvo.class, zzgvo2);
    }

    private zzgvo() {
        zzhac zzhac2;
        this.zzd = zzhac2 = zzhac.zzb;
    }

    public static zzgvn zzc() {
        return (zzgvn)zza.zzaZ();
    }

    public static /* synthetic */ zzgvo zzd() {
        return zza;
    }

    public static zzgvo zze(zzhac zzhac2, zzhay zzhay2) {
        return (zzgvo)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static zzhdm zzg() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzh(zzgvo zzgvo2, zzhac zzhac2) {
        zzgvo2.zzd = zzhac2;
    }

    public final int zza() {
        return this.zzc;
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
                clazz = zzgvo.class;
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
                return new zzgvn(null);
            }
            case 3: {
                return new zzgvo();
            }
            case 2: {
                object = new Object[2];
                object[0] = "zzc";
                object[by2] = "zzd";
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", object);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzhac zzf() {
        return this.zzd;
    }
}

