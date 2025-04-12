/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzap;
import com.google.android.gms.internal.ads.zzbdv$zzaq;
import com.google.android.gms.internal.ads.zzbdv$zzk$zza;
import com.google.android.gms.internal.ads.zzbdv$zzl;
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

public final class zzbdv$zzk
extends zzhbo
implements zzbdv$zzl {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final zzbdv$zzk zzg;
    private static volatile zzhdm zzh;
    private int zzi;
    private int zzj;
    private zzbdv$zzap zzk;
    private zzbdv$zzap zzl;
    private zzbdv$zzap zzm;
    private zzhca zzn;
    private int zzo;

    static {
        zzbdv$zzk zzbdv$zzk;
        zzg = zzbdv$zzk = new zzbdv$zzk();
        zzhbo.zzca(zzbdv$zzk.class, zzbdv$zzk);
    }

    private zzbdv$zzk() {
        zzhca zzhca2;
        this.zzn = zzhca2 = zzhbo.zzbK();
    }

    public static /* synthetic */ void zzA(zzbdv$zzk zzbdv$zzk) {
        zzbdv$zzk.zzae();
    }

    public static /* synthetic */ void zzB(zzbdv$zzk zzbdv$zzk, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzk.zzao(zzbdv$zzap);
    }

    public static /* synthetic */ void zzM(zzbdv$zzk zzbdv$zzk, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzk.zzaj(zzbdv$zzap);
    }

    public static /* synthetic */ void zzN(zzbdv$zzk zzbdv$zzk) {
        zzbdv$zzk.zzad();
    }

    public static /* synthetic */ void zzO(zzbdv$zzk zzbdv$zzk, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzk.zzar(zzbdv$zzap);
    }

    public static /* synthetic */ void zzP(zzbdv$zzk zzbdv$zzk, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzk.zzal(zzbdv$zzap);
    }

    public static /* synthetic */ void zzQ(zzbdv$zzk zzbdv$zzk) {
        zzbdv$zzk.zzag();
    }

    public static /* synthetic */ void zzR(zzbdv$zzk zzbdv$zzk, int n3, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzk.zzaq(n3, zzbdv$zzap);
    }

    public static /* synthetic */ void zzS(zzbdv$zzk zzbdv$zzk, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzk.zzZ(zzbdv$zzap);
    }

    public static /* synthetic */ void zzT(zzbdv$zzk zzbdv$zzk, int n3, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzk.zzaa(n3, zzbdv$zzap);
    }

    public static /* synthetic */ void zzU(zzbdv$zzk zzbdv$zzk, Iterable iterable) {
        zzbdv$zzk.zzab(iterable);
    }

    public static /* synthetic */ void zzV(zzbdv$zzk zzbdv$zzk) {
        zzbdv$zzk.zzaf();
    }

    public static /* synthetic */ void zzW(zzbdv$zzk zzbdv$zzk, int n3) {
        zzbdv$zzk.zzam(n3);
    }

    public static /* synthetic */ void zzX(zzbdv$zzk zzbdv$zzk, int n3) {
        zzbdv$zzk.zzas(n3);
    }

    public static /* synthetic */ void zzY(zzbdv$zzk zzbdv$zzk) {
        zzbdv$zzk.zzah();
    }

    private void zzZ(zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzap.getClass();
        this.zzai();
        this.zzn.add(zzbdv$zzap);
    }

    private void zzaa(int n3, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzap.getClass();
        this.zzai();
        this.zzn.add(n3, zzbdv$zzap);
    }

    private void zzab(Iterable iterable) {
        this.zzai();
        zzhca zzhca2 = this.zzn;
        zzgzi.zzaQ(iterable, zzhca2);
    }

    private void zzac() {
        int n3;
        this.zzi = n3 = this.zzi & 0xFFFFFFFE;
        this.zzj = 0;
    }

    private void zzad() {
        int n3;
        this.zzl = null;
        this.zzi = n3 = this.zzi & 0xFFFFFFFB;
    }

    private void zzae() {
        int n3;
        this.zzk = null;
        this.zzi = n3 = this.zzi & 0xFFFFFFFD;
    }

    private void zzaf() {
        zzhca zzhca2;
        this.zzn = zzhca2 = zzhbo.zzbK();
    }

    private void zzag() {
        int n3;
        this.zzm = null;
        this.zzi = n3 = this.zzi & 0xFFFFFFF7;
    }

    private void zzah() {
        int n3;
        this.zzi = n3 = this.zzi & 0xFFFFFFEF;
        this.zzo = 0;
    }

    private void zzai() {
        zzhca zzhca2 = this.zzn;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            this.zzn = zzhca2 = zzhbo.zzbL(zzhca2);
        }
    }

    private void zzaj(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap zzbdv$zzap2;
        zzbdv$zzap.getClass();
        zzbdv$zzaq zzbdv$zzaq = this.zzl;
        if (zzbdv$zzaq != null && zzbdv$zzaq != (zzbdv$zzap2 = zzbdv$zzap.zzf())) {
            zzbdv$zzaq = zzbdv$zzap.zzd((zzbdv$zzap)zzbdv$zzaq);
            ((zzhbi)((Object)zzbdv$zzaq)).zzbj(zzbdv$zzap);
            zzbdv$zzap = (zzbdv$zzap)((zzhbi)((Object)zzbdv$zzaq)).zzbo();
        }
        this.zzl = zzbdv$zzap;
        this.zzi = n3 = this.zzi | 4;
    }

    private void zzak(zzbdv$zzap zzbdv$zzap) {
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
        this.zzi = n3 = this.zzi | 2;
    }

    private void zzal(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap zzbdv$zzap2;
        zzbdv$zzap.getClass();
        zzbdv$zzaq zzbdv$zzaq = this.zzm;
        if (zzbdv$zzaq != null && zzbdv$zzaq != (zzbdv$zzap2 = zzbdv$zzap.zzf())) {
            zzbdv$zzaq = zzbdv$zzap.zzd((zzbdv$zzap)zzbdv$zzaq);
            ((zzhbi)((Object)zzbdv$zzaq)).zzbj(zzbdv$zzap);
            zzbdv$zzap = (zzbdv$zzap)((zzhbi)((Object)zzbdv$zzaq)).zzbo();
        }
        this.zzm = zzbdv$zzap;
        this.zzi = n3 = this.zzi | 8;
    }

    private void zzam(int n3) {
        this.zzai();
        this.zzn.remove(n3);
    }

    private void zzan(int n3) {
        int n4;
        this.zzi = n4 = this.zzi | 1;
        this.zzj = n3;
    }

    private void zzao(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap.getClass();
        this.zzl = zzbdv$zzap;
        this.zzi = n3 = this.zzi | 4;
    }

    private void zzap(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap.getClass();
        this.zzk = zzbdv$zzap;
        this.zzi = n3 = this.zzi | 2;
    }

    private void zzaq(int n3, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzap.getClass();
        this.zzai();
        this.zzn.set(n3, zzbdv$zzap);
    }

    private void zzar(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap.getClass();
        this.zzm = zzbdv$zzap;
        this.zzi = n3 = this.zzi | 8;
    }

    private void zzas(int n3) {
        int n4;
        this.zzi = n4 = this.zzi | 0x10;
        this.zzo = n3;
    }

    public static zzbdv$zzk$zza zzd() {
        return (zzbdv$zzk$zza)zzg.zzaZ();
    }

    public static zzbdv$zzk$zza zze(zzbdv$zzk zzbdv$zzk) {
        return (zzbdv$zzk$zza)zzg.zzba(zzbdv$zzk);
    }

    public static /* synthetic */ zzbdv$zzk zzf() {
        return zzg;
    }

    public static zzbdv$zzk zzg() {
        return zzg;
    }

    public static zzbdv$zzk zzh(InputStream inputStream) {
        return (zzbdv$zzk)zzhbo.zzbk(zzg, inputStream);
    }

    public static zzbdv$zzk zzi(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzk)zzhbo.zzbl(zzg, inputStream, zzhay2);
    }

    public static zzbdv$zzk zzj(zzhac zzhac2) {
        return (zzbdv$zzk)zzhbo.zzbm(zzg, zzhac2);
    }

    public static zzbdv$zzk zzk(zzham zzham2) {
        return (zzbdv$zzk)zzhbo.zzbn(zzg, zzham2);
    }

    public static zzbdv$zzk zzl(InputStream inputStream) {
        return (zzbdv$zzk)zzhbo.zzbo(zzg, inputStream);
    }

    public static zzbdv$zzk zzm(ByteBuffer byteBuffer) {
        return (zzbdv$zzk)zzhbo.zzbp(zzg, byteBuffer);
    }

    public static zzbdv$zzk zzn(byte[] byArray) {
        return (zzbdv$zzk)zzhbo.zzbq(zzg, byArray);
    }

    public static zzbdv$zzk zzo(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzk)zzhbo.zzbr(zzg, zzhac2, zzhay2);
    }

    public static zzbdv$zzk zzp(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzk)zzhbo.zzbs(zzg, zzham2, zzhay2);
    }

    public static zzbdv$zzk zzq(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzk)zzhbo.zzbu(zzg, inputStream, zzhay2);
    }

    public static zzbdv$zzk zzr(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzk)zzhbo.zzbv(zzg, byteBuffer, zzhay2);
    }

    public static zzbdv$zzk zzs(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzk)zzhbo.zzbx(zzg, byArray, zzhay2);
    }

    public static zzhdm zzu() {
        return zzg.zzbM();
    }

    public static /* synthetic */ void zzw(zzbdv$zzk zzbdv$zzk, int n3) {
        zzbdv$zzk.zzan(n3);
    }

    public static /* synthetic */ void zzx(zzbdv$zzk zzbdv$zzk) {
        zzbdv$zzk.zzac();
    }

    public static /* synthetic */ void zzy(zzbdv$zzk zzbdv$zzk, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzk.zzap(zzbdv$zzap);
    }

    public static /* synthetic */ void zzz(zzbdv$zzk zzbdv$zzk, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzk.zzak(zzbdv$zzap);
    }

    public zzbdv$zzap zzC() {
        zzbdv$zzap zzbdv$zzap = this.zzl;
        if (zzbdv$zzap == null) {
            zzbdv$zzap = zzbdv$zzap.zzf();
        }
        return zzbdv$zzap;
    }

    public zzbdv$zzap zzD() {
        zzbdv$zzap zzbdv$zzap = this.zzk;
        if (zzbdv$zzap == null) {
            zzbdv$zzap = zzbdv$zzap.zzf();
        }
        return zzbdv$zzap;
    }

    public zzbdv$zzap zzE(int n3) {
        return (zzbdv$zzap)this.zzn.get(n3);
    }

    public zzbdv$zzap zzF() {
        zzbdv$zzap zzbdv$zzap = this.zzm;
        if (zzbdv$zzap == null) {
            zzbdv$zzap = zzbdv$zzap.zzf();
        }
        return zzbdv$zzap;
    }

    public List zzG() {
        return this.zzn;
    }

    public boolean zzH() {
        int n3 = this.zzi;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzI() {
        int n3 = this.zzi & 4;
        return n3 != 0;
    }

    public boolean zzJ() {
        int n3 = this.zzi & 2;
        return n3 != 0;
    }

    public boolean zzK() {
        int n3 = this.zzi & 8;
        return n3 != 0;
    }

    public boolean zzL() {
        int n3 = this.zzi & 0x10;
        return n3 != 0;
    }

    public int zza() {
        return this.zzj;
    }

    public int zzb() {
        return this.zzn.size();
    }

    public int zzc() {
        return this.zzo;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = zzhbn.zza;
        int n3 = objectArray.ordinal();
        object = null;
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 6: {
                objectArray = zzh;
                if (objectArray != null) return objectArray;
                clazz = zzbdv$zzk.class;
                synchronized (clazz) {
                    try {
                        objectArray = zzh;
                        if (objectArray != null) return objectArray;
                        object = zzg;
                        zzh = objectArray = new zzhbj((zzhbo)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzg;
            }
            case 4: {
                return new zzbdv$zzk$zza(null);
            }
            case 3: {
                return new zzbdv$zzk();
            }
            case 2: {
                objectArray = new Object[8];
                objectArray[0] = "zzi";
                objectArray[by2] = "zzj";
                objectArray[2] = "zzk";
                objectArray[3] = "zzl";
                objectArray[4] = "zzm";
                objectArray[5] = "zzn";
                objectArray[6] = zzbdv$zzap.class;
                objectArray[7] = "zzo";
                return zzhbo.zzbR(zzg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u001b\u0006\u1004\u0004", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzaq zzt(int n3) {
        return (zzbdv$zzaq)this.zzn.get(n3);
    }

    public List zzv() {
        return this.zzn;
    }
}

