/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class zzeb {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzeb(int n3, int n4, float f5, float f6, int n7) {
        int n8;
        this.zza = n3;
        this.zzb = n4;
        this.zzc = f5;
        this.zzd = f6;
        f5 = n3;
        f6 = n7;
        this.zze = f5 /= f6;
        this.zzf = n8 = n3 / 400;
        this.zzg = n3 /= 65;
        n3 += n3;
        this.zzh = n3;
        short[] sArray = new short[n3];
        this.zzi = sArray;
        short[] sArray2 = new short[n3 *= n4];
        this.zzj = sArray2;
        sArray2 = new short[n3];
        this.zzl = sArray2;
        short[] sArray3 = new short[n3];
        this.zzn = sArray3;
    }

    private final int zzg(short[] sArray, int n3, int n4, int n7) {
        int n8 = 1;
        int n10 = 255;
        int n14 = 0;
        int n15 = 0;
        while (n4 <= n7) {
            int n16;
            int n17;
            int n18 = 0;
            for (n17 = 0; n17 < n4; ++n17) {
                n16 = this.zzb * n3;
                int n19 = n16 + n17;
                n19 = sArray[n19];
                n16 = n16 + n4 + n17;
                n16 = sArray[n16];
                n19 -= n16;
                n16 = Math.abs(n19);
                n18 += n16;
            }
            n17 = n18 * n14;
            n16 = n8 * n4;
            if (n17 < n16) {
                n8 = n18;
            }
            if (n17 < n16) {
                n14 = n4;
            }
            if ((n17 = n18 * n10) > (n16 = n15 * n4)) {
                n15 = n18;
            }
            if (n17 > n16) {
                n10 = n4;
            }
            ++n4;
        }
        this.zzu = n8 /= n14;
        this.zzv = n15 /= n10;
        return n14;
    }

    private final void zzh(short[] sArray, int n3, int n4) {
        int n7;
        short[] sArray2 = this.zzl;
        int n8 = this.zzm;
        this.zzl = sArray2 = this.zzl(sArray2, n8, n4);
        n8 = this.zzm;
        int n10 = this.zzb;
        int n14 = n4 * n10;
        System.arraycopy(sArray, n3 *= n10, sArray2, n8 *= n10, n14);
        this.zzm = n7 = this.zzm + n4;
    }

    private final void zzi(short[] sArray, int n3, int n4) {
        int n7;
        for (int i3 = 0; i3 < (n7 = this.zzh / n4); ++i3) {
            int n8;
            int n10;
            short[] sArray2 = null;
            int n14 = 0;
            for (n7 = 0; n7 < (n10 = (n8 = this.zzb) * n4); ++n7) {
                n8 *= n3;
                n8 = a60.a(i3, n10, n8, n7);
                n8 = sArray[n8];
                n14 += n8;
            }
            n14 /= n10;
            sArray2 = this.zzi;
            sArray2[i3] = n14 = (int)((short)n14);
        }
    }

    private static void zzj(int n3, int n4, short[] sArray, int n7, short[] sArray2, int n8, short[] sArray3, int n10) {
        for (int i3 = 0; i3 < n4; ++i3) {
            int n14 = n7 * n4;
            int n15 = n10 * n4;
            int n16 = n8 * n4 + i3;
            n15 += i3;
            n14 += i3;
            for (int i8 = 0; i8 < n3; ++i8) {
                short s7 = sArray2[n16];
                int n17 = (n3 - i8) * s7;
                sArray[n14] = s7 = (short)((sArray3[n15] * i8 + n17) / n3);
                n14 += n4;
                n16 += n4;
                n15 += n4;
            }
        }
    }

    private final void zzk() {
        int n3;
        float f5;
        int n4;
        int n7;
        short[] sArray;
        int n8;
        int n10;
        int n14;
        short[] sArray2;
        double d2;
        double d5;
        int n15;
        zzeb zzeb2 = this;
        float f6 = this.zzc;
        float f7 = this.zzd;
        double d7 = f6 /= f7;
        double d9 = 1.00001;
        int n16 = 1065353216;
        float f8 = 1.0f;
        int n17 = 1;
        double d12 = d7 == d9 ? 0 : (d7 > d9 ? 1 : -1);
        int n18 = this.zzm;
        if (d12 <= 0 && (n15 = (int)((d5 = d7 - (d2 = 0.99999)) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1))) >= 0) {
            sArray2 = this.zzj;
            n14 = this.zzk;
            this.zzh(sArray2, 0, n14);
            this.zzk = 0;
        } else {
            n15 = zzeb2.zzk;
            d12 = zzeb2.zzh;
            if (n15 >= d12) {
                d12 = 0.0;
                do {
                    int n19;
                    int n20;
                    short[] sArray3;
                    int n21;
                    short[] sArray4;
                    float f11;
                    if ((n10 = zzeb2.zzr) > 0) {
                        n10 = Math.min(zzeb2.zzh, n10);
                        short[] sArray5 = zzeb2.zzj;
                        zzeb2.zzh(sArray5, (int)d12, n10);
                        zzeb2.zzr = n8 = zzeb2.zzr - n10;
                        d12 += n10;
                        continue;
                    }
                    sArray = zzeb2.zzj;
                    n8 = zzeb2.zza;
                    n7 = 4000;
                    float f12 = 5.605E-42f;
                    if (n8 > n7) {
                        n8 /= 4000;
                    } else {
                        n8 = 1;
                        f11 = Float.MIN_VALUE;
                    }
                    n7 = zzeb2.zzb;
                    if (n7 == n17 && n8 == n17) {
                        n8 = zzeb2.zzf;
                        n7 = zzeb2.zzg;
                        n10 = zzeb2.zzg(sArray, (int)d12, n8, n7);
                    } else {
                        zzeb2.zzi(sArray, (int)d12, n8);
                        sArray4 = zzeb2.zzi;
                        n4 = zzeb2.zzf;
                        n21 = zzeb2.zzg / n8;
                        n7 = zzeb2.zzg(sArray4, 0, n4 /= n8, n21);
                        if (n8 != n17) {
                            n4 = zzeb2.zzf;
                            if ((n21 = (n7 *= n8) - (n8 *= 4)) >= n4) {
                                n4 = n21;
                            }
                            if ((n7 += n8) > (n8 = zzeb2.zzg)) {
                                n7 = n8;
                            }
                            if ((n8 = zzeb2.zzb) == n17) {
                                n10 = zzeb2.zzg(sArray, (int)d12, n4, n7);
                            } else {
                                zzeb2.zzi(sArray, (int)d12, n17);
                                sArray = zzeb2.zzi;
                                n10 = zzeb2.zzg(sArray, 0, n4, n7);
                            }
                        } else {
                            n10 = n7;
                        }
                    }
                    n8 = zzeb2.zzu;
                    n7 = zzeb2.zzv;
                    int n22 = n8 != 0 && (n4 = zzeb2.zzs) != 0 && n7 <= (n21 = n8 * 3) && (n7 = n8 + n8) > (n21 = zzeb2.zzt * 3) ? n4 : n10;
                    double d13 = d12 + n22;
                    zzeb2.zzt = n8;
                    zzeb2.zzs = n10;
                    double d14 = 1.0;
                    n7 = -1082130432;
                    f12 = -1.0f;
                    n4 = (int)(d7 == d14 ? 0 : (d7 > d14 ? 1 : -1));
                    float f14 = n22;
                    if (n4 > 0) {
                        sArray3 = zzeb2.zzj;
                        f12 += f6;
                        n8 = 0x40000000;
                        f11 = 2.0f;
                        float f15 = f6 - f11;
                        n4 = (int)(f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1));
                        if (n4 >= 0) {
                            n4 = n10 = (int)(f14 /= f12);
                        } else {
                            f11 = (f11 - f6) * f14 / f12;
                            zzeb2.zzr = n10 = (int)f11;
                            n4 = n22;
                        }
                        sArray = zzeb2.zzl;
                        n8 = zzeb2.zzm;
                        sArray4 = zzeb2.zzl(sArray, n8, n4);
                        zzeb2.zzl = sArray4;
                        n8 = zzeb2.zzb;
                        int n24 = zzeb2.zzm;
                        n10 = n4;
                        n20 = n4;
                        n4 = n24;
                        n19 = n22;
                        n22 = (int)d12;
                        zzeb.zzj(n10, n8, sArray4, n24, sArray3, (int)d12, sArray3, (int)d13);
                        zzeb2.zzm = n10 = zzeb2.zzm + n20;
                        n22 = n19 + n20 + d12;
                        d12 = n22;
                        continue;
                    }
                    n19 = n22;
                    short[] sArray6 = zzeb2.zzj;
                    f11 = f8 - f6;
                    float f16 = 0.5f;
                    float f17 = f6 - f16;
                    n4 = (int)(f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1));
                    if (n4 < 0) {
                        f14 = f14 * f6 / f11;
                        n20 = n10 = (int)f14;
                    } else {
                        f16 = (f6 + f6 + f12) * f14 / f11;
                        zzeb2.zzr = n10 = (int)f16;
                        n20 = n22;
                    }
                    sArray = zzeb2.zzl;
                    n8 = zzeb2.zzm;
                    n21 = n19 + n20;
                    sArray = zzeb2.zzl(sArray, n8, n21);
                    zzeb2.zzl = sArray;
                    n8 = zzeb2.zzb;
                    n7 = (int)(d12 * n8);
                    n4 = zzeb2.zzm * n8;
                    System.arraycopy(sArray6, n7, sArray, n4, n8 *= n19);
                    n8 = zzeb2.zzb;
                    sArray4 = zzeb2.zzl;
                    n4 = zzeb2.zzm + n19;
                    n10 = n20;
                    n19 = n21;
                    sArray3 = sArray6;
                    n22 = (int)d13;
                    d13 = d12;
                    zzeb.zzj(n20, n8, sArray4, n4, sArray6, n22, sArray6, (int)d12);
                    zzeb2.zzm = n10 = zzeb2.zzm + n21;
                    d12 += n20;
                } while ((n10 = zzeb2.zzh + d12) <= n15);
                f5 = zzeb2.zzk - d12;
                short[] sArray7 = zzeb2.zzj;
                n3 = zzeb2.zzb;
                d12 *= n3;
                System.arraycopy(sArray7, (int)d12, sArray7, 0, n3 *= f5);
                zzeb2.zzk = (int)f5;
            }
        }
        f6 = zzeb2.zzd;
        f7 = zzeb2.zze * f6;
        f5 = f7 == f8 ? 0 : (f7 > f8 ? 1 : -1);
        if (f5 != false && (f5 = (float)zzeb2.zzm) != n18) {
            f5 = zzeb2.zza;
            float f18 = (float)f5 / f7;
            n14 = (int)f18;
            while (true) {
                n3 = 16384;
                f18 = 2.2959E-41f;
                if (n14 <= n3 && f5 <= n3) {
                    n3 = zzeb2.zzm - n18;
                    short[] sArray8 = zzeb2.zzn;
                    n16 = zzeb2.zzo;
                    zzeb2.zzn = sArray8 = zzeb2.zzl(sArray8, n16, n3);
                    short[] sArray9 = zzeb2.zzl;
                    d12 = zzeb2.zzb;
                    n10 = n18 * d12;
                    n8 = zzeb2.zzo * d12;
                    System.arraycopy(sArray9, n10, sArray8, n8, (int)(d12 *= n3));
                    zzeb2.zzm = n18;
                    zzeb2.zzo = n18 = zzeb2.zzo + n3;
                    f18 = 0.0f;
                    for (n3 = 0; n3 < (n15 = (n18 = zzeb2.zzo) + -1); ++n3) {
                        short[] sArray10;
                        while ((n15 = (n18 = zzeb2.zzp + n17) * n14) > (d12 = (double)((n16 = zzeb2.zzq) * f5))) {
                            sArray10 = zzeb2.zzl;
                            n15 = zzeb2.zzm;
                            zzeb2.zzl = sArray10 = zzeb2.zzl(sArray10, n15, n17);
                            sArray10 = null;
                            for (n18 = 0; n18 < (n15 = zzeb2.zzb); ++n18) {
                                sArray9 = zzeb2.zzl;
                                d12 = zzeb2.zzm * n15;
                                sArray = zzeb2.zzn;
                                n8 = n3 * n15 + n18;
                                n7 = sArray[n8];
                                n8 += n15;
                                n15 = sArray[n8];
                                n10 = zzeb2.zzq * f5;
                                n8 = zzeb2.zzp;
                                n4 = n8 * n14;
                                n8 = (n8 + n17) * n14;
                                n10 = n8 - n10;
                                n7 *= n10;
                                n10 = (((n8 -= n4) - n10) * n15 + n7) / n8;
                                n15 = (short)n10;
                                sArray9[d12 += n18] = n15;
                            }
                            zzeb2.zzq = n18 = zzeb2.zzq + n17;
                            zzeb2.zzm = n18 = zzeb2.zzm + n17;
                        }
                        zzeb2.zzp = n18;
                        if (n18 != f5) continue;
                        zzeb2.zzp = 0;
                        if (n16 == n14) {
                            n18 = 1;
                        } else {
                            n18 = 0;
                            sArray10 = null;
                        }
                        zzeq.zzf(n18 != 0);
                        zzeb2.zzq = 0;
                    }
                    if (n15 == 0) break;
                    sArray2 = zzeb2.zzn;
                    n14 = zzeb2.zzb;
                    n18 -= n15;
                    n3 = n15 * n14;
                    System.arraycopy(sArray2, n3, sArray2, 0, n18 *= n14);
                    f5 = zzeb2.zzo - n15;
                    zzeb2.zzo = (int)f5;
                    return;
                }
                n14 /= 2;
                f5 /= 2;
            }
        }
    }

    private final short[] zzl(short[] sArray, int n3, int n4) {
        int n7 = sArray.length;
        int n8 = this.zzb;
        if ((n3 += n4) <= (n7 /= n8)) {
            return sArray;
        }
        n7 = (n7 * 3 / 2 + n4) * n8;
        return Arrays.copyOf(sArray, n7);
    }

    public final int zza() {
        int n3 = this.zzm;
        int n4 = this.zzb;
        return (n3 *= n4) + n3;
    }

    public final int zzb() {
        int n3 = this.zzk;
        int n4 = this.zzb;
        return (n3 *= n4) + n3;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int n3;
        int n4 = shortBuffer.remaining();
        int n7 = this.zzb;
        n4 /= n7;
        n7 = this.zzm;
        n4 = Math.min(n4, n7);
        n7 = this.zzb * n4;
        short[] sArray = this.zzl;
        shortBuffer.put(sArray, 0, n7);
        this.zzm = n3 = this.zzm - n4;
        n7 = this.zzb;
        sArray = this.zzl;
        System.arraycopy(sArray, n4 *= n7, sArray, 0, n3 *= n7);
    }

    public final void zze() {
        int n3;
        int n4 = this.zzk;
        float f5 = n4;
        int n7 = this.zzm;
        float f6 = this.zzo;
        float f7 = this.zzc;
        float f8 = this.zze;
        float f11 = this.zzd;
        f5 = f5 / (f7 /= f11) + f6;
        int n8 = (int)(f5 / (f8 *= f11) + 0.5f);
        n7 += n8;
        n8 = this.zzh;
        n8 = n8 + n8 + n4;
        short[] sArray = this.zzj;
        short[] sArray2 = this.zzl(sArray, n4, n8);
        this.zzj = sArray2;
        n8 = 0;
        f5 = 0.0f;
        sArray2 = null;
        int n10 = 0;
        f6 = 0.0f;
        sArray = null;
        while (true) {
            int n14;
            n3 = this.zzh;
            int n15 = this.zzb;
            if (n10 >= (n14 = (n3 += n3) * n15)) break;
            short[] sArray3 = this.zzj;
            n15 = n15 * n4 + n10;
            sArray3[n15] = 0;
            ++n10;
        }
        this.zzk = n4 = this.zzk + n3;
        this.zzk();
        n4 = this.zzm;
        if (n4 > n7) {
            this.zzm = n7;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int n3;
        int n4 = shortBuffer.remaining();
        int n7 = this.zzb;
        n4 /= n7;
        n7 *= n4;
        short[] sArray = this.zzj;
        int n8 = this.zzk;
        this.zzj = sArray = this.zzl(sArray, n8, n4);
        n8 = this.zzk;
        int n10 = this.zzb;
        n7 = (n7 + n7) / 2;
        shortBuffer.get(sArray, n8 *= n10, n7);
        this.zzk = n3 = this.zzk + n4;
        this.zzk();
    }
}

