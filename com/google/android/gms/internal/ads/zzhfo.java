/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhfn;

public final class zzhfo
extends zzhbo
implements zzhdf {
    private static final zzhfo zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzhfo zzhfo2;
        zza = zzhfo2 = new zzhfo();
        zzhbo.zzca(zzhfo.class, zzhfo2);
    }

    private zzhfo() {
    }

    public static zzhfn zzc() {
        return (zzhfn)zza.zzaZ();
    }

    public static /* synthetic */ zzhfo zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhfo zzhfo2, int n3) {
        zzhfo2.zzc = n3;
    }

    public static /* synthetic */ void zzg(zzhfo zzhfo2, long l2) {
        zzhfo2.zzd = l2;
    }

    public static /* synthetic */ void zzh(zzhfo zzhfo2, long l2) {
        zzhfo2.zze = l2;
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
                clazz = zzhfo.class;
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
                return new zzhfn(null);
            }
            case 3: {
                return new zzhfo();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                return zzhbo.zzbR(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

