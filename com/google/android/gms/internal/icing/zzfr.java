/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbu;
import com.google.android.gms.internal.icing.zzfn;
import com.google.android.gms.internal.icing.zzfo;
import com.google.android.gms.internal.icing.zzfp;
import com.google.android.gms.internal.icing.zzfq;

final class zzfr {
    private static final zzfo zza;

    static {
        int n3 = zzfn.zza();
        if (n3 != 0 && (n3 = zzfn.zzb()) != 0) {
            n3 = zzbu.zza;
        }
        zzfp zzfp2 = new zzfp();
        zza = zzfp2;
    }

    public static boolean zza(byte[] byArray) {
        zzfo zzfo2 = zza;
        int n3 = byArray.length;
        return zzfo2.zza(byArray, 0, n3);
    }

    public static boolean zzb(byte[] byArray, int n3, int n4) {
        return zza.zza(byArray, 0, n4);
    }

    public static int zzc(CharSequence object) {
        int n3;
        int n4;
        int n7;
        int n8 = object.length();
        int n10 = 0;
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
                    if (n15 >= n16 && n15 <= (n16 = 57343)) {
                        n15 = Character.codePointAt((CharSequence)object, n7);
                        if (n15 >= (n16 = 65536)) {
                            ++n7;
                        } else {
                            object = new zzfq(n7, n3);
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
        CharSequence charSequence = new StringBuilder(54);
        charSequence.append("UTF-8 length does not fit in int: ");
        long l2 = (long)n4 + 0x100000000L;
        charSequence.append(l2);
        charSequence = charSequence.toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public static int zzd(CharSequence object, byte[] object2, int n3, int n4) {
        block7: {
            int n7;
            int n8;
            int n10;
            int n14;
            int n15;
            block6: {
                n15 = object.length();
                n4 += n3;
                n14 = 0;
                while (true) {
                    n10 = 128;
                    if (n14 >= n15 || (n8 = n14 + n3) >= n4 || (n7 = object.charAt(n14)) >= n10) break;
                    object2[n8] = n10 = (int)((byte)n7);
                    ++n14;
                }
                if (n14 != n15) break block6;
                n3 += n15;
                break block7;
            }
            n3 += n14;
            while (n14 < n15) {
                block15: {
                    block16: {
                        int n16;
                        block12: {
                            block13: {
                                block14: {
                                    block9: {
                                        int n17;
                                        block11: {
                                            block10: {
                                                block8: {
                                                    n8 = object.charAt(n14);
                                                    if (n8 >= n10 || n3 >= n4) break block8;
                                                    n7 = n3 + 1;
                                                    object2[n3] = n8 = (int)((byte)n8);
                                                    n3 = n7;
                                                    break block9;
                                                }
                                                n7 = 2048;
                                                if (n8 >= n7 || n3 > (n7 = n4 + -2)) break block10;
                                                n7 = n3 + 1;
                                                object2[n3] = n16 = (int)((byte)(n8 >>> 6 | 0x3C0));
                                                n3 += 2;
                                                n8 = (byte)(n8 & 0x3F | n10);
                                                object2[n7] = n8;
                                                break block9;
                                            }
                                            n7 = 57343;
                                            n16 = 55296;
                                            if (n8 >= n16 && n8 <= n7 || n3 > (n17 = n4 + -3)) break block11;
                                            n7 = n3 + 1;
                                            object2[n3] = n16 = (int)((byte)(n8 >>> 12 | 0x1E0));
                                            n16 = n3 + 2;
                                            n17 = (byte)(n8 >>> 6 & 0x3F | n10);
                                            object2[n7] = n17;
                                            n3 += 3;
                                            n8 = (byte)(n8 & 0x3F | n10);
                                            object2[n16] = n8;
                                            break block9;
                                        }
                                        n17 = n4 + -4;
                                        if (n3 > n17) break block12;
                                        n7 = n14 + 1;
                                        n16 = object.length();
                                        if (n7 == n16) break block13;
                                        n14 = object.charAt(n7);
                                        n16 = (int)(Character.isSurrogatePair((char)n8, (char)n14) ? 1 : 0);
                                        if (n16 == 0) break block14;
                                        n14 = Character.toCodePoint((char)n8, (char)n14);
                                        n8 = n3 + 1;
                                        n16 = (byte)(n14 >>> 18 | 0xF0);
                                        object2[n3] = n16;
                                        n16 = n3 + 2;
                                        n17 = (byte)(n14 >>> 12 & 0x3F | n10);
                                        object2[n8] = n17;
                                        n8 = n3 + 3;
                                        n17 = (byte)(n14 >>> 6 & 0x3F | n10);
                                        object2[n16] = n17;
                                        n3 += 4;
                                        n14 = (byte)(n14 & 0x3F | n10);
                                        object2[n8] = n14;
                                        n14 = n7;
                                    }
                                    ++n14;
                                    continue;
                                }
                                n14 = n7;
                            }
                            object = new zzfq(n14 += -1, n15);
                            throw object;
                        }
                        if (n8 < n16 || n8 > n7) break block15;
                        int n18 = n14 + 1;
                        n4 = object.length();
                        if (n18 == n4) break block16;
                        char c2 = object.charAt(n18);
                        if ((c2 = (char)(Character.isSurrogatePair((char)n8, c2) ? 1 : 0)) != '\u0000') break block15;
                    }
                    object = new zzfq(n14, n15);
                    throw object;
                }
                object2 = new StringBuilder;
                ((StringBuilder)object2)(37);
                ((StringBuilder)object2).append("Failed writing ");
                ((StringBuilder)object2).append((char)n8);
                ((StringBuilder)object2).append(" at index ");
                ((StringBuilder)object2).append(n3);
                object2 = ((StringBuilder)object2).toString();
                object = new ArrayIndexOutOfBoundsException((String)object2);
                throw object;
            }
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ int zze(byte[] object, int n3, int n4) {
        int n7;
        int n8 = n7 + -1;
        n8 = object[n8];
        int n10 = -12;
        if ((by2 -= n7) != 0) {
            byte by2;
            byte by4 = 1;
            int n14 = -65;
            if (by2 != by4) {
                byte by5 = 2;
                if (by2 != by5) {
                    AssertionError assertionError = new AssertionError();
                    throw assertionError;
                }
                by2 = object[n7];
                int n15 = object[n7 += by4];
                if (n8 > n10) return -1;
                if (by2 > n14) return -1;
                if (n15 > n14) return -1;
                n7 = by2 << 8 ^ n8;
                return n7 ^ (n15 <<= 16);
            }
            int n16 = object[n7];
            if (n8 > n10) return -1;
            if (n16 > n14) return -1;
            return n8 ^= (n16 <<= 8);
        }
        if (n8 <= n10) return n8;
        return -1;
    }
}

