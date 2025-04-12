/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzb$zzg$zza;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzh;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbdv$zzb$zzg
extends zzhbo
implements zzbdv$zzb$zzh {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbdv$zzb$zzg zzd;
    private static volatile zzhdm zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzbdv$zzb$zzg zzbdv$zzb$zzg;
        zzd = zzbdv$zzb$zzg = new zzbdv$zzb$zzg();
        zzhbo.zzca(zzbdv$zzb$zzg.class, zzbdv$zzb$zzg);
    }

    private zzbdv$zzb$zzg() {
    }

    public static /* synthetic */ void zzA(zzbdv$zzb$zzg zzbdv$zzb$zzg, boolean bl2) {
        zzbdv$zzb$zzg.zzI(bl2);
    }

    public static /* synthetic */ void zzB(zzbdv$zzb$zzg zzbdv$zzb$zzg) {
        zzbdv$zzb$zzg.zzF();
    }

    public static /* synthetic */ void zzC(zzbdv$zzb$zzg zzbdv$zzb$zzg, int n3) {
        zzbdv$zzb$zzg.zzJ(n3);
    }

    public static /* synthetic */ void zzD(zzbdv$zzb$zzg zzbdv$zzb$zzg) {
        zzbdv$zzb$zzg.zzG();
    }

    private void zzE() {
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFE;
        this.zzg = false;
    }

    private void zzF() {
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFD;
        this.zzh = false;
    }

    private void zzG() {
        int n3;
        this.zzf = n3 = this.zzf & 0xFFFFFFFB;
        this.zzi = 0;
    }

    private void zzH(boolean bl2) {
        int n3;
        this.zzf = n3 = this.zzf | 1;
        this.zzg = bl2;
    }

    private void zzI(boolean bl2) {
        int n3;
        this.zzf = n3 = this.zzf | 2;
        this.zzh = bl2;
    }

    private void zzJ(int n3) {
        int n4;
        this.zzf = n4 = this.zzf | 4;
        this.zzi = n3;
    }

    public static zzbdv$zzb$zzg$zza zzc() {
        return (zzbdv$zzb$zzg$zza)zzd.zzaZ();
    }

    public static zzbdv$zzb$zzg$zza zzd(zzbdv$zzb$zzg zzbdv$zzb$zzg) {
        return (zzbdv$zzb$zzg$zza)zzd.zzba(zzbdv$zzb$zzg);
    }

    public static /* synthetic */ zzbdv$zzb$zzg zze() {
        return zzd;
    }

    public static zzbdv$zzb$zzg zzf() {
        return zzd;
    }

    public static zzbdv$zzb$zzg zzg(InputStream inputStream) {
        return (zzbdv$zzb$zzg)zzhbo.zzbk(zzd, inputStream);
    }

    public static zzbdv$zzb$zzg zzm(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzb$zzg)zzhbo.zzbl(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzb$zzg zzn(zzhac zzhac2) {
        return (zzbdv$zzb$zzg)zzhbo.zzbm(zzd, zzhac2);
    }

    public static zzbdv$zzb$zzg zzo(zzham zzham2) {
        return (zzbdv$zzb$zzg)zzhbo.zzbn(zzd, zzham2);
    }

    public static zzbdv$zzb$zzg zzp(InputStream inputStream) {
        return (zzbdv$zzb$zzg)zzhbo.zzbo(zzd, inputStream);
    }

    public static zzbdv$zzb$zzg zzq(ByteBuffer byteBuffer) {
        return (zzbdv$zzb$zzg)zzhbo.zzbp(zzd, byteBuffer);
    }

    public static zzbdv$zzb$zzg zzr(byte[] byArray) {
        return (zzbdv$zzb$zzg)zzhbo.zzbq(zzd, byArray);
    }

    public static zzbdv$zzb$zzg zzs(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzb$zzg)zzhbo.zzbr(zzd, zzhac2, zzhay2);
    }

    public static zzbdv$zzb$zzg zzt(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzb$zzg)zzhbo.zzbs(zzd, zzham2, zzhay2);
    }

    public static zzbdv$zzb$zzg zzu(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzb$zzg)zzhbo.zzbu(zzd, inputStream, zzhay2);
    }

    public static zzbdv$zzb$zzg zzv(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzb$zzg)zzhbo.zzbv(zzd, byteBuffer, zzhay2);
    }

    public static zzbdv$zzb$zzg zzw(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzb$zzg)zzhbo.zzbx(zzd, byArray, zzhay2);
    }

    public static zzhdm zzx() {
        return zzd.zzbM();
    }

    public static /* synthetic */ void zzy(zzbdv$zzb$zzg zzbdv$zzb$zzg, boolean bl2) {
        zzbdv$zzb$zzg.zzH(bl2);
    }

    public static /* synthetic */ void zzz(zzbdv$zzb$zzg zzbdv$zzb$zzg) {
        zzbdv$zzb$zzg.zzE();
    }

    public int zza() {
        return this.zzi;
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
                objectArray = zze;
                if (objectArray != null) return objectArray;
                clazz = zzbdv$zzb$zzg.class;
                synchronized (clazz) {
                    try {
                        objectArray = zze;
                        if (objectArray != null) return objectArray;
                        object = zzd;
                        zze = objectArray = new zzhbj((zzhbo)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzd;
            }
            case 4: {
                return new zzbdv$zzb$zzg$zza(null);
            }
            case 3: {
                return new zzbdv$zzb$zzg();
            }
            case 2: {
                objectArray = new Object[4];
                objectArray[0] = "zzf";
                objectArray[by2] = "zzg";
                objectArray[2] = "zzh";
                objectArray[3] = "zzi";
                return zzhbo.zzbR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u100b\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public boolean zzh() {
        return this.zzg;
    }

    public boolean zzi() {
        return this.zzh;
    }

    public boolean zzj() {
        int n3 = this.zzf;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public boolean zzk() {
        int n3 = this.zzf & 2;
        return n3 != 0;
    }

    public boolean zzl() {
        int n3 = this.zzf & 4;
        return n3 != 0;
    }
}

