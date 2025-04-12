/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzauw
extends zzhbo
implements zzhdf {
    private static final zzauw zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhac zzd;
    private zzhac zze;
    private zzhac zzf;
    private zzhac zzg;

    static {
        zzauw zzauw2;
        zza = zzauw2 = new zzauw();
        zzhbo.zzca(zzauw.class, zzauw2);
    }

    private zzauw() {
        zzhac zzhac2;
        this.zzd = zzhac2 = zzhac.zzb;
        this.zze = zzhac2;
        this.zzf = zzhac2;
        this.zzg = zzhac2;
    }

    public static zzauv zza() {
        return (zzauv)zza.zzaZ();
    }

    public static /* synthetic */ zzauw zzc() {
        return zza;
    }

    public static zzauw zzd(byte[] byArray, zzhay zzhay2) {
        return (zzauw)zzhbo.zzbx(zza, byArray, zzhay2);
    }

    public static /* synthetic */ void zzi(zzauw zzauw2, zzhac zzhac2) {
        int n3;
        zzauw2.zzc = n3 = zzauw2.zzc | 1;
        zzauw2.zzd = zzhac2;
    }

    public static /* synthetic */ void zzj(zzauw zzauw2, zzhac zzhac2) {
        int n3;
        zzauw2.zzc = n3 = zzauw2.zzc | 2;
        zzauw2.zze = zzhac2;
    }

    public static /* synthetic */ void zzk(zzauw zzauw2, zzhac zzhac2) {
        int n3;
        zzauw2.zzc = n3 = zzauw2.zzc | 4;
        zzauw2.zzf = zzhac2;
    }

    public static /* synthetic */ void zzl(zzauw zzauw2, zzhac zzhac2) {
        int n3;
        zzauw2.zzc = n3 = zzauw2.zzc | 8;
        zzauw2.zzg = zzhac2;
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
                clazz = zzauw.class;
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
                return new zzauv(null);
            }
            case 3: {
                return new zzauw();
            }
            case 2: {
                objectArray = new Object[5];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                return zzhbo.zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100a\u0001\u0003\u100a\u0002\u0004\u100a\u0003", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzhac zze() {
        return this.zzd;
    }

    public final zzhac zzf() {
        return this.zze;
    }

    public final zzhac zzg() {
        return this.zzg;
    }

    public final zzhac zzh() {
        return this.zzf;
    }
}

