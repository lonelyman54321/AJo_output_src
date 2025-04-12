/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzb$zza$zza;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzb;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzd;
import com.google.android.gms.internal.ads.zzbdv$zzb$zze;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzf;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzg;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzh;
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

public final class zzbdv$zzb$zza
extends zzhbo
implements zzbdv$zzb$zzb {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbdv$zzb$zza zzd;
    private static volatile zzhdm zze;
    private int zzf;
    private int zzg;
    private zzbdv$zzb$zze zzh;
    private zzbdv$zzb$zzg zzi;

    static {
        zzbdv$zzb$zza zzbdv$zzb$zza;
        zzd = zzbdv$zzb$zza = new zzbdv$zzb$zza();
        zzhbo.zzca(zzbdv$zzb$zza.class, zzbdv$zzb$zza);
    }

    private zzbdv$zzb$zza() {
    }

    public static /* synthetic */ void zzA(zzbdv$zzb$zza zzbdv$zzb$zza, zzbdv$zzb$zze zzbdv$zzb$zze) {
        zzbdv$zzb$zza.zzM(zzbdv$zzb$zze);
    }

    public static /* synthetic */ void zzB(zzbdv$zzb$zza zzbdv$zzb$zza, zzbdv$zzb$zze zzbdv$zzb$zze) {
        zzbdv$zzb$zza.zzJ(zzbdv$zzb$zze);
    }

    public static /* synthetic */ void zzC(zzbdv$zzb$zza zzbdv$zzb$zza) {
        zzbdv$zzb$zza.zzH();
    }

    public static /* synthetic */ void zzD(zzbdv$zzb$zza zzbdv$zzb$zza, zzbdv$zzb$zzg zzbdv$zzb$zzg) {
        zzbdv$zzb$zza.zzN(zzbdv$zzb$zzg);
    }

    public static /* synthetic */ void zzE(zzbdv$zzb$zza zzbdv$zzb$zza, zzbdv$zzb$zzg zzbdv$zzb$zzg) {
        zzbdv$zzb$zza.zzK(zzbdv$zzb$zzg);
    }

    public static /* synthetic */ void zzF(zzbdv$zzb$zza zzbdv$zzb$zza) {
        zzbdv$zzb$zza.zzI();
    }

    private void zzG() {
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFE;
        this.zzg = 0;
    }

    private void zzH() {
        int n3;
        this.zzh = null;
        this.zzf = n3 = this.zzf & 0xFFFFFFFD;
    }

    private void zzI() {
        int n3;
        this.zzi = null;
        this.zzf = n3 = this.zzf & 0xFFFFFFFB;
    }

    private void zzJ(zzbdv$zzb$zze zzbdv$zzb$zze) {
        int n3;
        zzbdv$zzb$zze zzbdv$zzb$zze2;
        zzbdv$zzb$zze.getClass();
        zzbdv$zzb$zzf zzbdv$zzb$zzf = this.zzh;
        if (zzbdv$zzb$zzf != null && zzbdv$zzb$zzf != (zzbdv$zzb$zze2 = zzbdv$zzb$zze.zzi())) {
            zzbdv$zzb$zzf = zzbdv$zzb$zze.zzd((zzbdv$zzb$zze)zzbdv$zzb$zzf);
            ((zzhbi)((Object)zzbdv$zzb$zzf)).zzbj(zzbdv$zzb$zze);
            zzbdv$zzb$zze = (zzbdv$zzb$zze)((zzhbi)((Object)zzbdv$zzb$zzf)).zzbo();
        }
        this.zzh = zzbdv$zzb$zze;
        this.zzf = n3 = this.zzf | 2;
    }

    private void zzK(zzbdv$zzb$zzg zzbdv$zzb$zzg) {
        int n3;
        zzbdv$zzb$zzg zzbdv$zzb$zzg2;
        zzbdv$zzb$zzg.getClass();
        zzbdv$zzb$zzh zzbdv$zzb$zzh = this.zzi;
        if (zzbdv$zzb$zzh != null && zzbdv$zzb$zzh != (zzbdv$zzb$zzg2 = zzbdv$zzb$zzg.zzf())) {
            zzbdv$zzb$zzh = zzbdv$zzb$zzg.zzd((zzbdv$zzb$zzg)zzbdv$zzb$zzh);
            ((zzhbi)((Object)zzbdv$zzb$zzh)).zzbj(zzbdv$zzb$zzg);
            zzbdv$zzb$zzg = (zzbdv$zzb$zzg)((zzhbi)((Object)zzbdv$zzb$zzh)).zzbo();
        }
        this.zzi = zzbdv$zzb$zzg;
        this.zzf = n3 = this.zzf | 4;
    }

    private void zzL(zzbdv$zzb$zzd zzbdv$zzb$zzd) {
        int n3;
        this.zzg = n3 = zzbdv$zzb$zzd.zza();
        this.zzf = n3 = this.zzf | 1;
    }

    private void zzM(zzbdv$zzb$zze zzbdv$zzb$zze) {
        int n3;
        zzbdv$zzb$zze.getClass();
        this.zzh = zzbdv$zzb$zze;
        this.zzf = n3 = this.zzf | 2;
    }

    private void zzN(zzbdv$zzb$zzg zzbdv$zzb$zzg) {
        int n3;
        zzbdv$zzb$zzg.getClass();
        this.zzi = zzbdv$zzb$zzg;
        this.zzf = n3 = this.zzf | 4;
    }

    public static zzbdv$zzb$zza$zza zza() {
        return (zzbdv$zzb$zza$zza)zzd.zzaZ();
    }

    public static zzbdv$zzb$zza$zza zzc(zzbdv$zzb$zza zzbdv$zzb$zza) {
        return (zzbdv$zzb$zza$zza)zzd.zzba(zzbdv$zzb$zza);
    }

    public static /* synthetic */ zzbdv$zzb$zza zzd() {
        return zzd;
    }

    public static zzbdv$zzb$zza zze() {
        return zzd;
    }

    public static zzbdv$zzb$zza zzf(InputStream inputStream) {
        return (zzbdv$zzb$zza)zzhbo.zzbk(zzd, inputStream);
    }

    public static zzbdv$zzb$zza zzg(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzb$zza)zzhbo.zzbl(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzb$zza zzh(zzhac zzhac2) {
        return (zzbdv$zzb$zza)zzhbo.zzbm(zzd, zzhac2);
    }

    public static zzbdv$zzb$zza zzi(zzham zzham2) {
        return (zzbdv$zzb$zza)zzhbo.zzbn(zzd, zzham2);
    }

    public static zzbdv$zzb$zza zzj(InputStream inputStream) {
        return (zzbdv$zzb$zza)zzhbo.zzbo(zzd, inputStream);
    }

    public static zzbdv$zzb$zza zzq(ByteBuffer byteBuffer) {
        return (zzbdv$zzb$zza)zzhbo.zzbp(zzd, byteBuffer);
    }

    public static zzbdv$zzb$zza zzr(byte[] byArray) {
        return (zzbdv$zzb$zza)zzhbo.zzbq(zzd, byArray);
    }

    public static zzbdv$zzb$zza zzs(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzb$zza)zzhbo.zzbr(zzd, zzhac2, zzhay2);
    }

    public static zzbdv$zzb$zza zzt(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzb$zza)zzhbo.zzbs(zzd, zzham2, zzhay2);
    }

    public static zzbdv$zzb$zza zzu(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzb$zza)zzhbo.zzbu(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzb$zza zzv(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzb$zza)zzhbo.zzbv(zzd, byteBuffer, zzhay2);
    }

    public static zzbdv$zzb$zza zzw(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzb$zza)zzhbo.zzbx(zzd, byArray, zzhay2);
    }

    public static zzhdm zzx() {
        return zzd.zzbM();
    }

    public static /* synthetic */ void zzy(zzbdv$zzb$zza zzbdv$zzb$zza, zzbdv$zzb$zzd zzbdv$zzb$zzd) {
        zzbdv$zzb$zza.zzL(zzbdv$zzb$zzd);
    }

    public static /* synthetic */ void zzz(zzbdv$zzb$zza zzbdv$zzb$zza) {
        zzbdv$zzb$zza.zzG();
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
                object = zze;
                if (object != null) return object;
                clazz = zzbdv$zzb$zza.class;
                synchronized (clazz) {
                    try {
                        object = zze;
                        if (object != null) return object;
                        objectArray = zzd;
                        object = new zzhbj((zzhbo)objectArray);
                        zze = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzd;
            }
            case 4: {
                return new zzbdv$zzb$zza$zza(null);
            }
            case 3: {
                return new zzbdv$zzb$zza();
            }
            case 2: {
                object = zzbdv$zzb$zzd.zze();
                objectArray = new Object[5];
                objectArray[0] = "zzf";
                objectArray[by2] = "zzg";
                objectArray[2] = object;
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0003\u1009\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzb$zzd zzk() {
        int n3 = this.zzg;
        zzbdv$zzb$zzd zzbdv$zzb$zzd = zzbdv$zzb$zzd.zzb(n3);
        if (zzbdv$zzb$zzd == null) {
            zzbdv$zzb$zzd = zzbdv$zzb$zzd.zza;
        }
        return zzbdv$zzb$zzd;
    }

    public zzbdv$zzb$zze zzl() {
        zzbdv$zzb$zze zzbdv$zzb$zze = this.zzh;
        if (zzbdv$zzb$zze == null) {
            zzbdv$zzb$zze = zzbdv$zzb$zze.zzi();
        }
        return zzbdv$zzb$zze;
    }

    public zzbdv$zzb$zzg zzm() {
        zzbdv$zzb$zzg zzbdv$zzb$zzg = this.zzi;
        if (zzbdv$zzb$zzg == null) {
            zzbdv$zzb$zzg = zzbdv$zzb$zzg.zzf();
        }
        return zzbdv$zzb$zzg;
    }

    public boolean zzn() {
        int n3 = this.zzf;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzo() {
        int n3 = this.zzf & 2;
        return n3 != 0;
    }

    public boolean zzp() {
        int n3 = this.zzf & 4;
        return n3 != 0;
    }
}

