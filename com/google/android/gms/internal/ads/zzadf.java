/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;

public final class zzadf {
    /*
     * Enabled aggressive block sorting
     */
    public static void zza(long l2, zzfu zzfu2, zzafa[] zzafaArray) {
        while (true) {
            int n3;
            block12: {
                String string2;
                String string3;
                block11: {
                    int n4;
                    int n7;
                    if ((n7 = zzfu2.zzb()) <= (n4 = 1)) {
                        return;
                    }
                    n7 = zzadf.zzc(zzfu2);
                    int n8 = zzadf.zzc(zzfu2);
                    n3 = zzfu2.zzd() + n8;
                    int n10 = -1;
                    if (n8 == n10 || n8 > (n10 = zzfu2.zzb())) break block11;
                    n10 = 4;
                    if (n7 == n10 && n8 >= (n7 = 8)) {
                        int n14;
                        int n15;
                        n7 = zzfu2.zzm();
                        n8 = zzfu2.zzq();
                        if (n8 == (n10 = 49)) {
                            n15 = zzfu2.zzg();
                            n8 = 49;
                        } else {
                            n15 = 0;
                        }
                        int n16 = zzfu2.zzm();
                        int n17 = 47;
                        if (n8 == n17) {
                            zzfu2.zzL(n4);
                            n8 = 47;
                        }
                        if (n7 == (n14 = 181) && (n8 == n10 || n8 == n17) && n16 == (n7 = 3)) {
                            n7 = 1;
                        } else {
                            n7 = 0;
                            string3 = null;
                        }
                        if (n8 == n10) {
                            n8 = 1195456820;
                            if (n15 != n8) {
                                n4 = 0;
                                string2 = null;
                            }
                            n7 &= n4;
                        }
                        if (n7 != 0) {
                            zzadf.zzb(l2, zzfu2, zzafaArray);
                        }
                    }
                    break block12;
                }
                string3 = "CeaUtil";
                string2 = "Skipping remainder of malformed SEI NAL unit.";
                zzfk.zzf(string3, string2);
                n3 = zzfu2.zze();
            }
            zzfu2.zzK(n3);
        }
    }

    public static void zzb(long l2, zzfu zzfu2, zzafa[] zzafaArray) {
        zzfu zzfu3 = zzfu2;
        zzafa[] zzafaArray2 = zzafaArray;
        int n3 = zzfu2.zzm();
        int n4 = n3 & 0x40;
        if (n4 != 0) {
            n3 &= 0x1F;
            n4 = 1;
            zzfu2.zzL(n4);
            int n7 = zzfu2.zzd();
            int n8 = zzafaArray.length;
            for (int i3 = 0; i3 < n8; ++i3) {
                int n10 = n3 * 3;
                zzafa zzafa2 = zzafaArray2[i3];
                zzfu3.zzK(n7);
                zzafa2.zzq(zzfu3, n10);
                long l3 = -9223372036854775807L;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                boolean bl2 = l4 != false;
                zzeq.zzf(bl2);
                l4 = 1;
                l3 = l2;
                zzafa2.zzs(l2, (int)l4, n10, 0, null);
            }
        }
    }

    private static int zzc(zzfu zzfu2) {
        int n3;
        int n4;
        int n7 = 0;
        do {
            if ((n4 = zzfu2.zzb()) == 0) {
                return -1;
            }
            n4 = zzfu2.zzm();
            n7 += n4;
        } while (n4 == (n3 = 255));
        return n7;
    }
}

