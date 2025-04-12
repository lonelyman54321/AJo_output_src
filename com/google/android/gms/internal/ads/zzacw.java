/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacv;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;

public final class zzacw {
    public static final /* synthetic */ int zza;
    private static final int[] zzb;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[14];
        int[] nArray3 = nArray;
        nArray2[0] = 2002;
        nArray3[1] = 2000;
        nArray2[2] = 1920;
        nArray3[3] = 1601;
        nArray2[4] = 1600;
        nArray3[5] = 1001;
        nArray2[6] = 1000;
        nArray3[7] = 960;
        nArray2[8] = 800;
        nArray3[9] = 800;
        nArray2[10] = 480;
        nArray3[11] = 400;
        nArray2[12] = 400;
        nArray3[13] = 2048;
        zzb = nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static zzacv zza(zzft object) {
        int n3;
        Object object2;
        int n4;
        Object object3;
        Object object4;
        block12: {
            block13: {
                int n7;
                block16: {
                    block17: {
                        int n8;
                        int n10;
                        int n14;
                        block14: {
                            block15: {
                                int n15;
                                int[] nArray;
                                int n16;
                                int n17;
                                Object object5;
                                block11: {
                                    object5 = 16;
                                    n17 = ((zzft)object).zzd((int)object5);
                                    object5 = ((zzft)object).zzd((int)object5);
                                    n7 = -1;
                                    n16 = 4;
                                    if (object5 == n7) {
                                        object5 = ((zzft)object).zzd(24);
                                        n7 = 7;
                                    } else {
                                        n7 = 4;
                                    }
                                    object5 += n7;
                                    n7 = 44097;
                                    if (n17 == n7) {
                                        object5 += 2;
                                    }
                                    object4 = object5;
                                    object5 = 2;
                                    n17 = ((zzft)object).zzd((int)object5);
                                    n7 = 0;
                                    nArray = null;
                                    n14 = 3;
                                    if (n17 != n14) {
                                        object3 = n17;
                                    } else {
                                        n17 = 0;
                                        while (true) {
                                            object3 = ((zzft)object).zzd((int)object5) + n17;
                                            n17 = (int)(((zzft)object).zzo() ? 1 : 0);
                                            if (n17 == 0) {
                                                object3 += n14;
                                                break;
                                            }
                                            n17 = ++object3 << 2;
                                        }
                                    }
                                    n17 = ((zzft)object).zzd(10);
                                    n10 = ((zzft)object).zzo();
                                    if (n10 != 0 && (n10 = ((zzft)object).zzd(n14)) > 0) {
                                        ((zzft)object).zzm((int)object5);
                                    }
                                    n10 = ((zzft)object).zzo();
                                    n4 = 48000;
                                    object2 = 44100;
                                    n15 = 1;
                                    n3 = n15 != n10 ? 44100 : 48000;
                                    n8 = ((zzft)object).zzd(n16);
                                    if (n3 != object2 || n8 != (n10 = 13)) break block11;
                                    object = zzb;
                                    Object object6 = object[n10];
                                    object2 = object6;
                                    break block12;
                                }
                                if (n3 != n4 || n8 >= (n10 = 14)) break block13;
                                nArray = zzb;
                                n7 = nArray[n8];
                                n10 = 8;
                                if ((n17 %= 5) == n15) break block14;
                                n4 = 11;
                                if (n17 == object5) break block15;
                                if (n17 == n14) break block14;
                                if (n17 != n16 || n8 != n14 && n8 != n10 && n8 != n4) break block16;
                                break block17;
                            }
                            if (n8 != n10 && n8 != n4) break block16;
                            break block17;
                        }
                        if (n8 != n14 && n8 != n10) break block16;
                    }
                    ++n7;
                }
                object2 = n7;
                break block12;
            }
            object2 = 0;
        }
        n4 = n3;
        return new zzacv((int)object3, 2, n3, (int)object4, (int)object2, null);
    }

    public static void zzb(int n3, zzfu object) {
        ((zzfu)object).zzH(7);
        object = ((zzfu)object).zzM();
        object[0] = -84;
        object[1] = 64;
        int n4 = -1;
        object[2] = n4;
        object[3] = n4;
        byte by2 = (byte)(n3 >> 16 & 0xFF);
        object[4] = by2;
        by2 = (byte)(n3 >> 8 & 0xFF);
        object[5] = by2;
        n3 = (byte)(n3 & 0xFF);
        object[6] = n3;
    }
}

