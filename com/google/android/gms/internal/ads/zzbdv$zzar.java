/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzar$zza;
import com.google.android.gms.internal.ads.zzbdv$zzas;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbdv$zzar
extends zzhbo
implements zzbdv$zzas {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbdv$zzar zzd;
    private static volatile zzhdm zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzbdv$zzar zzbdv$zzar;
        zzd = zzbdv$zzar = new zzbdv$zzar();
        zzhbo.zzca(zzbdv$zzar.class, zzbdv$zzar);
    }

    private zzbdv$zzar() {
    }

    public static /* synthetic */ void zzA(zzbdv$zzar zzbdv$zzar) {
        zzbdv$zzar.zzF();
    }

    public static /* synthetic */ void zzB(zzbdv$zzar zzbdv$zzar, int n3) {
        zzbdv$zzar.zzH(n3);
    }

    public static /* synthetic */ void zzC(zzbdv$zzar zzbdv$zzar) {
        zzbdv$zzar.zzE();
    }

    private void zzD() {
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFE;
        this.zzg = 0;
    }

    private void zzE() {
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFB;
        this.zzi = 0;
    }

    private void zzF() {
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFD;
        this.zzh = 0;
    }

    private void zzG(int n3) {
        int n4;
        this.zzf = n4 = this.zzf | 1;
        this.zzg = n3;
    }

    private void zzH(int n3) {
        int n4;
        this.zzf = n4 = this.zzf | 4;
        this.zzi = n3;
    }

    private void zzI(int n3) {
        int n4;
        this.zzf = n4 = this.zzf | 2;
        this.zzh = n3;
    }

    public static zzbdv$zzar$zza zzd() {
        return (zzbdv$zzar$zza)zzd.zzaZ();
    }

    public static zzbdv$zzar$zza zze(zzbdv$zzar zzbdv$zzar) {
        return (zzbdv$zzar$zza)zzd.zzba(zzbdv$zzar);
    }

    public static /* synthetic */ zzbdv$zzar zzf() {
        return zzd;
    }

    public static zzbdv$zzar zzg() {
        return zzd;
    }

    public static zzbdv$zzar zzh(InputStream inputStream) {
        return (zzbdv$zzar)zzhbo.zzbk(zzd, inputStream);
    }

    public static zzbdv$zzar zzi(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzar)zzhbo.zzbl(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzar zzm(zzhac zzhac2) {
        return (zzbdv$zzar)zzhbo.zzbm(zzd, zzhac2);
    }

    public static zzbdv$zzar zzn(zzham zzham2) {
        return (zzbdv$zzar)zzhbo.zzbn(zzd, zzham2);
    }

    public static zzbdv$zzar zzo(InputStream inputStream) {
        return (zzbdv$zzar)zzhbo.zzbo(zzd, inputStream);
    }

    public static zzbdv$zzar zzp(ByteBuffer byteBuffer) {
        return (zzbdv$zzar)zzhbo.zzbp(zzd, byteBuffer);
    }

    public static zzbdv$zzar zzq(byte[] byArray) {
        return (zzbdv$zzar)zzhbo.zzbq(zzd, byArray);
    }

    public static zzbdv$zzar zzr(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzar)zzhbo.zzbr(zzd, zzhac2, zzhay2);
    }

    public static zzbdv$zzar zzs(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzar)zzhbo.zzbs(zzd, zzham2, zzhay2);
    }

    public static zzbdv$zzar zzt(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzar)zzhbo.zzbu(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzar zzu(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzar)zzhbo.zzbv(zzd, byteBuffer, zzhay2);
    }

    public static zzbdv$zzar zzv(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzar)zzhbo.zzbx(zzd, byArray, zzhay2);
    }

    public static zzhdm zzw() {
        return zzd.zzbM();
    }

    public static /* synthetic */ void zzx(zzbdv$zzar zzbdv$zzar, int n3) {
        zzbdv$zzar.zzG(n3);
    }

    public static /* synthetic */ void zzy(zzbdv$zzar zzbdv$zzar) {
        zzbdv$zzar.zzD();
    }

    public static /* synthetic */ void zzz(zzbdv$zzar zzbdv$zzar, int n3) {
        zzbdv$zzar.zzI(n3);
    }

    public int zza() {
        return this.zzg;
    }

    public int zzb() {
        return this.zzi;
    }

    public int zzc() {
        return this.zzh;
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
                objectArray = zze;
                if (objectArray != null) return objectArray;
                clazz = zzbdv$zzar.class;
                synchronized (clazz) {
                    try {
                        objectArray = zze;
                        if (objectArray != null) return objectArray;
                        object = zzd;
                        zze = objectArray = new zzhbj((zzhbo)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzd;
            }
            case 4: {
                return new zzbdv$zzar$zza(null);
            }
            case 3: {
                return new zzbdv$zzar();
            }
            case 2: {
                objectArray = new Object[4];
                objectArray[0] = "zzf";
                objectArray[by2] = "zzg";
                objectArray[2] = "zzh";
                objectArray[3] = "zzi";
                return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public boolean zzj() {
        int n3 = this.zzf;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzk() {
        int n3 = this.zzf & 4;
        return n3 != 0;
    }

    public boolean zzl() {
        int n3 = this.zzf & 2;
        return n3 != 0;
    }
}

