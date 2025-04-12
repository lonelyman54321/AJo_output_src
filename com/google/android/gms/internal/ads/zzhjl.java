/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhjj;
import com.google.android.gms.internal.ads.zzhjk;

public final class zzhjl
extends zzhbo
implements zzhdf {
    private static final zzhjl zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzhbw zzf;
    private int zzg;
    private zzhca zzh;
    private zzhac zzi;

    static {
        zzhjl zzhjl2;
        zza = zzhjl2 = new zzhjl();
        zzhbo.zzca(zzhjl.class, zzhjl2);
    }

    private zzhjl() {
        Iterable iterable;
        this.zzf = iterable = zzhbo.zzbG();
        iterable = zzhbo.zzbK();
        this.zzh = iterable;
        iterable = zzhac.zzb;
        this.zzi = iterable;
    }

    public static /* synthetic */ zzhjl zzc() {
        return zza;
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
                clazz = zzhjl.class;
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
                return new zzhjk(null);
            }
            case 3: {
                return new zzhjl();
            }
            case 2: {
                objectArray = new Object[8];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                objectArray[6] = zzhjj.class;
                objectArray[7] = "zzi";
                return zzhbo.zzbR(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u0016\u0005\u1004\u0002\u0006\u001b\u0007\u100a\u0003", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

