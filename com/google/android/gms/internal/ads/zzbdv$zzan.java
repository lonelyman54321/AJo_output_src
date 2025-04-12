/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzan$zza;
import com.google.android.gms.internal.ads.zzbdv$zzao;
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

public final class zzbdv$zzan
extends zzhbo
implements zzbdv$zzao {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbdv$zzan zzd;
    private static volatile zzhdm zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private zzbdv$zzap zzi;

    static {
        zzbdv$zzan zzbdv$zzan;
        zzd = zzbdv$zzan = new zzbdv$zzan();
        zzhbo.zzca(zzbdv$zzan.class, zzbdv$zzan);
    }

    private zzbdv$zzan() {
    }

    public static /* synthetic */ void zzA(zzbdv$zzan zzbdv$zzan) {
        zzbdv$zzan.zzH();
    }

    public static /* synthetic */ void zzB(zzbdv$zzan zzbdv$zzan, zzhac zzhac2) {
        zzbdv$zzan.zzM(zzhac2);
    }

    public static /* synthetic */ void zzC(zzbdv$zzan zzbdv$zzan, zzbdv$zzq zzbdv$zzq) {
        zzbdv$zzan.zzO(zzbdv$zzq);
    }

    public static /* synthetic */ void zzD(zzbdv$zzan zzbdv$zzan) {
        zzbdv$zzan.zzJ();
    }

    public static /* synthetic */ void zzE(zzbdv$zzan zzbdv$zzan, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzan.zzN(zzbdv$zzap);
    }

    public static /* synthetic */ void zzF(zzbdv$zzan zzbdv$zzan, zzbdv$zzap zzbdv$zzap) {
        zzbdv$zzan.zzK(zzbdv$zzap);
    }

    public static /* synthetic */ void zzG(zzbdv$zzan zzbdv$zzan) {
        zzbdv$zzan.zzI();
    }

    private void zzH() {
        String string2;
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFE;
        this.zzg = string2 = zzbdv$zzan.zzf().zzm();
    }

    private void zzI() {
        int n3;
        this.zzi = null;
        this.zzf = n3 = this.zzf & 0xFFFFFFFB;
    }

    private void zzJ() {
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFD;
        this.zzh = 0;
    }

    private void zzK(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap zzbdv$zzap2;
        zzbdv$zzap.getClass();
        zzbdv$zzaq zzbdv$zzaq = this.zzi;
        if (zzbdv$zzaq != null && zzbdv$zzaq != (zzbdv$zzap2 = zzbdv$zzap.zzf())) {
            zzbdv$zzaq = zzbdv$zzap.zzd((zzbdv$zzap)zzbdv$zzaq);
            ((zzhbi)((Object)zzbdv$zzaq)).zzbj(zzbdv$zzap);
            zzbdv$zzap = (zzbdv$zzap)((zzhbi)((Object)zzbdv$zzaq)).zzbo();
        }
        this.zzi = zzbdv$zzap;
        this.zzf = n3 = this.zzf | 4;
    }

    private void zzL(String string2) {
        int n3;
        string2.getClass();
        this.zzf = n3 = this.zzf | 1;
        this.zzg = string2;
    }

    private void zzM(zzhac object) {
        int n3;
        this.zzg = object = ((zzhac)object).zzy();
        this.zzf = n3 = this.zzf | 1;
    }

    private void zzN(zzbdv$zzap zzbdv$zzap) {
        int n3;
        zzbdv$zzap.getClass();
        this.zzi = zzbdv$zzap;
        this.zzf = n3 = this.zzf | 4;
    }

    private void zzO(zzbdv$zzq zzbdv$zzq) {
        int n3;
        this.zzh = n3 = zzbdv$zzq.zza();
        this.zzf = n3 = this.zzf | 2;
    }

    public static zzbdv$zzan$zza zzc() {
        return (zzbdv$zzan$zza)zzd.zzaZ();
    }

    public static zzbdv$zzan$zza zzd(zzbdv$zzan zzbdv$zzan) {
        return (zzbdv$zzan$zza)zzd.zzba(zzbdv$zzan);
    }

    public static /* synthetic */ zzbdv$zzan zze() {
        return zzd;
    }

    public static zzbdv$zzan zzf() {
        return zzd;
    }

    public static zzbdv$zzan zzg(InputStream inputStream) {
        return (zzbdv$zzan)zzhbo.zzbk(zzd, inputStream);
    }

    public static zzbdv$zzan zzh(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzan)zzhbo.zzbl(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzan zzi(zzhac zzhac2) {
        return (zzbdv$zzan)zzhbo.zzbm(zzd, zzhac2);
    }

    public static zzbdv$zzan zzj(zzham zzham2) {
        return (zzbdv$zzan)zzhbo.zzbn(zzd, zzham2);
    }

    public static zzbdv$zzan zzq(InputStream inputStream) {
        return (zzbdv$zzan)zzhbo.zzbo(zzd, inputStream);
    }

    public static zzbdv$zzan zzr(ByteBuffer byteBuffer) {
        return (zzbdv$zzan)zzhbo.zzbp(zzd, byteBuffer);
    }

    public static zzbdv$zzan zzs(byte[] byArray) {
        return (zzbdv$zzan)zzhbo.zzbq(zzd, byArray);
    }

    public static zzbdv$zzan zzt(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzan)zzhbo.zzbr(zzd, zzhac2, zzhay2);
    }

    public static zzbdv$zzan zzu(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzan)zzhbo.zzbs(zzd, zzham2, zzhay2);
    }

    public static zzbdv$zzan zzv(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzan)zzhbo.zzbu(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzan zzw(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzan)zzhbo.zzbv(zzd, byteBuffer, zzhay2);
    }

    public static zzbdv$zzan zzx(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzan)zzhbo.zzbx(zzd, byArray, zzhay2);
    }

    public static zzhdm zzy() {
        return zzd.zzbM();
    }

    public static /* synthetic */ void zzz(zzbdv$zzan zzbdv$zzan, String string2) {
        zzbdv$zzan.zzL(string2);
    }

    public zzbdv$zzq zza() {
        int n3 = this.zzh;
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
                object = zze;
                if (object != null) return object;
                clazz = zzbdv$zzan.class;
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
                return new zzbdv$zzan$zza(null);
            }
            case 3: {
                return new zzbdv$zzan();
            }
            case 2: {
                object = zzbdv$zzq.zze();
                objectArray = new Object[5];
                objectArray[0] = "zzf";
                objectArray[by2] = "zzg";
                objectArray[2] = "zzh";
                objectArray[3] = object;
                objectArray[4] = "zzi";
                return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u1009\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzap zzk() {
        zzbdv$zzap zzbdv$zzap = this.zzi;
        if (zzbdv$zzap == null) {
            zzbdv$zzap = zzbdv$zzap.zzf();
        }
        return zzbdv$zzap;
    }

    public zzhac zzl() {
        return zzhac.zzw(this.zzg);
    }

    public String zzm() {
        return this.zzg;
    }

    public boolean zzn() {
        int n3 = this.zzf;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzo() {
        int n3 = this.zzf & 4;
        return n3 != 0;
    }

    public boolean zzp() {
        int n3 = this.zzf & 2;
        return n3 != 0;
    }
}

