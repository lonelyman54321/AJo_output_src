/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzac$zza;
import com.google.android.gms.internal.ads.zzbdv$zzad;
import com.google.android.gms.internal.ads.zzbdv$zzap;
import com.google.android.gms.internal.ads.zzbdv$zzaq;
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

public final class zzbdv$zzac
extends zzhbo
implements zzbdv$zzad {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbdv$zzac zzc;
    private static volatile zzhdm zzd;
    private int zze;
    private int zzf;
    private zzbdv$zzap zzg;

    static {
        zzbdv$zzac zzbdv$zzac;
        zzc = zzbdv$zzac = new zzbdv$zzac();
        zzhbo.zzca(zzbdv$zzac.class, zzbdv$zzac);
    }

    private zzbdv$zzac() {
    }

    public static /* synthetic */ void zzA(zzbdv$zzac zzbdv$zzac) {
        zzbdv$zzac.zzB();
    }

    private void zzB() {
        int n3;
        this.zzg = null;
        this.zze = n3 = this.zze & 0xFFFFFFFD;
    }

    private void zzC() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFE;
        this.zzf = 0;
    }

    private void zzD(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap zzbdv$zzap2;
        zzbdv$zzap.getClass();
        zzbdv$zzaq zzbdv$zzaq = this.zzg;
        if (zzbdv$zzaq != null && zzbdv$zzaq != (zzbdv$zzap2 = zzbdv$zzap.zzf())) {
            zzbdv$zzaq = zzbdv$zzap.zzd((zzbdv$zzap)zzbdv$zzaq);
            ((zzhbi)((Object)zzbdv$zzaq)).zzbj(zzbdv$zzap);
            zzbdv$zzap = (zzbdv$zzap)((zzhbi)((Object)zzbdv$zzaq)).zzbo();
        }
        this.zzg = zzbdv$zzap;
        this.zze = n3 = this.zze | 2;
    }

    private void zzE(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap.getClass();
        this.zzg = zzbdv$zzap;
        this.zze = n3 = this.zze | 2;
    }

    private void zzF(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzf = n3 = zzbdv$zzq.zza();
        this.zze = n3 = this.zze | 1;
    }

    public static zzbdv$zzac$zza zzc() {
        return (zzbdv$zzac$zza)zzc.zzaZ();
    }

    public static zzbdv$zzac$zza zzd(zzbdv$zzac zzbdv$zzac) {
        return (zzbdv$zzac$zza)zzc.zzba(zzbdv$zzac);
    }

    public static /* synthetic */ zzbdv$zzac zze() {
        return zzc;
    }

    public static zzbdv$zzac zzf() {
        return zzc;
    }

    public static zzbdv$zzac zzg(InputStream inputStream) {
        return (zzbdv$zzac)zzhbo.zzbk(zzc, inputStream);
    }

    public static zzbdv$zzac zzk(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzac)zzhbo.zzbl(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzac zzl(zzhac zzhac2) {
        return (zzbdv$zzac)zzhbo.zzbm(zzc, zzhac2);
    }

    public static zzbdv$zzac zzm(zzham zzham2) {
        return (zzbdv$zzac)zzhbo.zzbn(zzc, zzham2);
    }

    public static zzbdv$zzac zzn(InputStream inputStream) {
        return (zzbdv$zzac)zzhbo.zzbo(zzc, inputStream);
    }

    public static zzbdv$zzac zzo(ByteBuffer byteBuffer) {
        return (zzbdv$zzac)zzhbo.zzbp(zzc, byteBuffer);
    }

    public static zzbdv$zzac zzp(byte[] byArray) {
        return (zzbdv$zzac)zzhbo.zzbq(zzc, byArray);
    }

    public static zzbdv$zzac zzq(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzac)zzhbo.zzbr(zzc, zzhac2, zzhay2);
    }

    public static zzbdv$zzac zzr(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzac)zzhbo.zzbs(zzc, zzham2, zzhay2);
    }

    public static zzbdv$zzac zzs(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzac)zzhbo.zzbu(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzac zzt(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzac)zzhbo.zzbv(zzc, byteBuffer, zzhay2);
    }

    public static zzbdv$zzac zzu(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzac)zzhbo.zzbx(zzc, byArray, zzhay2);
    }

    public static zzhdm zzv() {
        return zzc.zzbM();
    }

    public static /* synthetic */ void zzw(zzbdv$zzac zzbdv$zzac, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzac.zzF(zzbdv$zzq);
    }

    public static /* synthetic */ void zzx(zzbdv$zzac zzbdv$zzac) {
        zzbdv$zzac.zzC();
    }

    public static /* synthetic */ void zzy(zzbdv$zzac zzbdv$zzac, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzac.zzE(zzbdv$zzap);
    }

    public static /* synthetic */ void zzz(zzbdv$zzac zzbdv$zzac, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzac.zzD(zzbdv$zzap);
    }

    public zzbdv$zzq zza() {
        int n3 = this.zzf;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zza;
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
                object = zzd;
                if (object != null) return object;
                clazz = zzbdv$zzac.class;
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
                return new zzbdv$zzac$zza(null);
            }
            case 3: {
                return new zzbdv$zzac();
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

    public zzbdv$zzap zzh() {
        zzbdv$zzap zzbdv$zzap = this.zzg;
        if (zzbdv$zzap == null) {
            zzbdv$zzap = zzbdv$zzap.zzf();
        }
        return zzbdv$zzap;
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

