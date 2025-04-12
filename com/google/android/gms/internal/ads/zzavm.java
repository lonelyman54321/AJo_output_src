/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzavm {
    private final byte[] zza;
    private int zzb;
    private int zzc;

    public zzavm(byte[] byArray) {
        byte[] byArray2;
        int n3;
        int n4 = 256;
        byte[] byArray3 = new byte[n4];
        this.zza = byArray3;
        byArray3 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            byte by2;
            byArray2 = this.zza;
            byArray2[n3] = by2 = (byte)n3;
        }
        int n7 = 0;
        byArray2 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            byte[] byArray4 = this.zza;
            byte by4 = byArray4[n3];
            n7 += by4;
            int n8 = byArray.length;
            n8 = n3 % n8;
            n8 = byArray[n8];
            n7 = n7 + n8 & 0xFF;
            byArray4[n3] = n8 = byArray4[n7];
            byArray4[n7] = by4;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] byArray) {
        int n3;
        int n4 = this.zzb;
        int n7 = this.zzc;
        for (int i3 = 0; i3 < (n3 = 256); ++i3) {
            byte by2;
            ++n4;
            byte[] byArray2 = this.zza;
            int n8 = byArray2[n4 &= 0xFF];
            n7 = n7 + n8 & 0xFF;
            byArray2[n4] = by2 = byArray2[n7];
            byArray2[n7] = n8;
            by2 = byArray[i3];
            int n10 = byArray2[n4] + n8;
            n8 = n10 & 0xFF;
            byArray[i3] = n3 = (int)((byte)(byArray2[n8] ^ by2));
        }
        this.zzb = n4;
        this.zzc = n7;
    }
}

