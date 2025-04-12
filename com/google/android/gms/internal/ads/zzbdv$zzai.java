/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzai$zza;
import com.google.android.gms.internal.ads.zzbdv$zzaj;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbdv$zzai
extends zzhbo
implements zzbdv$zzaj {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbdv$zzai zzc;
    private static volatile zzhdm zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbdv$zzai zzbdv$zzai;
        zzc = zzbdv$zzai = new zzbdv$zzai();
        zzhbo.zzca(zzbdv$zzai.class, zzbdv$zzai);
    }

    private zzbdv$zzai() {
    }

    private void zzA() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFD;
        this.zzg = 0;
    }

    private void zzB(int n3) {
        int n4;
        this.zze = n4 = this.zze | 1;
        this.zzf = n3;
    }

    private void zzC(int n3) {
        int n4;
        this.zze = n4 = this.zze | 2;
        this.zzg = n3;
    }

    public static zzbdv$zzai$zza zzc() {
        return (zzbdv$zzai$zza)zzc.zzaZ();
    }

    public static zzbdv$zzai$zza zzd(zzbdv$zzai zzbdv$zzai) {
        return (zzbdv$zzai$zza)zzc.zzba(zzbdv$zzai);
    }

    public static /* synthetic */ zzbdv$zzai zze() {
        return zzc;
    }

    public static zzbdv$zzai zzf() {
        return zzc;
    }

    public static zzbdv$zzai zzi(InputStream inputStream) {
        return (zzbdv$zzai)zzhbo.zzbk(zzc, inputStream);
    }

    public static zzbdv$zzai zzj(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzai)zzhbo.zzbl(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzai zzk(zzhac zzhac2) {
        return (zzbdv$zzai)zzhbo.zzbm(zzc, zzhac2);
    }

    public static zzbdv$zzai zzl(zzham zzham2) {
        return (zzbdv$zzai)zzhbo.zzbn(zzc, zzham2);
    }

    public static zzbdv$zzai zzm(InputStream inputStream) {
        return (zzbdv$zzai)zzhbo.zzbo(zzc, inputStream);
    }

    public static zzbdv$zzai zzn(ByteBuffer byteBuffer) {
        return (zzbdv$zzai)zzhbo.zzbp(zzc, byteBuffer);
    }

    public static zzbdv$zzai zzo(byte[] byArray) {
        return (zzbdv$zzai)zzhbo.zzbq(zzc, byArray);
    }

    public static zzbdv$zzai zzp(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzai)zzhbo.zzbr(zzc, zzhac2, zzhay2);
    }

    public static zzbdv$zzai zzq(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzai)zzhbo.zzbs(zzc, zzham2, zzhay2);
    }

    public static zzbdv$zzai zzr(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzai)zzhbo.zzbu(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzai zzs(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzai)zzhbo.zzbv(zzc, byteBuffer, zzhay2);
    }

    public static zzbdv$zzai zzt(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzai)zzhbo.zzbx(zzc, byArray, zzhay2);
    }

    public static zzhdm zzu() {
        return zzc.zzbM();
    }

    public static /* synthetic */ void zzv(zzbdv$zzai zzbdv$zzai, int n3) {
        zzbdv$zzai.zzB(n3);
    }

    public static /* synthetic */ void zzw(zzbdv$zzai zzbdv$zzai) {
        zzbdv$zzai.zzz();
    }

    public static /* synthetic */ void zzx(zzbdv$zzai zzbdv$zzai, int n3) {
        zzbdv$zzai.zzC(n3);
    }

    public static /* synthetic */ void zzy(zzbdv$zzai zzbdv$zzai) {
        zzbdv$zzai.zzA();
    }

    private void zzz() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFE;
        this.zzf = 0;
    }

    public int zza() {
        return this.zzf;
    }

    public int zzb() {
        return this.zzg;
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
                clazz = zzbdv$zzai.class;
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
                return new zzbdv$zzai$zza(null);
            }
            case 3: {
                return new zzbdv$zzai();
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
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzh() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }
}

