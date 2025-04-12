/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaut;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzauu
extends zzhbo
implements zzhdf {
    private static final zzauu zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private zzhbw zzg;
    private long zzh;

    static {
        zzauu zzauu2;
        zza = zzauu2 = new zzauu();
        zzhbo.zzca(zzauu.class, zzauu2);
    }

    private zzauu() {
        zzhbw zzhbw2;
        this.zzg = zzhbw2 = zzhbo.zzbG();
    }

    public static /* synthetic */ zzauu zza() {
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
                clazz = zzauu.class;
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
                return new zzaut(null);
            }
            case 3: {
                return new zzauu();
            }
            case 2: {
                objectArray = new Object[6];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                return zzhbo.zzbR(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u1004\u0001\u0003\u1007\u0002\u0004\u0016\u0005\u1003\u0003", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

