/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzd;
import com.google.android.gms.internal.ads.zzbdv$zze;
import com.google.android.gms.internal.ads.zzbdv$zzi$zza;
import com.google.android.gms.internal.ads.zzbdv$zzj;
import com.google.android.gms.internal.ads.zzbdv$zzq;
import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbu;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbdv$zzi
extends zzhbo
implements zzbdv$zzj {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final zzbdv$zzi zzf;
    private static volatile zzhdm zzg;
    private int zzh;
    private String zzi = "";
    private zzhca zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        zzbdv$zzi zzbdv$zzi;
        zzf = zzbdv$zzi = new zzbdv$zzi();
        zzhbo.zzca(zzbdv$zzi.class, zzbdv$zzi);
    }

    private zzbdv$zzi() {
        int n3;
        zzhca zzhca2;
        this.zzj = zzhca2 = zzhbo.zzbK();
        this.zzk = n3 = 1000;
        this.zzl = n3;
        this.zzm = n3;
    }

    public static /* synthetic */ void zzF(zzbdv$zzi zzbdv$zzi, String string2) {
        zzbdv$zzi.zzaf(string2);
    }

    public static /* synthetic */ void zzG(zzbdv$zzi zzbdv$zzi) {
        zzbdv$zzi.zzY();
    }

    public static /* synthetic */ void zzH(zzbdv$zzi zzbdv$zzi, zzhac zzhac2) {
        zzbdv$zzi.zzag(zzhac2);
    }

    public static /* synthetic */ void zzI(zzbdv$zzi zzbdv$zzi, int n3, zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzi.zzaj(n3, zzbdv$zzd);
    }

    public static /* synthetic */ void zzJ(zzbdv$zzi zzbdv$zzi, zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzi.zzV(zzbdv$zzd);
    }

    public static /* synthetic */ void zzK(zzbdv$zzi zzbdv$zzi, int n3, zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzi.zzW(n3, zzbdv$zzd);
    }

    public static /* synthetic */ void zzL(zzbdv$zzi zzbdv$zzi, Iterable iterable) {
        zzbdv$zzi.zzU(iterable);
    }

    public static /* synthetic */ void zzM(zzbdv$zzi zzbdv$zzi) {
        zzbdv$zzi.zzab();
    }

    public static /* synthetic */ void zzN(zzbdv$zzi zzbdv$zzi, int n3) {
        zzbdv$zzi.zzad(n3);
    }

    public static /* synthetic */ void zzO(zzbdv$zzi zzbdv$zzi, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzi.zzai(zzbdv$zzq);
    }

    public static /* synthetic */ void zzP(zzbdv$zzi zzbdv$zzi) {
        zzbdv$zzi.zzaa();
    }

    public static /* synthetic */ void zzQ(zzbdv$zzi zzbdv$zzi, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzi.zzah(zzbdv$zzq);
    }

    public static /* synthetic */ void zzR(zzbdv$zzi zzbdv$zzi) {
        zzbdv$zzi.zzZ();
    }

    public static /* synthetic */ void zzS(zzbdv$zzi zzbdv$zzi, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzi.zzae(zzbdv$zzq);
    }

    public static /* synthetic */ void zzT(zzbdv$zzi zzbdv$zzi) {
        zzbdv$zzi.zzX();
    }

    private void zzU(Iterable iterable) {
        this.zzac();
        zzhca zzhca2 = this.zzj;
        zzgzi.zzaQ(iterable, zzhca2);
    }

    private void zzV(zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzd.getClass();
        this.zzac();
        this.zzj.add(zzbdv$zzd);
    }

    private void zzW(int n3, zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzd.getClass();
        this.zzac();
        this.zzj.add(n3, zzbdv$zzd);
    }

    private void zzX() {
        int n3;
        this.zzh = n3 = this.zzh & 0xFFFFFFF7;
        this.zzm = 1000;
    }

    private void zzY() {
        String string2;
        int n3;
        this.zzh = n3 = this.zzh & 0xFFFFFFFE;
        this.zzi = string2 = zzbdv$zzi.zzg().zzy();
    }

    private void zzZ() {
        int n3;
        this.zzh = n3 = this.zzh & 0xFFFFFFFB;
        this.zzl = 1000;
    }

    private void zzaa() {
        int n3;
        this.zzh = n3 = this.zzh & 0xFFFFFFFD;
        this.zzk = 1000;
    }

    private void zzab() {
        zzhca zzhca2;
        this.zzj = zzhca2 = zzhbo.zzbK();
    }

    private void zzac() {
        zzhca zzhca2 = this.zzj;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            this.zzj = zzhca2 = zzhbo.zzbL(zzhca2);
        }
    }

    private void zzad(int n3) {
        this.zzac();
        this.zzj.remove(n3);
    }

    private void zzae(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzm = n3 = zzbdv$zzq.zza();
        this.zzh = n3 = this.zzh | 8;
    }

    private void zzaf(String string2) {
        int n3;
        string2.getClass();
        this.zzh = n3 = this.zzh | 1;
        this.zzi = string2;
    }

    private void zzag(zzhac object) {
        int n3;
        this.zzi = object = ((zzhac)object).zzy();
        this.zzh = n3 = this.zzh | 1;
    }

    private void zzah(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzl = n3 = zzbdv$zzq.zza();
        this.zzh = n3 = this.zzh | 4;
    }

    private void zzai(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzk = n3 = zzbdv$zzq.zza();
        this.zzh = n3 = this.zzh | 2;
    }

    private void zzaj(int n3, zzbdv$zzd zzbdv$zzd) {
        zzbdv$zzd.getClass();
        this.zzac();
        this.zzj.set(n3, zzbdv$zzd);
    }

    public static zzbdv$zzi$zza zzd() {
        return (zzbdv$zzi$zza)zzf.zzaZ();
    }

    public static zzbdv$zzi$zza zze(zzbdv$zzi zzbdv$zzi) {
        return (zzbdv$zzi$zza)zzf.zzba(zzbdv$zzi);
    }

    public static /* synthetic */ zzbdv$zzi zzf() {
        return zzf;
    }

    public static zzbdv$zzi zzg() {
        return zzf;
    }

    public static zzbdv$zzi zzh(InputStream inputStream) {
        return (zzbdv$zzi)zzhbo.zzbk(zzf, inputStream);
    }

    public static zzbdv$zzi zzi(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzi)zzhbo.zzbl(zzf, inputStream, zzhay2);
    }

    public static zzbdv$zzi zzj(zzhac zzhac2) {
        return (zzbdv$zzi)zzhbo.zzbm(zzf, zzhac2);
    }

    public static zzbdv$zzi zzk(zzham zzham2) {
        return (zzbdv$zzi)zzhbo.zzbn(zzf, zzham2);
    }

    public static zzbdv$zzi zzl(InputStream inputStream) {
        return (zzbdv$zzi)zzhbo.zzbo(zzf, inputStream);
    }

    public static zzbdv$zzi zzm(ByteBuffer byteBuffer) {
        return (zzbdv$zzi)zzhbo.zzbp(zzf, byteBuffer);
    }

    public static zzbdv$zzi zzn(byte[] byArray) {
        return (zzbdv$zzi)zzhbo.zzbq(zzf, byArray);
    }

    public static zzbdv$zzi zzo(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzi)zzhbo.zzbr(zzf, zzhac2, zzhay2);
    }

    public static zzbdv$zzi zzp(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzi)zzhbo.zzbs(zzf, zzham2, zzhay2);
    }

    public static zzbdv$zzi zzq(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzi)zzhbo.zzbu(zzf, inputStream, zzhay2);
    }

    public static zzbdv$zzi zzr(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzi)zzhbo.zzbv(zzf, byteBuffer, zzhay2);
    }

    public static zzbdv$zzi zzs(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzi)zzhbo.zzbx(zzf, byArray, zzhay2);
    }

    public static zzhdm zzt() {
        return zzf.zzbM();
    }

    public boolean zzA() {
        int n3 = this.zzh & 8;
        return n3 != 0;
    }

    public boolean zzB() {
        int n3 = this.zzh;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzC() {
        int n3 = this.zzh & 4;
        return n3 != 0;
    }

    public boolean zzD() {
        int n3 = this.zzh & 2;
        return n3 != 0;
    }

    public List zzE() {
        return this.zzj;
    }

    public int zza() {
        return this.zzj.size();
    }

    public zzbdv$zzd zzb(int n3) {
        return (zzbdv$zzd)this.zzj.get(n3);
    }

    public zzbdv$zze zzc(int n3) {
        return (zzbdv$zze)this.zzj.get(n3);
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
                object = zzg;
                if (object != null) return object;
                clazz = zzbdv$zzi.class;
                synchronized (clazz) {
                    try {
                        object = zzg;
                        if (object != null) return object;
                        object2 = zzf;
                        object = new zzhbj((zzhbo)object2);
                        zzg = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzf;
            }
            case 4: {
                return new zzbdv$zzi$zza(null);
            }
            case 3: {
                return new zzbdv$zzi();
            }
            case 2: {
                object = zzbdv$zzq.zze();
                object2 = zzbdv$zzq.zze();
                zzhbu zzhbu2 = zzbdv$zzq.zze();
                Object[] objectArray = new Object[10];
                objectArray[0] = "zzh";
                objectArray[by2] = "zzi";
                objectArray[2] = "zzj";
                objectArray[3] = zzbdv$zzd.class;
                objectArray[4] = "zzk";
                objectArray[5] = object;
                objectArray[6] = "zzl";
                objectArray[7] = object2;
                objectArray[8] = "zzm";
                objectArray[9] = zzhbu2;
                return zzhbo.zzbR(zzf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u180c\u0001\u0004\u180c\u0002\u0005\u180c\u0003", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzq zzu() {
        int n3 = this.zzm;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zzc;
        }
        return zzbdv$zzq;
    }

    public zzbdv$zzq zzv() {
        int n3 = this.zzl;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zzc;
        }
        return zzbdv$zzq;
    }

    public zzbdv$zzq zzw() {
        int n3 = this.zzk;
        zzbdv$zzq zzbdv$zzq = zzbdv$zzq.zzb(n3);
        if (zzbdv$zzq == null) {
            zzbdv$zzq = zzbdv$zzq.zzc;
        }
        return zzbdv$zzq;
    }

    public zzhac zzx() {
        return zzhac.zzw(this.zzi);
    }

    public String zzy() {
        return this.zzi;
    }

    public List zzz() {
        return this.zzj;
    }
}

