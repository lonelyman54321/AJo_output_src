/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzal;
import com.google.android.gms.internal.ads.zzbdv$zzam;
import com.google.android.gms.internal.ads.zzbdv$zzd$zza;
import com.google.android.gms.internal.ads.zzbdv$zzd$zzb;
import com.google.android.gms.internal.ads.zzbdv$zze;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbdv$zzd
extends zzhbo
implements zzbdv$zze {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbdv$zzd zzc;
    private static volatile zzhdm zzd;
    private int zze;
    private int zzf;
    private zzbdv$zzal zzg;

    static {
        zzbdv$zzd zzbdv$zzd;
        zzc = zzbdv$zzd = new zzbdv$zzd();
        zzhbo.zzca(zzbdv$zzd.class, zzbdv$zzd);
    }

    private zzbdv$zzd() {
    }

    public static /* synthetic */ void zzA(zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzd.zzB();
    }

    private void zzB() {
        int n3;
        this.zzg = null;
        this.zze = n3 = this.zze & 0xFFFFFFFD;
    }

    private void zzC() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFE;
        this.zzf = 0;
    }

    private void zzD(zzbdv$zzal zzbdv$zzal) {
        int n3;
        zzbdv$zzal zzbdv$zzal2;
        zzbdv$zzal.getClass();
        zzbdv$zzam zzbdv$zzam = this.zzg;
        if (zzbdv$zzam != null && zzbdv$zzam != (zzbdv$zzal2 = zzbdv$zzal.zzf())) {
            zzbdv$zzam = zzbdv$zzal.zzd((zzbdv$zzal)zzbdv$zzam);
            ((zzhbi)((Object)zzbdv$zzam)).zzbj(zzbdv$zzal);
            zzbdv$zzal = (zzbdv$zzal)((zzhbi)((Object)zzbdv$zzam)).zzbo();
        }
        this.zzg = zzbdv$zzal;
        this.zze = n3 = this.zze | 2;
    }

    private void zzE(zzbdv$zzal zzbdv$zzal) {
        int n3;
        zzbdv$zzal.getClass();
        this.zzg = zzbdv$zzal;
        this.zze = n3 = this.zze | 2;
    }

    private void zzF(zzbdv$zzd$zza zzbdv$zzd$zza) {
        int n3;
        this.zzf = n3 = zzbdv$zzd$zza.zza();
        this.zze = n3 = this.zze | 1;
    }

    public static zzbdv$zzd$zzb zzc() {
        return (zzbdv$zzd$zzb)zzc.zzaZ();
    }

    public static zzbdv$zzd$zzb zzd(zzbdv$zzd zzbdv$zzd) {
        return (zzbdv$zzd$zzb)zzc.zzba(zzbdv$zzd);
    }

    public static /* synthetic */ zzbdv$zzd zze() {
        return zzc;
    }

    public static zzbdv$zzd zzf() {
        return zzc;
    }

    public static zzbdv$zzd zzg(InputStream inputStream) {
        return (zzbdv$zzd)zzhbo.zzbk(zzc, inputStream);
    }

    public static zzbdv$zzd zzk(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzd)zzhbo.zzbl(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzd zzl(zzhac zzhac2) {
        return (zzbdv$zzd)zzhbo.zzbm(zzc, zzhac2);
    }

    public static zzbdv$zzd zzm(zzham zzham2) {
        return (zzbdv$zzd)zzhbo.zzbn(zzc, zzham2);
    }

    public static zzbdv$zzd zzn(InputStream inputStream) {
        return (zzbdv$zzd)zzhbo.zzbo(zzc, inputStream);
    }

    public static zzbdv$zzd zzo(ByteBuffer byteBuffer) {
        return (zzbdv$zzd)zzhbo.zzbp(zzc, byteBuffer);
    }

    public static zzbdv$zzd zzp(byte[] byArray) {
        return (zzbdv$zzd)zzhbo.zzbq(zzc, byArray);
    }

    public static zzbdv$zzd zzq(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzd)zzhbo.zzbr(zzc, zzhac2, zzhay2);
    }

    public static zzbdv$zzd zzr(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzd)zzhbo.zzbs(zzc, zzham2, zzhay2);
    }

    public static zzbdv$zzd zzs(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzd)zzhbo.zzbu(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzd zzt(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzd)zzhbo.zzbv(zzc, byteBuffer, zzhay2);
    }

    public static zzbdv$zzd zzu(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzd)zzhbo.zzbx(zzc, byArray, zzhay2);
    }

    public static zzhdm zzv() {
        return zzc.zzbM();
    }

    public static /* synthetic */ void zzw(zzbdv$zzd zzbdv$zzd, zzbdv$zzd$zza zzbdv$zzd$zza) {
        zzbdv$zzd.zzF(zzbdv$zzd$zza);
    }

    public static /* synthetic */ void zzx(zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzd.zzC();
    }

    public static /* synthetic */ void zzy(zzbdv$zzd zzbdv$zzd, zzbdv$zzal zzbdv$zzal) {
        zzbdv$zzd.zzE(zzbdv$zzal);
    }

    public static /* synthetic */ void zzz(zzbdv$zzd zzbdv$zzd, zzbdv$zzal zzbdv$zzal) {
        zzbdv$zzd.zzD(zzbdv$zzal);
    }

    public zzbdv$zzd$zza zza() {
        int n3 = this.zzf;
        zzbdv$zzd$zza zzbdv$zzd$zza = zzbdv$zzd$zza.zzb(n3);
        if (zzbdv$zzd$zza == null) {
            zzbdv$zzd$zza = zzbdv$zzd$zza.zza;
        }
        return zzbdv$zzd$zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn object, Object clazz, Object objectArray) {
        byte by2 = 1;
        objectArray = zzhbn.zza;
        int n3 = object.ordinal();
        objectArray = null;
        switch (n3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 6: {
                object = zzd;
                if (object != null) return object;
                clazz = zzbdv$zzd.class;
                synchronized (clazz) {
                    try {
                        object = zzd;
                        if (object != null) return object;
                        objectArray = zzc;
                        object = new zzhbj((zzhbo)objectArray);
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
                return new zzbdv$zzd$zzb(null);
            }
            case 3: {
                return new zzbdv$zzd();
            }
            case 2: {
                object = zzbdv$zzd$zza.zze();
                objectArray = new Object[4];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = object;
                objectArray[3] = "zzg";
                return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzal zzh() {
        zzbdv$zzal zzbdv$zzal = this.zzg;
        if (zzbdv$zzal == null) {
            zzbdv$zzal = zzbdv$zzal.zzf();
        }
        return zzbdv$zzal;
    }

    public boolean zzi() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }

    public boolean zzj() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

