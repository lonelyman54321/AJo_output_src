/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzaod {
    private static final byte[] zzd;
    public int zza;
    public int zzb;
    public byte[] zzc;
    private boolean zze;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[3];
        byArray[0] = 0;
        byArray2[1] = 0;
        byArray2[2] = 1;
        zzd = byArray;
    }

    public zzaod(int n3) {
        byte[] byArray = new byte[128];
        this.zzc = byArray;
    }

    public final void zza(byte[] byArray, int n3, int n4) {
        int n7;
        boolean bl2 = this.zze;
        if (!bl2) {
            return;
        }
        byte[] byArray2 = this.zzc;
        int n8 = byArray2.length;
        int n10 = this.zza + (n4 -= n3);
        if (n8 < n10) {
            n10 += n10;
            this.zzc = byArray2 = Arrays.copyOf(byArray2, n10);
        }
        byArray2 = this.zzc;
        n8 = this.zza;
        System.arraycopy(byArray, n3, byArray2, n8, n4);
        this.zza = n7 = this.zza + n4;
    }

    public final void zzb() {
        this.zze = false;
        this.zza = 0;
        this.zzb = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean zzc(int n3, int n4) {
        block4: {
            int n7 = this.zze;
            boolean bl2 = true;
            if (n7 != 0) {
                this.zza = n7 = this.zza - n4;
                n4 = this.zzb;
                if (n4 == 0 && n3 == (n4 = 181)) {
                    this.zzb = n7;
                    break block4;
                } else {
                    this.zze = false;
                    return bl2;
                }
            }
            n4 = 179;
            if (n3 == n4) {
                this.zze = bl2;
            }
        }
        byte[] byArray = zzd;
        this.zza(byArray, 0, 3);
        return false;
    }
}

