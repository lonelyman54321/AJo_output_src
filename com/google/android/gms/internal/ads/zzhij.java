/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhif;
import com.google.android.gms.internal.ads.zzhih;
import com.google.android.gms.internal.ads.zzhii;

public final class zzhij
extends zzhbo
implements zzhdf {
    private static final zzhij zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzhac zzf;
    private zzhac zzg;

    static {
        zzhij zzhij2;
        zza = zzhij2 = new zzhij();
        zzhbo.zzca(zzhij.class, zzhij2);
    }

    private zzhij() {
        zzhac zzhac2;
        this.zzf = zzhac2 = zzhac.zzb;
        this.zzg = zzhac2;
    }

    public static zzhif zzc() {
        return (zzhif)zza.zzaZ();
    }

    public static /* synthetic */ zzhij zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhij zzhij2, zzhii zzhii2) {
        int n3;
        zzhij2.zzd = n3 = zzhii2.zza();
        zzhij2.zzc = n3 = zzhij2.zzc | 1;
    }

    public static /* synthetic */ void zzg(zzhij zzhij2, String string2) {
        int n3;
        zzhij2.zzc = n3 = zzhij2.zzc | 2;
        zzhij2.zze = "image/png";
    }

    public static /* synthetic */ void zzh(zzhij zzhij2, zzhac zzhac2) {
        int n3;
        zzhac2.getClass();
        zzhij2.zzc = n3 = zzhij2.zzc | 4;
        zzhij2.zzf = zzhac2;
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
                object = zzhij.class;
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
                return new zzhif(null);
            }
            case 3: {
                return new zzhij();
            }
            case 2: {
                objectArray = new Object[6];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = object = zzhih.zza;
                objectArray[3] = "zze";
                objectArray[4] = "zzf";
                objectArray[5] = "zzg";
                return zzhbo.zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u100a\u0002\u0004\u100a\u0003", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

