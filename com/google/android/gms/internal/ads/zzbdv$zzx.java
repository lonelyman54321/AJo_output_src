/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzq;
import com.google.android.gms.internal.ads.zzbdv$zzx$zza;
import com.google.android.gms.internal.ads.zzbdv$zzy;
import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbdv$zzx
extends zzhbo
implements zzbdv$zzy {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbdv$zzx zzc;
    private static volatile zzhdm zzd;
    private int zze;
    private int zzf;
    private zzhbw zzg;

    static {
        zzbdv$zzx zzbdv$zzx;
        zzc = zzbdv$zzx = new zzbdv$zzx();
        zzhbo.zzca(zzbdv$zzx.class, zzbdv$zzx);
    }

    private zzbdv$zzx() {
        zzhbw zzhbw2;
        this.zzg = zzhbw2 = zzhbo.zzbG();
    }

    public static /* synthetic */ void zzA(zzbdv$zzx zzbdv$zzx, Iterable iterable) {
        zzbdv$zzx.zzC(iterable);
    }

    public static /* synthetic */ void zzB(zzbdv$zzx zzbdv$zzx) {
        zzbdv$zzx.zzE();
    }

    private void zzC(Iterable iterable) {
        this.zzG();
        zzhbw zzhbw2 = this.zzg;
        zzgzi.zzaQ(iterable, zzhbw2);
    }

    private void zzD(int n3) {
        this.zzG();
        this.zzg.zzi(n3);
    }

    private void zzE() {
        zzhbw zzhbw2;
        this.zzg = zzhbw2 = zzhbo.zzbG();
    }

    private void zzF() {
        int n3;
        this.zze = n3 = this.zze & 0xFFFFFFFE;
        this.zzf = 0;
    }

    private void zzG() {
        zzhbw zzhbw2 = this.zzg;
        boolean bl2 = zzhbw2.zzc();
        if (!bl2) {
            this.zzg = zzhbw2 = zzhbo.zzbH(zzhbw2);
        }
    }

    private void zzH(int n3, int n4) {
        this.zzG();
        this.zzg.zze(n3, n4);
    }

    private void zzI(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzf = n3 = zzbdv$zzq.zza();
        this.zze = n3 = this.zze | 1;
    }

    public static zzbdv$zzx$zza zzd() {
        return (zzbdv$zzx$zza)zzc.zzaZ();
    }

    public static zzbdv$zzx$zza zze(zzbdv$zzx zzbdv$zzx) {
        return (zzbdv$zzx$zza)zzc.zzba(zzbdv$zzx);
    }

    public static /* synthetic */ zzbdv$zzx zzf() {
        return zzc;
    }

    public static zzbdv$zzx zzg() {
        return zzc;
    }

    public static zzbdv$zzx zzh(InputStream inputStream) {
        return (zzbdv$zzx)zzhbo.zzbk(zzc, inputStream);
    }

    public static zzbdv$zzx zzi(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzx)zzhbo.zzbl(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzx zzl(zzhac zzhac2) {
        return (zzbdv$zzx)zzhbo.zzbm(zzc, zzhac2);
    }

    public static zzbdv$zzx zzm(zzham zzham2) {
        return (zzbdv$zzx)zzhbo.zzbn(zzc, zzham2);
    }

    public static zzbdv$zzx zzn(InputStream inputStream) {
        return (zzbdv$zzx)zzhbo.zzbo(zzc, inputStream);
    }

    public static zzbdv$zzx zzo(ByteBuffer byteBuffer) {
        return (zzbdv$zzx)zzhbo.zzbp(zzc, byteBuffer);
    }

    public static zzbdv$zzx zzp(byte[] byArray) {
        return (zzbdv$zzx)zzhbo.zzbq(zzc, byArray);
    }

    public static zzbdv$zzx zzq(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzx)zzhbo.zzbr(zzc, zzhac2, zzhay2);
    }

    public static zzbdv$zzx zzr(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzx)zzhbo.zzbs(zzc, zzham2, zzhay2);
    }

    public static zzbdv$zzx zzs(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzx)zzhbo.zzbu(zzc, inputStream, zzhay2);
    }

    public static zzbdv$zzx zzt(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzx)zzhbo.zzbv(zzc, byteBuffer, zzhay2);
    }

    public static zzbdv$zzx zzu(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzx)zzhbo.zzbx(zzc, byArray, zzhay2);
    }

    public static zzhdm zzv() {
        return zzc.zzbM();
    }

    public static /* synthetic */ void zzw(zzbdv$zzx zzbdv$zzx, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzx.zzI(zzbdv$zzq);
    }

    public static /* synthetic */ void zzx(zzbdv$zzx zzbdv$zzx) {
        zzbdv$zzx.zzF();
    }

    public static /* synthetic */ void zzy(zzbdv$zzx zzbdv$zzx, int n3, int n4) {
        zzbdv$zzx.zzH(n3, n4);
    }

    public static /* synthetic */ void zzz(zzbdv$zzx zzbdv$zzx, int n3) {
        zzbdv$zzx.zzD(n3);
    }

    public int zza(int n3) {
        return this.zzg.zzd(n3);
    }

    public int zzb() {
        return this.zzg.size();
    }

    public zzbdv$zzq zzc() {
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
                clazz = zzbdv$zzx.class;
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
                return new zzbdv$zzx$zza(null);
            }
            case 3: {
                return new zzbdv$zzx();
            }
            case 2: {
                object = zzbdv$zzq.zze();
                objectArray = new Object[4];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = object;
                objectArray[3] = "zzg";
                return zzhbo.zzbR(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u0016", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public List zzj() {
        return this.zzg;
    }

    public boolean zzk() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

