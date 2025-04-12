/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 */
package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzei;
import com.google.android.gms.internal.ads.zzfu;
import java.util.Arrays;

final class zzami {
    private final zzfu zza;
    private final int[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public zzami() {
        Object object = new zzfu();
        this.zza = object;
        object = new int[256];
        this.zzb = (int[])object;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzami object, zzfu zzfu2, int n3) {
        block4: {
            Object object2;
            int n4;
            int n7;
            int n8;
            block5: {
                n8 = 4;
                if (n3 < n8) break block4;
                zzfu2.zzL(3);
                n7 = zzfu2.zzm() & 0x80;
                n4 = n3 + -4;
                if (n7 == 0) break block5;
                n7 = 7;
                if (n4 < n7 || (n7 = zzfu2.zzo()) < n8) break block4;
                ((zzami)object).zzh = n8 = zzfu2.zzq();
                ((zzami)object).zzi = n8 = zzfu2.zzq();
                zzfu zzfu3 = ((zzami)object).zza;
                zzfu3.zzH(n7 += -4);
                n4 = n3 + -11;
            }
            if ((n8 = ((zzfu)(object2 = ((zzami)object).zza)).zzd()) < (n7 = ((zzfu)object2).zze()) && n4 > 0) {
                n7 -= n8;
                n7 = Math.min(n4, n7);
                object2 = ((zzfu)object2).zzM();
                zzfu2.zzG((byte[])object2, n8, n7);
                object = ((zzami)object).zza;
                ((zzfu)object).zzK(n8 += n7);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzc(zzami zzami2, zzfu zzfu2, int n3) {
        int n4;
        int n7 = 19;
        if (n3 < n7) {
            return;
        }
        zzami2.zzd = n3 = zzfu2.zzq();
        zzami2.zze = n3 = zzfu2.zzq();
        zzfu2.zzL(11);
        zzami2.zzf = n3 = zzfu2.zzq();
        zzami2.zzg = n4 = zzfu2.zzq();
    }

    public static /* bridge */ /* synthetic */ void zzd(zzami zzami2, zzfu zzfu2, int n3) {
        zzami zzami3 = zzami2;
        int n4 = n3 % 5;
        int n7 = 2;
        if (n4 != n7) {
            return;
        }
        zzfu2.zzL(n7);
        int[] nArray = zzami2.zzb;
        int n8 = 0;
        Arrays.fill(nArray, 0);
        n7 = n3 / 5;
        int n10 = 0;
        while (n10 < n7) {
            int n14 = zzfu2.zzm();
            int n15 = zzfu2.zzm();
            int n16 = zzfu2.zzm();
            int n17 = zzfu2.zzm();
            int n18 = zzfu2.zzm();
            double d2 = n15;
            n17 += -128;
            int[] nArray2 = zzami3.zzb;
            n18 <<= 24;
            double d5 = n16 += -128;
            double d7 = 1.402 * d5 + d2;
            n16 = (int)d7;
            int n19 = 255;
            n16 = Math.min(n16, n19);
            n16 = Math.max(0, n16) << 16;
            n3 = n10;
            double d9 = n17;
            double d12 = 0.34414 * d9;
            d12 = d2 - d12;
            double d13 = 0.71414;
            d5 *= d13;
            d5 = d12 - d5;
            n17 = Math.min((int)d5, n19);
            n17 = Math.max(0, n17) << 8;
            double d14 = 1.772;
            d9 = d9 * d14 + d2;
            n8 = Math.min((int)d9, n19);
            n8 = Math.max(0, n8);
            n10 = n18 | n16 | n17;
            nArray2[n14] = n8 |= n10;
            n10 = n3 + 1;
            n8 = 0;
        }
        zzami3.zzc = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzei zza() {
        int n3;
        int n4 = this.zzd;
        if (n4 == 0) return null;
        n4 = this.zze;
        if (n4 == 0) return null;
        n4 = this.zzh;
        if (n4 == 0) return null;
        n4 = this.zzi;
        if (n4 == 0) return null;
        zzfu zzfu2 = this.zza;
        int n7 = zzfu2.zze();
        if (n7 == 0) return null;
        n7 = zzfu2.zzd();
        if (n7 != (n3 = zzfu2.zze())) return null;
        n7 = (int)(this.zzc ? 1 : 0);
        if (n7 == 0) {
            return null;
        }
        n7 = 0;
        float f5 = 0.0f;
        zzfu2.zzK(0);
        n4 = this.zzh;
        n3 = this.zzi;
        Object object = new int[n4 *= n3];
        int n8 = 0;
        float f6 = 0.0f;
        while (true) {
            Object object2;
            int n10;
            Object object3;
            if (n8 >= n4) {
                n4 = this.zzh;
                n8 = this.zzi;
                object3 = Bitmap.Config.ARGB_8888;
                zzfu2 = Bitmap.createBitmap((int[])object, (int)n4, (int)n8, (Bitmap.Config)object3);
                object = new zzeg;
                ((zzeg)object)();
                ((zzeg)object).zzc((Bitmap)zzfu2);
                float f7 = this.zzf;
                f6 = this.zzd;
                ((zzeg)object).zzh(f7 /= f6);
                ((zzeg)object).zzi(0);
                f7 = this.zzg;
                f6 = this.zze;
                ((zzeg)object).zze(f7 /= f6, 0);
                ((zzeg)object).zzf(0);
                f7 = this.zzh;
                f5 = this.zzd;
                ((zzeg)object).zzk(f7 /= f5);
                f7 = this.zzi;
                f5 = this.zze;
                ((zzeg)object).zzd(f7 /= f5);
                return ((zzeg)object).zzp();
            }
            object3 = this.zza;
            Object object4 = ((zzfu)object3).zzm();
            if (object4 != 0) {
                n10 = n8 + 1;
                object2 = this.zzb;
                object4 = object2[object4];
                object[n8] = object4;
            } else {
                object3 = this.zza;
                object4 = ((zzfu)object3).zzm();
                if (object4 == 0) continue;
                n10 = object4 & 0x3F;
                int n14 = object4 & 0x40;
                if (n14 != 0) {
                    n10 <<= 8;
                    object2 = this.zza;
                    n14 = ((zzfu)object2).zzm();
                    n10 |= n14;
                }
                if ((object4 &= 0x80) == 0) {
                    object4 = 0;
                    object3 = null;
                } else {
                    object3 = this.zzb;
                    object2 = this.zza;
                    n14 = ((zzfu)object2).zzm();
                    object4 = object3[n14];
                }
                Arrays.fill((int[])object, n8, n10 += n8, object4);
            }
            n8 = n10;
        }
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzH(0);
        this.zzc = false;
    }
}

