/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfd;
import com.google.android.gms.internal.clearcut.zzfg;
import com.google.android.gms.internal.clearcut.zzfh;
import com.google.android.gms.internal.clearcut.zzfi;
import com.google.android.gms.internal.clearcut.zzfj;
import java.nio.ByteBuffer;

final class zzff {
    private static final zzfg zzqb;

    static {
        boolean bl2 = zzfd.zzed();
        zzfg zzfg2 = bl2 && (bl2 = zzfd.zzee()) ? new zzfj() : new zzfh();
        zzqb = zzfg2;
    }

    public static int zza(CharSequence object) {
        int n3;
        int n4;
        int n7;
        int n8 = object.length();
        int n10 = 0;
        StringBuilder stringBuilder = null;
        for (n7 = 0; n7 < n8 && (n4 = (int)object.charAt(n7)) < (n3 = 128); ++n7) {
        }
        n4 = n8;
        while (n7 < n8) {
            int n14;
            n3 = object.charAt(n7);
            if (n3 < (n14 = 2048)) {
                n3 = 127 - n3 >>> 31;
                n4 += n3;
                ++n7;
                continue;
            }
            n3 = object.length();
            while (n7 < n3) {
                int n15 = object.charAt(n7);
                if (n15 < n14) {
                    n15 = 127 - n15 >>> 31;
                    n10 += n15;
                } else {
                    n10 += 2;
                    int n16 = 55296;
                    if (n16 <= n15 && n15 <= (n16 = 57343)) {
                        n15 = Character.codePointAt((CharSequence)object, n7);
                        if (n15 >= (n16 = 65536)) {
                            ++n7;
                        } else {
                            object = new zzfi(n7, n3);
                            throw object;
                        }
                    }
                }
                ++n7;
            }
            n4 += n10;
            break;
        }
        if (n4 >= n8) {
            return n4;
        }
        long l2 = (long)n4 + 0x100000000L;
        stringBuilder = new StringBuilder(54);
        stringBuilder.append("UTF-8 length does not fit in int: ");
        stringBuilder.append(l2);
        String string2 = stringBuilder.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static int zza(CharSequence charSequence, byte[] byArray, int n3, int n4) {
        return zzqb.zzb(charSequence, byArray, n3, n4);
    }

    public static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        zzfg zzfg2 = zzqb;
        boolean bl2 = byteBuffer.hasArray();
        if (bl2) {
            int n3 = byteBuffer.arrayOffset();
            byte[] byArray = byteBuffer.array();
            int n4 = byteBuffer.position() + n3;
            int n7 = byteBuffer.remaining();
            int n8 = zzff.zza(charSequence, byArray, n4, n7) - n3;
            byteBuffer.position(n8);
            return;
        }
        bl2 = byteBuffer.isDirect();
        if (bl2) {
            zzfg2.zzb(charSequence, byteBuffer);
            return;
        }
        zzfg.zzc(charSequence, byteBuffer);
    }

    private static int zzam(int n3) {
        int n4 = -12;
        if (n3 > n4) {
            n3 = -1;
        }
        return n3;
    }

    public static /* synthetic */ int zzan(int n3) {
        return zzff.zzam(n3);
    }

    private static int zzd(int n3, int n4, int n7) {
        int n8 = -12;
        if (n3 <= n8 && n4 <= (n8 = -65) && n7 <= n8) {
            n4 = n7 << 16;
            return (n3 ^= (n4 <<= 8)) ^ n4;
        }
        return -1;
    }

    public static /* synthetic */ int zze(int n3, int n4, int n7) {
        return zzff.zzd(n3, n4, n7);
    }

    public static boolean zze(byte[] byArray) {
        zzfg zzfg2 = zzqb;
        int n3 = byArray.length;
        return zzfg2.zze(byArray, 0, n3);
    }

    public static boolean zze(byte[] byArray, int n3, int n4) {
        return zzqb.zze(byArray, n3, n4);
    }

    private static int zzf(byte[] object, int n3, int n4) {
        int n7 = n3 + -1;
        n7 = object[n7];
        if ((n4 -= n3) != 0) {
            int n8 = 1;
            if (n4 != n8) {
                int n10 = 2;
                if (n4 == n10) {
                    n4 = object[n3];
                    byte by2 = object[n3 += n8];
                    return zzff.zzd(n7, n4, by2);
                }
                object = new AssertionError;
                object();
                throw object;
            }
            byte by4 = object[n3];
            return zzff.zzp(n7, by4);
        }
        return zzff.zzam(n7);
    }

    public static /* synthetic */ int zzg(byte[] byArray, int n3, int n4) {
        return zzff.zzf(byArray, n3, n4);
    }

    private static int zzp(int n3, int n4) {
        int n7 = -12;
        if (n3 <= n7 && n4 <= (n7 = -65)) {
            return n3 ^ (n4 <<= 8);
        }
        return -1;
    }

    public static /* synthetic */ int zzq(int n3, int n4) {
        return zzff.zzp(n3, n4);
    }
}

