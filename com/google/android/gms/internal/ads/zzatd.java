/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzasz;
import com.google.android.gms.internal.ads.zzatb;
import com.google.android.gms.internal.ads.zzatc;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzatd
extends zzhbo
implements zzhdf {
    private static final zzatd zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private String zzk;
    private long zzl;
    private String zzm;
    private String zzn;
    private zzhca zzo;
    private int zzp;

    static {
        zzatd zzatd2;
        zza = zzatd2 = new zzatd();
        zzhbo.zzca(zzatd.class, zzatd2);
    }

    private zzatd() {
        Object object = "";
        this.zzd = object;
        this.zzf = object;
        this.zzg = object;
        this.zzh = object;
        this.zzk = object;
        this.zzm = object;
        this.zzn = object;
        this.zzo = object = zzhbo.zzbK();
    }

    public static zzasx zza() {
        return (zzasx)zza.zzaZ();
    }

    public static /* synthetic */ zzatd zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzatd zzatd2, long l2) {
        int n3;
        zzatd2.zzc = n3 = zzatd2.zzc | 2;
        zzatd2.zze = l2;
    }

    public static /* synthetic */ void zze(zzatd zzatd2, String string2) {
        int n3;
        string2.getClass();
        zzatd2.zzc = n3 = zzatd2.zzc | 4;
        zzatd2.zzf = string2;
    }

    public static /* synthetic */ void zzf(zzatd zzatd2, String string2) {
        int n3;
        string2.getClass();
        zzatd2.zzc = n3 = zzatd2.zzc | 8;
        zzatd2.zzg = string2;
    }

    public static /* synthetic */ void zzg(zzatd zzatd2, String string2) {
        int n3;
        zzatd2.zzc = n3 = zzatd2.zzc | 0x10;
        zzatd2.zzh = string2;
    }

    public static /* synthetic */ void zzh(zzatd zzatd2, String string2) {
        int n3;
        zzatd2.zzc = n3 = zzatd2.zzc | 0x400;
        zzatd2.zzn = string2;
    }

    public static /* synthetic */ void zzi(zzatd zzatd2, zzatc zzatc2) {
        int n3;
        zzatd2.zzp = n3 = zzatc2.zza();
        zzatd2.zzc = n3 = zzatd2.zzc | 0x800;
    }

    public static /* synthetic */ void zzj(zzatd zzatd2, String string2) {
        int n3;
        string2.getClass();
        zzatd2.zzc = n3 = zzatd2.zzc | 1;
        zzatd2.zzd = string2;
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
                object = zzatd.class;
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
                return new zzasx(null);
            }
            case 3: {
                return new zzatd();
            }
            case 2: {
                objectArray = new Object[16];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                objectArray[6] = "zzi";
                objectArray[7] = "zzj";
                objectArray[8] = "zzk";
                objectArray[9] = "zzl";
                objectArray[10] = "zzm";
                objectArray[11] = "zzn";
                objectArray[12] = "zzo";
                objectArray[13] = zzasz.class;
                objectArray[14] = "zzp";
                objectArray[15] = object = zzatb.zza;
                return zzhbo.zzbR(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1008\u0007\t\u1002\b\n\u1008\t\u000b\u1008\n\f\u001b\r\u180c\u000b", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

