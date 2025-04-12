/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzft;

public final class zzacq {
    public static final /* synthetic */ int zza;
    private static final int[] zzb;
    private static final int[] zzc;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[13];
        int[] nArray3 = nArray;
        nArray2[0] = 96000;
        nArray3[1] = 88200;
        nArray2[2] = 64000;
        nArray3[3] = 48000;
        nArray2[4] = 44100;
        nArray3[5] = 32000;
        nArray2[6] = 24000;
        nArray3[7] = 22050;
        nArray2[8] = 16000;
        nArray3[9] = 12000;
        nArray2[10] = 11025;
        nArray3[11] = 8000;
        nArray3[12] = 7350;
        zzb = nArray;
        int[] nArray4 = nArray = new int[16];
        int[] nArray5 = nArray;
        nArray4[0] = 0;
        nArray5[1] = 1;
        nArray4[2] = 2;
        nArray5[3] = 3;
        nArray4[4] = 4;
        nArray5[5] = 5;
        nArray4[6] = 6;
        nArray5[7] = 8;
        nArray4[8] = -1;
        nArray5[9] = -1;
        nArray4[10] = -1;
        nArray5[11] = 7;
        nArray4[12] = 8;
        nArray5[13] = -1;
        nArray4[14] = 8;
        nArray5[15] = -1;
        zzc = nArray;
    }

    public static zzacp zza(byte[] byArray) {
        int n3 = byArray.length;
        zzft zzft2 = new zzft(byArray, n3);
        return zzacq.zzb(zzft2, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static zzacp zzb(zzft object, boolean n3) {
        String string2;
        int n4;
        int n7;
        int n8;
        block23: {
            int n10;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            block25: {
                block24: {
                    n8 = zzacq.zzc((zzft)object);
                    n7 = zzacq.zzd((zzft)object);
                    n18 = 4;
                    n4 = ((zzft)object).zzd(n18);
                    string2 = hj0_0.a(n8, "mp4a.40.");
                    int n19 = 5;
                    n17 = 22;
                    if (n8 == n19 || n8 == (n19 = 29)) {
                        n7 = zzacq.zzd((zzft)object);
                        n8 = zzacq.zzc((zzft)object);
                        if (n8 == n17) {
                            n4 = ((zzft)object).zzd(n18);
                        }
                    }
                    if (n3 == 0) break block23;
                    n3 = 17;
                    n19 = 6;
                    n16 = 1;
                    n15 = 2;
                    n14 = 3;
                    if (n8 != n16 && n8 != n15 && n8 != n14 && n8 != n18 && n8 != n19 && n8 != (n18 = 7) && n8 != n3) {
                        switch (n8) {
                            default: {
                                object = new StringBuilder("Unsupported audio object type: ");
                                ((StringBuilder)object).append(n8);
                                throw zzch.zzc(((StringBuilder)object).toString());
                            }
                            case 19: 
                            case 20: 
                            case 21: 
                            case 22: 
                            case 23: 
                        }
                    }
                    if ((n18 = (int)(((zzft)object).zzo() ? 1 : 0)) != 0) {
                        String string3 = "AacUtil";
                        String string4 = "Unexpected frameLengthFlag = 1";
                        zzfk.zzf(string3, string4);
                    }
                    if ((n18 = (int)(((zzft)object).zzo() ? 1 : 0)) != 0) {
                        n18 = 14;
                        ((zzft)object).zzm(n18);
                    }
                    n18 = (int)(((zzft)object).zzo() ? 1 : 0);
                    if (n4 == 0) {
                        object = new UnsupportedOperationException();
                        throw object;
                    }
                    n10 = 20;
                    if (n8 == n19) break block24;
                    if (n8 != n10) break block25;
                    n8 = 20;
                }
                ((zzft)object).zzm(n14);
            }
            if (n18 != 0) {
                if (n8 == n17) {
                    n18 = 16;
                    ((zzft)object).zzm(n18);
                } else {
                    n17 = n8;
                }
                if (n17 == n3 || n17 == (n3 = 19) || n17 == n10 || n17 == (n3 = 23)) {
                    ((zzft)object).zzm(n14);
                }
                ((zzft)object).zzm(n16);
            }
            switch (n8) {
                default: {
                    break;
                }
                case 17: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: {
                    int n20;
                    int n21 = ((zzft)object).zzd(n15);
                    if (n21 != n15) {
                        if (n21 != n14) {
                            break;
                        }
                    } else {
                        n20 = n21;
                    }
                    object = new StringBuilder("Unsupported epConfig: ");
                    ((StringBuilder)object).append(n20);
                    throw zzch.zzc(((StringBuilder)object).toString());
                }
            }
        }
        object = zzc;
        Object object2 = object[n4];
        n3 = -1;
        n8 = 0;
        if (object2 == n3) throw zzch.zza(null, null);
        return new zzacp(n7, (int)object2, string2, null);
    }

    private static int zzc(zzft zzft2) {
        int n3;
        int n4 = zzft2.zzd(5);
        if (n4 == (n3 = 31)) {
            return zzft2.zzd(6) + 32;
        }
        return n4;
    }

    private static int zzd(zzft object) {
        block5: {
            Object object2;
            block4: {
                int n3;
                block2: {
                    block3: {
                        int n4;
                        n3 = ((zzft)object).zzd(4);
                        if (n3 != (n4 = 15)) break block2;
                        n3 = ((zzft)object).zza();
                        if (n3 < (n4 = 24)) break block3;
                        object2 = ((zzft)object).zzd(n4);
                        break block4;
                    }
                    throw zzch.zza("AAC header insufficient data", null);
                }
                object2 = 13;
                if (n3 >= object2) break block5;
                object = zzb;
                object2 = object[n3];
            }
            return object2;
        }
        throw zzch.zza("AAC header wrong Sampling Frequency Index", null);
    }
}

