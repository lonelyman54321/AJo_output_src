/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzap;
import com.google.android.gms.internal.ads.zzbdv$zzaq;
import com.google.android.gms.internal.ads.zzbdv$zzq;
import com.google.android.gms.internal.ads.zzbdv$zzv$zza;
import com.google.android.gms.internal.ads.zzbdv$zzw;
import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbdv$zzv
extends zzhbo
implements zzbdv$zzw {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final zzbdv$zzv zze;
    private static volatile zzhdm zzf;
    private int zzg;
    private String zzh = "";
    private int zzi;
    private zzhbw zzj;
    private zzbdv$zzap zzk;

    static {
        zzbdv$zzv zzbdv$zzv;
        zze = zzbdv$zzv = new zzbdv$zzv();
        zzhbo.zzca(zzbdv$zzv.class, zzbdv$zzv);
    }

    private zzbdv$zzv() {
        zzhbw zzhbw2;
        this.zzj = zzhbw2 = zzhbo.zzbG();
    }

    public static zzhdm zzA() {
        return zze.zzbM();
    }

    public static /* synthetic */ void zzB(zzbdv$zzv zzbdv$zzv, String string2) {
        zzbdv$zzv.zzV(string2);
    }

    public static /* synthetic */ void zzC(zzbdv$zzv zzbdv$zzv) {
        zzbdv$zzv.zzP();
    }

    public static /* synthetic */ void zzD(zzbdv$zzv zzbdv$zzv, zzhac zzhac2) {
        zzbdv$zzv.zzW(zzhac2);
    }

    public static /* synthetic */ void zzE(zzbdv$zzv zzbdv$zzv, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzv.zzY(zzbdv$zzq);
    }

    public static /* synthetic */ void zzF(zzbdv$zzv zzbdv$zzv) {
        zzbdv$zzv.zzR();
    }

    public static /* synthetic */ void zzG(zzbdv$zzv zzbdv$zzv, int n3, int n4) {
        zzbdv$zzv.zzZ(n3, n4);
    }

    public static /* synthetic */ void zzH(zzbdv$zzv zzbdv$zzv, int n3) {
        zzbdv$zzv.zzO(n3);
    }

    public static /* synthetic */ void zzI(zzbdv$zzv zzbdv$zzv, Iterable iterable) {
        zzbdv$zzv.zzN(iterable);
    }

    public static /* synthetic */ void zzJ(zzbdv$zzv zzbdv$zzv) {
        zzbdv$zzv.zzS();
    }

    public static /* synthetic */ void zzK(zzbdv$zzv zzbdv$zzv, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzv.zzX(zzbdv$zzap);
    }

    public static /* synthetic */ void zzL(zzbdv$zzv zzbdv$zzv, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzv.zzU(zzbdv$zzap);
    }

    public static /* synthetic */ void zzM(zzbdv$zzv zzbdv$zzv) {
        zzbdv$zzv.zzQ();
    }

    private void zzN(Iterable iterable) {
        this.zzT();
        zzhbw zzhbw2 = this.zzj;
        zzgzi.zzaQ(iterable, zzhbw2);
    }

    private void zzO(int n3) {
        this.zzT();
        this.zzj.zzi(n3);
    }

    private void zzP() {
        String string2;
        int n3;
        this.zzg = n3 = this.zzg & 0xFFFFFFFE;
        this.zzh = string2 = zzbdv$zzv.zzg().zzs();
    }

    private void zzQ() {
        int n3;
        this.zzk = null;
        this.zzg = n3 = this.zzg & 0xFFFFFFFB;
    }

    private void zzR() {
        int n3;
        this.zzg = n3 = this.zzg & 0xFFFFFFFD;
        this.zzi = 0;
    }

    private void zzS() {
        zzhbw zzhbw2;
        this.zzj = zzhbw2 = zzhbo.zzbG();
    }

    private void zzT() {
        zzhbw zzhbw2 = this.zzj;
        boolean bl2 = zzhbw2.zzc();
        if (!bl2) {
            this.zzj = zzhbw2 = zzhbo.zzbH(zzhbw2);
        }
    }

    private void zzU(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap zzbdv$zzap2;
        zzbdv$zzap.getClass();
        zzbdv$zzaq zzbdv$zzaq = this.zzk;
        if (zzbdv$zzaq != null && zzbdv$zzaq != (zzbdv$zzap2 = zzbdv$zzap.zzf())) {
            zzbdv$zzaq = zzbdv$zzap.zzd((zzbdv$zzap)zzbdv$zzaq);
            ((zzhbi)((Object)zzbdv$zzaq)).zzbj(zzbdv$zzap);
            zzbdv$zzap = (zzbdv$zzap)((zzhbi)((Object)zzbdv$zzaq)).zzbo();
        }
        this.zzk = zzbdv$zzap;
        this.zzg = n3 = this.zzg | 4;
    }

    private void zzV(String string2) {
        int n3;
        string2.getClass();
        this.zzg = n3 = this.zzg | 1;
        this.zzh = string2;
    }

    private void zzW(zzhac object) {
        int n3;
        this.zzh = object = ((zzhac)object).zzy();
        this.zzg = n3 = this.zzg | 1;
    }

    private void zzX(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap.getClass();
        this.zzk = zzbdv$zzap;
        this.zzg = n3 = this.zzg | 4;
    }

    private void zzY(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzi = n3 = zzbdv$zzq.zza();
        this.zzg = n3 = this.zzg | 2;
    }

    private void zzZ(int n3, int n4) {
        this.zzT();
        this.zzj.zze(n3, n4);
    }

    public static zzbdv$zzv$zza zzd() {
        return (zzbdv$zzv$zza)zze.zzaZ();
    }

    public static zzbdv$zzv$zza zze(zzbdv$zzv zzbdv$zzv) {
        return (zzbdv$zzv$zza)zze.zzba(zzbdv$zzv);
    }

    public static /* synthetic */ zzbdv$zzv zzf() {
        return zze;
    }

    public static zzbdv$zzv zzg() {
        return zze;
    }

    public static zzbdv$zzv zzh(InputStream inputStream) {
        return (zzbdv$zzv)zzhbo.zzbk(zze, inputStream);
    }

    public static zzbdv$zzv zzi(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzv)zzhbo.zzbl(zze, inputStream, zzhay2);
    }

    public static zzbdv$zzv zzj(zzhac zzhac2) {
        return (zzbdv$zzv)zzhbo.zzbm(zze, zzhac2);
    }

    public static zzbdv$zzv zzk(zzham zzham2) {
        return (zzbdv$zzv)zzhbo.zzbn(zze, zzham2);
    }

    public static zzbdv$zzv zzl(InputStream inputStream) {
        return (zzbdv$zzv)zzhbo.zzbo(zze, inputStream);
    }

    public static zzbdv$zzv zzm(ByteBuffer byteBuffer) {
        return (zzbdv$zzv)zzhbo.zzbp(zze, byteBuffer);
    }

    public static zzbdv$zzv zzn(byte[] byArray) {
        return (zzbdv$zzv)zzhbo.zzbq(zze, byArray);
    }

    public static zzbdv$zzv zzo(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzv)zzhbo.zzbr(zze, zzhac2, zzhay2);
    }

    public static zzbdv$zzv zzp(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzv)zzhbo.zzbs(zze, zzham2, zzhay2);
    }

    public static zzbdv$zzv zzx(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzv)zzhbo.zzbu(zze, inputStream, zzhay2);
    }

    public static zzbdv$zzv zzy(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzv)zzhbo.zzbv(zze, byteBuffer, zzhay2);
    }

    public static zzbdv$zzv zzz(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzv)zzhbo.zzbx(zze, byArray, zzhay2);
    }

    public int zza(int n3) {
        return this.zzj.zzd(n3);
    }

    public int zzb() {
        return this.zzj.size();
    }

    public zzbdv$zzq zzc() {
        int n3 = this.zzi;
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
                object = zzf;
                if (object != null) return object;
                clazz = zzbdv$zzv.class;
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
                return new zzbdv$zzv$zza(null);
            }
            case 3: {
                return new zzbdv$zzv();
            }
            case 2: {
                object = zzbdv$zzq.zze();
                objectArray = new Object[6];
                objectArray[0] = "zzg";
                objectArray[by2] = "zzh";
                objectArray[2] = "zzi";
                objectArray[3] = object;
                objectArray[4] = "zzj";
                objectArray[5] = "zzk";
                return zzhbo.zzbR(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u0016\u0004\u1009\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzap zzq() {
        zzbdv$zzap zzbdv$zzap = this.zzk;
        if (zzbdv$zzap == null) {
            zzbdv$zzap = zzbdv$zzap.zzf();
        }
        return zzbdv$zzap;
    }

    public zzhac zzr() {
        return zzhac.zzw(this.zzh);
    }

    public String zzs() {
        return this.zzh;
    }

    public List zzt() {
        return this.zzj;
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
        int n3 = this.zzg & 4;
        return n3 != 0;
    }

    public boolean zzw() {
        int n3 = this.zzg & 2;
        return n3 != 0;
    }
}

