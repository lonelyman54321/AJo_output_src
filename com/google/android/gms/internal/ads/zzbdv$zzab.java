/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzab$zza;
import com.google.android.gms.internal.ads.zzbdv$zzab$zzb;
import com.google.android.gms.internal.ads.zzbdv$zzab$zzc;
import com.google.android.gms.internal.ads.zzbdv$zzae;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbdv$zzab
extends zzhbo
implements zzbdv$zzae {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbdv$zzab zzc;
    private static volatile zzhdm zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbdv$zzab zzbdv$zzab;
        zzc = zzbdv$zzab = new zzbdv$zzab();
        zzhbo.zzca(zzbdv$zzab.class, zzbdv$zzab);
    }

    private zzbdv$zzab() {
    }

    private void zzA() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFD;
        this.zzg = 0;
    }

    private void zzB() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFE;
        this.zzf = 0;
    }

    private void zzC(zzbdv$zzab$zzb zzbdv$zzab$zzb) {
        int n3;
        this.zzg = n3 = zzbdv$zzab$zzb.zza();
        this.zze = n3 = this.zze | 2;
    }

    private void zzD(zzbdv$zzab$zzc zzbdv$zzab$zzc) {
        int n3;
        this.zzf = n3 = zzbdv$zzab$zzc.zza();
        this.zze = n3 = this.zze | 1;
    }

    public static zzbdv$zzab$zza zza() {
        return (zzbdv$zzab$zza)zzc.zzaZ();
    }

    public static zzbdv$zzab$zza zzc(zzbdv$zzab zzbdv$zzab) {
        return (zzbdv$zzab$zza)zzc.zzba(zzbdv$zzab);
    }

    public static /* synthetic */ zzbdv$zzab zzd() {
        return zzc;
    }

    public static zzbdv$zzab zzi() {
        return zzc;
    }

    public static zzbdv$zzab zzj(InputStream inputStream) {
        return (zzbdv$zzab)zzhbo.zzbk(zzc, inputStream);
    }

    public static zzbdv$zzab zzk(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzab)zzhbo.zzbl(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzab zzl(zzhac zzhac2) {
        return (zzbdv$zzab)zzhbo.zzbm(zzc, zzhac2);
    }

    public static zzbdv$zzab zzm(zzham zzham2) {
        return (zzbdv$zzab)zzhbo.zzbn(zzc, zzham2);
    }

    public static zzbdv$zzab zzn(InputStream inputStream) {
        return (zzbdv$zzab)zzhbo.zzbo(zzc, inputStream);
    }

    public static zzbdv$zzab zzo(ByteBuffer byteBuffer) {
        return (zzbdv$zzab)zzhbo.zzbp(zzc, byteBuffer);
    }

    public static zzbdv$zzab zzp(byte[] byArray) {
        return (zzbdv$zzab)zzhbo.zzbq(zzc, byArray);
    }

    public static zzbdv$zzab zzq(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzab)zzhbo.zzbr(zzc, zzhac2, zzhay2);
    }

    public static zzbdv$zzab zzr(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzab)zzhbo.zzbs(zzc, zzham2, zzhay2);
    }

    public static zzbdv$zzab zzs(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzab)zzhbo.zzbu(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzab zzt(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzab)zzhbo.zzbv(zzc, byteBuffer, zzhay2);
    }

    public static zzbdv$zzab zzu(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzab)zzhbo.zzbx(zzc, byArray, zzhay2);
    }

    public static zzhdm zzv() {
        return zzc.zzbM();
    }

    public static /* synthetic */ void zzw(zzbdv$zzab zzbdv$zzab, zzbdv$zzab$zzc zzbdv$zzab$zzc) {
        zzbdv$zzab.zzD(zzbdv$zzab$zzc);
    }

    public static /* synthetic */ void zzx(zzbdv$zzab zzbdv$zzab) {
        zzbdv$zzab.zzB();
    }

    public static /* synthetic */ void zzy(zzbdv$zzab zzbdv$zzab, zzbdv$zzab$zzb zzbdv$zzab$zzb) {
        zzbdv$zzab.zzC(zzbdv$zzab$zzb);
    }

    public static /* synthetic */ void zzz(zzbdv$zzab zzbdv$zzab) {
        zzbdv$zzab.zzA();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = zzhbn.zza;
        int n3 = object.ordinal();
        object2 = null;
        switch (n3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 6: {
                object = zzd;
                if (object != null) return object;
                clazz = zzbdv$zzab.class;
                synchronized (clazz) {
                    try {
                        object = zzd;
                        if (object != null) return object;
                        object2 = zzc;
                        object = new zzhbj((zzhbo)object2);
                        zzd = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzc;
            }
            case 4: {
                return new zzbdv$zzab$zza(null);
            }
            case 3: {
                return new zzbdv$zzab();
            }
            case 2: {
                object = zzbdv$zzab$zzc.zze();
                object2 = zzbdv$zzab$zzb.zze();
                Object[] objectArray = new Object[5];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = object;
                objectArray[3] = "zzg";
                objectArray[4] = object2;
                return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzab$zzb zze() {
        int n3 = this.zzg;
        zzbdv$zzab$zzb zzbdv$zzab$zzb = zzbdv$zzab$zzb.zzb(n3);
        if (zzbdv$zzab$zzb == null) {
            zzbdv$zzab$zzb = zzbdv$zzab$zzb.zza;
        }
        return zzbdv$zzab$zzb;
    }

    public zzbdv$zzab$zzc zzf() {
        int n3 = this.zzf;
        zzbdv$zzab$zzc zzbdv$zzab$zzc = zzbdv$zzab$zzc.zzb(n3);
        if (zzbdv$zzab$zzc == null) {
            zzbdv$zzab$zzc = zzbdv$zzab$zzc.zza;
        }
        return zzbdv$zzab$zzc;
    }

    public boolean zzg() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }

    public boolean zzh() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

