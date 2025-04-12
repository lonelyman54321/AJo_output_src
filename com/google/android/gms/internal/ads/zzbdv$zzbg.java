/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzap;
import com.google.android.gms.internal.ads.zzbdv$zzaq;
import com.google.android.gms.internal.ads.zzbdv$zzaw;
import com.google.android.gms.internal.ads.zzbdv$zzax;
import com.google.android.gms.internal.ads.zzbdv$zzbg$zza;
import com.google.android.gms.internal.ads.zzbdv$zzbh;
import com.google.android.gms.internal.ads.zzbdv$zzq;
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

public final class zzbdv$zzbg
extends zzhbo
implements zzbdv$zzbh {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbdv$zzbg zzd;
    private static volatile zzhdm zze;
    private int zzf;
    private int zzg = 1000;
    private zzbdv$zzaw zzh;
    private zzbdv$zzap zzi;

    static {
        zzbdv$zzbg zzbdv$zzbg;
        zzd = zzbdv$zzbg = new zzbdv$zzbg();
        zzhbo.zzca(zzbdv$zzbg.class, zzbdv$zzbg);
    }

    private zzbdv$zzbg() {
    }

    public static /* synthetic */ void zzA(zzbdv$zzbg zzbdv$zzbg, zzbdv$zzaw zzbdv$zzaw) {
        zzbdv$zzbg.zzI(zzbdv$zzaw);
    }

    public static /* synthetic */ void zzB(zzbdv$zzbg zzbdv$zzbg) {
        zzbdv$zzbg.zzF();
    }

    public static /* synthetic */ void zzC(zzbdv$zzbg zzbdv$zzbg, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzbg.zzL(zzbdv$zzap);
    }

    public static /* synthetic */ void zzD(zzbdv$zzbg zzbdv$zzbg, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzbg.zzJ(zzbdv$zzap);
    }

    public static /* synthetic */ void zzE(zzbdv$zzbg zzbdv$zzbg) {
        zzbdv$zzbg.zzG();
    }

    private void zzF() {
        int n3;
        this.zzh = null;
        this.zzf = n3 = this.zzf & 0xFFFFFFFD;
    }

    private void zzG() {
        int n3;
        this.zzi = null;
        this.zzf = n3 = this.zzf & 0xFFFFFFFB;
    }

    private void zzH() {
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFE;
        this.zzg = 1000;
    }

    private void zzI(zzbdv$zzaw zzbdv$zzaw) {
        int n3;
        zzbdv$zzaw zzbdv$zzaw2;
        zzbdv$zzaw.getClass();
        zzbdv$zzax zzbdv$zzax = this.zzh;
        if (zzbdv$zzax != null && zzbdv$zzax != (zzbdv$zzaw2 = zzbdv$zzaw.zzg())) {
            zzbdv$zzax = zzbdv$zzaw.zze((zzbdv$zzaw)zzbdv$zzax);
            ((zzhbi)((Object)zzbdv$zzax)).zzbj(zzbdv$zzaw);
            zzbdv$zzaw = (zzbdv$zzaw)((zzhbi)((Object)zzbdv$zzax)).zzbo();
        }
        this.zzh = zzbdv$zzaw;
        this.zzf = n3 = this.zzf | 2;
    }

    private void zzJ(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap zzbdv$zzap2;
        zzbdv$zzap.getClass();
        zzbdv$zzaq zzbdv$zzaq = this.zzi;
        if (zzbdv$zzaq != null && zzbdv$zzaq != (zzbdv$zzap2 = zzbdv$zzap.zzf())) {
            zzbdv$zzaq = zzbdv$zzap.zzd((zzbdv$zzap)zzbdv$zzaq);
            ((zzhbi)((Object)zzbdv$zzaq)).zzbj(zzbdv$zzap);
            zzbdv$zzap = (zzbdv$zzap)((zzhbi)((Object)zzbdv$zzaq)).zzbo();
        }
        this.zzi = zzbdv$zzap;
        this.zzf = n3 = this.zzf | 4;
    }

    private void zzK(zzbdv$zzaw zzbdv$zzaw) {
        int n3;
        zzbdv$zzaw.getClass();
        this.zzh = zzbdv$zzaw;
        this.zzf = n3 = this.zzf | 2;
    }

    private void zzL(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap.getClass();
        this.zzi = zzbdv$zzap;
        this.zzf = n3 = this.zzf | 4;
    }

    private void zzM(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzg = n3 = zzbdv$zzq.zza();
        this.zzf = n3 = this.zzf | 1;
    }

    public static zzbdv$zzbg$zza zzd() {
        return (zzbdv$zzbg$zza)zzd.zzaZ();
    }

    public static zzbdv$zzbg$zza zze(zzbdv$zzbg zzbdv$zzbg) {
        return (zzbdv$zzbg$zza)zzd.zzba(zzbdv$zzbg);
    }

    public static /* synthetic */ zzbdv$zzbg zzf() {
        return zzd;
    }

    public static zzbdv$zzbg zzg() {
        return zzd;
    }

    public static zzbdv$zzbg zzh(InputStream inputStream) {
        return (zzbdv$zzbg)zzhbo.zzbk(zzd, inputStream);
    }

    public static zzbdv$zzbg zzi(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzbg)zzhbo.zzbl(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzbg zzj(zzhac zzhac2) {
        return (zzbdv$zzbg)zzhbo.zzbm(zzd, zzhac2);
    }

    public static zzbdv$zzbg zzk(zzham zzham2) {
        return (zzbdv$zzbg)zzhbo.zzbn(zzd, zzham2);
    }

    public static zzbdv$zzbg zzl(InputStream inputStream) {
        return (zzbdv$zzbg)zzhbo.zzbo(zzd, inputStream);
    }

    public static zzbdv$zzbg zzm(ByteBuffer byteBuffer) {
        return (zzbdv$zzbg)zzhbo.zzbp(zzd, byteBuffer);
    }

    public static zzbdv$zzbg zzq(byte[] byArray) {
        return (zzbdv$zzbg)zzhbo.zzbq(zzd, byArray);
    }

    public static zzbdv$zzbg zzr(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzbg)zzhbo.zzbr(zzd, zzhac2, zzhay2);
    }

    public static zzbdv$zzbg zzs(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzbg)zzhbo.zzbs(zzd, zzham2, zzhay2);
    }

    public static zzbdv$zzbg zzt(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzbg)zzhbo.zzbu(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzbg zzu(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzbg)zzhbo.zzbv(zzd, byteBuffer, zzhay2);
    }

    public static zzbdv$zzbg zzv(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzbg)zzhbo.zzbx(zzd, byArray, zzhay2);
    }

    public static zzhdm zzw() {
        return zzd.zzbM();
    }

    public static /* synthetic */ void zzx(zzbdv$zzbg zzbdv$zzbg, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzbg.zzM(zzbdv$zzq);
    }

    public static /* synthetic */ void zzy(zzbdv$zzbg zzbdv$zzbg) {
        zzbdv$zzbg.zzH();
    }

    public static /* synthetic */ void zzz(zzbdv$zzbg zzbdv$zzbg, zzbdv$zzaw zzbdv$zzaw) {
        zzbdv$zzbg.zzK(zzbdv$zzaw);
    }

    public zzbdv$zzq zza() {
        int n3 = this.zzg;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zzc;
        }
        return zzbdv$zzq;
    }

    public zzbdv$zzap zzb() {
        zzbdv$zzap zzbdv$zzap = this.zzi;
        if (zzbdv$zzap == null) {
            zzbdv$zzap = zzbdv$zzap.zzf();
        }
        return zzbdv$zzap;
    }

    public zzbdv$zzaw zzc() {
        zzbdv$zzaw zzbdv$zzaw = this.zzh;
        if (zzbdv$zzaw == null) {
            zzbdv$zzaw = zzbdv$zzaw.zzg();
        }
        return zzbdv$zzaw;
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
                clazz = zzbdv$zzbg.class;
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
                return new zzbdv$zzbg$zza(null);
            }
            case 3: {
                return new zzbdv$zzbg();
            }
            case 2: {
                object = zzbdv$zzq.zze();
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

    public boolean zzn() {
        int n3 = this.zzf & 2;
        return n3 != 0;
    }

    public boolean zzo() {
        int n3 = this.zzf & 4;
        return n3 != 0;
    }

    public boolean zzp() {
        int n3 = this.zzf;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

