/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzauy;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzave;
import com.google.android.gms.internal.ads.zzavk;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzavl
extends zzhbo
implements zzhdf {
    private static final zzavl zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhca zzd;
    private zzhac zze;
    private int zzf;
    private int zzg;

    static {
        zzavl zzavl2;
        zza = zzavl2 = new zzavl();
        zzhbo.zzca(zzavl.class, zzavl2);
    }

    private zzavl() {
        int n3;
        Iterable iterable;
        this.zzd = iterable = zzhbo.zzbK();
        iterable = zzhac.zzb;
        this.zze = iterable;
        this.zzf = n3 = 1;
        this.zzg = n3;
    }

    public static zzavk zza() {
        return (zzavk)zza.zzaZ();
    }

    public static /* synthetic */ zzavl zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzavl zzavl2, zzhac zzhac2) {
        zzhca zzhca2 = zzavl2.zzd;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            zzavl2.zzd = zzhca2 = zzhbo.zzbL(zzhca2);
        }
        zzavl2.zzd.add(zzhac2);
    }

    public static /* synthetic */ void zze(zzavl zzavl2, zzhac zzhac2) {
        int n3;
        zzavl2.zzc = n3 = zzavl2.zzc | 1;
        zzavl2.zze = zzhac2;
    }

    public static /* synthetic */ void zzf(zzavl zzavl2, zzauz zzauz2) {
        int n3;
        zzavl2.zzg = n3 = zzauz2.zza();
        zzavl2.zzc = n3 = zzavl2.zzc | 4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn objectArray, Object object, Object object2) {
        byte by2 = 1;
        object2 = zzhbn.zza;
        int n3 = objectArray.ordinal();
        object2 = null;
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 6: {
                objectArray = zzb;
                if (objectArray != null) return objectArray;
                object = zzavl.class;
                synchronized (object) {
                    try {
                        objectArray = zzb;
                        if (objectArray != null) return objectArray;
                        object2 = zza;
                        zzb = objectArray = new zzhbj((zzhbo)object2);
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
                return new zzavk(null);
            }
            case 3: {
                return new zzavl();
            }
            case 2: {
                objectArray = new Object[7];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = object = zzave.zza;
                objectArray[5] = "zzg";
                objectArray[6] = object = zzauy.zza;
                return zzhbo.zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002\u100a\u0000\u0003\u180c\u0001\u0004\u180c\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

