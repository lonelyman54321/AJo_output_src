/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzd;
import com.google.android.gms.internal.ads.zzbdv$zze;
import com.google.android.gms.internal.ads.zzbdv$zzg$zza;
import com.google.android.gms.internal.ads.zzbdv$zzh;
import com.google.android.gms.internal.ads.zzbdv$zzq;
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

public final class zzbdv$zzg
extends zzhbo
implements zzbdv$zzh {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbdv$zzg zzd;
    private static volatile zzhdm zze;
    private int zzf;
    private String zzg = "";
    private zzhca zzh;
    private int zzi;

    static {
        zzbdv$zzg zzbdv$zzg;
        zzd = zzbdv$zzg = new zzbdv$zzg();
        zzhbo.zzca(zzbdv$zzg.class, zzbdv$zzg);
    }

    private zzbdv$zzg() {
        zzhca zzhca2;
        this.zzh = zzhca2 = zzhbo.zzbK();
    }

    public static /* synthetic */ void zzB(zzbdv$zzg zzbdv$zzg, String string2) {
        zzbdv$zzg.zzU(string2);
    }

    public static /* synthetic */ void zzC(zzbdv$zzg zzbdv$zzg) {
        zzbdv$zzg.zzP();
    }

    public static /* synthetic */ void zzD(zzbdv$zzg zzbdv$zzg, zzhac zzhac2) {
        zzbdv$zzg.zzV(zzhac2);
    }

    public static /* synthetic */ void zzE(zzbdv$zzg zzbdv$zzg, int n3, zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzg.zzX(n3, zzbdv$zzd);
    }

    public static /* synthetic */ void zzF(zzbdv$zzg zzbdv$zzg, zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzg.zzN(zzbdv$zzd);
    }

    public static /* synthetic */ void zzG(zzbdv$zzg zzbdv$zzg, int n3, zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzg.zzO(n3, zzbdv$zzd);
    }

    public static /* synthetic */ void zzH(zzbdv$zzg zzbdv$zzg, Iterable iterable) {
        zzbdv$zzg.zzM(iterable);
    }

    public static /* synthetic */ void zzI(zzbdv$zzg zzbdv$zzg) {
        zzbdv$zzg.zzR();
    }

    public static /* synthetic */ void zzJ(zzbdv$zzg zzbdv$zzg, int n3) {
        zzbdv$zzg.zzT(n3);
    }

    public static /* synthetic */ void zzK(zzbdv$zzg zzbdv$zzg, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzg.zzW(zzbdv$zzq);
    }

    public static /* synthetic */ void zzL(zzbdv$zzg zzbdv$zzg) {
        zzbdv$zzg.zzQ();
    }

    private void zzM(Iterable iterable) {
        this.zzS();
        zzhca zzhca2 = this.zzh;
        zzgzi.zzaQ(iterable, zzhca2);
    }

    private void zzN(zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzd.getClass();
        this.zzS();
        this.zzh.add(zzbdv$zzd);
    }

    private void zzO(int n3, zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzd.getClass();
        this.zzS();
        this.zzh.add(n3, zzbdv$zzd);
    }

    private void zzP() {
        String string2;
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFE;
        this.zzg = string2 = zzbdv$zzg.zzg().zzs();
    }

    private void zzQ() {
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFD;
        this.zzi = 0;
    }

    private void zzR() {
        zzhca zzhca2;
        this.zzh = zzhca2 = zzhbo.zzbK();
    }

    private void zzS() {
        zzhca zzhca2 = this.zzh;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            this.zzh = zzhca2 = zzhbo.zzbL(zzhca2);
        }
    }

    private void zzT(int n3) {
        this.zzS();
        this.zzh.remove(n3);
    }

    private void zzU(String string2) {
        int n3;
        string2.getClass();
        this.zzf = n3 = this.zzf | 1;
        this.zzg = string2;
    }

    private void zzV(zzhac object) {
        int n3;
        this.zzg = object = ((zzhac)object).zzy();
        this.zzf = n3 = this.zzf | 1;
    }

    private void zzW(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzi = n3 = zzbdv$zzq.zza();
        this.zzf = n3 = this.zzf | 2;
    }

    private void zzX(int n3, zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzd.getClass();
        this.zzS();
        this.zzh.set(n3, zzbdv$zzd);
    }

    public static zzbdv$zzg$zza zzd() {
        return (zzbdv$zzg$zza)zzd.zzaZ();
    }

    public static zzbdv$zzg$zza zze(zzbdv$zzg zzbdv$zzg) {
        return (zzbdv$zzg$zza)zzd.zzba(zzbdv$zzg);
    }

    public static /* synthetic */ zzbdv$zzg zzf() {
        return zzd;
    }

    public static zzbdv$zzg zzg() {
        return zzd;
    }

    public static zzbdv$zzg zzh(InputStream inputStream) {
        return (zzbdv$zzg)zzhbo.zzbk(zzd, inputStream);
    }

    public static zzbdv$zzg zzi(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzg)zzhbo.zzbl(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzg zzj(zzhac zzhac2) {
        return (zzbdv$zzg)zzhbo.zzbm(zzd, zzhac2);
    }

    public static zzbdv$zzg zzk(zzham zzham2) {
        return (zzbdv$zzg)zzhbo.zzbn(zzd, zzham2);
    }

    public static zzbdv$zzg zzl(InputStream inputStream) {
        return (zzbdv$zzg)zzhbo.zzbo(zzd, inputStream);
    }

    public static zzbdv$zzg zzm(ByteBuffer byteBuffer) {
        return (zzbdv$zzg)zzhbo.zzbp(zzd, byteBuffer);
    }

    public static zzbdv$zzg zzn(byte[] byArray) {
        return (zzbdv$zzg)zzhbo.zzbq(zzd, byArray);
    }

    public static zzbdv$zzg zzo(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzg)zzhbo.zzbr(zzd, zzhac2, zzhay2);
    }

    public static zzbdv$zzg zzp(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzg)zzhbo.zzbs(zzd, zzham2, zzhay2);
    }

    public static zzbdv$zzg zzw(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzg)zzhbo.zzbu(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzg zzx(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzg)zzhbo.zzbv(zzd, byteBuffer, zzhay2);
    }

    public static zzbdv$zzg zzy(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzg)zzhbo.zzbx(zzd, byArray, zzhay2);
    }

    public static zzhdm zzz() {
        return zzd.zzbM();
    }

    public List zzA() {
        return this.zzh;
    }

    public int zza() {
        return this.zzh.size();
    }

    public zzbdv$zzd zzb(int n3) {
        return (zzbdv$zzd)this.zzh.get(n3);
    }

    public zzbdv$zze zzc(int n3) {
        return (zzbdv$zze)this.zzh.get(n3);
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
                object = zze;
                if (object != null) return object;
                clazz = zzbdv$zzg.class;
                synchronized (clazz) {
                    try {
                        object = zze;
                        if (object != null) return object;
                        objectArray = zzd;
                        object = new zzhbj((zzhbo)objectArray);
                        zze = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzd;
            }
            case 4: {
                return new zzbdv$zzg$zza(null);
            }
            case 3: {
                return new zzbdv$zzg();
            }
            case 2: {
                object = zzbdv$zzq.zze();
                objectArray = new Object[6];
                objectArray[0] = "zzf";
                objectArray[by2] = "zzg";
                objectArray[2] = "zzh";
                objectArray[3] = zzbdv$zzd.class;
                objectArray[4] = "zzi";
                objectArray[5] = object;
                return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u180c\u0001", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzq zzq() {
        int n3 = this.zzi;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zza;
        }
        return zzbdv$zzq;
    }

    public zzhac zzr() {
        return zzhac.zzw(this.zzg);
    }

    public String zzs() {
        return this.zzg;
    }

    public List zzt() {
        return this.zzh;
    }

    public boolean zzu() {
        int n3 = this.zzf;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzv() {
        int n3 = this.zzf & 2;
        return n3 != 0;
    }
}

