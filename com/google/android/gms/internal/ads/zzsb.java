/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgea;
import com.google.android.gms.internal.ads.zzrk;
import com.google.android.gms.internal.ads.zzsa;

public final class zzsb
implements zzrk {
    public zzsb(zzsa zzsa2) {
    }

    public static int zza(int n3, int n4, int n7) {
        long l2 = n3;
        long l3 = n4;
        l2 *= l3;
        l3 = n7;
        return zzgea.zzb(l2 * l3 / 1000000L);
    }

    public static int zzb(int n3) {
        switch (n3) {
            default: {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                throw illegalArgumentException;
            }
            case 20: {
                return 63750;
            }
            case 17: {
                return 336000;
            }
            case 16: {
                return 256000;
            }
            case 15: {
                return 8000;
            }
            case 14: {
                return 3062500;
            }
            case 12: {
                return 7000;
            }
            case 11: {
                return 16000;
            }
            case 10: {
                return 100000;
            }
            case 9: {
                return 40000;
            }
            case 8: {
                return 2250000;
            }
            case 7: {
                return 192000;
            }
            case 6: 
            case 18: {
                return 768000;
            }
            case 5: 
        }
        return 80000;
    }
}

