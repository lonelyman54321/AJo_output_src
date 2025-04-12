/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzb$zza;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzb;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzc;
import com.google.android.gms.internal.ads.zzbdv$zzc;
import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbdv$zzb
extends zzhbo
implements zzbdv$zzc {
    public static final int zza = 1;
    private static final zzbdv$zzb zzb;
    private static volatile zzhdm zzc;
    private zzhca zzd;

    static {
        zzbdv$zzb zzbdv$zzb;
        zzb = zzbdv$zzb = new zzbdv$zzb();
        zzhbo.zzca(zzbdv$zzb.class, zzbdv$zzb);
    }

    private zzbdv$zzb() {
        zzhca zzhca2;
        this.zzd = zzhca2 = zzhbo.zzbK();
    }

    public static /* synthetic */ void zzA(zzbdv$zzb zzbdv$zzb) {
        zzbdv$zzb.zzF();
    }

    public static /* synthetic */ void zzB(zzbdv$zzb zzbdv$zzb, int n3) {
        zzbdv$zzb.zzH(n3);
    }

    private void zzC(Iterable iterable) {
        this.zzG();
        zzhca zzhca2 = this.zzd;
        zzgzi.zzaQ(iterable, zzhca2);
    }

    private void zzD(zzbdv$zzb$zza zzbdv$zzb$zza) {
        zzbdv$zzb$zza.getClass();
        this.zzG();
        this.zzd.add(zzbdv$zzb$zza);
    }

    private void zzE(int n3, zzbdv$zzb$zza zzbdv$zzb$zza) {
        zzbdv$zzb$zza.getClass();
        this.zzG();
        this.zzd.add(n3, zzbdv$zzb$zza);
    }

    private void zzF() {
        zzhca zzhca2;
        this.zzd = zzhca2 = zzhbo.zzbK();
    }

    private void zzG() {
        zzhca zzhca2 = this.zzd;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            this.zzd = zzhca2 = zzhbo.zzbL(zzhca2);
        }
    }

    private void zzH(int n3) {
        this.zzG();
        this.zzd.remove(n3);
    }

    private void zzI(int n3, zzbdv$zzb$zza zzbdv$zzb$zza) {
        zzbdv$zzb$zza.getClass();
        this.zzG();
        this.zzd.set(n3, zzbdv$zzb$zza);
    }

    public static zzbdv$zzb$zzc zzd() {
        return (zzbdv$zzb$zzc)zzb.zzaZ();
    }

    public static zzbdv$zzb$zzc zze(zzbdv$zzb zzbdv$zzb) {
        return (zzbdv$zzb$zzc)zzb.zzba(zzbdv$zzb);
    }

    public static /* synthetic */ zzbdv$zzb zzf() {
        return zzb;
    }

    public static zzbdv$zzb zzg() {
        return zzb;
    }

    public static zzbdv$zzb zzh(InputStream inputStream) {
        return (zzbdv$zzb)zzhbo.zzbk(zzb, inputStream);
    }

    public static zzbdv$zzb zzi(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzb)zzhbo.zzbl(zzb, inputStream, zzhay2);
    }

    public static zzbdv$zzb zzj(zzhac zzhac2) {
        return (zzbdv$zzb)zzhbo.zzbm(zzb, zzhac2);
    }

    public static zzbdv$zzb zzk(zzham zzham2) {
        return (zzbdv$zzb)zzhbo.zzbn(zzb, zzham2);
    }

    public static zzbdv$zzb zzm(InputStream inputStream) {
        return (zzbdv$zzb)zzhbo.zzbo(zzb, inputStream);
    }

    public static zzbdv$zzb zzn(ByteBuffer byteBuffer) {
        return (zzbdv$zzb)zzhbo.zzbp(zzb, byteBuffer);
    }

    public static zzbdv$zzb zzo(byte[] byArray) {
        return (zzbdv$zzb)zzhbo.zzbq(zzb, byArray);
    }

    public static zzbdv$zzb zzp(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzb)zzhbo.zzbr(zzb, zzhac2, zzhay2);
    }

    public static zzbdv$zzb zzq(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzb)zzhbo.zzbs(zzb, zzham2, zzhay2);
    }

    public static zzbdv$zzb zzr(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzb)zzhbo.zzbu(zzb, inputStream, zzhay2);
    }

    public static zzbdv$zzb zzs(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzb)zzhbo.zzbv(zzb, byteBuffer, zzhay2);
    }

    public static zzbdv$zzb zzt(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzb)zzhbo.zzbx(zzb, byArray, zzhay2);
    }

    public static zzhdm zzu() {
        return zzb.zzbM();
    }

    public static /* synthetic */ void zzw(zzbdv$zzb zzbdv$zzb, int n3, zzbdv$zzb$zza zzbdv$zzb$zza) {
        zzbdv$zzb.zzI(n3, zzbdv$zzb$zza);
    }

    public static /* synthetic */ void zzx(zzbdv$zzb zzbdv$zzb, zzbdv$zzb$zza zzbdv$zzb$zza) {
        zzbdv$zzb.zzD(zzbdv$zzb$zza);
    }

    public static /* synthetic */ void zzy(zzbdv$zzb zzbdv$zzb, int n3, zzbdv$zzb$zza zzbdv$zzb$zza) {
        zzbdv$zzb.zzE(n3, zzbdv$zzb$zza);
    }

    public static /* synthetic */ void zzz(zzbdv$zzb zzbdv$zzb, Iterable iterable) {
        zzbdv$zzb.zzC(iterable);
    }

    public int zza() {
        return this.zzd.size();
    }

    public zzbdv$zzb$zza zzb(int n3) {
        return (zzbdv$zzb$zza)this.zzd.get(n3);
    }

    public zzbdv$zzb$zzb zzc(int n3) {
        return (zzbdv$zzb$zzb)this.zzd.get(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = zzhbn.zza;
        int n3 = object.ordinal();
        object2 = null;
        switch (n3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 6: {
                object = zzc;
                if (object != null) return object;
                clazz = zzbdv$zzb.class;
                synchronized (clazz) {
                    try {
                        object = zzc;
                        if (object != null) return object;
                        object2 = zzb;
                        zzc = object = new zzhbj((zzhbo)object2);
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
                return new zzbdv$zzb$zzc(null);
            }
            case 3: {
                return new zzbdv$zzb();
            }
            case 2: {
                object = new Object[2];
                object[0] = "zzd";
                object[by2] = zzbdv$zzb$zza.class;
                return zzhbo.zzbR(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public List zzl() {
        return this.zzd;
    }

    public List zzv() {
        return this.zzd;
    }
}

