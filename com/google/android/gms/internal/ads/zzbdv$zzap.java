/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzap$zza;
import com.google.android.gms.internal.ads.zzbdv$zzaq;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbdv$zzap
extends zzhbo
implements zzbdv$zzaq {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbdv$zzap zzc;
    private static volatile zzhdm zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbdv$zzap zzbdv$zzap;
        zzc = zzbdv$zzap = new zzbdv$zzap();
        zzhbo.zzca(zzbdv$zzap.class, zzbdv$zzap);
    }

    private zzbdv$zzap() {
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

    public static zzbdv$zzap$zza zzc() {
        return (zzbdv$zzap$zza)zzc.zzaZ();
    }

    public static zzbdv$zzap$zza zzd(zzbdv$zzap zzbdv$zzap) {
        return (zzbdv$zzap$zza)zzc.zzba(zzbdv$zzap);
    }

    public static /* synthetic */ zzbdv$zzap zze() {
        return zzc;
    }

    public static zzbdv$zzap zzf() {
        return zzc;
    }

    public static zzbdv$zzap zzi(InputStream inputStream) {
        return (zzbdv$zzap)zzhbo.zzbk(zzc, inputStream);
    }

    public static zzbdv$zzap zzj(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzap)zzhbo.zzbl(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzap zzk(zzhac zzhac2) {
        return (zzbdv$zzap)zzhbo.zzbm(zzc, zzhac2);
    }

    public static zzbdv$zzap zzl(zzham zzham2) {
        return (zzbdv$zzap)zzhbo.zzbn(zzc, zzham2);
    }

    public static zzbdv$zzap zzm(InputStream inputStream) {
        return (zzbdv$zzap)zzhbo.zzbo(zzc, inputStream);
    }

    public static zzbdv$zzap zzn(ByteBuffer byteBuffer) {
        return (zzbdv$zzap)zzhbo.zzbp(zzc, byteBuffer);
    }

    public static zzbdv$zzap zzo(byte[] byArray) {
        return (zzbdv$zzap)zzhbo.zzbq(zzc, byArray);
    }

    public static zzbdv$zzap zzp(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzap)zzhbo.zzbr(zzc, zzhac2, zzhay2);
    }

    public static zzbdv$zzap zzq(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzap)zzhbo.zzbs(zzc, zzham2, zzhay2);
    }

    public static zzbdv$zzap zzr(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzap)zzhbo.zzbu(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzap zzs(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzap)zzhbo.zzbv(zzc, byteBuffer, zzhay2);
    }

    public static zzbdv$zzap zzt(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzap)zzhbo.zzbx(zzc, byArray, zzhay2);
    }

    public static zzhdm zzu() {
        return zzc.zzbM();
    }

    public static /* synthetic */ void zzv(zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzap.zzA();
    }

    public static /* synthetic */ void zzw(zzbdv$zzap zzbdv$zzap, int n3) {
        zzbdv$zzap.zzB(n3);
    }

    public static /* synthetic */ void zzx(zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzap.zzz();
    }

    public static /* synthetic */ void zzy(zzbdv$zzap zzbdv$zzap, int n3) {
        zzbdv$zzap.zzC(n3);
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
                clazz = zzbdv$zzap.class;
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
                return new zzbdv$zzap$zza(null);
            }
            case 3: {
                return new zzbdv$zzap();
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

