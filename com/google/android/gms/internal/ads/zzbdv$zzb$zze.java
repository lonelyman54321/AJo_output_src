/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzb$zze$zza;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzf;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbdv$zzb$zze
extends zzhbo
implements zzbdv$zzb$zzf {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbdv$zzb$zze zzc;
    private static volatile zzhdm zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbdv$zzb$zze zzbdv$zzb$zze;
        zzc = zzbdv$zzb$zze = new zzbdv$zzb$zze();
        zzhbo.zzca(zzbdv$zzb$zze.class, zzbdv$zzb$zze);
    }

    private zzbdv$zzb$zze() {
    }

    private void zzA() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFE;
        this.zzf = false;
    }

    private void zzB() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFD;
        this.zzg = 0;
    }

    private void zzC(boolean bl2) {
        int n3;
        this.zze = n3 = this.zze | 1;
        this.zzf = bl2;
    }

    private void zzD(int n3) {
        int n4;
        this.zze = n4 = this.zze | 2;
        this.zzg = n3;
    }

    public static zzbdv$zzb$zze$zza zzc() {
        return (zzbdv$zzb$zze$zza)zzc.zzaZ();
    }

    public static zzbdv$zzb$zze$zza zzd(zzbdv$zzb$zze zzbdv$zzb$zze) {
        return (zzbdv$zzb$zze$zza)zzc.zzba(zzbdv$zzb$zze);
    }

    public static /* synthetic */ zzbdv$zzb$zze zze() {
        return zzc;
    }

    public static zzbdv$zzb$zze zzi() {
        return zzc;
    }

    public static zzbdv$zzb$zze zzj(InputStream inputStream) {
        return (zzbdv$zzb$zze)zzhbo.zzbk(zzc, inputStream);
    }

    public static zzbdv$zzb$zze zzk(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzb$zze)zzhbo.zzbl(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzb$zze zzl(zzhac zzhac2) {
        return (zzbdv$zzb$zze)zzhbo.zzbm(zzc, zzhac2);
    }

    public static zzbdv$zzb$zze zzm(zzham zzham2) {
        return (zzbdv$zzb$zze)zzhbo.zzbn(zzc, zzham2);
    }

    public static zzbdv$zzb$zze zzn(InputStream inputStream) {
        return (zzbdv$zzb$zze)zzhbo.zzbo(zzc, inputStream);
    }

    public static zzbdv$zzb$zze zzo(ByteBuffer byteBuffer) {
        return (zzbdv$zzb$zze)zzhbo.zzbp(zzc, byteBuffer);
    }

    public static zzbdv$zzb$zze zzp(byte[] byArray) {
        return (zzbdv$zzb$zze)zzhbo.zzbq(zzc, byArray);
    }

    public static zzbdv$zzb$zze zzq(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzb$zze)zzhbo.zzbr(zzc, zzhac2, zzhay2);
    }

    public static zzbdv$zzb$zze zzr(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzb$zze)zzhbo.zzbs(zzc, zzham2, zzhay2);
    }

    public static zzbdv$zzb$zze zzs(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzb$zze)zzhbo.zzbu(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzb$zze zzt(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzb$zze)zzhbo.zzbv(zzc, byteBuffer, zzhay2);
    }

    public static zzbdv$zzb$zze zzu(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzb$zze)zzhbo.zzbx(zzc, byArray, zzhay2);
    }

    public static zzhdm zzv() {
        return zzc.zzbM();
    }

    public static /* synthetic */ void zzw(zzbdv$zzb$zze zzbdv$zzb$zze, boolean bl2) {
        zzbdv$zzb$zze.zzC(bl2);
    }

    public static /* synthetic */ void zzx(zzbdv$zzb$zze zzbdv$zzb$zze) {
        zzbdv$zzb$zze.zzA();
    }

    public static /* synthetic */ void zzy(zzbdv$zzb$zze zzbdv$zzb$zze, int n3) {
        zzbdv$zzb$zze.zzD(n3);
    }

    public static /* synthetic */ void zzz(zzbdv$zzb$zze zzbdv$zzb$zze) {
        zzbdv$zzb$zze.zzB();
    }

    public int zza() {
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
                clazz = zzbdv$zzb$zze.class;
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
                return new zzbdv$zzb$zze$zza(null);
            }
            case 3: {
                return new zzbdv$zzb$zze();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100b\u0001", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public boolean zzf() {
        return this.zzf;
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

