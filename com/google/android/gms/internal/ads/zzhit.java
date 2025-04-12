/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhis;
import com.google.android.gms.internal.ads.zzhiv;

public final class zzhit
extends zzhbo
implements zzhdf {
    private static final zzhit zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private String zzd;
    private long zze;
    private boolean zzf;
    private int zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;

    static {
        zzhit zzhit2;
        zza = zzhit2 = new zzhit();
        zzhbo.zzca(zzhit.class, zzhit2);
    }

    private zzhit() {
        String string2;
        this.zzd = string2 = "";
        this.zzh = string2;
        this.zzi = string2;
    }

    public static zzhis zzc() {
        return (zzhis)zza.zzaZ();
    }

    public static /* synthetic */ zzhit zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhit zzhit2, String string2) {
        int n3;
        zzhit2.zzc = n3 = zzhit2.zzc | 1;
        zzhit2.zzd = string2;
    }

    public static /* synthetic */ void zzg(zzhit zzhit2, long l2) {
        int n3;
        zzhit2.zzc = n3 = zzhit2.zzc | 2;
        zzhit2.zze = l2;
    }

    public static /* synthetic */ void zzh(zzhit zzhit2, boolean bl2) {
        int n3;
        zzhit2.zzc = n3 = zzhit2.zzc | 4;
        zzhit2.zzf = bl2;
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
                object = zzhit.class;
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
                return new zzhis(null);
            }
            case 3: {
                return new zzhit();
            }
            case 2: {
                objectArray = new Object[9];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = object = zzhiv.zza;
                objectArray[6] = "zzh";
                objectArray[7] = "zzi";
                objectArray[8] = "zzj";
                return zzhbo.zzbR(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1007\u0002\u0004\u180c\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1007\u0006", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

