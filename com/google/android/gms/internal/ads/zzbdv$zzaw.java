/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzaw$zza;
import com.google.android.gms.internal.ads.zzbdv$zzaw$zzb;
import com.google.android.gms.internal.ads.zzbdv$zzax;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbdv$zzaw
extends zzhbo
implements zzbdv$zzax {
    public static final int zza = 1;
    private static final zzbdv$zzaw zzb;
    private static volatile zzhdm zzc;
    private int zzd;
    private int zze;

    static {
        zzbdv$zzaw zzbdv$zzaw;
        zzb = zzbdv$zzaw = new zzbdv$zzaw();
        zzhbo.zzca(zzbdv$zzaw.class, zzbdv$zzaw);
    }

    private zzbdv$zzaw() {
    }

    public static zzbdv$zzaw$zza zza() {
        return (zzbdv$zzaw$zza)zzb.zzaZ();
    }

    public static zzbdv$zzaw$zza zze(zzbdv$zzaw zzbdv$zzaw) {
        return (zzbdv$zzaw$zza)zzb.zzba(zzbdv$zzaw);
    }

    public static /* synthetic */ zzbdv$zzaw zzf() {
        return zzb;
    }

    public static zzbdv$zzaw zzg() {
        return zzb;
    }

    public static zzbdv$zzaw zzh(InputStream inputStream) {
        return (zzbdv$zzaw)zzhbo.zzbk(zzb, inputStream);
    }

    public static zzbdv$zzaw zzi(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzaw)zzhbo.zzbl(zzb, inputStream, zzhay2);
    }

    public static zzbdv$zzaw zzj(zzhac zzhac2) {
        return (zzbdv$zzaw)zzhbo.zzbm(zzb, zzhac2);
    }

    public static zzbdv$zzaw zzk(zzham zzham2) {
        return (zzbdv$zzaw)zzhbo.zzbn(zzb, zzham2);
    }

    public static zzbdv$zzaw zzl(InputStream inputStream) {
        return (zzbdv$zzaw)zzhbo.zzbo(zzb, inputStream);
    }

    public static zzbdv$zzaw zzm(ByteBuffer byteBuffer) {
        return (zzbdv$zzaw)zzhbo.zzbp(zzb, byteBuffer);
    }

    public static zzbdv$zzaw zzn(byte[] byArray) {
        return (zzbdv$zzaw)zzhbo.zzbq(zzb, byArray);
    }

    public static zzbdv$zzaw zzo(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzaw)zzhbo.zzbr(zzb, zzhac2, zzhay2);
    }

    public static zzbdv$zzaw zzp(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzaw)zzhbo.zzbs(zzb, zzham2, zzhay2);
    }

    public static zzbdv$zzaw zzq(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzaw)zzhbo.zzbu(zzb, inputStream, zzhay2);
    }

    public static zzbdv$zzaw zzr(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzaw)zzhbo.zzbv(zzb, byteBuffer, zzhay2);
    }

    public static zzbdv$zzaw zzs(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzaw)zzhbo.zzbx(zzb, byArray, zzhay2);
    }

    public static zzhdm zzt() {
        return zzb.zzbM();
    }

    public static /* synthetic */ void zzu(zzbdv$zzaw zzbdv$zzaw, zzbdv$zzaw$zzb zzbdv$zzaw$zzb) {
        zzbdv$zzaw.zzx(zzbdv$zzaw$zzb);
    }

    public static /* synthetic */ void zzv(zzbdv$zzaw zzbdv$zzaw) {
        zzbdv$zzaw.zzw();
    }

    private void zzw() {
        int n3;
        this.zzd = n3 = this.zzd & 0xFFFFFFFE;
        this.zze = 0;
    }

    private void zzx(zzbdv$zzaw$zzb zzbdv$zzaw$zzb) {
        int n3;
        this.zze = n3 = zzbdv$zzaw$zzb.zza();
        this.zzd = n3 = this.zzd | 1;
    }

    public zzbdv$zzaw$zzb zzc() {
        int n3 = this.zze;
        zzbdv$zzaw$zzb zzbdv$zzaw$zzb = zzbdv$zzaw$zzb.zzb(n3);
        if (zzbdv$zzaw$zzb == null) {
            zzbdv$zzaw$zzb = zzbdv$zzaw$zzb.zza;
        }
        return zzbdv$zzaw$zzb;
    }

    public boolean zzd() {
        int n3 = this.zzd;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
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
                object = zzc;
                if (object != null) return object;
                clazz = zzbdv$zzaw.class;
                synchronized (clazz) {
                    try {
                        object = zzc;
                        if (object != null) return object;
                        objectArray = zzb;
                        object = new zzhbj((zzhbo)objectArray);
                        zzc = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzb;
            }
            case 4: {
                return new zzbdv$zzaw$zza(null);
            }
            case 3: {
                return new zzbdv$zzaw();
            }
            case 2: {
                object = zzbdv$zzaw$zzb.zze();
                objectArray = new Object[3];
                objectArray[0] = "zzd";
                objectArray[by2] = "zze";
                objectArray[2] = object;
                return zzhbo.zzbR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}

