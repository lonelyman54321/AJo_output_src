/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhho;
import com.google.android.gms.internal.ads.zzhhq;

public final class zzhhr
extends zzhbo
implements zzhdf {
    private static final zzhhr zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzhhr zzhhr2;
        zza = zzhhr2 = new zzhhr();
        zzhbo.zzca(zzhhr.class, zzhhr2);
    }

    private zzhhr() {
    }

    public static /* synthetic */ zzhhr zzc() {
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
                object = zzhhr.class;
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
                return new zzhhq(null);
            }
            case 3: {
                return new zzhhr();
            }
            case 2: {
                objectArray = new Object[6];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = object = zzhho.zza;
                objectArray[3] = "zze";
                objectArray[4] = "zzf";
                objectArray[5] = object;
                return zzhbo.zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u180c\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

