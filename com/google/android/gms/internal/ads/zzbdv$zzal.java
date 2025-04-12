/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzal$zza;
import com.google.android.gms.internal.ads.zzbdv$zzam;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbdv$zzal
extends zzhbo
implements zzbdv$zzam {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbdv$zzal zzc;
    private static volatile zzhdm zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbdv$zzal zzbdv$zzal;
        zzc = zzbdv$zzal = new zzbdv$zzal();
        zzhbo.zzca(zzbdv$zzal.class, zzbdv$zzal);
    }

    private zzbdv$zzal() {
    }

    private void zzA() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFE;
        this.zzf = 0;
    }

    private void zzB(int n3) {
        int n4;
        this.zze = n4 = this.zze | 2;
        this.zzg = n3;
    }

    private void zzC(int n3) {
        int n4;
        this.zze = n4 = this.zze | 1;
        this.zzf = n3;
    }

    public static zzbdv$zzal$zza zzc() {
        return (zzbdv$zzal$zza)zzc.zzaZ();
    }

    public static zzbdv$zzal$zza zzd(zzbdv$zzal zzbdv$zzal) {
        return (zzbdv$zzal$zza)zzc.zzba(zzbdv$zzal);
    }

    public static /* synthetic */ zzbdv$zzal zze() {
        return zzc;
    }

    public static zzbdv$zzal zzf() {
        return zzc;
    }

    public static zzbdv$zzal zzi(InputStream inputStream) {
        return (zzbdv$zzal)zzhbo.zzbk(zzc, inputStream);
    }

    public static zzbdv$zzal zzj(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzal)zzhbo.zzbl(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzal zzk(zzhac zzhac2) {
        return (zzbdv$zzal)zzhbo.zzbm(zzc, zzhac2);
    }

    public static zzbdv$zzal zzl(zzham zzham2) {
        return (zzbdv$zzal)zzhbo.zzbn(zzc, zzham2);
    }

    public static zzbdv$zzal zzm(InputStream inputStream) {
        return (zzbdv$zzal)zzhbo.zzbo(zzc, inputStream);
    }

    public static zzbdv$zzal zzn(ByteBuffer byteBuffer) {
        return (zzbdv$zzal)zzhbo.zzbp(zzc, byteBuffer);
    }

    public static zzbdv$zzal zzo(byte[] byArray) {
        return (zzbdv$zzal)zzhbo.zzbq(zzc, byArray);
    }

    public static zzbdv$zzal zzp(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzal)zzhbo.zzbr(zzc, zzhac2, zzhay2);
    }

    public static zzbdv$zzal zzq(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzal)zzhbo.zzbs(zzc, zzham2, zzhay2);
    }

    public static zzbdv$zzal zzr(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzal)zzhbo.zzbu(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzal zzs(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzal)zzhbo.zzbv(zzc, byteBuffer, zzhay2);
    }

    public static zzbdv$zzal zzt(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzal)zzhbo.zzbx(zzc, byArray, zzhay2);
    }

    public static zzhdm zzu() {
        return zzc.zzbM();
    }

    public static /* synthetic */ void zzv(zzbdv$zzal zzbdv$zzal, int n3) {
        zzbdv$zzal.zzC(n3);
    }

    public static /* synthetic */ void zzw(zzbdv$zzal zzbdv$zzal) {
        zzbdv$zzal.zzA();
    }

    public static /* synthetic */ void zzx(zzbdv$zzal zzbdv$zzal, int n3) {
        zzbdv$zzal.zzB(n3);
    }

    public static /* synthetic */ void zzy(zzbdv$zzal zzbdv$zzal) {
        zzbdv$zzal.zzz();
    }

    private void zzz() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFD;
        this.zzg = 0;
    }

    public int zza() {
        return this.zzg;
    }

    public int zzb() {
        return this.zzf;
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
                objectArray = zzd;
                if (objectArray != null) return objectArray;
                clazz = zzbdv$zzal.class;
                synchronized (clazz) {
                    try {
                        objectArray = zzd;
                        if (objectArray != null) return objectArray;
                        object = zzc;
                        zzd = objectArray = new zzhbj((zzhbo)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzc;
            }
            case 4: {
                return new zzbdv$zzal$zza(null);
            }
            case 3: {
                return new zzbdv$zzal();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public boolean zzg() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }

    public boolean zzh() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

