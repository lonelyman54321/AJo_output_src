/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzabd {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg;
    private int zzh;

    public zzabd() {
        boolean[] blArray = new boolean[15];
        this.zzg = blArray;
    }

    public final long zza() {
        long l2 = this.zze;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return l3;
        }
        return this.zzf / l2;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final void zzc(long l2) {
        long l3 = this.zzd;
        long l4 = 0L;
        long l7 = 1L;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object == false) {
            this.zza = l2;
        } else {
            Object object2 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
            if (object2 == false) {
                l3 = this.zza;
                this.zzb = l3 = l2 - l3;
                this.zzf = l3;
                this.zze = l7;
            } else {
                l4 = this.zzc;
                l4 = l2 - l4;
                long l8 = this.zzb;
                l8 = l4 - l8;
                l8 = Math.abs(l8);
                long l12 = 1000000L;
                long l14 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
                int n3 = (int)(l3 %= (long)15);
                if (l14 <= 0) {
                    this.zze = l8 = this.zze + l7;
                    this.zzf = l8 = this.zzf + l4;
                    boolean[] blArray = this.zzg;
                    object2 = blArray[n3];
                    if (object2 != false) {
                        int n4;
                        object2 = 0;
                        blArray[n3] = false;
                        this.zzh = n4 = this.zzh + -1;
                    }
                } else {
                    boolean[] blArray = this.zzg;
                    object2 = blArray[n3];
                    if (object2 == false) {
                        int n7;
                        object2 = 1;
                        blArray[n3] = object2;
                        this.zzh = n7 = this.zzh + object2;
                    }
                }
            }
        }
        this.zzd = l3 = this.zzd + l7;
        this.zzc = l2;
    }

    public final void zzd() {
        long l2;
        this.zzd = l2 = 0L;
        this.zze = l2;
        this.zzf = l2;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zze() {
        long l2 = this.zzd;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return false;
        }
        boolean[] blArray = this.zzg;
        int n3 = (int)((l2 + (long)-1) % (long)15);
        return blArray[n3];
    }

    public final boolean zzf() {
        int n3;
        long l2 = this.zzd;
        long l3 = 15;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object > 0 && (n3 = this.zzh) == 0;
    }
}

