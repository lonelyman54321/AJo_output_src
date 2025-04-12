/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzaw;
import com.google.android.gms.internal.ads.zzbdv$zzax;
import com.google.android.gms.internal.ads.zzbdv$zzbj$zza;
import com.google.android.gms.internal.ads.zzbdv$zzbk;
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

public final class zzbdv$zzbj
extends zzhbo
implements zzbdv$zzbk {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbdv$zzbj zzc;
    private static volatile zzhdm zzd;
    private int zze;
    private int zzf = 1000;
    private zzbdv$zzaw zzg;

    static {
        zzbdv$zzbj zzbdv$zzbj;
        zzc = zzbdv$zzbj = new zzbdv$zzbj();
        zzhbo.zzca(zzbdv$zzbj.class, zzbdv$zzbj);
    }

    private zzbdv$zzbj() {
    }

    private void zzA() {
        int n3;
        this.zzg = null;
        this.zze = n3 = this.zze & 0xFFFFFFFD;
    }

    private void zzB() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFE;
        this.zzf = 1000;
    }

    private void zzC(zzbdv$zzaw zzbdv$zzaw) {
        int n3;
        zzbdv$zzaw zzbdv$zzaw2;
        zzbdv$zzaw.getClass();
        zzbdv$zzax zzbdv$zzax = this.zzg;
        if (zzbdv$zzax != null && zzbdv$zzax != (zzbdv$zzaw2 = zzbdv$zzaw.zzg())) {
            zzbdv$zzax = zzbdv$zzaw.zze((zzbdv$zzaw)zzbdv$zzax);
            ((zzhbi)((Object)zzbdv$zzax)).zzbj(zzbdv$zzaw);
            zzbdv$zzaw = (zzbdv$zzaw)((zzhbi)((Object)zzbdv$zzax)).zzbo();
        }
        this.zzg = zzbdv$zzaw;
        this.zze = n3 = this.zze | 2;
    }

    private void zzD(zzbdv$zzaw zzbdv$zzaw) {
        int n3;
        zzbdv$zzaw.getClass();
        this.zzg = zzbdv$zzaw;
        this.zze = n3 = this.zze | 2;
    }

    private void zzE(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzf = n3 = zzbdv$zzq.zza();
        this.zze = n3 = this.zze | 1;
    }

    public static zzbdv$zzbj$zza zzc() {
        return (zzbdv$zzbj$zza)zzc.zzaZ();
    }

    public static zzbdv$zzbj$zza zzd(zzbdv$zzbj zzbdv$zzbj) {
        return (zzbdv$zzbj$zza)zzc.zzba(zzbdv$zzbj);
    }

    public static /* synthetic */ zzbdv$zzbj zze() {
        return zzc;
    }

    public static zzbdv$zzbj zzf() {
        return zzc;
    }

    public static zzbdv$zzbj zzg(InputStream inputStream) {
        return (zzbdv$zzbj)zzhbo.zzbk(zzc, inputStream);
    }

    public static zzbdv$zzbj zzh(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzbj)zzhbo.zzbl(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzbj zzk(zzhac zzhac2) {
        return (zzbdv$zzbj)zzhbo.zzbm(zzc, zzhac2);
    }

    public static zzbdv$zzbj zzl(zzham zzham2) {
        return (zzbdv$zzbj)zzhbo.zzbn(zzc, zzham2);
    }

    public static zzbdv$zzbj zzm(InputStream inputStream) {
        return (zzbdv$zzbj)zzhbo.zzbo(zzc, inputStream);
    }

    public static zzbdv$zzbj zzn(ByteBuffer byteBuffer) {
        return (zzbdv$zzbj)zzhbo.zzbp(zzc, byteBuffer);
    }

    public static zzbdv$zzbj zzo(byte[] byArray) {
        return (zzbdv$zzbj)zzhbo.zzbq(zzc, byArray);
    }

    public static zzbdv$zzbj zzp(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzbj)zzhbo.zzbr(zzc, zzhac2, zzhay2);
    }

    public static zzbdv$zzbj zzq(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzbj)zzhbo.zzbs(zzc, zzham2, zzhay2);
    }

    public static zzbdv$zzbj zzr(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzbj)zzhbo.zzbu(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzbj zzs(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzbj)zzhbo.zzbv(zzc, byteBuffer, zzhay2);
    }

    public static zzbdv$zzbj zzt(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzbj)zzhbo.zzbx(zzc, byArray, zzhay2);
    }

    public static zzhdm zzu() {
        return zzc.zzbM();
    }

    public static /* synthetic */ void zzv(zzbdv$zzbj zzbdv$zzbj, zzbdv$zzaw zzbdv$zzaw) {
        zzbdv$zzbj.zzC(zzbdv$zzaw);
    }

    public static /* synthetic */ void zzw(zzbdv$zzbj zzbdv$zzbj) {
        zzbdv$zzbj.zzA();
    }

    public static /* synthetic */ void zzx(zzbdv$zzbj zzbdv$zzbj, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzbj.zzE(zzbdv$zzq);
    }

    public static /* synthetic */ void zzy(zzbdv$zzbj zzbdv$zzbj) {
        zzbdv$zzbj.zzB();
    }

    public static /* synthetic */ void zzz(zzbdv$zzbj zzbdv$zzbj, zzbdv$zzaw zzbdv$zzaw) {
        zzbdv$zzbj.zzD(zzbdv$zzaw);
    }

    public zzbdv$zzq zza() {
        int n3 = this.zzf;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zzc;
        }
        return zzbdv$zzq;
    }

    public zzbdv$zzaw zzb() {
        zzbdv$zzaw zzbdv$zzaw = this.zzg;
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
                object = zzd;
                if (object != null) return object;
                clazz = zzbdv$zzbj.class;
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
                return new zzbdv$zzbj$zza(null);
            }
            case 3: {
                return new zzbdv$zzbj();
            }
            case 2: {
                object = zzbdv$zzq.zze();
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

