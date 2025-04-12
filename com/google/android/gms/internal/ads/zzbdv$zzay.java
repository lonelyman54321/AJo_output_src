/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzap;
import com.google.android.gms.internal.ads.zzbdv$zzaq;
import com.google.android.gms.internal.ads.zzbdv$zzar;
import com.google.android.gms.internal.ads.zzbdv$zzas;
import com.google.android.gms.internal.ads.zzbdv$zzaw;
import com.google.android.gms.internal.ads.zzbdv$zzax;
import com.google.android.gms.internal.ads.zzbdv$zzay$zza;
import com.google.android.gms.internal.ads.zzbdv$zzaz;
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

public final class zzbdv$zzay
extends zzhbo
implements zzbdv$zzaz {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final zzbdv$zzay zze;
    private static volatile zzhdm zzf;
    private int zzg;
    private zzbdv$zzar zzh;
    private int zzi = 1000;
    private zzbdv$zzaw zzj;
    private zzbdv$zzap zzk;

    static {
        zzbdv$zzay zzbdv$zzay;
        zze = zzbdv$zzay = new zzbdv$zzay();
        zzhbo.zzca(zzbdv$zzay.class, zzbdv$zzay);
    }

    private zzbdv$zzay() {
    }

    public static /* synthetic */ void zzA(zzbdv$zzay zzbdv$zzay, zzbdv$zzar zzbdv$zzar) {
        zzbdv$zzay.zzQ(zzbdv$zzar);
    }

    public static /* synthetic */ void zzB(zzbdv$zzay zzbdv$zzay) {
        zzbdv$zzay.zzN();
    }

    public static /* synthetic */ void zzC(zzbdv$zzay zzbdv$zzay, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzay.zzT(zzbdv$zzq);
    }

    public static /* synthetic */ void zzD(zzbdv$zzay zzbdv$zzay) {
        zzbdv$zzay.zzM();
    }

    public static /* synthetic */ void zzE(zzbdv$zzay zzbdv$zzay, zzbdv$zzaw zzbdv$zzaw) {
        zzbdv$zzay.zzR(zzbdv$zzaw);
    }

    public static /* synthetic */ void zzF(zzbdv$zzay zzbdv$zzay, zzbdv$zzaw zzbdv$zzaw) {
        zzbdv$zzay.zzO(zzbdv$zzaw);
    }

    public static /* synthetic */ void zzG(zzbdv$zzay zzbdv$zzay) {
        zzbdv$zzay.zzK();
    }

    public static /* synthetic */ void zzH(zzbdv$zzay zzbdv$zzay, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzay.zzS(zzbdv$zzap);
    }

    public static /* synthetic */ void zzI(zzbdv$zzay zzbdv$zzay, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzay.zzP(zzbdv$zzap);
    }

    public static /* synthetic */ void zzJ(zzbdv$zzay zzbdv$zzay) {
        zzbdv$zzay.zzL();
    }

    private void zzK() {
        int n3;
        this.zzj = null;
        this.zzg = n3 = this.zzg & 0xFFFFFFFB;
    }

    private void zzL() {
        int n3;
        this.zzk = null;
        this.zzg = n3 = this.zzg & 0xFFFFFFF7;
    }

    private void zzM() {
        int n3;
        this.zzg = n3 = this.zzg & 0xFFFFFFFD;
        this.zzi = 1000;
    }

    private void zzN() {
        int n3;
        this.zzh = null;
        this.zzg = n3 = this.zzg & 0xFFFFFFFE;
    }

    private void zzO(zzbdv$zzaw zzbdv$zzaw) {
        int n3;
        zzbdv$zzaw zzbdv$zzaw2;
        zzbdv$zzaw.getClass();
        zzbdv$zzax zzbdv$zzax = this.zzj;
        if (zzbdv$zzax != null && zzbdv$zzax != (zzbdv$zzaw2 = zzbdv$zzaw.zzg())) {
            zzbdv$zzax = zzbdv$zzaw.zze((zzbdv$zzaw)zzbdv$zzax);
            ((zzhbi)((Object)zzbdv$zzax)).zzbj(zzbdv$zzaw);
            zzbdv$zzaw = (zzbdv$zzaw)((zzhbi)((Object)zzbdv$zzax)).zzbo();
        }
        this.zzj = zzbdv$zzaw;
        this.zzg = n3 = this.zzg | 4;
    }

    private void zzP(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap zzbdv$zzap2;
        zzbdv$zzap.getClass();
        zzbdv$zzaq zzbdv$zzaq = this.zzk;
        if (zzbdv$zzaq != null && zzbdv$zzaq != (zzbdv$zzap2 = zzbdv$zzap.zzf())) {
            zzbdv$zzaq = zzbdv$zzap.zzd((zzbdv$zzap)zzbdv$zzaq);
            ((zzhbi)((Object)zzbdv$zzaq)).zzbj(zzbdv$zzap);
            zzbdv$zzap = (zzbdv$zzap)((zzhbi)((Object)zzbdv$zzaq)).zzbo();
        }
        this.zzk = zzbdv$zzap;
        this.zzg = n3 = this.zzg | 8;
    }

    private void zzQ(zzbdv$zzar zzbdv$zzar) {
        int n3;
        zzbdv$zzar zzbdv$zzar2;
        zzbdv$zzar.getClass();
        zzbdv$zzas zzbdv$zzas = this.zzh;
        if (zzbdv$zzas != null && zzbdv$zzas != (zzbdv$zzar2 = zzbdv$zzar.zzg())) {
            zzbdv$zzas = zzbdv$zzar.zze((zzbdv$zzar)zzbdv$zzas);
            ((zzhbi)((Object)zzbdv$zzas)).zzbj(zzbdv$zzar);
            zzbdv$zzar = (zzbdv$zzar)((zzhbi)((Object)zzbdv$zzas)).zzbo();
        }
        this.zzh = zzbdv$zzar;
        this.zzg = n3 = this.zzg | 1;
    }

    private void zzR(zzbdv$zzaw zzbdv$zzaw) {
        int n3;
        zzbdv$zzaw.getClass();
        this.zzj = zzbdv$zzaw;
        this.zzg = n3 = this.zzg | 4;
    }

    private void zzS(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap.getClass();
        this.zzk = zzbdv$zzap;
        this.zzg = n3 = this.zzg | 8;
    }

    private void zzT(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzi = n3 = zzbdv$zzq.zza();
        this.zzg = n3 = this.zzg | 2;
    }

    private void zzU(zzbdv$zzar zzbdv$zzar) {
        int n3;
        zzbdv$zzar.getClass();
        this.zzh = zzbdv$zzar;
        this.zzg = n3 = this.zzg | 1;
    }

    public static zzbdv$zzay$zza zze() {
        return (zzbdv$zzay$zza)zze.zzaZ();
    }

    public static zzbdv$zzay$zza zzf(zzbdv$zzay zzbdv$zzay) {
        return (zzbdv$zzay$zza)zze.zzba(zzbdv$zzay);
    }

    public static /* synthetic */ zzbdv$zzay zzg() {
        return zze;
    }

    public static zzbdv$zzay zzh() {
        return zze;
    }

    public static zzbdv$zzay zzi(InputStream inputStream) {
        return (zzbdv$zzay)zzhbo.zzbk(zze, inputStream);
    }

    public static zzbdv$zzay zzj(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzay)zzhbo.zzbl(zze, inputStream, zzhay2);
    }

    public static zzbdv$zzay zzk(zzhac zzhac2) {
        return (zzbdv$zzay)zzhbo.zzbm(zze, zzhac2);
    }

    public static zzbdv$zzay zzl(zzham zzham2) {
        return (zzbdv$zzay)zzhbo.zzbn(zze, zzham2);
    }

    public static zzbdv$zzay zzm(InputStream inputStream) {
        return (zzbdv$zzay)zzhbo.zzbo(zze, inputStream);
    }

    public static zzbdv$zzay zzn(ByteBuffer byteBuffer) {
        return (zzbdv$zzay)zzhbo.zzbp(zze, byteBuffer);
    }

    public static zzbdv$zzay zzo(byte[] byArray) {
        return (zzbdv$zzay)zzhbo.zzbq(zze, byArray);
    }

    public static zzbdv$zzay zzp(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzay)zzhbo.zzbr(zze, zzhac2, zzhay2);
    }

    public static zzbdv$zzay zzq(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzay)zzhbo.zzbs(zze, zzham2, zzhay2);
    }

    public static zzbdv$zzay zzr(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzay)zzhbo.zzbu(zze, inputStream, zzhay2);
    }

    public static zzbdv$zzay zzw(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzay)zzhbo.zzbv(zze, byteBuffer, zzhay2);
    }

    public static zzbdv$zzay zzx(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzay)zzhbo.zzbx(zze, byArray, zzhay2);
    }

    public static zzhdm zzy() {
        return zze.zzbM();
    }

    public static /* synthetic */ void zzz(zzbdv$zzay zzbdv$zzay, zzbdv$zzar zzbdv$zzar) {
        zzbdv$zzay.zzU(zzbdv$zzar);
    }

    public zzbdv$zzq zza() {
        int n3 = this.zzi;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zzc;
        }
        return zzbdv$zzq;
    }

    public zzbdv$zzap zzb() {
        zzbdv$zzap zzbdv$zzap = this.zzk;
        if (zzbdv$zzap == null) {
            zzbdv$zzap = zzbdv$zzap.zzf();
        }
        return zzbdv$zzap;
    }

    public zzbdv$zzar zzc() {
        zzbdv$zzar zzbdv$zzar = this.zzh;
        if (zzbdv$zzar == null) {
            zzbdv$zzar = zzbdv$zzar.zzg();
        }
        return zzbdv$zzar;
    }

    public zzbdv$zzaw zzd() {
        zzbdv$zzaw zzbdv$zzaw = this.zzj;
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
                object = zzf;
                if (object != null) return object;
                clazz = zzbdv$zzay.class;
                synchronized (clazz) {
                    try {
                        object = zzf;
                        if (object != null) return object;
                        objectArray = zze;
                        object = new zzhbj((zzhbo)objectArray);
                        zzf = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zze;
            }
            case 4: {
                return new zzbdv$zzay$zza(null);
            }
            case 3: {
                return new zzbdv$zzay();
            }
            case 2: {
                object = zzbdv$zzq.zze();
                objectArray = new Object[6];
                objectArray[0] = "zzg";
                objectArray[by2] = "zzh";
                objectArray[2] = "zzi";
                objectArray[3] = object;
                objectArray[4] = "zzj";
                objectArray[5] = "zzk";
                return zzhbo.zzbR(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u180c\u0001\u0003\u1009\u0002\u0004\u1009\u0003", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public boolean zzs() {
        int n3 = this.zzg & 4;
        return n3 != 0;
    }

    public boolean zzt() {
        int n3 = this.zzg & 8;
        return n3 != 0;
    }

    public boolean zzu() {
        int n3 = this.zzg & 2;
        return n3 != 0;
    }

    public boolean zzv() {
        int n3 = this.zzg;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

