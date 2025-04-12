/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzaa;
import com.google.android.gms.internal.ads.zzbdv$zzan;
import com.google.android.gms.internal.ads.zzbdv$zzao;
import com.google.android.gms.internal.ads.zzbdv$zzap;
import com.google.android.gms.internal.ads.zzbdv$zzaq;
import com.google.android.gms.internal.ads.zzbdv$zzq;
import com.google.android.gms.internal.ads.zzbdv$zzv;
import com.google.android.gms.internal.ads.zzbdv$zzw;
import com.google.android.gms.internal.ads.zzbdv$zzz$zza;
import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbdv$zzz
extends zzhbo
implements zzbdv$zzaa {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final zzbdv$zzz zze;
    private static volatile zzhdm zzf;
    private int zzg;
    private zzbdv$zzv zzh;
    private zzhca zzi;
    private int zzj;
    private zzbdv$zzap zzk;

    static {
        zzbdv$zzz zzbdv$zzz;
        zze = zzbdv$zzz = new zzbdv$zzz();
        zzhbo.zzca(zzbdv$zzz.class, zzbdv$zzz);
    }

    private zzbdv$zzz() {
        zzhca zzhca2;
        this.zzi = zzhca2 = zzhbo.zzbK();
    }

    public static /* synthetic */ void zzC(zzbdv$zzz zzbdv$zzz, zzbdv$zzv zzbdv$zzv) {
        zzbdv$zzz.zzab(zzbdv$zzv);
    }

    public static /* synthetic */ void zzD(zzbdv$zzz zzbdv$zzz, zzbdv$zzv zzbdv$zzv) {
        zzbdv$zzz.zzY(zzbdv$zzv);
    }

    public static /* synthetic */ void zzE(zzbdv$zzz zzbdv$zzz) {
        zzbdv$zzz.zzT();
    }

    public static /* synthetic */ void zzF(zzbdv$zzz zzbdv$zzz, int n3, zzbdv$zzan zzbdv$zzan) {
        zzbdv$zzz.zzae(n3, zzbdv$zzan);
    }

    public static /* synthetic */ void zzG(zzbdv$zzz zzbdv$zzz, zzbdv$zzan zzbdv$zzan) {
        zzbdv$zzz.zzR(zzbdv$zzan);
    }

    public static /* synthetic */ void zzH(zzbdv$zzz zzbdv$zzz, int n3, zzbdv$zzan zzbdv$zzan) {
        zzbdv$zzz.zzS(n3, zzbdv$zzan);
    }

    public static /* synthetic */ void zzI(zzbdv$zzz zzbdv$zzz, Iterable iterable) {
        zzbdv$zzz.zzQ(iterable);
    }

    public static /* synthetic */ void zzJ(zzbdv$zzz zzbdv$zzz) {
        zzbdv$zzz.zzW();
    }

    public static /* synthetic */ void zzK(zzbdv$zzz zzbdv$zzz, int n3) {
        zzbdv$zzz.zzaa(n3);
    }

    public static /* synthetic */ void zzL(zzbdv$zzz zzbdv$zzz, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzz.zzad(zzbdv$zzq);
    }

    public static /* synthetic */ void zzM(zzbdv$zzz zzbdv$zzz) {
        zzbdv$zzz.zzV();
    }

    public static /* synthetic */ void zzN(zzbdv$zzz zzbdv$zzz, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzz.zzac(zzbdv$zzap);
    }

    public static /* synthetic */ void zzO(zzbdv$zzz zzbdv$zzz, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzz.zzZ(zzbdv$zzap);
    }

    public static /* synthetic */ void zzP(zzbdv$zzz zzbdv$zzz) {
        zzbdv$zzz.zzU();
    }

    private void zzQ(Iterable iterable) {
        this.zzX();
        zzhca zzhca2 = this.zzi;
        zzgzi.zzaQ(iterable, zzhca2);
    }

    private void zzR(zzbdv$zzan zzbdv$zzan) {
        zzbdv$zzan.getClass();
        this.zzX();
        this.zzi.add(zzbdv$zzan);
    }

    private void zzS(int n3, zzbdv$zzan zzbdv$zzan) {
        zzbdv$zzan.getClass();
        this.zzX();
        this.zzi.add(n3, zzbdv$zzan);
    }

    private void zzT() {
        int n3;
        this.zzh = null;
        this.zzg = n3 = this.zzg & 0xFFFFFFFE;
    }

    private void zzU() {
        int n3;
        this.zzk = null;
        this.zzg = n3 = this.zzg & 0xFFFFFFFB;
    }

    private void zzV() {
        int n3;
        this.zzg = n3 = this.zzg & 0xFFFFFFFD;
        this.zzj = 0;
    }

    private void zzW() {
        zzhca zzhca2;
        this.zzi = zzhca2 = zzhbo.zzbK();
    }

    private void zzX() {
        zzhca zzhca2 = this.zzi;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            this.zzi = zzhca2 = zzhbo.zzbL(zzhca2);
        }
    }

    private void zzY(zzbdv$zzv zzbdv$zzv) {
        int n3;
        zzbdv$zzv zzbdv$zzv2;
        zzbdv$zzv.getClass();
        zzbdv$zzw zzbdv$zzw = this.zzh;
        if (zzbdv$zzw != null && zzbdv$zzw != (zzbdv$zzv2 = zzbdv$zzv.zzg())) {
            zzbdv$zzw = zzbdv$zzv.zze((zzbdv$zzv)zzbdv$zzw);
            ((zzhbi)((Object)zzbdv$zzw)).zzbj(zzbdv$zzv);
            zzbdv$zzv = (zzbdv$zzv)((zzhbi)((Object)zzbdv$zzw)).zzbo();
        }
        this.zzh = zzbdv$zzv;
        this.zzg = n3 = this.zzg | 1;
    }

    private void zzZ(zzbdv$zzap zzbdv$zzap) {
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
        this.zzg = n3 = this.zzg | 4;
    }

    private void zzaa(int n3) {
        this.zzX();
        this.zzi.remove(n3);
    }

    private void zzab(zzbdv$zzv zzbdv$zzv) {
        int n3;
        zzbdv$zzv.getClass();
        this.zzh = zzbdv$zzv;
        this.zzg = n3 = this.zzg | 1;
    }

    private void zzac(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap.getClass();
        this.zzk = zzbdv$zzap;
        this.zzg = n3 = this.zzg | 4;
    }

    private void zzad(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzj = n3 = zzbdv$zzq.zza();
        this.zzg = n3 = this.zzg | 2;
    }

    private void zzae(int n3, zzbdv$zzan zzbdv$zzan) {
        zzbdv$zzan.getClass();
        this.zzX();
        this.zzi.set(n3, zzbdv$zzan);
    }

    public static zzbdv$zzz$zza zzd() {
        return (zzbdv$zzz$zza)zze.zzaZ();
    }

    public static zzbdv$zzz$zza zze(zzbdv$zzz zzbdv$zzz) {
        return (zzbdv$zzz$zza)zze.zzba(zzbdv$zzz);
    }

    public static /* synthetic */ zzbdv$zzz zzf() {
        return zze;
    }

    public static zzbdv$zzz zzg() {
        return zze;
    }

    public static zzbdv$zzz zzh(InputStream inputStream) {
        return (zzbdv$zzz)zzhbo.zzbk(zze, inputStream);
    }

    public static zzbdv$zzz zzi(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzz)zzhbo.zzbl(zze, inputStream, zzhay2);
    }

    public static zzbdv$zzz zzj(zzhac zzhac2) {
        return (zzbdv$zzz)zzhbo.zzbm(zze, zzhac2);
    }

    public static zzbdv$zzz zzk(zzham zzham2) {
        return (zzbdv$zzz)zzhbo.zzbn(zze, zzham2);
    }

    public static zzbdv$zzz zzl(InputStream inputStream) {
        return (zzbdv$zzz)zzhbo.zzbo(zze, inputStream);
    }

    public static zzbdv$zzz zzm(ByteBuffer byteBuffer) {
        return (zzbdv$zzz)zzhbo.zzbp(zze, byteBuffer);
    }

    public static zzbdv$zzz zzn(byte[] byArray) {
        return (zzbdv$zzz)zzhbo.zzbq(zze, byArray);
    }

    public static zzbdv$zzz zzo(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzz)zzhbo.zzbr(zze, zzhac2, zzhay2);
    }

    public static zzbdv$zzz zzp(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzz)zzhbo.zzbs(zze, zzham2, zzhay2);
    }

    public static zzbdv$zzz zzq(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzz)zzhbo.zzbu(zze, inputStream, zzhay2);
    }

    public static zzbdv$zzz zzr(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzz)zzhbo.zzbv(zze, byteBuffer, zzhay2);
    }

    public static zzbdv$zzz zzs(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzz)zzhbo.zzbx(zze, byArray, zzhay2);
    }

    public static zzhdm zzu() {
        return zze.zzbM();
    }

    public boolean zzA() {
        int n3 = this.zzg & 4;
        return n3 != 0;
    }

    public boolean zzB() {
        int n3 = this.zzg & 2;
        return n3 != 0;
    }

    public int zza() {
        return this.zzi.size();
    }

    public zzbdv$zzq zzb() {
        int n3 = this.zzj;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zza;
        }
        return zzbdv$zzq;
    }

    public zzbdv$zzv zzc() {
        zzbdv$zzv zzbdv$zzv = this.zzh;
        if (zzbdv$zzv == null) {
            zzbdv$zzv = zzbdv$zzv.zzg();
        }
        return zzbdv$zzv;
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
                clazz = zzbdv$zzz.class;
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
                return new zzbdv$zzz$zza(null);
            }
            case 3: {
                return new zzbdv$zzz();
            }
            case 2: {
                object = zzbdv$zzq.zze();
                objectArray = new Object[7];
                objectArray[0] = "zzg";
                objectArray[by2] = "zzh";
                objectArray[2] = "zzi";
                objectArray[3] = zzbdv$zzan.class;
                objectArray[4] = "zzj";
                objectArray[5] = object;
                objectArray[6] = "zzk";
                return zzhbo.zzbR(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u180c\u0001\u0004\u1009\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzao zzt(int n3) {
        return (zzbdv$zzao)this.zzi.get(n3);
    }

    public List zzv() {
        return this.zzi;
    }

    public zzbdv$zzan zzw(int n3) {
        return (zzbdv$zzan)this.zzi.get(n3);
    }

    public zzbdv$zzap zzx() {
        zzbdv$zzap zzbdv$zzap = this.zzk;
        if (zzbdv$zzap == null) {
            zzbdv$zzap = zzbdv$zzap.zzf();
        }
        return zzbdv$zzap;
    }

    public List zzy() {
        return this.zzi;
    }

    public boolean zzz() {
        int n3 = this.zzg;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

