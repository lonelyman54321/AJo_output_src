/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzaup
extends zzhbo
implements zzhdf {
    private static final zzaup zza;
    private static volatile zzhdm zzb;
    private long zzA;
    private long zzB;
    private int zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private long zzo;
    private long zzp;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        zzaup zzaup2;
        zza = zzaup2 = new zzaup();
        zzhbo.zzca(zzaup.class, zzaup2);
    }

    private zzaup() {
        int n3;
        long l2;
        this.zzd = l2 = (long)-1;
        this.zze = l2;
        this.zzf = l2;
        this.zzg = l2;
        this.zzh = l2;
        this.zzi = l2;
        this.zzj = n3 = 1000;
        this.zzk = l2;
        this.zzl = l2;
        this.zzm = l2;
        this.zzn = n3;
        this.zzo = l2;
        this.zzp = l2;
        this.zzu = l2;
        this.zzv = l2;
        this.zzy = l2;
        this.zzz = l2;
        this.zzA = l2;
        this.zzB = l2;
    }

    public static zzauo zza() {
        return (zzauo)zza.zzaZ();
    }

    public static /* synthetic */ zzaup zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 1;
        zzaup2.zzd = l2;
    }

    public static /* synthetic */ void zze(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 2;
        zzaup2.zze = l2;
    }

    public static /* synthetic */ void zzf(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 4;
        zzaup2.zzf = l2;
    }

    public static /* synthetic */ void zzg(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 8;
        zzaup2.zzg = l2;
    }

    public static /* synthetic */ void zzh(zzaup zzaup2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc & 0xFFFFFFF7;
        zzaup2.zzg = -1;
    }

    public static /* synthetic */ void zzi(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x10;
        zzaup2.zzh = l2;
    }

    public static /* synthetic */ void zzj(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x20;
        zzaup2.zzi = l2;
    }

    public static /* synthetic */ void zzk(zzaup zzaup2, zzavc zzavc2) {
        int n3;
        zzaup2.zzj = n3 = zzavc2.zza();
        zzaup2.zzc = n3 = zzaup2.zzc | 0x40;
    }

    public static /* synthetic */ void zzl(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x80;
        zzaup2.zzk = l2;
    }

    public static /* synthetic */ void zzm(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x100;
        zzaup2.zzl = l2;
    }

    public static /* synthetic */ void zzn(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x200;
        zzaup2.zzm = l2;
    }

    public static /* synthetic */ void zzo(zzaup zzaup2, zzavc zzavc2) {
        int n3;
        zzaup2.zzn = n3 = zzavc2.zza();
        zzaup2.zzc = n3 = zzaup2.zzc | 0x400;
    }

    public static /* synthetic */ void zzp(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x800;
        zzaup2.zzo = l2;
    }

    public static /* synthetic */ void zzq(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x1000;
        zzaup2.zzp = l2;
    }

    public static /* synthetic */ void zzr(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x2000;
        zzaup2.zzu = l2;
    }

    public static /* synthetic */ void zzs(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x4000;
        zzaup2.zzv = l2;
    }

    public static /* synthetic */ void zzt(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x8000;
        zzaup2.zzw = l2;
    }

    public static /* synthetic */ void zzu(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x10000;
        zzaup2.zzx = l2;
    }

    public static /* synthetic */ void zzv(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x20000;
        zzaup2.zzy = l2;
    }

    public static /* synthetic */ void zzw(zzaup zzaup2, long l2) {
        int n3;
        zzaup2.zzc = n3 = zzaup2.zzc | 0x40000;
        zzaup2.zzz = l2;
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
                object = zzaup.class;
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
                return new zzauo(null);
            }
            case 3: {
                return new zzaup();
            }
            case 2: {
                objectArray = new Object[24];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                objectArray[6] = "zzi";
                objectArray[7] = "zzj";
                objectArray[8] = object = zzavb.zza;
                objectArray[9] = "zzk";
                objectArray[10] = "zzl";
                objectArray[11] = "zzm";
                objectArray[12] = "zzn";
                objectArray[13] = object;
                objectArray[14] = "zzo";
                objectArray[15] = "zzp";
                objectArray[16] = "zzu";
                objectArray[17] = "zzv";
                objectArray[18] = "zzw";
                objectArray[19] = "zzx";
                objectArray[20] = "zzy";
                objectArray[21] = "zzz";
                objectArray[22] = "zzA";
                objectArray[23] = "zzB";
                return zzhbo.zzbR(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u180c\u0006\b\u1002\u0007\t\u1002\b\n\u1002\t\u000b\u180c\n\f\u1002\u000b\r\u1002\f\u000e\u1002\r\u000f\u1002\u000e\u0010\u1002\u000f\u0011\u1002\u0010\u0012\u1002\u0011\u0013\u1002\u0012\u0014\u1002\u0013\u0015\u1002\u0014", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

