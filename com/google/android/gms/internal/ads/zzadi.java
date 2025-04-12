/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzu;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class zzadi
implements zzadv {
    private final byte[] zza;
    private final zzu zzb;
    private final long zzc;
    private long zzd;
    private byte[] zze;
    private int zzf;
    private int zzg;

    static {
        zzbv.zzb("media3.extractor");
    }

    public zzadi(zzu object, long l2, long l3) {
        this.zzb = object;
        this.zzd = l2;
        this.zzc = l3;
        object = new byte[65536];
        this.zze = (byte[])object;
        object = new byte[4096];
        this.zza = (byte[])object;
    }

    private final int zzp(byte[] byArray, int n3, int n4) {
        int n7 = this.zzg;
        if (n7 == 0) {
            return 0;
        }
        n4 = Math.min(n7, n4);
        System.arraycopy(this.zze, 0, byArray, n3, n4);
        this.zzu(n4);
        return n4;
    }

    private final int zzq(byte[] object, int n3, int n4, int n7, boolean bl2) {
        boolean bl3 = Thread.interrupted();
        if (!bl3) {
            zzu zzu2 = this.zzb;
            n3 += n7;
            int n8 = zzu2.zza((byte[])object, n3, n4 -= n7);
            if (n8 == (n3 = -1)) {
                if (n7 == 0 && bl2) {
                    return n3;
                }
                object = new EOFException;
                object();
                throw object;
            }
            return n7 + n8;
        }
        object = new InterruptedIOException;
        object();
        throw object;
    }

    private final int zzr(int n3) {
        n3 = Math.min(this.zzg, n3);
        this.zzu(n3);
        return n3;
    }

    private final void zzs(int n3) {
        int n4 = -1;
        if (n3 != n4) {
            long l2 = this.zzd;
            long l3 = n3;
            this.zzd = l2 += l3;
        }
    }

    private final void zzt(int n3) {
        int n4 = this.zzf + n3;
        byte[] byArray = this.zze;
        if (n4 > (n3 = byArray.length)) {
            int n7 = 65536 + n4;
            int n8 = 524288;
            n3 = Math.min(n3 + n3, n4 += n8);
            n3 = Math.max(n7, n3);
            byte[] byArray2 = this.zze;
            this.zze = byArray = Arrays.copyOf(byArray2, n3);
        }
    }

    private final void zzu(int n3) {
        byte[] byArray;
        int n4;
        this.zzg = n4 = this.zzg - n3;
        this.zzf = 0;
        byte[] byArray2 = this.zze;
        int n7 = byArray2.length;
        int n8 = -524288;
        if (n4 < (n7 += n8)) {
            n7 = 65536 + n4;
            byArray = new byte[n7];
        } else {
            byArray = byArray2;
        }
        System.arraycopy(byArray2, n3, byArray, 0, n4);
        this.zze = byArray;
    }

    public final int zza(byte[] byArray, int n3, int n4) {
        int n7 = this.zzp(byArray, n3, n4);
        if (n7 == 0) {
            boolean bl2 = true;
            n7 = this.zzq(byArray, n3, n4, 0, bl2);
        }
        this.zzs(n7);
        return n7;
    }

    public final int zzb(byte[] byArray, int n3, int n4) {
        int n7;
        this.zzt(n4);
        int n8 = this.zzg;
        int n10 = this.zzf;
        if ((n8 -= n10) == 0) {
            byte[] byArray2 = this.zze;
            boolean bl2 = true;
            if ((n4 = this.zzq(byArray2, n10, n4, 0, bl2)) == (n8 = -1)) {
                return n8;
            }
            this.zzg = n8 = this.zzg + n4;
        } else {
            n4 = Math.min(n4, n8);
        }
        byte[] byArray3 = this.zze;
        int n14 = this.zzf;
        System.arraycopy(byArray3, n14, byArray, n3, n4);
        this.zzf = n7 = this.zzf + n4;
        return n4;
    }

    public final int zzc(int n3) {
        n3 = 1;
        int n4 = this.zzr(n3);
        if (n4 == 0) {
            byte[] byArray = this.zza;
            int n7 = Math.min(n3, 4096);
            boolean bl2 = true;
            n4 = this.zzq(byArray, 0, n7, 0, bl2);
        }
        this.zzs(n4);
        return n4;
    }

    public final long zzd() {
        return this.zzc;
    }

    public final long zze() {
        long l2 = this.zzd;
        long l3 = this.zzf;
        return l2 + l3;
    }

    public final long zzf() {
        return this.zzd;
    }

    public final void zzg(int n3) {
        this.zzl(n3, false);
    }

    public final void zzh(byte[] byArray, int n3, int n4) {
        this.zzm(byArray, n3, n4, false);
    }

    public final void zzi(byte[] byArray, int n3, int n4) {
        this.zzn(byArray, n3, n4, false);
    }

    public final void zzj() {
        this.zzf = 0;
    }

    public final void zzk(int n3) {
        this.zzo(n3, false);
    }

    public final boolean zzl(int n3, boolean bl2) {
        int n4;
        this.zzt(n3);
        int n7 = this.zzg;
        int n8 = this.zzf;
        int n10 = n7 -= n8;
        while (n10 < n3) {
            byte[] byArray = this.zze;
            int n14 = this.zzf;
            if ((n10 = this.zzq(byArray, n14, n3, n10, bl2)) == (n7 = -1)) {
                return false;
            }
            this.zzg = n7 = this.zzf + n10;
        }
        this.zzf = n4 = this.zzf + n3;
        return true;
    }

    public final boolean zzm(byte[] byArray, int n3, int n4, boolean bl2) {
        if (!(bl2 = this.zzl(n4, bl2))) {
            return false;
        }
        byte[] byArray2 = this.zze;
        int n7 = this.zzf - n4;
        System.arraycopy(byArray2, n7, byArray, n3, n4);
        return true;
    }

    public final boolean zzn(byte[] byArray, int n3, int n4, boolean bl2) {
        int n7;
        int n8 = n7 = this.zzp(byArray, n3, n4);
        while (true) {
            n7 = -1;
            if (n8 >= n4 || n8 == n7) break;
            n8 = this.zzq(byArray, n3, n4, n8, bl2);
        }
        this.zzs(n8);
        return n8 != n7;
    }

    public final boolean zzo(int n3, boolean n4) {
        int n7 = n4 = this.zzr(n3);
        while (true) {
            n4 = -1;
            if (n7 >= n3 || n7 == n4) break;
            n4 = n7 + 4096;
            byte[] byArray = this.zza;
            int n8 = -n7;
            int n10 = Math.min(n3, n4);
            n7 = this.zzq(byArray, n8, n10, n7, false);
        }
        this.zzs(n7);
        return n7 != n4;
    }
}

