/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfk;
import java.util.Arrays;

final class zzaof {
    private static final byte[] zzd;
    public int zza;
    public int zzb;
    public byte[] zzc;
    private boolean zze;
    private int zzf;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[3];
        byArray[0] = 0;
        byArray2[1] = 0;
        byArray2[2] = 1;
        zzd = byArray;
    }

    public zzaof(int n3) {
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
        this.zzf = 0;
    }

    public final boolean zzc(int n3, int n4) {
        int n7 = this.zzf;
        int n8 = 3;
        int n10 = 1;
        if (n7 != 0) {
            int n14 = 181;
            int n15 = 2;
            String string2 = "Unexpected start code value";
            String string3 = "H263Reader";
            if (n7 != n10) {
                if (n7 != n15) {
                    if (n7 != n8) {
                        n7 = 179;
                        if (n3 == n7 || n3 == n14) {
                            this.zza = n3 = this.zza - n4;
                            this.zze = false;
                            return n10;
                        }
                    } else {
                        n4 = 32;
                        if ((n3 &= 0xF0) != n4) {
                            zzfk.zzf(string3, string2);
                            this.zzb();
                        } else {
                            this.zzb = n3 = this.zza;
                            this.zzf = n3 = 4;
                        }
                    }
                } else {
                    n4 = 31;
                    if (n3 > n4) {
                        zzfk.zzf(string3, string2);
                        this.zzb();
                    } else {
                        this.zzf = n8;
                    }
                }
            } else if (n3 != n14) {
                zzfk.zzf(string3, string2);
                this.zzb();
            } else {
                this.zzf = n15;
            }
        } else {
            n4 = 176;
            if (n3 == n4) {
                this.zzf = n10;
                this.zze = n10;
            }
        }
        byte[] byArray = zzd;
        this.zza(byArray, 0, n8);
        return false;
    }
}

