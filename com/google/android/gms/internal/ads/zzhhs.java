/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhhm;
import com.google.android.gms.internal.ads.zzhho;
import com.google.android.gms.internal.ads.zzhhr;

public final class zzhhs
extends zzhbo
implements zzhdf {
    private static final zzhhs zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzhhr zze;
    private zzhhr zzf;

    static {
        zzhhs zzhhs2;
        zza = zzhhs2 = new zzhhs();
        zzhbo.zzca(zzhhs.class, zzhhs2);
    }

    private zzhhs() {
    }

    public static /* synthetic */ zzhhs zzc() {
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
                object = zzhhs.class;
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
                return new zzhhm(null);
            }
            case 3: {
                return new zzhhs();
            }
            case 2: {
                objectArray = new Object[5];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = object = zzhho.zza;
                objectArray[3] = "zze";
                objectArray[4] = "zzf";
                return zzhbo.zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0003\u1009\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

