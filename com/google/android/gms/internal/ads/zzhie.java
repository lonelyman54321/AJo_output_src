/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhia;
import com.google.android.gms.internal.ads.zzhic;

public final class zzhie
extends zzhbo
implements zzhdf {
    private static final zzhie zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        zzhie zzhie2;
        zza = zzhie2 = new zzhie();
        zzhbo.zzca(zzhie.class, zzhie2);
    }

    private zzhie() {
    }

    public static /* synthetic */ zzhie zzc() {
        return zza;
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
                object = zzhie.class;
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
                return new zzhia(null);
            }
            case 3: {
                return new zzhie();
            }
            case 2: {
                objectArray = new Object[6];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = object = zzhic.zza;
                objectArray[3] = "zze";
                objectArray[4] = "zzf";
                objectArray[5] = "zzg";
                return zzhbo.zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1004\u0001\u0003\u1002\u0002\u0004\u1002\u0003", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

