/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzaw;
import com.google.android.gms.internal.ads.zzbdv$zzax;
import com.google.android.gms.internal.ads.zzbdv$zzbe$zza;
import com.google.android.gms.internal.ads.zzbdv$zzbf;
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

public final class zzbdv$zzbe
extends zzhbo
implements zzbdv$zzbf {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final zzbdv$zzbe zzg;
    private static volatile zzhdm zzh;
    private int zzi;
    private int zzj = 1000;
    private zzbdv$zzaw zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;

    static {
        zzbdv$zzbe zzbdv$zzbe;
        zzg = zzbdv$zzbe = new zzbdv$zzbe();
        zzhbo.zzca(zzbdv$zzbe.class, zzbdv$zzbe);
    }

    private zzbdv$zzbe() {
    }

    public static zzbdv$zzbe zzA(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzbe)zzhbo.zzbv(zzg, byteBuffer, zzhay2);
    }

    public static zzbdv$zzbe zzB(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzbe)zzhbo.zzbx(zzg, byArray, zzhay2);
    }

    public static zzhdm zzC() {
        return zzg.zzbM();
    }

    public static /* synthetic */ void zzD(zzbdv$zzbe zzbdv$zzbe, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzbe.zzZ(zzbdv$zzq);
    }

    public static /* synthetic */ void zzE(zzbdv$zzbe zzbdv$zzbe) {
        zzbdv$zzbe.zzS();
    }

    public static /* synthetic */ void zzF(zzbdv$zzbe zzbdv$zzbe, zzbdv$zzaw zzbdv$zzaw) {
        zzbdv$zzbe.zzY(zzbdv$zzaw);
    }

    public static /* synthetic */ void zzG(zzbdv$zzbe zzbdv$zzbe, zzbdv$zzaw zzbdv$zzaw) {
        zzbdv$zzbe.zzW(zzbdv$zzaw);
    }

    public static /* synthetic */ void zzH(zzbdv$zzbe zzbdv$zzbe) {
        zzbdv$zzbe.zzR();
    }

    public static /* synthetic */ void zzI(zzbdv$zzbe zzbdv$zzbe, int n3) {
        zzbdv$zzbe.zzab(n3);
    }

    public static /* synthetic */ void zzJ(zzbdv$zzbe zzbdv$zzbe) {
        zzbdv$zzbe.zzU();
    }

    public static /* synthetic */ void zzK(zzbdv$zzbe zzbdv$zzbe, int n3) {
        zzbdv$zzbe.zzac(n3);
    }

    public static /* synthetic */ void zzL(zzbdv$zzbe zzbdv$zzbe) {
        zzbdv$zzbe.zzV();
    }

    public static /* synthetic */ void zzM(zzbdv$zzbe zzbdv$zzbe, int n3) {
        zzbdv$zzbe.zzaa(n3);
    }

    public static /* synthetic */ void zzN(zzbdv$zzbe zzbdv$zzbe) {
        zzbdv$zzbe.zzT();
    }

    public static /* synthetic */ void zzO(zzbdv$zzbe zzbdv$zzbe, long l2) {
        zzbdv$zzbe.zzX(l2);
    }

    public static /* synthetic */ void zzP(zzbdv$zzbe zzbdv$zzbe) {
        zzbdv$zzbe.zzQ();
    }

    private void zzQ() {
        int n3;
        this.zzi = n3 = this.zzi & 0xFFFFFFDF;
        this.zzo = 0L;
    }

    private void zzR() {
        int n3;
        this.zzk = null;
        this.zzi = n3 = this.zzi & 0xFFFFFFFD;
    }

    private void zzS() {
        int n3;
        this.zzi = n3 = this.zzi & 0xFFFFFFFE;
        this.zzj = 1000;
    }

    private void zzT() {
        int n3;
        this.zzi = n3 = this.zzi & 0xFFFFFFEF;
        this.zzn = 0;
    }

    private void zzU() {
        int n3;
        this.zzi = n3 = this.zzi & 0xFFFFFFFB;
        this.zzl = 0;
    }

    private void zzV() {
        int n3;
        this.zzi = n3 = this.zzi & 0xFFFFFFF7;
        this.zzm = 0;
    }

    private void zzW(zzbdv$zzaw zzbdv$zzaw) {
        int n3;
        zzbdv$zzaw zzbdv$zzaw2;
        zzbdv$zzaw.getClass();
        zzbdv$zzax zzbdv$zzax = this.zzk;
        if (zzbdv$zzax != null && zzbdv$zzax != (zzbdv$zzaw2 = zzbdv$zzaw.zzg())) {
            zzbdv$zzax = zzbdv$zzaw.zze((zzbdv$zzaw)zzbdv$zzax);
            ((zzhbi)((Object)zzbdv$zzax)).zzbj(zzbdv$zzaw);
            zzbdv$zzaw = (zzbdv$zzaw)((zzhbi)((Object)zzbdv$zzax)).zzbo();
        }
        this.zzk = zzbdv$zzaw;
        this.zzi = n3 = this.zzi | 2;
    }

    private void zzX(long l2) {
        int n3;
        this.zzi = n3 = this.zzi | 0x20;
        this.zzo = l2;
    }

    private void zzY(zzbdv$zzaw zzbdv$zzaw) {
        int n3;
        zzbdv$zzaw.getClass();
        this.zzk = zzbdv$zzaw;
        this.zzi = n3 = this.zzi | 2;
    }

    private void zzZ(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzj = n3 = zzbdv$zzq.zza();
        this.zzi = n3 = this.zzi | 1;
    }

    private void zzaa(int n3) {
        int n4;
        this.zzi = n4 = this.zzi | 0x10;
        this.zzn = n3;
    }

    private void zzab(int n3) {
        int n4;
        this.zzi = n4 = this.zzi | 4;
        this.zzl = n3;
    }

    private void zzac(int n3) {
        int n4;
        this.zzi = n4 = this.zzi | 8;
        this.zzm = n3;
    }

    public static zzbdv$zzbe$zza zzg() {
        return (zzbdv$zzbe$zza)zzg.zzaZ();
    }

    public static zzbdv$zzbe$zza zzh(zzbdv$zzbe zzbdv$zzbe) {
        return (zzbdv$zzbe$zza)zzg.zzba(zzbdv$zzbe);
    }

    public static /* synthetic */ zzbdv$zzbe zzi() {
        return zzg;
    }

    public static zzbdv$zzbe zzj() {
        return zzg;
    }

    public static zzbdv$zzbe zzk(InputStream inputStream) {
        return (zzbdv$zzbe)zzhbo.zzbk(zzg, inputStream);
    }

    public static zzbdv$zzbe zzl(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzbe)zzhbo.zzbl(zzg, inputStream, zzhay2);
    }

    public static zzbdv$zzbe zzm(zzhac zzhac2) {
        return (zzbdv$zzbe)zzhbo.zzbm(zzg, zzhac2);
    }

    public static zzbdv$zzbe zzn(zzham zzham2) {
        return (zzbdv$zzbe)zzhbo.zzbn(zzg, zzham2);
    }

    public static zzbdv$zzbe zzo(InputStream inputStream) {
        return (zzbdv$zzbe)zzhbo.zzbo(zzg, inputStream);
    }

    public static zzbdv$zzbe zzp(ByteBuffer byteBuffer) {
        return (zzbdv$zzbe)zzhbo.zzbp(zzg, byteBuffer);
    }

    public static zzbdv$zzbe zzq(byte[] byArray) {
        return (zzbdv$zzbe)zzhbo.zzbq(zzg, byArray);
    }

    public static zzbdv$zzbe zzr(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzbe)zzhbo.zzbr(zzg, zzhac2, zzhay2);
    }

    public static zzbdv$zzbe zzs(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzbe)zzhbo.zzbs(zzg, zzham2, zzhay2);
    }

    public static zzbdv$zzbe zzt(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzbe)zzhbo.zzbu(zzg, inputStream, zzhay2);
    }

    public int zza() {
        return this.zzn;
    }

    public int zzb() {
        return this.zzl;
    }

    public int zzc() {
        return this.zzm;
    }

    public long zzd() {
        return this.zzo;
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
                object = zzh;
                if (object != null) return object;
                clazz = zzbdv$zzbe.class;
                synchronized (clazz) {
                    try {
                        object = zzh;
                        if (object != null) return object;
                        objectArray = zzg;
                        object = new zzhbj((zzhbo)objectArray);
                        zzh = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzg;
            }
            case 4: {
                return new zzbdv$zzbe$zza(null);
            }
            case 3: {
                return new zzbdv$zzbe();
            }
            case 2: {
                object = zzbdv$zzq.zze();
                objectArray = new Object[8];
                objectArray[0] = "zzi";
                objectArray[by2] = "zzj";
                objectArray[2] = object;
                objectArray[3] = "zzk";
                objectArray[4] = "zzl";
                objectArray[5] = "zzm";
                objectArray[6] = "zzn";
                objectArray[7] = "zzo";
                return zzhbo.zzbR(zzg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1003\u0005", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzq zze() {
        int n3 = this.zzj;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zzc;
        }
        return zzbdv$zzq;
    }

    public zzbdv$zzaw zzf() {
        zzbdv$zzaw zzbdv$zzaw = this.zzk;
        if (zzbdv$zzaw == null) {
            zzbdv$zzaw = zzbdv$zzaw.zzg();
        }
        return zzbdv$zzaw;
    }

    public boolean zzu() {
        int n3 = this.zzi & 0x20;
        return n3 != 0;
    }

    public boolean zzv() {
        int n3 = this.zzi & 2;
        return n3 != 0;
    }

    public boolean zzw() {
        int n3 = this.zzi;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzx() {
        int n3 = this.zzi & 0x10;
        return n3 != 0;
    }

    public boolean zzy() {
        int n3 = this.zzi & 4;
        return n3 != 0;
    }

    public boolean zzz() {
        int n3 = this.zzi & 8;
        return n3 != 0;
    }
}

