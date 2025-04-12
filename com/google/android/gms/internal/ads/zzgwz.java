/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgww;
import com.google.android.gms.internal.ads.zzgwy;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgwz
extends zzhbo
implements zzhdf {
    private static final zzgwz zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhca zzd;

    static {
        zzgwz zzgwz2;
        zza = zzgwz2 = new zzgwz();
        zzhbo.zzca(zzgwz.class, zzgwz2);
    }

    private zzgwz() {
        zzhca zzhca2;
        this.zzd = zzhca2 = zzhbo.zzbK();
    }

    public static zzgww zza() {
        return (zzgww)zza.zzaZ();
    }

    public static /* synthetic */ zzgwz zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzgwz zzgwz2, int n3) {
        zzgwz2.zzc = n3;
    }

    public static /* synthetic */ void zze(zzgwz zzgwz2, zzgwy zzgwy2) {
        zzgwy2.getClass();
        zzhca zzhca2 = zzgwz2.zzd;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            zzgwz2.zzd = zzhca2 = zzhbo.zzbL(zzhca2);
        }
        zzgwz2.zzd.add(zzgwy2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = zzhbn.zza;
        int n3 = objectArray.ordinal();
        object = null;
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 6: {
                objectArray = zzb;
                if (objectArray != null) return objectArray;
                clazz = zzgwz.class;
                synchronized (clazz) {
                    try {
                        objectArray = zzb;
                        if (objectArray != null) return objectArray;
                        object = zza;
                        zzb = objectArray = new zzhbj((zzhbo)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zza;
            }
            case 4: {
                return new zzgww(null);
            }
            case 3: {
                return new zzgwz();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = zzgwy.class;
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

