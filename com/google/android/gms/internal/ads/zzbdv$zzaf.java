/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzaf$zza;
import com.google.android.gms.internal.ads.zzbdv$zzaf$zzb;
import com.google.android.gms.internal.ads.zzbdv$zzaf$zzc;
import com.google.android.gms.internal.ads.zzbdv$zzag;
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

public final class zzbdv$zzaf
extends zzhbo
implements zzbdv$zzag {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final zzbdv$zzaf zzi;
    private static volatile zzhdm zzj;
    private int zzk;
    private zzhca zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private String zzp;
    private String zzu;
    private long zzv;
    private int zzw;

    static {
        zzbdv$zzaf zzbdv$zzaf;
        zzi = zzbdv$zzaf = new zzbdv$zzaf();
        zzhbo.zzca(zzbdv$zzaf.class, zzbdv$zzaf);
    }

    private zzbdv$zzaf() {
        Object object = zzhbo.zzbK();
        this.zzl = object;
        this.zzp = object = "";
        this.zzu = object;
    }

    public static /* synthetic */ void zzA(zzbdv$zzaf zzbdv$zzaf, int n3, zzbdv$zzaf$zza zzbdv$zzaf$zza) {
        zzbdv$zzaf.zzaC(n3, zzbdv$zzaf$zza);
    }

    public static /* synthetic */ void zzB(zzbdv$zzaf zzbdv$zzaf, zzbdv$zzaf$zza zzbdv$zzaf$zza) {
        zzbdv$zzaf.zzaj(zzbdv$zzaf$zza);
    }

    public static /* synthetic */ void zzC(zzbdv$zzaf zzbdv$zzaf, int n3, zzbdv$zzaf$zza zzbdv$zzaf$zza) {
        zzbdv$zzaf.zzak(n3, zzbdv$zzaf$zza);
    }

    public static /* synthetic */ void zzD(zzbdv$zzaf zzbdv$zzaf, Iterable iterable) {
        zzbdv$zzaf.zzai(iterable);
    }

    public static /* synthetic */ void zzE(zzbdv$zzaf zzbdv$zzaf) {
        zzbdv$zzaf.zzaq();
    }

    public static /* synthetic */ void zzF(zzbdv$zzaf zzbdv$zzaf, int n3) {
        zzbdv$zzaf.zzau(n3);
    }

    public static /* synthetic */ void zzS(zzbdv$zzaf zzbdv$zzaf, int n3) {
        zzbdv$zzaf.zzaA(n3);
    }

    public static /* synthetic */ void zzT(zzbdv$zzaf zzbdv$zzaf) {
        zzbdv$zzaf.zzao();
    }

    public static /* synthetic */ void zzU(zzbdv$zzaf zzbdv$zzaf, int n3) {
        zzbdv$zzaf.zzaD(n3);
    }

    public static /* synthetic */ void zzV(zzbdv$zzaf zzbdv$zzaf) {
        zzbdv$zzaf.zzar();
    }

    public static /* synthetic */ void zzW(zzbdv$zzaf zzbdv$zzaf, long l2) {
        zzbdv$zzaf.zzaE(l2);
    }

    public static /* synthetic */ void zzX(zzbdv$zzaf zzbdv$zzaf) {
        zzbdv$zzaf.zzas();
    }

    public static /* synthetic */ void zzY(zzbdv$zzaf zzbdv$zzaf, String string2) {
        zzbdv$zzaf.zzav(string2);
    }

    public static /* synthetic */ void zzZ(zzbdv$zzaf zzbdv$zzaf) {
        zzbdv$zzaf.zzal();
    }

    private void zzaA(int n3) {
        int n4;
        this.zzk = n4 = this.zzk | 1;
        this.zzm = n3;
    }

    private void zzaB(long l2) {
        int n3;
        this.zzk = n3 = this.zzk | 0x20;
        this.zzv = l2;
    }

    private void zzaC(int n3, zzbdv$zzaf$zza zzbdv$zzaf$zza) {
        zzbdv$zzaf$zza.getClass();
        this.zzat();
        this.zzl.set(n3, zzbdv$zzaf$zza);
    }

    private void zzaD(int n3) {
        int n4;
        this.zzk = n4 = this.zzk | 2;
        this.zzn = n3;
    }

    private void zzaE(long l2) {
        int n3;
        this.zzk = n3 = this.zzk | 4;
        this.zzo = l2;
    }

    public static /* synthetic */ void zzaa(zzbdv$zzaf zzbdv$zzaf, zzhac zzhac2) {
        zzbdv$zzaf.zzaw(zzhac2);
    }

    public static /* synthetic */ void zzab(zzbdv$zzaf zzbdv$zzaf, String string2) {
        zzbdv$zzaf.zzay(string2);
    }

    public static /* synthetic */ void zzac(zzbdv$zzaf zzbdv$zzaf) {
        zzbdv$zzaf.zzan();
    }

    public static /* synthetic */ void zzad(zzbdv$zzaf zzbdv$zzaf, zzhac zzhac2) {
        zzbdv$zzaf.zzaz(zzhac2);
    }

    public static /* synthetic */ void zzae(zzbdv$zzaf zzbdv$zzaf, long l2) {
        zzbdv$zzaf.zzaB(l2);
    }

    public static /* synthetic */ void zzaf(zzbdv$zzaf zzbdv$zzaf) {
        zzbdv$zzaf.zzap();
    }

    public static /* synthetic */ void zzag(zzbdv$zzaf zzbdv$zzaf, int n3) {
        zzbdv$zzaf.zzax(n3);
    }

    public static /* synthetic */ void zzah(zzbdv$zzaf zzbdv$zzaf) {
        zzbdv$zzaf.zzam();
    }

    private void zzai(Iterable iterable) {
        this.zzat();
        zzhca zzhca2 = this.zzl;
        zzgzi.zzaQ(iterable, zzhca2);
    }

    private void zzaj(zzbdv$zzaf$zza zzbdv$zzaf$zza) {
        zzbdv$zzaf$zza.getClass();
        this.zzat();
        this.zzl.add(zzbdv$zzaf$zza);
    }

    private void zzak(int n3, zzbdv$zzaf$zza zzbdv$zzaf$zza) {
        zzbdv$zzaf$zza.getClass();
        this.zzat();
        this.zzl.add(n3, zzbdv$zzaf$zza);
    }

    private void zzal() {
        String string2;
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFF7;
        this.zzp = string2 = zzbdv$zzaf.zzl().zzI();
    }

    private void zzam() {
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFBF;
        this.zzw = 0;
    }

    private void zzan() {
        String string2;
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFEF;
        this.zzu = string2 = zzbdv$zzaf.zzl().zzJ();
    }

    private void zzao() {
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFFE;
        this.zzm = 0;
    }

    private void zzap() {
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFDF;
        this.zzv = 0L;
    }

    private void zzaq() {
        zzhca zzhca2;
        this.zzl = zzhca2 = zzhbo.zzbK();
    }

    private void zzar() {
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFFD;
        this.zzn = 0;
    }

    private void zzas() {
        int n3;
        this.zzk = n3 = this.zzk & 0xFFFFFFFB;
        this.zzo = 0L;
    }

    private void zzat() {
        zzhca zzhca2 = this.zzl;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            this.zzl = zzhca2 = zzhbo.zzbL(zzhca2);
        }
    }

    private void zzau(int n3) {
        this.zzat();
        this.zzl.remove(n3);
    }

    private void zzav(String string2) {
        int n3;
        string2.getClass();
        this.zzk = n3 = this.zzk | 8;
        this.zzp = string2;
    }

    private void zzaw(zzhac object) {
        int n3;
        this.zzp = object = ((zzhac)object).zzy();
        this.zzk = n3 = this.zzk | 8;
    }

    private void zzax(int n3) {
        int n4;
        this.zzk = n4 = this.zzk | 0x40;
        this.zzw = n3;
    }

    private void zzay(String string2) {
        int n3;
        string2.getClass();
        this.zzk = n3 = this.zzk | 0x10;
        this.zzu = string2;
    }

    private void zzaz(zzhac object) {
        int n3;
        this.zzu = object = ((zzhac)object).zzy();
        this.zzk = n3 = this.zzk | 0x10;
    }

    public static zzbdv$zzaf$zzc zzi() {
        return (zzbdv$zzaf$zzc)zzi.zzaZ();
    }

    public static zzbdv$zzaf$zzc zzj(zzbdv$zzaf zzbdv$zzaf) {
        return (zzbdv$zzaf$zzc)zzi.zzba(zzbdv$zzaf);
    }

    public static /* synthetic */ zzbdv$zzaf zzk() {
        return zzi;
    }

    public static zzbdv$zzaf zzl() {
        return zzi;
    }

    public static zzbdv$zzaf zzm(InputStream inputStream) {
        return (zzbdv$zzaf)zzhbo.zzbk(zzi, inputStream);
    }

    public static zzbdv$zzaf zzn(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzaf)zzhbo.zzbl(zzi, inputStream, zzhay2);
    }

    public static zzbdv$zzaf zzo(zzhac zzhac2) {
        return (zzbdv$zzaf)zzhbo.zzbm(zzi, zzhac2);
    }

    public static zzbdv$zzaf zzp(zzham zzham2) {
        return (zzbdv$zzaf)zzhbo.zzbn(zzi, zzham2);
    }

    public static zzbdv$zzaf zzq(InputStream inputStream) {
        return (zzbdv$zzaf)zzhbo.zzbo(zzi, inputStream);
    }

    public static zzbdv$zzaf zzr(ByteBuffer byteBuffer) {
        return (zzbdv$zzaf)zzhbo.zzbp(zzi, byteBuffer);
    }

    public static zzbdv$zzaf zzs(byte[] byArray) {
        return (zzbdv$zzaf)zzhbo.zzbq(zzi, byArray);
    }

    public static zzbdv$zzaf zzt(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzaf)zzhbo.zzbr(zzi, zzhac2, zzhay2);
    }

    public static zzbdv$zzaf zzu(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzaf)zzhbo.zzbs(zzi, zzham2, zzhay2);
    }

    public static zzbdv$zzaf zzv(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzaf)zzhbo.zzbu(zzi, inputStream, zzhay2);
    }

    public static zzbdv$zzaf zzw(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzaf)zzhbo.zzbv(zzi, byteBuffer, zzhay2);
    }

    public static zzbdv$zzaf zzx(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzaf)zzhbo.zzbx(zzi, byArray, zzhay2);
    }

    public static zzhdm zzy() {
        return zzi.zzbM();
    }

    public zzhac zzG() {
        return zzhac.zzw(this.zzp);
    }

    public zzhac zzH() {
        return zzhac.zzw(this.zzu);
    }

    public String zzI() {
        return this.zzp;
    }

    public String zzJ() {
        return this.zzu;
    }

    public List zzK() {
        return this.zzl;
    }

    public boolean zzL() {
        int n3 = this.zzk & 8;
        return n3 != 0;
    }

    public boolean zzM() {
        int n3 = this.zzk & 0x40;
        return n3 != 0;
    }

    public boolean zzN() {
        int n3 = this.zzk & 0x10;
        return n3 != 0;
    }

    public boolean zzO() {
        int n3 = this.zzk;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzP() {
        int n3 = this.zzk & 0x20;
        return n3 != 0;
    }

    public boolean zzQ() {
        int n3 = this.zzk & 2;
        return n3 != 0;
    }

    public boolean zzR() {
        int n3 = this.zzk & 4;
        return n3 != 0;
    }

    public int zza() {
        return this.zzw;
    }

    public int zzb() {
        return this.zzm;
    }

    public int zzc() {
        return this.zzl.size();
    }

    public int zzd() {
        return this.zzn;
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
                objectArray = zzj;
                if (objectArray != null) return objectArray;
                clazz = zzbdv$zzaf.class;
                synchronized (clazz) {
                    try {
                        objectArray = zzj;
                        if (objectArray != null) return objectArray;
                        object = zzi;
                        zzj = objectArray = new zzhbj((zzhbo)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzi;
            }
            case 4: {
                return new zzbdv$zzaf$zzc(null);
            }
            case 3: {
                return new zzbdv$zzaf();
            }
            case 2: {
                objectArray = new Object[10];
                objectArray[0] = "zzk";
                objectArray[by2] = "zzl";
                objectArray[2] = zzbdv$zzaf$zza.class;
                objectArray[3] = "zzm";
                objectArray[4] = "zzn";
                objectArray[5] = "zzo";
                objectArray[6] = "zzp";
                objectArray[7] = "zzu";
                objectArray[8] = "zzv";
                objectArray[9] = "zzw";
                return zzhbo.zzbR(zzi, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002\u1004\u0000\u0003\u1004\u0001\u0004\u1002\u0002\u0005\u1008\u0003\u0006\u1008\u0004\u0007\u1002\u0005\b\u1004\u0006", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public long zze() {
        return this.zzv;
    }

    public long zzf() {
        return this.zzo;
    }

    public zzbdv$zzaf$zza zzg(int n3) {
        return (zzbdv$zzaf$zza)this.zzl.get(n3);
    }

    public zzbdv$zzaf$zzb zzh(int n3) {
        return (zzbdv$zzaf$zzb)this.zzl.get(n3);
    }

    public List zzz() {
        return this.zzl;
    }
}

