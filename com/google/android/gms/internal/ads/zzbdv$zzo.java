/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzar;
import com.google.android.gms.internal.ads.zzbdv$zzas;
import com.google.android.gms.internal.ads.zzbdv$zzo$zza;
import com.google.android.gms.internal.ads.zzbdv$zzo$zzb;
import com.google.android.gms.internal.ads.zzbdv$zzp;
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

public final class zzbdv$zzo
extends zzhbo
implements zzbdv$zzp {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final zzbdv$zzo zze;
    private static volatile zzhdm zzf;
    private int zzg;
    private int zzh;
    private zzbdv$zzar zzi;
    private String zzj;
    private String zzk;

    static {
        zzbdv$zzo zzbdv$zzo;
        zze = zzbdv$zzo = new zzbdv$zzo();
        zzhbo.zzca(zzbdv$zzo.class, zzbdv$zzo);
    }

    private zzbdv$zzo() {
        String string2;
        this.zzj = string2 = "";
        this.zzk = string2;
    }

    public static zzbdv$zzo zzA(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzo)zzhbo.zzbx(zze, byArray, zzhay2);
    }

    public static zzhdm zzB() {
        return zze.zzbM();
    }

    public static /* synthetic */ void zzC(zzbdv$zzo zzbdv$zzo, zzbdv$zzo$zzb zzbdv$zzo$zzb) {
        zzbdv$zzo.zzV(zzbdv$zzo$zzb);
    }

    public static /* synthetic */ void zzD(zzbdv$zzo zzbdv$zzo) {
        zzbdv$zzo.zzP();
    }

    public static /* synthetic */ void zzE(zzbdv$zzo zzbdv$zzo, zzbdv$zzar zzbdv$zzar) {
        zzbdv$zzo.zzU(zzbdv$zzar);
    }

    public static /* synthetic */ void zzF(zzbdv$zzo zzbdv$zzo, zzbdv$zzar zzbdv$zzar) {
        zzbdv$zzo.zzR(zzbdv$zzar);
    }

    public static /* synthetic */ void zzG(zzbdv$zzo zzbdv$zzo) {
        zzbdv$zzo.zzO();
    }

    public static /* synthetic */ void zzH(zzbdv$zzo zzbdv$zzo, String string2) {
        zzbdv$zzo.zzS(string2);
    }

    public static /* synthetic */ void zzI(zzbdv$zzo zzbdv$zzo) {
        zzbdv$zzo.zzN();
    }

    public static /* synthetic */ void zzJ(zzbdv$zzo zzbdv$zzo, zzhac zzhac2) {
        zzbdv$zzo.zzT(zzhac2);
    }

    public static /* synthetic */ void zzK(zzbdv$zzo zzbdv$zzo, String string2) {
        zzbdv$zzo.zzW(string2);
    }

    public static /* synthetic */ void zzL(zzbdv$zzo zzbdv$zzo) {
        zzbdv$zzo.zzQ();
    }

    public static /* synthetic */ void zzM(zzbdv$zzo zzbdv$zzo, zzhac zzhac2) {
        zzbdv$zzo.zzX(zzhac2);
    }

    private void zzN() {
        String string2;
        int n3;
        this.zzg = n3 = this.zzg & 0xFFFFFFFB;
        this.zzj = string2 = zzbdv$zzo.zze().zzq();
    }

    private void zzO() {
        int n3;
        this.zzi = null;
        this.zzg = n3 = this.zzg & 0xFFFFFFFD;
    }

    private void zzP() {
        int n3;
        this.zzg = n3 = this.zzg & 0xFFFFFFFE;
        this.zzh = 0;
    }

    private void zzQ() {
        String string2;
        int n3;
        this.zzg = n3 = this.zzg & 0xFFFFFFF7;
        this.zzk = string2 = zzbdv$zzo.zze().zzr();
    }

    private void zzR(zzbdv$zzar zzbdv$zzar) {
        int n3;
        zzbdv$zzar zzbdv$zzar2;
        zzbdv$zzar.getClass();
        zzbdv$zzas zzbdv$zzas = this.zzi;
        if (zzbdv$zzas != null && zzbdv$zzas != (zzbdv$zzar2 = zzbdv$zzar.zzg())) {
            zzbdv$zzas = zzbdv$zzar.zze((zzbdv$zzar)zzbdv$zzas);
            ((zzhbi)((Object)zzbdv$zzas)).zzbj(zzbdv$zzar);
            zzbdv$zzar = (zzbdv$zzar)((zzhbi)((Object)zzbdv$zzas)).zzbo();
        }
        this.zzi = zzbdv$zzar;
        this.zzg = n3 = this.zzg | 2;
    }

    private void zzS(String string2) {
        int n3;
        string2.getClass();
        this.zzg = n3 = this.zzg | 4;
        this.zzj = string2;
    }

    private void zzT(zzhac object) {
        int n3;
        this.zzj = object = ((zzhac)object).zzy();
        this.zzg = n3 = this.zzg | 4;
    }

    private void zzU(zzbdv$zzar zzbdv$zzar) {
        int n3;
        zzbdv$zzar.getClass();
        this.zzi = zzbdv$zzar;
        this.zzg = n3 = this.zzg | 2;
    }

    private void zzV(zzbdv$zzo$zzb zzbdv$zzo$zzb) {
        int n3;
        this.zzh = n3 = zzbdv$zzo$zzb.zza();
        this.zzg = n3 = this.zzg | 1;
    }

    private void zzW(String string2) {
        int n3;
        string2.getClass();
        this.zzg = n3 = this.zzg | 8;
        this.zzk = string2;
    }

    private void zzX(zzhac object) {
        int n3;
        this.zzk = object = ((zzhac)object).zzy();
        this.zzg = n3 = this.zzg | 8;
    }

    public static zzbdv$zzo$zza zza() {
        return (zzbdv$zzo$zza)zze.zzaZ();
    }

    public static zzbdv$zzo$zza zzc(zzbdv$zzo zzbdv$zzo) {
        return (zzbdv$zzo$zza)zze.zzba(zzbdv$zzo);
    }

    public static /* synthetic */ zzbdv$zzo zzd() {
        return zze;
    }

    public static zzbdv$zzo zze() {
        return zze;
    }

    public static zzbdv$zzo zzf(InputStream inputStream) {
        return (zzbdv$zzo)zzhbo.zzbk(zze, inputStream);
    }

    public static zzbdv$zzo zzg(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzo)zzhbo.zzbl(zze, inputStream, zzhay2);
    }

    public static zzbdv$zzo zzh(zzhac zzhac2) {
        return (zzbdv$zzo)zzhbo.zzbm(zze, zzhac2);
    }

    public static zzbdv$zzo zzi(zzham zzham2) {
        return (zzbdv$zzo)zzhbo.zzbn(zze, zzham2);
    }

    public static zzbdv$zzo zzj(InputStream inputStream) {
        return (zzbdv$zzo)zzhbo.zzbo(zze, inputStream);
    }

    public static zzbdv$zzo zzk(ByteBuffer byteBuffer) {
        return (zzbdv$zzo)zzhbo.zzbp(zze, byteBuffer);
    }

    public static zzbdv$zzo zzl(byte[] byArray) {
        return (zzbdv$zzo)zzhbo.zzbq(zze, byArray);
    }

    public static zzbdv$zzo zzw(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzo)zzhbo.zzbr(zze, zzhac2, zzhay2);
    }

    public static zzbdv$zzo zzx(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzo)zzhbo.zzbs(zze, zzham2, zzhay2);
    }

    public static zzbdv$zzo zzy(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzo)zzhbo.zzbu(zze, inputStream, zzhay2);
    }

    public static zzbdv$zzo zzz(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzo)zzhbo.zzbv(zze, byteBuffer, zzhay2);
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
                object = zzf;
                if (object != null) return object;
                clazz = zzbdv$zzo.class;
                synchronized (clazz) {
                    try {
                        object = zzf;
                        if (object != null) return object;
                        objectArray = zze;
                        object = new zzhbj((zzhbo)objectArray);
                        zzf = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zze;
            }
            case 4: {
                return new zzbdv$zzo$zza(null);
            }
            case 3: {
                return new zzbdv$zzo();
            }
            case 2: {
                object = zzbdv$zzo$zzb.zze();
                objectArray = new Object[6];
                objectArray[0] = "zzg";
                objectArray[by2] = "zzh";
                objectArray[2] = object;
                objectArray[3] = "zzi";
                objectArray[4] = "zzj";
                objectArray[5] = "zzk";
                return zzhbo.zzbR(zze, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005\u180c\u0000\u0006\u1009\u0001\u0007\u1008\u0002\b\u1008\u0003", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzo$zzb zzm() {
        int n3 = this.zzh;
        zzbdv$zzo$zzb zzbdv$zzo$zzb = zzbdv$zzo$zzb.zzb(n3);
        if (zzbdv$zzo$zzb == null) {
            zzbdv$zzo$zzb = zzbdv$zzo$zzb.zza;
        }
        return zzbdv$zzo$zzb;
    }

    public zzbdv$zzar zzn() {
        zzbdv$zzar zzbdv$zzar = this.zzi;
        if (zzbdv$zzar == null) {
            zzbdv$zzar = zzbdv$zzar.zzg();
        }
        return zzbdv$zzar;
    }

    public zzhac zzo() {
        return zzhac.zzw(this.zzj);
    }

    public zzhac zzp() {
        return zzhac.zzw(this.zzk);
    }

    public String zzq() {
        return this.zzj;
    }

    public String zzr() {
        return this.zzk;
    }

    public boolean zzs() {
        int n3 = this.zzg & 4;
        return n3 != 0;
    }

    public boolean zzt() {
        int n3 = this.zzg & 2;
        return n3 != 0;
    }

    public boolean zzu() {
        int n3 = this.zzg;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzv() {
        int n3 = this.zzg & 8;
        return n3 != 0;
    }
}

