/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzap;
import com.google.android.gms.internal.ads.zzbdv$zzaq;
import com.google.android.gms.internal.ads.zzbdv$zzar;
import com.google.android.gms.internal.ads.zzbdv$zzas;
import com.google.android.gms.internal.ads.zzbdv$zzm$zza;
import com.google.android.gms.internal.ads.zzbdv$zzn;
import com.google.android.gms.internal.ads.zzbdv$zzq;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbu;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbdv$zzm
extends zzhbo
implements zzbdv$zzn {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final zzbdv$zzm zzi;
    private static volatile zzhdm zzj;
    private int zzk;
    private String zzl = "";
    private zzbdv$zzap zzm;
    private int zzn;
    private zzbdv$zzar zzo;
    private int zzp;
    private int zzu;
    private int zzv;
    private int zzw;

    static {
        zzbdv$zzm zzbdv$zzm;
        zzi = zzbdv$zzm = new zzbdv$zzm();
        zzhbo.zzca(zzbdv$zzm.class, zzbdv$zzm);
    }

    private zzbdv$zzm() {
        int n3;
        this.zzu = n3 = 1000;
        this.zzv = n3;
        this.zzw = n3;
    }

    public static /* synthetic */ void zzM(zzbdv$zzm zzbdv$zzm, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzm.zzaj(zzbdv$zzap);
    }

    public static /* synthetic */ void zzN(zzbdv$zzm zzbdv$zzm) {
        zzbdv$zzm.zzaf();
    }

    public static /* synthetic */ void zzO(zzbdv$zzm zzbdv$zzm, int n3) {
        zzbdv$zzm.zzas(n3);
    }

    public static /* synthetic */ void zzP(zzbdv$zzm zzbdv$zzm) {
        zzbdv$zzm.zzah();
    }

    public static /* synthetic */ void zzQ(zzbdv$zzm zzbdv$zzm, zzbdv$zzar zzbdv$zzar) {
        zzbdv$zzm.zzat(zzbdv$zzar);
    }

    public static /* synthetic */ void zzR(zzbdv$zzm zzbdv$zzm, zzbdv$zzar zzbdv$zzar) {
        zzbdv$zzm.zzak(zzbdv$zzar);
    }

    public static /* synthetic */ void zzS(zzbdv$zzm zzbdv$zzm) {
        zzbdv$zzm.zzai();
    }

    public static /* synthetic */ void zzT(zzbdv$zzm zzbdv$zzm, int n3) {
        zzbdv$zzm.zzar(n3);
    }

    public static /* synthetic */ void zzU(zzbdv$zzm zzbdv$zzm) {
        zzbdv$zzm.zzag();
    }

    public static /* synthetic */ void zzV(zzbdv$zzm zzbdv$zzm, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzm.zzan(zzbdv$zzq);
    }

    public static /* synthetic */ void zzW(zzbdv$zzm zzbdv$zzm) {
        zzbdv$zzm.zzac();
    }

    public static /* synthetic */ void zzX(zzbdv$zzm zzbdv$zzm, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzm.zzao(zzbdv$zzq);
    }

    public static /* synthetic */ void zzY(zzbdv$zzm zzbdv$zzm) {
        zzbdv$zzm.zzad();
    }

    public static /* synthetic */ void zzZ(zzbdv$zzm zzbdv$zzm, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzm.zzap(zzbdv$zzq);
    }

    public static /* synthetic */ void zzaa(zzbdv$zzm zzbdv$zzm) {
        zzbdv$zzm.zzae();
    }

    private void zzab() {
        String string2;
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFFE;
        this.zzl = string2 = zzbdv$zzm.zzf().zzD();
    }

    private void zzac() {
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFDF;
        this.zzu = 1000;
    }

    private void zzad() {
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFBF;
        this.zzv = 1000;
    }

    private void zzae() {
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFF7F;
        this.zzw = 1000;
    }

    private void zzaf() {
        int n3;
        this.zzm = null;
        this.zzk = n3 = this.zzk & 0xFFFFFFFD;
    }

    private void zzag() {
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFEF;
        this.zzp = 0;
    }

    private void zzah() {
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFFB;
        this.zzn = 0;
    }

    private void zzai() {
        int n3;
        this.zzo = null;
        this.zzk = n3 = this.zzk & 0xFFFFFFF7;
    }

    private void zzaj(zzbdv$zzap zzbdv$zzap) {
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
        this.zzk = n3 = this.zzk | 2;
    }

    private void zzak(zzbdv$zzar zzbdv$zzar) {
        int n3;
        zzbdv$zzar zzbdv$zzar2;
        zzbdv$zzar.getClass();
        zzbdv$zzas zzbdv$zzas = this.zzo;
        if (zzbdv$zzas != null && zzbdv$zzas != (zzbdv$zzar2 = zzbdv$zzar.zzg())) {
            zzbdv$zzas = zzbdv$zzar.zze((zzbdv$zzar)zzbdv$zzas);
            ((zzhbi)((Object)zzbdv$zzas)).zzbj(zzbdv$zzar);
            zzbdv$zzar = (zzbdv$zzar)((zzhbi)((Object)zzbdv$zzas)).zzbo();
        }
        this.zzo = zzbdv$zzar;
        this.zzk = n3 = this.zzk | 8;
    }

    private void zzal(String string2) {
        int n3;
        string2.getClass();
        this.zzk = n3 = this.zzk | 1;
        this.zzl = string2;
    }

    private void zzam(zzhac object) {
        int n3;
        this.zzl = object = ((zzhac)object).zzy();
        this.zzk = n3 = this.zzk | 1;
    }

    private void zzan(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzu = n3 = zzbdv$zzq.zza();
        this.zzk = n3 = this.zzk | 0x20;
    }

    private void zzao(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzv = n3 = zzbdv$zzq.zza();
        this.zzk = n3 = this.zzk | 0x40;
    }

    private void zzap(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzw = n3 = zzbdv$zzq.zza();
        this.zzk = n3 = this.zzk | 0x80;
    }

    private void zzaq(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap.getClass();
        this.zzm = zzbdv$zzap;
        this.zzk = n3 = this.zzk | 2;
    }

    private void zzar(int n3) {
        int n4;
        this.zzk = n4 = this.zzk | 0x10;
        this.zzp = n3;
    }

    private void zzas(int n3) {
        int n4;
        this.zzk = n4 = this.zzk | 4;
        this.zzn = n3;
    }

    private void zzat(zzbdv$zzar zzbdv$zzar) {
        int n3;
        zzbdv$zzar.getClass();
        this.zzo = zzbdv$zzar;
        this.zzk = n3 = this.zzk | 8;
    }

    public static zzbdv$zzm$zza zzc() {
        return (zzbdv$zzm$zza)zzi.zzaZ();
    }

    public static zzbdv$zzm$zza zzd(zzbdv$zzm zzbdv$zzm) {
        return (zzbdv$zzm$zza)zzi.zzba(zzbdv$zzm);
    }

    public static /* synthetic */ zzbdv$zzm zze() {
        return zzi;
    }

    public static zzbdv$zzm zzf() {
        return zzi;
    }

    public static zzbdv$zzm zzg(InputStream inputStream) {
        return (zzbdv$zzm)zzhbo.zzbk(zzi, inputStream);
    }

    public static zzbdv$zzm zzh(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzm)zzhbo.zzbl(zzi, inputStream, zzhay2);
    }

    public static zzbdv$zzm zzi(zzhac zzhac2) {
        return (zzbdv$zzm)zzhbo.zzbm(zzi, zzhac2);
    }

    public static zzbdv$zzm zzj(zzham zzham2) {
        return (zzbdv$zzm)zzhbo.zzbn(zzi, zzham2);
    }

    public static zzbdv$zzm zzk(InputStream inputStream) {
        return (zzbdv$zzm)zzhbo.zzbo(zzi, inputStream);
    }

    public static zzbdv$zzm zzl(ByteBuffer byteBuffer) {
        return (zzbdv$zzm)zzhbo.zzbp(zzi, byteBuffer);
    }

    public static zzbdv$zzm zzm(byte[] byArray) {
        return (zzbdv$zzm)zzhbo.zzbq(zzi, byArray);
    }

    public static zzbdv$zzm zzn(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzm)zzhbo.zzbr(zzi, zzhac2, zzhay2);
    }

    public static zzbdv$zzm zzo(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzm)zzhbo.zzbs(zzi, zzham2, zzhay2);
    }

    public static zzbdv$zzm zzp(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzm)zzhbo.zzbu(zzi, inputStream, zzhay2);
    }

    public static zzbdv$zzm zzq(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzm)zzhbo.zzbv(zzi, byteBuffer, zzhay2);
    }

    public static zzbdv$zzm zzr(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzm)zzhbo.zzbx(zzi, byArray, zzhay2);
    }

    public static zzhdm zzs() {
        return zzi.zzbM();
    }

    public static /* synthetic */ void zzt(zzbdv$zzm zzbdv$zzm, String string2) {
        zzbdv$zzm.zzal(string2);
    }

    public static /* synthetic */ void zzu(zzbdv$zzm zzbdv$zzm) {
        zzbdv$zzm.zzab();
    }

    public static /* synthetic */ void zzv(zzbdv$zzm zzbdv$zzm, zzhac zzhac2) {
        zzbdv$zzm.zzam(zzhac2);
    }

    public static /* synthetic */ void zzw(zzbdv$zzm zzbdv$zzm, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzm.zzaq(zzbdv$zzap);
    }

    public zzbdv$zzap zzA() {
        zzbdv$zzap zzbdv$zzap = this.zzm;
        if (zzbdv$zzap == null) {
            zzbdv$zzap = zzbdv$zzap.zzf();
        }
        return zzbdv$zzap;
    }

    public zzbdv$zzar zzB() {
        zzbdv$zzar zzbdv$zzar = this.zzo;
        if (zzbdv$zzar == null) {
            zzbdv$zzar = zzbdv$zzar.zzg();
        }
        return zzbdv$zzar;
    }

    public zzhac zzC() {
        return zzhac.zzw(this.zzl);
    }

    public String zzD() {
        return this.zzl;
    }

    public boolean zzE() {
        int n3 = this.zzk;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzF() {
        int n3 = this.zzk & 0x20;
        return n3 != 0;
    }

    public boolean zzG() {
        int n3 = this.zzk & 0x40;
        return n3 != 0;
    }

    public boolean zzH() {
        int n3 = this.zzk & 0x80;
        return n3 != 0;
    }

    public boolean zzI() {
        int n3 = this.zzk & 2;
        return n3 != 0;
    }

    public boolean zzJ() {
        int n3 = this.zzk & 0x10;
        return n3 != 0;
    }

    public boolean zzK() {
        int n3 = this.zzk & 4;
        return n3 != 0;
    }

    public boolean zzL() {
        int n3 = this.zzk & 8;
        return n3 != 0;
    }

    public int zza() {
        return this.zzp;
    }

    public int zzb() {
        return this.zzn;
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
                object = zzj;
                if (object != null) return object;
                clazz = zzbdv$zzm.class;
                synchronized (clazz) {
                    try {
                        object = zzj;
                        if (object != null) return object;
                        object2 = zzi;
                        object = new zzhbj((zzhbo)object2);
                        zzj = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzi;
            }
            case 4: {
                return new zzbdv$zzm$zza(null);
            }
            case 3: {
                return new zzbdv$zzm();
            }
            case 2: {
                object = zzbdv$zzq.zze();
                object2 = zzbdv$zzq.zze();
                zzhbu zzhbu2 = zzbdv$zzq.zze();
                Object[] objectArray = new Object[12];
                objectArray[0] = "zzk";
                objectArray[by2] = "zzl";
                objectArray[2] = "zzm";
                objectArray[3] = "zzn";
                objectArray[4] = "zzo";
                objectArray[5] = "zzp";
                objectArray[6] = "zzu";
                objectArray[7] = object;
                objectArray[8] = "zzv";
                objectArray[9] = object2;
                objectArray[10] = "zzw";
                objectArray[11] = zzhbu2;
                return zzhbo.zzbR(zzi, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1004\u0002\u0004\u1009\u0003\u0005\u1004\u0004\u0006\u180c\u0005\u0007\u180c\u0006\b\u180c\u0007", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzq zzx() {
        int n3 = this.zzu;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zzc;
        }
        return zzbdv$zzq;
    }

    public zzbdv$zzq zzy() {
        int n3 = this.zzv;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zzc;
        }
        return zzbdv$zzq;
    }

    public zzbdv$zzq zzz() {
        int n3 = this.zzw;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zzc;
        }
        return zzbdv$zzq;
    }
}

