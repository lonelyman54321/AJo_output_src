/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadq;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzgd;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzadr {
    public static final /* synthetic */ int zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final int[] zzd;
    private static final int[] zze;
    private static final int[] zzf;
    private static final int[] zzg;
    private static final int[] zzh;
    private static final int[] zzi;
    private static final int[] zzj;

    static {
        int[] nArray;
        int n3 = 8;
        int n4 = 5;
        int n7 = 6;
        int n8 = 16;
        int[] nArray2 = nArray = new int[n8];
        int[] nArray3 = nArray;
        nArray2[0] = 1;
        nArray3[1] = 2;
        nArray2[2] = 2;
        nArray3[3] = 2;
        nArray2[4] = 2;
        nArray3[5] = 3;
        nArray2[6] = 3;
        nArray3[7] = 4;
        nArray2[8] = 4;
        nArray3[9] = 5;
        nArray2[10] = 6;
        nArray3[11] = 6;
        nArray2[12] = 6;
        nArray3[13] = 7;
        nArray2[14] = 8;
        nArray3[15] = 8;
        zzb = nArray;
        int[] nArray4 = nArray = new int[n8];
        int[] nArray5 = nArray;
        nArray4[0] = -1;
        nArray5[1] = 8000;
        nArray4[2] = 16000;
        nArray5[3] = 32000;
        nArray4[4] = -1;
        nArray5[5] = -1;
        nArray4[6] = 11025;
        nArray5[7] = 22050;
        nArray4[8] = 44100;
        nArray5[9] = -1;
        nArray4[10] = -1;
        nArray5[11] = 12000;
        nArray4[12] = 24000;
        nArray5[13] = 48000;
        nArray4[14] = -1;
        nArray5[15] = -1;
        zzc = nArray;
        int[] nArray6 = nArray = new int[29];
        int[] nArray7 = nArray;
        nArray6[0] = 64;
        nArray7[1] = 112;
        nArray6[2] = 128;
        nArray7[3] = 192;
        nArray6[4] = 224;
        nArray7[5] = 256;
        nArray6[6] = 384;
        nArray7[7] = 448;
        nArray6[8] = 512;
        nArray7[9] = 640;
        nArray6[10] = 768;
        nArray7[11] = 896;
        nArray6[12] = 1024;
        nArray7[13] = 1152;
        nArray6[14] = 1280;
        nArray7[15] = 1536;
        nArray6[16] = 1920;
        nArray7[17] = 2048;
        nArray6[18] = 2304;
        nArray7[19] = 2560;
        nArray6[20] = 2688;
        nArray7[21] = 2816;
        nArray6[22] = 2823;
        nArray7[23] = 2944;
        nArray6[24] = 3072;
        nArray7[25] = 3840;
        nArray6[26] = 4096;
        nArray7[27] = 6144;
        nArray7[28] = 7680;
        zzd = nArray;
        int[] nArray8 = nArray = new int[n8];
        int[] nArray9 = nArray;
        nArray8[0] = 8000;
        nArray9[1] = 16000;
        nArray8[2] = 32000;
        nArray9[3] = 64000;
        nArray8[4] = 128000;
        nArray9[5] = 22050;
        nArray8[6] = 44100;
        nArray9[7] = 88200;
        nArray8[8] = 176400;
        nArray9[9] = 352800;
        nArray8[10] = 12000;
        nArray9[11] = 24000;
        nArray8[12] = 48000;
        nArray9[13] = 96000;
        nArray8[14] = 192000;
        nArray9[15] = 384000;
        zze = nArray;
        int n10 = 10;
        int n14 = 12;
        zzf = new int[]{n4, n3, n10, n14};
        int n15 = 9;
        zzg = new int[]{n7, n15, n14, 15};
        zzh = new int[]{2, 4, n7, n3};
        zzi = new int[]{n15, 11, 13, n8};
        zzj = new int[]{n4, n3, n10, n14};
    }

    /*
     * WARNING - void declaration
     */
    public static int zza(byte[] object) {
        void var1_4;
        object = zzadr.zzg((byte[])object);
        ((zzft)object).zzm(42);
        int n3 = ((zzft)object).zzo();
        int n4 = 1;
        if (n4 != n3) {
            int n7 = 8;
        } else {
            int n8 = 12;
        }
        return ((zzft)object).zzd((int)var1_4) + n4;
    }

    public static int zzb(byte[] object) {
        object = zzadr.zzg((byte[])object);
        ((zzft)object).zzm(32);
        int[] nArray = zzj;
        int n3 = 1;
        return zzadr.zzf((zzft)object, nArray, n3 != 0) + n3;
    }

    public static zzan zzc(byte[] object, String string2, String string3, int n3, zzae zzae2) {
        object = zzadr.zzg((byte[])object);
        ((zzft)object).zzm(60);
        int n4 = ((zzft)object).zzd(6);
        int[] nArray = zzb;
        n4 = nArray[n4];
        int n7 = ((zzft)object).zzd(4);
        int[] nArray2 = zzc;
        n7 = nArray2[n7];
        int n8 = ((zzft)object).zzd(5);
        int n10 = 29;
        int n14 = 2;
        if (n8 >= n10) {
            n8 = -1;
        } else {
            int[] nArray3 = zzd;
            n8 = nArray3[n8] * 1000 / n14;
        }
        n10 = 10;
        ((zzft)object).zzm(n10);
        int n15 = ((zzft)object).zzd(n14);
        if (n15 > 0) {
            n15 = 1;
        } else {
            n15 = 0;
            object = null;
        }
        n4 += n15;
        object = new zzal();
        ((zzal)object).zzK(string2);
        ((zzal)object).zzX("audio/vnd.dts");
        ((zzal)object).zzx(n8);
        ((zzal)object).zzy(n4);
        ((zzal)object).zzY(n7);
        ((zzal)object).zzE(null);
        ((zzal)object).zzO(string3);
        ((zzal)object).zzV(n3);
        return ((zzal)object).zzad();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static zzadq zzd(byte[] byArray) {
        zzadq zzadq2;
        long l2;
        int n3;
        int n4;
        int n7;
        Object object = zzadr.zzg(byArray);
        ((zzft)object).zzm(40);
        int n8 = 2;
        int n10 = ((zzft)object).zzd(n8);
        int n14 = ((zzft)object).zzo();
        int n15 = 1;
        int n16 = n15 != n14 ? 16 : 20;
        int n17 = 12;
        int n18 = 8;
        n14 = n15 != n14 ? 8 : 12;
        ((zzft)object).zzm(n14);
        int n19 = ((zzft)object).zzd(n16) + 1;
        n14 = (int)(((zzft)object).zzo() ? 1 : 0);
        int n20 = 0;
        if (n14 != 0) {
            n7 = ((zzft)object).zzd(n8);
            n4 = 3;
            int n21 = ((zzft)object).zzd(n4) + n15;
            int n22 = ((zzft)object).zzo();
            if (n22 != 0) {
                n22 = 36;
                ((zzft)object).zzm(n22);
            }
            n22 = ((zzft)object).zzd(n4) + n15;
            n4 = ((zzft)object).zzd(n4) + n15;
            if (n22 != n15) throw zzch.zzc("Multiple audio presentations or assets not supported");
            if (n4 != n15) throw zzch.zzc("Multiple audio presentations or assets not supported");
            n4 = ((zzft)object).zzd(n10 += n15);
            for (n22 = 0; n22 < n10; ++n22) {
                int n24 = n4 >> n22 & n15;
                if (n24 != n15) continue;
                ((zzft)object).zzm(n18);
            }
            n21 *= 512;
            n10 = (int)(((zzft)object).zzo() ? 1 : 0);
            if (n10 != 0) {
                ((zzft)object).zzm(n8);
                n10 = ((zzft)object).zzd(n8) + n15 << n8;
                n4 = ((zzft)object).zzd(n8) + n15;
                while (n20 < n4) {
                    ((zzft)object).zzm(n10);
                    ++n20;
                }
            }
            n20 = n21;
        } else {
            n7 = -1;
        }
        ((zzft)object).zzm(n16);
        ((zzft)object).zzm(n17);
        if (n14 != 0) {
            n10 = (int)(((zzft)object).zzo() ? 1 : 0);
            n16 = 4;
            if (n10 != 0) {
                ((zzft)object).zzm(n16);
            }
            if ((n10 = (int)(((zzft)object).zzo() ? 1 : 0)) != 0) {
                n10 = 24;
                ((zzft)object).zzm(n10);
            }
            if ((n10 = (int)(((zzft)object).zzo() ? 1 : 0)) != 0) {
                n10 = ((zzft)object).zzd(10) + n15;
                ((zzft)object).zzn(n10);
            }
            ((zzft)object).zzm(5);
            int[] nArray = zze;
            n16 = ((zzft)object).zzd(n16);
            n10 = nArray[n16];
            n3 = ((zzft)object).zzd(n18) + n15;
            n4 = n10;
        } else {
            n3 = -1;
            n4 = -2147483647;
        }
        if (n14 != 0) {
            if (n7 != 0) {
                if (n7 != n15) {
                    if (n7 != n8) {
                        object = new StringBuilder("Unsupported reference clock code in DTS HD header: ");
                        ((StringBuilder)object).append(n7);
                        throw zzch.zza(((StringBuilder)object).toString(), null);
                    }
                    n8 = 48000;
                } else {
                    n8 = 44100;
                }
            } else {
                n8 = 32000;
            }
            long l3 = n20;
            long l4 = n8;
            RoundingMode roundingMode = RoundingMode.FLOOR;
            long l7 = 1000000L;
            l2 = zzgd.zzt(l3, l7, l4, roundingMode);
        } else {
            l2 = -9223372036854775807L;
        }
        zzadq zzadq3 = zzadq2;
        n7 = n3;
        return new zzadq("audio/vnd.dts.hd;profile=lbr", n3, n4, n19, l2, 0, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static zzadq zze(byte[] byArray, AtomicInteger atomicInteger) {
        long l2;
        int n3;
        long l3;
        int[] nArray;
        int n4;
        Object object = byArray;
        zzft zzft2 = zzadr.zzg(byArray);
        int n7 = zzft2.zzd(32);
        int[] nArray2 = zzf;
        int n8 = 1;
        int n10 = zzadr.zzf(zzft2, nArray2, n8 != 0);
        int n14 = n10 + 1;
        int n15 = 1078008818;
        if ((n7 = n7 == n15 ? 1 : 0) != 0) {
            n15 = (int)(zzft2.zzo() ? 1 : 0);
            if (n15 == 0) {
                throw zzch.zzc("Only supports full channel mask-based audio presentation");
            }
            n15 = n10 + -1;
            int n16 = object[n15] << 8;
            n10 = object[n10] & 0xFF;
            int n17 = -1;
            n4 = zzgd.zzd((byte[])object, 0, n15, n17);
            n15 = (char)n16;
            n10 |= n15;
            n15 = 0;
            nArray = null;
            if (n10 != n4) {
                throw zzch.zza("CRC check failed", null);
            }
            n4 = 2;
            n10 = zzft2.zzd(n4);
            if (n10 != 0) {
                if (n10 != n8) {
                    if (n10 != n4) {
                        object = new StringBuilder;
                        ((StringBuilder)object)("Unsupported base duration index in DTS UHD header: ");
                        ((StringBuilder)object).append(n10);
                        throw zzch.zza(((StringBuilder)object).toString(), null);
                    }
                    n10 = 384;
                } else {
                    n10 = 480;
                }
            } else {
                n10 = 512;
            }
            n16 = zzft2.zzd(3) + n8;
            n17 = zzft2.zzd(n4);
            if (n17 != 0) {
                if (n17 != n8) {
                    if (n17 != n4) {
                        object = new StringBuilder("Unsupported clock rate index in DTS UHD header: ");
                        ((StringBuilder)object).append(n17);
                        throw zzch.zza(((StringBuilder)object).toString(), null);
                    }
                    n15 = 48000;
                } else {
                    n15 = 44100;
                }
            } else {
                n15 = 32000;
            }
            n17 = (int)(zzft2.zzo() ? 1 : 0);
            if (n17 != 0) {
                n17 = 36;
                zzft2.zzm(n17);
            }
            n4 = zzft2.zzd(n4);
            n4 = (n8 << n4) * n15;
            long l4 = n15;
            l3 = n10 *= n16;
            long l7 = 1000000L;
            RoundingMode roundingMode = RoundingMode.FLOOR;
            l3 = zzgd.zzt(l3, l7, l4, roundingMode);
            n3 = n4;
            l2 = l3;
        } else {
            l3 = -9223372036854775807L;
            n4 = -2147483647;
            l2 = l3;
            n3 = -2147483647;
        }
        n4 = 0;
        object = null;
        n10 = 0;
        nArray2 = null;
        while (n4 < n7) {
            object = zzg;
            n4 = zzadr.zzf(zzft2, (int[])object, n8 != 0);
            n10 += n4;
            n4 = 1;
        }
        n4 = 0;
        object = null;
        while (true) {
            if (n4 > 0) {
                int n18 = n14 + n10;
                object = new zzadq;
                return new zzadq("audio/vnd.dts.uhd;profile=p2", 2, n3, n18, l2, 0, null);
            }
            if (n7 != 0) {
                nArray = zzh;
                n15 = zzadr.zzf(zzft2, nArray, n8 != 0);
                atomicInteger.set(n15);
            }
            if ((n15 = atomicInteger.get()) != 0) {
                nArray = zzi;
                n15 = zzadr.zzf(zzft2, nArray, n8 != 0);
            } else {
                n15 = 0;
                nArray = null;
            }
            n10 += n15;
            ++n4;
        }
    }

    private static int zzf(zzft zzft2, int[] nArray, boolean n3) {
        int n4;
        int n7;
        n3 = 0;
        int n8 = 0;
        for (n7 = 0; n7 < (n4 = 3) && (n4 = (int)(zzft2.zzo() ? 1 : 0)) != 0; ++n7) {
            ++n8;
        }
        n7 = 0;
        while (n3 < n8) {
            n4 = nArray[n3];
            int n10 = 1;
            n4 = n10 << n4;
            n7 += n4;
            n3 += 1;
        }
        int n14 = nArray[n8];
        return zzft2.zzd(n14) + n7;
    }

    private static zzft zzg(byte[] byArray) {
        int n3 = 0;
        zzft zzft2 = null;
        int n4 = byArray[0];
        int n7 = 127;
        if (n4 != n7 && n4 != (n7 = 100) && n4 != (n7 = 64) && n4 != (n7 = 113)) {
            zzft zzft3;
            n4 = byArray.length;
            byArray = Arrays.copyOf(byArray, n4);
            n4 = byArray[0];
            n7 = -2;
            int n8 = -1;
            if (n4 == n7 || n4 == n8 || n4 == (n7 = 37) || n4 == (n7 = -14) || n4 == (n7 = -24)) {
                zzft3 = null;
                for (n4 = 0; n4 < (n7 = byArray.length + n8); n4 += 2) {
                    byte by2;
                    n7 = byArray[n4];
                    int n10 = n4 + 1;
                    byArray[n4] = by2 = byArray[n10];
                    byArray[n10] = n7;
                }
            }
            n7 = byArray.length;
            zzft3 = new zzft(byArray, n7);
            n3 = byArray[0];
            n8 = 31;
            if (n3 == n8) {
                zzft2 = new zzft(byArray, n7);
                while ((n7 = zzft2.zza()) >= (n8 = 16)) {
                    zzft2.zzm(2);
                    n7 = 14;
                    n8 = zzft2.zzd(n7);
                    zzft3.zzf(n8, n7);
                }
            }
            n3 = byArray.length;
            zzft3.zzj(byArray, n3);
            return zzft3;
        }
        n4 = byArray.length;
        zzft2 = new zzft(byArray, n4);
        return zzft2;
    }
}

