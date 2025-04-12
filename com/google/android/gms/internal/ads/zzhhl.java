/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhhd;
import com.google.android.gms.internal.ads.zzhhi;
import com.google.android.gms.internal.ads.zzhhk;

public final class zzhhl
extends zzhbo
implements zzhdf {
    private static final zzhhl zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhhk zzd;
    private zzhca zze;
    private zzhac zzf;
    private zzhac zzg;
    private int zzh;
    private zzhac zzi;
    private byte zzj = (byte)2;

    static {
        zzhhl zzhhl2;
        zza = zzhhl2 = new zzhhl();
        zzhbo.zzca(zzhhl.class, zzhhl2);
    }

    private zzhhl() {
        Iterable iterable;
        this.zze = iterable = zzhbo.zzbK();
        iterable = zzhac.zzb;
        this.zzf = iterable;
        this.zzg = iterable;
        this.zzi = iterable;
    }

    public static /* synthetic */ zzhhl zzc() {
        return zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn objectArray, Object clazz, Object object) {
        byte by2 = 1;
        int n3 = objectArray.ordinal();
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 6: {
                objectArray = zzb;
                if (objectArray != null) return objectArray;
                clazz = zzhhl.class;
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
                return new zzhhi(null);
            }
            case 3: {
                return new zzhhl();
            }
            case 2: {
                objectArray = new Object[8];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = zzhhd.class;
                objectArray[4] = "zzf";
                objectArray[5] = "zzg";
                objectArray[6] = "zzh";
                objectArray[7] = "zzi";
                return zzhbo.zzbR(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\u1009\u0000\u0002\u041b\u0003\u100a\u0001\u0004\u100a\u0002\u0005\u1004\u0003\u0006\u100a\u0004", objectArray);
            }
            case 1: {
                if (clazz == null) {
                    by2 = 0;
                    object = null;
                }
                this.zzj = by2;
                return null;
            }
            case 0: 
        }
        return this.zzj;
    }
}

