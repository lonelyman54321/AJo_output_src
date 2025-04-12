/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatm;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzatn
extends zzhbo
implements zzhdf {
    private static final zzatn zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;

    static {
        zzatn zzatn2;
        zza = zzatn2 = new zzatn();
        zzhbo.zzca(zzatn.class, zzatn2);
    }

    private zzatn() {
        String string2;
        this.zzd = string2 = "";
        this.zze = string2;
        this.zzf = string2;
        this.zzg = string2;
        this.zzh = string2;
        this.zzi = string2;
    }

    public static /* synthetic */ zzatn zza() {
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
                clazz = zzatn.class;
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
                return new zzatm(null);
            }
            case 3: {
                return new zzatn();
            }
            case 2: {
                objectArray = new Object[7];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                objectArray[6] = "zzi";
                return zzhbo.zzbR(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

