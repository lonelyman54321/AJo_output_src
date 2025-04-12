/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhfb;
import com.google.android.gms.internal.ads.zzhfc;
import com.google.android.gms.internal.ads.zzhff;

final class zzhfd
extends zzhfc {
    /*
     * Enabled aggressive block sorting
     */
    public final int zza(int n3, byte[] byArray, int n4, int n7) {
        int n8;
        int n10;
        int n14 = -19;
        int n15 = -16;
        int n16 = -62;
        int n17 = 0;
        int n18 = -96;
        int n19 = -32;
        int n20 = -65;
        int n21 = -1;
        if (n3 != 0) {
            if (n4 >= n7) {
                return n3;
            }
            n10 = n3;
            if (n10 < n19) {
                if (n10 < n16) return n21;
                n3 = n4 + 1;
                if ((n4 = byArray[n4]) > n20) return n21;
            } else {
                int n22;
                n8 = ~(n3 >> 8);
                if (n10 < n15) {
                    n3 = (byte)n8;
                    if (n3 == 0) {
                        n3 = n4 + 1;
                        n4 = byArray[n4];
                        if (n3 >= n7) return zzhff.zza(n10, n4);
                        n22 = n4;
                        n4 = n3;
                        n3 = n22;
                    }
                    if (n3 > n20) return n21;
                    if (n10 == n19) {
                        if (n3 < n18) return n21;
                    }
                    if (n10 == n14) {
                        if (n3 >= n18) return n21;
                    }
                    n3 = n4 + 1;
                    if ((n4 = byArray[n4]) > n20) return n21;
                } else {
                    if ((n8 = (int)((byte)n8)) == 0) {
                        n3 = n4 + 1;
                        n8 = byArray[n4];
                        if (n3 >= n7) return zzhff.zza(n10, n8);
                        n4 = n3;
                        n3 = 0;
                    } else {
                        n3 >>= 16;
                    }
                    if (n3 == 0) {
                        n3 = n4 + 1;
                        n4 = byArray[n4];
                        if (n3 >= n7) return zzhff.zzb(n10, n8, n4);
                        n22 = n4;
                        n4 = n3;
                        n3 = n22;
                    }
                    if (n8 > n20) return n21;
                    n10 <<= 28;
                    if ((n10 = (n8 = n8 + 112 + n10) >> 30) != 0) return n21;
                    if (n3 > n20) return n21;
                    n3 = n4 + 1;
                    if ((n4 = byArray[n4]) > n20) return n21;
                }
            }
            n4 = n3;
        }
        while (n4 < n7 && (n3 = byArray[n4]) >= 0) {
            ++n4;
        }
        if (n4 >= n7) {
            return n17;
        }
        while (n4 < n7) {
            n3 = n4 + 1;
            n10 = byArray[n4];
            if (n10 < 0) {
                if (n10 < n19) {
                    if (n3 >= n7) {
                        return n10;
                    }
                    if (n10 < n16) return -1;
                    n4 += 2;
                    if ((n3 = byArray[n3]) <= n20) continue;
                    return -1;
                } else if (n10 < n15) {
                    n8 = n7 + -1;
                    if (n3 >= n8) {
                        return zzhff.zzc(byArray, n3, n7);
                    }
                    n8 = n4 + 2;
                    if ((n3 = byArray[n3]) > n20) return -1;
                    if (n10 == n19) {
                        if (n3 < n18) return -1;
                    }
                    if (n10 == n14) {
                        if (n3 >= n18) return -1;
                    }
                    n4 += 3;
                    n3 = byArray[n8];
                    if (n3 <= n20) continue;
                    return -1;
                } else {
                    n8 = n7 + -2;
                    if (n3 >= n8) {
                        return zzhff.zzc(byArray, n3, n7);
                    }
                    n8 = n4 + 2;
                    if ((n3 = byArray[n3]) > n20) return -1;
                    if ((n3 = n3 + 112 + (n10 <<= 28) >> 30) != 0) return -1;
                    n3 = n4 + 3;
                    n10 = byArray[n8];
                    if (n10 > n20) return -1;
                    n4 += 4;
                    if ((n3 = byArray[n3]) <= n20) continue;
                }
                return -1;
            }
            n4 = n3;
        }
        return n17;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final String zzb(byte[] object, int n3, int n4) {
        char c2;
        int n7;
        void var3_5;
        int n8;
        int n10 = 3;
        int n14 = 2;
        int n15 = 1;
        int n16 = ((byte[])object).length;
        int n17 = n16 - n8;
        int n18 = n8 | var3_5;
        if ((n17 = n17 - var3_5 | n18) < 0) {
            Integer n19 = n16;
            Object object2 = n8;
            Integer n20 = (int)var3_5;
            Object[] objectArray = new Object[n10];
            objectArray[0] = n19;
            objectArray[n15] = object2;
            objectArray[n14] = n20;
            object2 = String.format("buffer length=%d, index=%d, size=%d", objectArray);
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)object2);
            throw arrayIndexOutOfBoundsException;
        }
        n16 = n8 + var3_5;
        char[] cArray = new char[var3_5];
        n17 = 0;
        while (n8 < n16 && (n7 = zzhfb.zzd((byte)(c2 = object[n8]))) != 0) {
            n8 += n15;
            n7 = n17 + 1;
            cArray[n17] = c2 = (char)c2;
            n17 = n7;
        }
        int n21 = n17;
        block1: while (true) {
            byte by2;
            char c3;
            block14: {
                block13: {
                    block12: {
                        if (n8 >= n16) {
                            return new String(cArray, 0, n21);
                        }
                        n17 = n8 + true;
                        c3 = object[n8];
                        n7 = zzhfb.zzd((byte)c3);
                        if (n7 != 0) {
                            n8 = n21 + 1;
                            cArray[n21] = c3 = (char)c3;
                            n21 = n8;
                            n8 = n17;
                            while (true) {
                                if (n8 >= n16 || (c3 = (char)(zzhfb.zzd((byte)(n17 = object[n8])) ? 1 : 0)) == '\u0000') continue block1;
                                n8 += n15;
                                c3 = (char)(n21 + 1);
                                cArray[n21] = n17 = (int)((char)n17);
                                n21 = c3;
                            }
                        }
                        n7 = (int)(zzhfb.zzf((byte)c3) ? 1 : 0);
                        if (n7 == 0) break block12;
                        if (n17 >= n16) {
                            throw zzhcd.zzd();
                        }
                        n7 = n21 + 1;
                        n8 += n14;
                        n17 = object[n17];
                        zzhfb.zzc((byte)c3, (byte)n17, cArray, n21);
                        break block13;
                    }
                    n7 = (int)(zzhfb.zze((byte)c3) ? 1 : 0);
                    if (n7 == 0) break block14;
                    n7 = n16 + -1;
                    if (n17 >= n7) {
                        throw zzhcd.zzd();
                    }
                    n7 = n21 + 1;
                    by2 = n8 + 2;
                    n17 = object[n17];
                    n8 += n10;
                    by2 = object[by2];
                    zzhfb.zzb((byte)c3, (byte)n17, by2, cArray, n21);
                }
                n21 = n7;
                continue;
            }
            n7 = n16 + -2;
            if (n17 >= n7) {
                throw zzhcd.zzd();
            }
            n7 = n8 + 2;
            by2 = object[n17];
            n17 = n8 + 3;
            n7 = object[n7];
            n8 += 4;
            byte by4 = object[n17];
            n17 = c3;
            c3 = by2;
            by2 = by4;
            zzhfb.zza((byte)n17, (byte)c3, (byte)n7, by4, cArray, n21);
            n21 += n14;
        }
    }
}

