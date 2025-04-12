/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzaeo {
    private static final String[] zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final int[] zzd;
    private static final int[] zze;
    private static final int[] zzf;
    private static final int[] zzg;

    static {
        int[] nArray;
        int[] nArray2;
        zza = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
        zzb = new int[]{44100, 48000, 32000};
        int n3 = 14;
        int[] nArray3 = nArray2 = new int[n3];
        int[] nArray4 = nArray2;
        nArray3[0] = 32000;
        nArray4[1] = 64000;
        nArray3[2] = 96000;
        nArray4[3] = 128000;
        nArray3[4] = 160000;
        nArray4[5] = 192000;
        nArray3[6] = 224000;
        nArray4[7] = 256000;
        nArray3[8] = 288000;
        nArray4[9] = 320000;
        nArray3[10] = 352000;
        nArray4[11] = 384000;
        nArray3[12] = 416000;
        nArray4[13] = 448000;
        zzc = nArray2;
        int[] nArray5 = nArray2 = new int[n3];
        int[] nArray6 = nArray2;
        nArray5[0] = 32000;
        nArray6[1] = 48000;
        nArray5[2] = 56000;
        nArray6[3] = 64000;
        nArray5[4] = 80000;
        nArray6[5] = 96000;
        nArray5[6] = 112000;
        nArray6[7] = 128000;
        nArray5[8] = 144000;
        nArray6[9] = 160000;
        nArray5[10] = 176000;
        nArray6[11] = 192000;
        nArray5[12] = 224000;
        nArray6[13] = 256000;
        zzd = nArray2;
        int[] nArray7 = nArray2 = new int[n3];
        int[] nArray8 = nArray2;
        nArray7[0] = 32000;
        nArray8[1] = 48000;
        nArray7[2] = 56000;
        nArray8[3] = 64000;
        nArray7[4] = 80000;
        nArray8[5] = 96000;
        nArray7[6] = 112000;
        nArray8[7] = 128000;
        nArray7[8] = 160000;
        nArray8[9] = 192000;
        nArray7[10] = 224000;
        nArray8[11] = 256000;
        nArray7[12] = 320000;
        nArray8[13] = 384000;
        zze = nArray2;
        int[] nArray9 = nArray2 = new int[n3];
        int[] nArray10 = nArray2;
        nArray9[0] = 32000;
        nArray10[1] = 40000;
        nArray9[2] = 48000;
        nArray10[3] = 56000;
        nArray9[4] = 64000;
        nArray10[5] = 80000;
        nArray9[6] = 96000;
        nArray10[7] = 112000;
        nArray9[8] = 128000;
        nArray10[9] = 160000;
        nArray9[10] = 192000;
        nArray10[11] = 224000;
        nArray9[12] = 256000;
        nArray10[13] = 320000;
        zzf = nArray2;
        int[] nArray11 = nArray = new int[n3];
        int[] nArray12 = nArray;
        nArray11[0] = 8000;
        nArray12[1] = 16000;
        nArray11[2] = 24000;
        nArray12[3] = 32000;
        nArray11[4] = 40000;
        nArray12[5] = 48000;
        nArray11[6] = 56000;
        nArray12[7] = 64000;
        nArray11[8] = 80000;
        nArray12[9] = 96000;
        nArray11[10] = 112000;
        nArray12[11] = 128000;
        nArray11[12] = 144000;
        nArray12[13] = 160000;
        zzg = nArray;
    }

    public static /* bridge */ /* synthetic */ int zza(int n3, int n4) {
        return zzaeo.zzl(n3, n4);
    }

    public static int zzb(int n3) {
        int n4 = zzaeo.zzm(n3);
        int n7 = -1;
        if (n4 != 0) {
            int n8;
            n4 = n3 >>> 19;
            int n10 = 3;
            int n14 = 1;
            if ((n4 &= n10) != n14 && (n8 = n3 >>> 17 & n10) != 0) {
                int n15 = n3 >>> 12;
                int n16 = 15;
                if ((n15 &= n16) != 0 && n15 != n16 && (n16 = n3 >>> 10 & n10) != n10) {
                    n15 += n7;
                    int[] nArray = zzb;
                    n7 = nArray[n16];
                    n16 = 2;
                    if (n4 == n16) {
                        n7 /= 2;
                    } else if (n4 == 0) {
                        n7 /= 4;
                    }
                    n3 = n3 >>> 9 & n14;
                    if (n8 == n10) {
                        if (n4 == n10) {
                            int[] nArray2 = zzc;
                            n4 = nArray2[n15];
                        } else {
                            int[] nArray3 = zzd;
                            n4 = nArray3[n15];
                        }
                        return (n4 * 12 / n7 + n3) * 4;
                    }
                    if (n4 == n10) {
                        if (n8 == n16) {
                            int[] nArray4 = zze;
                            n15 = nArray4[n15];
                        } else {
                            int[] nArray5 = zzf;
                            n15 = nArray5[n15];
                        }
                    } else {
                        int[] nArray6 = zzg;
                        n15 = nArray6[n15];
                    }
                    n16 = 144;
                    if (n4 == n10) {
                        return zy_2.a(n15, n16, n7, n3);
                    }
                    if (n8 == n14) {
                        n16 = 72;
                    }
                    return zy_2.a(n16, n15, n7, n3);
                }
            }
        }
        return n7;
    }

    public static int zzc(int n3) {
        int n4 = zzaeo.zzm(n3);
        if (n4 != 0) {
            n4 = n3 >>> 19;
            int n7 = 3;
            int n8 = 1;
            if ((n4 &= n7) != n8 && (n8 = n3 >>> 17 & n7) != 0) {
                int n10 = n3 >>> 12;
                n3 = n3 >>> 10 & n7;
                int n14 = 15;
                if ((n10 &= n14) != 0 && n10 != n14 && n3 != n7) {
                    return zzaeo.zzl(n4, n8);
                }
            }
        }
        return -1;
    }

    public static /* bridge */ /* synthetic */ boolean zzd(int n3) {
        return zzaeo.zzm(n3);
    }

    public static /* bridge */ /* synthetic */ int[] zze() {
        return zzc;
    }

    public static /* bridge */ /* synthetic */ int[] zzf() {
        return zze;
    }

    public static /* bridge */ /* synthetic */ int[] zzg() {
        return zzf;
    }

    public static /* bridge */ /* synthetic */ int[] zzh() {
        return zzg;
    }

    public static /* bridge */ /* synthetic */ int[] zzi() {
        return zzd;
    }

    public static /* bridge */ /* synthetic */ int[] zzj() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ String[] zzk() {
        return zza;
    }

    private static int zzl(int n3, int n4) {
        int n7 = 1;
        int n8 = 1152;
        if (n4 != n7) {
            n3 = 2;
            if (n4 != n3) {
                return 384;
            }
            return n8;
        }
        n4 = 3;
        if (n3 == n4) {
            return n8;
        }
        return 576;
    }

    private static boolean zzm(int n3) {
        int n4 = -2097152;
        return (n3 &= n4) == n4;
    }
}

