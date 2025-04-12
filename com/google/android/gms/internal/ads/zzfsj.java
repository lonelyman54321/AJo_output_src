/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfsd;
import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfsh;
import com.google.android.gms.internal.ads.zzfsi;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzfsj
extends zzhbo
implements zzhdf {
    private static final zzfsj zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private String zze;
    private String zzf;
    private zzfsd zzg;

    static {
        zzfsj zzfsj2;
        zza = zzfsj2 = new zzfsj();
        zzhbo.zzca(zzfsj.class, zzfsj2);
    }

    private zzfsj() {
        String string2;
        this.zze = string2 = "";
        this.zzf = string2;
    }

    public static zzfsf zza() {
        return (zzfsf)zza.zzaZ();
    }

    public static /* synthetic */ zzfsj zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzfsj zzfsj2, zzfsi zzfsi2) {
        int n3;
        zzfsj2.zzd = n3 = zzfsi2.zza();
        zzfsj2.zzc = n3 = zzfsj2.zzc | 1;
    }

    public static /* synthetic */ void zze(zzfsj zzfsj2, String string2) {
        int n3;
        string2.getClass();
        zzfsj2.zzc = n3 = zzfsj2.zzc | 2;
        zzfsj2.zze = string2;
    }

    public static /* synthetic */ void zzf(zzfsj zzfsj2, zzfsd zzfsd2) {
        int n3;
        zzfsd2.getClass();
        zzfsj2.zzg = zzfsd2;
        zzfsj2.zzc = n3 = zzfsj2.zzc | 8;
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
                object = zzfsj.class;
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
                return new zzfsf(null);
            }
            case 3: {
                return new zzfsj();
            }
            case 2: {
                objectArray = new Object[6];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = object = zzfsh.zza;
                objectArray[3] = "zze";
                objectArray[4] = "zzf";
                objectArray[5] = "zzg";
                return zzhbo.zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

