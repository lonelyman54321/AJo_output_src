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
import com.google.android.gms.internal.ads.zzhhe;
import com.google.android.gms.internal.ads.zzhhg;

public final class zzhhh
extends zzhbo
implements zzhdf {
    private static final zzhhh zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhhg zzd;
    private zzhca zze;
    private zzhac zzf;
    private zzhac zzg;
    private int zzh;
    private byte zzi = (byte)2;

    static {
        zzhhh zzhhh2;
        zza = zzhhh2 = new zzhhh();
        zzhbo.zzca(zzhhh.class, zzhhh2);
    }

    private zzhhh() {
        Iterable iterable;
        this.zze = iterable = zzhbo.zzbK();
        iterable = zzhac.zzb;
        this.zzf = iterable;
        this.zzg = iterable;
    }

    public static zzhhe zzc() {
        return (zzhhe)zza.zzaZ();
    }

    public static /* synthetic */ zzhhh zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhhh zzhhh2, zzhhd zzhhd2) {
        zzhhd2.getClass();
        zzhca zzhca2 = zzhhh2.zze;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            zzhhh2.zze = zzhca2 = zzhbo.zzbL(zzhca2);
        }
        zzhhh2.zze.add(zzhhd2);
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
                clazz = zzhhh.class;
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
                return new zzhhe(null);
            }
            case 3: {
                return new zzhhh();
            }
            case 2: {
                objectArray = new Object[7];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = zzhhd.class;
                objectArray[4] = "zzf";
                objectArray[5] = "zzg";
                objectArray[6] = "zzh";
                return zzhbo.zzbR(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1009\u0000\u0002\u041b\u0003\u100a\u0001\u0004\u100a\u0002\u0005\u1004\u0003", objectArray);
            }
            case 1: {
                if (clazz == null) {
                    by2 = 0;
                    object = null;
                }
                this.zzi = by2;
                return null;
            }
            case 0: 
        }
        return this.zzi;
    }
}

