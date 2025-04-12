/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzaw;
import com.google.android.gms.internal.ads.zzbdv$zzax;
import com.google.android.gms.internal.ads.zzbdv$zzba$zza;
import com.google.android.gms.internal.ads.zzbdv$zzbb;
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

public final class zzbdv$zzba
extends zzhbo
implements zzbdv$zzbb {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final zzbdv$zzba zzf;
    private static volatile zzhdm zzg;
    private int zzh;
    private int zzi = 1000;
    private zzbdv$zzaw zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        zzbdv$zzba zzbdv$zzba;
        zzf = zzbdv$zzba = new zzbdv$zzba();
        zzhbo.zzca(zzbdv$zzba.class, zzbdv$zzba);
    }

    private zzbdv$zzba() {
    }

    public static zzhdm zzA() {
        return zzf.zzbM();
    }

    public static /* synthetic */ void zzB(zzbdv$zzba zzbdv$zzba, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzba.zzT(zzbdv$zzq);
    }

    public static /* synthetic */ void zzC(zzbdv$zzba zzbdv$zzba) {
        zzbdv$zzba.zzN();
    }

    public static /* synthetic */ void zzD(zzbdv$zzba zzbdv$zzba, zzbdv$zzaw zzbdv$zzaw) {
        zzbdv$zzba.zzS(zzbdv$zzaw);
    }

    public static /* synthetic */ void zzE(zzbdv$zzba zzbdv$zzba, zzbdv$zzaw zzbdv$zzaw) {
        zzbdv$zzba.zzR(zzbdv$zzaw);
    }

    public static /* synthetic */ void zzF(zzbdv$zzba zzbdv$zzba) {
        zzbdv$zzba.zzM();
    }

    public static /* synthetic */ void zzG(zzbdv$zzba zzbdv$zzba, int n3) {
        zzbdv$zzba.zzV(n3);
    }

    public static /* synthetic */ void zzH(zzbdv$zzba zzbdv$zzba) {
        zzbdv$zzba.zzP();
    }

    public static /* synthetic */ void zzI(zzbdv$zzba zzbdv$zzba, int n3) {
        zzbdv$zzba.zzW(n3);
    }

    public static /* synthetic */ void zzJ(zzbdv$zzba zzbdv$zzba) {
        zzbdv$zzba.zzQ();
    }

    public static /* synthetic */ void zzK(zzbdv$zzba zzbdv$zzba, int n3) {
        zzbdv$zzba.zzU(n3);
    }

    public static /* synthetic */ void zzL(zzbdv$zzba zzbdv$zzba) {
        zzbdv$zzba.zzO();
    }

    private void zzM() {
        int n3;
        this.zzj = null;
        this.zzh = n3 = this.zzh & 0xFFFFFFFD;
    }

    private void zzN() {
        int n3;
        this.zzh = n3 = this.zzh & 0xFFFFFFFE;
        this.zzi = 1000;
    }

    private void zzO() {
        int n3;
        this.zzh = n3 = this.zzh & 0xFFFFFFEF;
        this.zzm = 0;
    }

    private void zzP() {
        int n3;
        this.zzh = n3 = this.zzh & 0xFFFFFFFB;
        this.zzk = 0;
    }

    private void zzQ() {
        int n3;
        this.zzh = n3 = this.zzh & 0xFFFFFFF7;
        this.zzl = 0;
    }

    private void zzR(zzbdv$zzaw zzbdv$zzaw) {
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
        this.zzh = n3 = this.zzh | 2;
    }

    private void zzS(zzbdv$zzaw zzbdv$zzaw) {
        int n3;
        zzbdv$zzaw.getClass();
        this.zzj = zzbdv$zzaw;
        this.zzh = n3 = this.zzh | 2;
    }

    private void zzT(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzi = n3 = zzbdv$zzq.zza();
        this.zzh = n3 = this.zzh | 1;
    }

    private void zzU(int n3) {
        int n4;
        this.zzh = n4 = this.zzh | 0x10;
        this.zzm = n3;
    }

    private void zzV(int n3) {
        int n4;
        this.zzh = n4 = this.zzh | 4;
        this.zzk = n3;
    }

    private void zzW(int n3) {
        int n4;
        this.zzh = n4 = this.zzh | 8;
        this.zzl = n3;
    }

    public static zzbdv$zzba$zza zzf() {
        return (zzbdv$zzba$zza)zzf.zzaZ();
    }

    public static zzbdv$zzba$zza zzg(zzbdv$zzba zzbdv$zzba) {
        return (zzbdv$zzba$zza)zzf.zzba(zzbdv$zzba);
    }

    public static /* synthetic */ zzbdv$zzba zzh() {
        return zzf;
    }

    public static zzbdv$zzba zzi() {
        return zzf;
    }

    public static zzbdv$zzba zzj(InputStream inputStream) {
        return (zzbdv$zzba)zzhbo.zzbk(zzf, inputStream);
    }

    public static zzbdv$zzba zzk(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzba)zzhbo.zzbl(zzf, inputStream, zzhay2);
    }

    public static zzbdv$zzba zzl(zzhac zzhac2) {
        return (zzbdv$zzba)zzhbo.zzbm(zzf, zzhac2);
    }

    public static zzbdv$zzba zzm(zzham zzham2) {
        return (zzbdv$zzba)zzhbo.zzbn(zzf, zzham2);
    }

    public static zzbdv$zzba zzn(InputStream inputStream) {
        return (zzbdv$zzba)zzhbo.zzbo(zzf, inputStream);
    }

    public static zzbdv$zzba zzo(ByteBuffer byteBuffer) {
        return (zzbdv$zzba)zzhbo.zzbp(zzf, byteBuffer);
    }

    public static zzbdv$zzba zzp(byte[] byArray) {
        return (zzbdv$zzba)zzhbo.zzbq(zzf, byArray);
    }

    public static zzbdv$zzba zzq(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzba)zzhbo.zzbr(zzf, zzhac2, zzhay2);
    }

    public static zzbdv$zzba zzw(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzba)zzhbo.zzbs(zzf, zzham2, zzhay2);
    }

    public static zzbdv$zzba zzx(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzba)zzhbo.zzbu(zzf, inputStream, zzhay2);
    }

    public static zzbdv$zzba zzy(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzba)zzhbo.zzbv(zzf, byteBuffer, zzhay2);
    }

    public static zzbdv$zzba zzz(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzba)zzhbo.zzbx(zzf, byArray, zzhay2);
    }

    public int zza() {
        return this.zzm;
    }

    public int zzb() {
        return this.zzk;
    }

    public int zzc() {
        return this.zzl;
    }

    public zzbdv$zzq zzd() {
        int n3 = this.zzi;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zzc;
        }
        return zzbdv$zzq;
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
                object = zzg;
                if (object != null) return object;
                clazz = zzbdv$zzba.class;
                synchronized (clazz) {
                    try {
                        object = zzg;
                        if (object != null) return object;
                        objectArray = zzf;
                        object = new zzhbj((zzhbo)objectArray);
                        zzg = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzf;
            }
            case 4: {
                return new zzbdv$zzba$zza(null);
            }
            case 3: {
                return new zzbdv$zzba();
            }
            case 2: {
                object = zzbdv$zzq.zze();
                objectArray = new Object[7];
                objectArray[0] = "zzh";
                objectArray[by2] = "zzi";
                objectArray[2] = object;
                objectArray[3] = "zzj";
                objectArray[4] = "zzk";
                objectArray[5] = "zzl";
                objectArray[6] = "zzm";
                return zzhbo.zzbR(zzf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzaw zze() {
        zzbdv$zzaw zzbdv$zzaw = this.zzj;
        if (zzbdv$zzaw == null) {
            zzbdv$zzaw = zzbdv$zzaw.zzg();
        }
        return zzbdv$zzaw;
    }

    public boolean zzr() {
        int n3 = this.zzh & 2;
        return n3 != 0;
    }

    public boolean zzs() {
        int n3 = this.zzh;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzt() {
        int n3 = this.zzh & 0x10;
        return n3 != 0;
    }

    public boolean zzu() {
        int n3 = this.zzh & 4;
        return n3 != 0;
    }

    public boolean zzv() {
        int n3 = this.zzh & 8;
        return n3 != 0;
    }
}

