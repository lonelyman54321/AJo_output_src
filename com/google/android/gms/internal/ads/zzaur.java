/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzauq;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzaur
extends zzhbo
implements zzhdf {
    private static final zzaur zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;

    static {
        zzaur zzaur2;
        zza = zzaur2 = new zzaur();
        zzhbo.zzca(zzaur.class, zzaur2);
    }

    private zzaur() {
        long l2;
        this.zzd = l2 = (long)-1;
        this.zze = l2;
        this.zzf = l2;
        this.zzg = l2;
        this.zzh = l2;
        this.zzi = l2;
        this.zzj = l2;
        this.zzk = l2;
    }

    public static zzauq zza() {
        return (zzauq)zza.zzaZ();
    }

    public static /* synthetic */ zzaur zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzaur zzaur2, long l2) {
        int n3;
        zzaur2.zzc = n3 = zzaur2.zzc | 1;
        zzaur2.zzd = l2;
    }

    public static /* synthetic */ void zze(zzaur zzaur2, long l2) {
        int n3;
        zzaur2.zzc = n3 = zzaur2.zzc | 4;
        zzaur2.zzf = l2;
    }

    public static /* synthetic */ void zzf(zzaur zzaur2, long l2) {
        int n3;
        zzaur2.zzc = n3 = zzaur2.zzc | 8;
        zzaur2.zzg = l2;
    }

    public static /* synthetic */ void zzg(zzaur zzaur2, long l2) {
        int n3;
        zzaur2.zzc = n3 = zzaur2.zzc | 0x10;
        zzaur2.zzh = l2;
    }

    public static /* synthetic */ void zzh(zzaur zzaur2, long l2) {
        int n3;
        zzaur2.zzc = n3 = zzaur2.zzc | 0x20;
        zzaur2.zzi = l2;
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
                clazz = zzaur.class;
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
                return new zzauq(null);
            }
            case 3: {
                return new zzaur();
            }
            case 2: {
                objectArray = new Object[9];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                objectArray[6] = "zzi";
                objectArray[7] = "zzj";
                objectArray[8] = "zzk";
                return zzhbo.zzbR(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1002\u0007", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

