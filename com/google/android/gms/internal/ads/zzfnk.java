/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfnh;
import com.google.android.gms.internal.ads.zzfnj;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzfnk
extends zzhbo
implements zzhdf {
    private static final zzfnk zza;
    private static volatile zzhdm zzb;
    private zzhca zzc;

    static {
        zzfnk zzfnk2;
        zza = zzfnk2 = new zzfnk();
        zzhbo.zzca(zzfnk.class, zzfnk2);
    }

    private zzfnk() {
        zzhca zzhca2;
        this.zzc = zzhca2 = zzhbo.zzbK();
    }

    public static zzfnh zzc() {
        return (zzfnh)zza.zzaZ();
    }

    public static /* synthetic */ zzfnk zzd() {
        return zza;
    }

    public static /* synthetic */ void zze(zzfnk zzfnk2) {
        zzhca zzhca2;
        zzfnk2.zzc = zzhca2 = zzhbo.zzbK();
    }

    public static /* synthetic */ void zzf(zzfnk zzfnk2, zzfnj zzfnj2) {
        zzfnj2.getClass();
        zzhca zzhca2 = zzfnk2.zzc;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            zzfnk2.zzc = zzhca2 = zzhbo.zzbL(zzhca2);
        }
        zzfnk2.zzc.add(zzfnj2);
    }

    public final int zza() {
        return this.zzc.size();
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
                clazz = zzfnk.class;
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
                return new zzfnh(null);
            }
            case 3: {
                return new zzfnk();
            }
            case 2: {
                object = new Object[2];
                object[0] = "zzc";
                object[by2] = zzfnj.class;
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

