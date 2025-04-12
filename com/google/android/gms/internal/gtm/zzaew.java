/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacq;
import com.google.android.gms.internal.gtm.zzaet;
import com.google.android.gms.internal.gtm.zzaeu;
import com.google.android.gms.internal.gtm.zzaev;
import com.google.android.gms.internal.gtm.zzyk;

final class zzaew {
    static {
        int n3 = zzaet.zzx();
        if (n3 != 0 && (n3 = zzaet.zzy()) != 0) {
            n3 = zzyk.zza;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* bridge */ /* synthetic */ int zza(byte[] object, int n3, int n4) {
        int n7;
        byte by2 = n7 + -1;
        by2 = object[by2];
        byte by4 = -12;
        if ((by5 -= n7) != 0) {
            byte by5;
            byte by6 = 1;
            byte by7 = -65;
            if (by5 != by6) {
                byte by8 = 2;
                if (by5 == by8) {
                    by5 = object[n7];
                    int n8 = object[n7 += by6];
                    if (by2 > by4 || by5 > by7 || n8 > by7) return -1;
                    n7 = by5 << 8;
                    return (n8 <<= 16) ^ (n7 ^= by2);
                }
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            byte by9 = object[n7];
            if (by2 > by4 || by9 > by7) return -1;
            return by9 << 8 ^ by2;
        }
        if (by2 > by4) return -1;
        return by2;
    }

    public static int zzb(String object, byte[] object2, int n3, int n4) {
        block7: {
            int n7;
            char c2;
            int n8;
            int n10;
            char c3;
            char c5;
            block6: {
                c5 = ((String)object).length();
                c3 = '\u0000';
                while (true) {
                    n10 = n3 + n4;
                    n8 = 128;
                    if (c3 >= c5 || (c2 = c3 + n3) >= n10 || (n7 = ((String)object).charAt(c3)) >= n8) break;
                    n10 = (byte)n7;
                    object2[c2] = n10;
                    ++c3;
                }
                if (c3 != c5) break block6;
                n3 += c5;
                break block7;
            }
            n3 += c3;
            while (c3 < c5) {
                block15: {
                    block16: {
                        block12: {
                            block13: {
                                block14: {
                                    block9: {
                                        int n14;
                                        int n15;
                                        block11: {
                                            block10: {
                                                block8: {
                                                    n4 = ((String)object).charAt(c3);
                                                    if (n4 >= n8 || n3 >= n10) break block8;
                                                    c2 = n3 + 1;
                                                    n4 = (byte)n4;
                                                    object2[n3] = n4;
                                                    n3 = c2;
                                                    break block9;
                                                }
                                                c2 = '\u0800';
                                                if (n4 >= c2 || n3 > (c2 = n10 + -2)) break block10;
                                                c2 = n3 + 1;
                                                n7 = n3 + 2;
                                                n15 = (byte)(n4 >>> 6 | 0x3C0);
                                                object2[n3] = n15;
                                                n3 = (byte)(n4 & 0x3F | n8);
                                                object2[c2] = n3;
                                                n3 = n7;
                                                break block9;
                                            }
                                            c2 = '\udfff';
                                            n7 = 55296;
                                            if (n4 >= n7 && n4 <= c2 || n3 > (n15 = n10 + -3)) break block11;
                                            c2 = n3 + 1;
                                            n7 = n3 + 2;
                                            n15 = n3 + 3;
                                            n14 = n4 >>> 12 | 0x1E0;
                                            object2[n3] = n14;
                                            n3 = (byte)(n4 >>> 6 & 0x3F | n8);
                                            object2[c2] = n3;
                                            n3 = (byte)(n4 & 0x3F | n8);
                                            object2[n7] = n3;
                                            n3 = n15;
                                            break block9;
                                        }
                                        n15 = n10 + -4;
                                        if (n3 > n15) break block12;
                                        c2 = c3 + 1;
                                        n7 = ((String)object).length();
                                        if (c2 == n7) break block13;
                                        c3 = ((String)object).charAt(c2);
                                        n7 = (int)(Character.isSurrogatePair((char)n4, c3) ? 1 : 0);
                                        if (n7 == 0) break block14;
                                        n7 = n3 + 1;
                                        n15 = n3 + 2;
                                        n14 = n3 + 3;
                                        n4 = Character.toCodePoint((char)n4, c3);
                                        c3 = (char)(n4 >>> 18 | 0xF0);
                                        object2[n3] = c3;
                                        c3 = (char)(n4 >>> 12 & 0x3F | n8);
                                        object2[n7] = c3;
                                        c3 = (char)(n4 >>> 6 & 0x3F | n8);
                                        object2[n15] = c3;
                                        n3 += 4;
                                        n4 = (byte)(n4 & 0x3F | n8);
                                        object2[n14] = n4;
                                        c3 = c2;
                                    }
                                    ++c3;
                                    continue;
                                }
                                c3 = c2;
                            }
                            object = new zzaev(c3 += -1, c5);
                            throw object;
                        }
                        if (n4 < n7 || n4 > c2) break block15;
                        int n16 = c3 + 1;
                        n10 = ((String)object).length();
                        if (n16 == n10) break block16;
                        char c6 = ((String)object).charAt(n16);
                        if ((c6 = (char)(Character.isSurrogatePair((char)n4, c6) ? 1 : 0)) != '\u0000') break block15;
                    }
                    object = new zzaev(c3, c5);
                    throw object;
                }
                object2 = new StringBuilder("Failed writing ");
                ((StringBuilder)object2).append((char)n4);
                ((StringBuilder)object2).append(" at index ");
                ((StringBuilder)object2).append(n3);
                object2 = ((StringBuilder)object2).toString();
                object = new ArrayIndexOutOfBoundsException((String)object2);
                throw object;
            }
        }
        return n3;
    }

    public static int zzc(String object) {
        int n3;
        int n4;
        int n7;
        int n8 = ((String)object).length();
        int n10 = 0;
        StringBuilder stringBuilder = null;
        for (n7 = 0; n7 < n8 && (n4 = (int)((String)object).charAt(n7)) < (n3 = 128); ++n7) {
        }
        n4 = n8;
        while (n7 < n8) {
            int n14;
            n3 = ((String)object).charAt(n7);
            if (n3 < (n14 = 2048)) {
                n3 = 127 - n3 >>> 31;
                n4 += n3;
                ++n7;
                continue;
            }
            n3 = ((String)object).length();
            while (n7 < n3) {
                int n15 = ((String)object).charAt(n7);
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
                            object = new zzaev(n7, n3);
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
        long l2 = n4;
        stringBuilder = new StringBuilder("UTF-8 length does not fit in int: ");
        stringBuilder.append(l2 += 0x100000000L);
        String string2 = stringBuilder.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static String zzd(byte[] object, int n3, int n4) {
        char c2;
        int n7;
        void var2_7;
        int n8;
        int n10 = 3;
        int n14 = 2;
        int n15 = 1;
        int n16 = ((byte[])object).length;
        int n17 = n16 - n8;
        int n18 = n8 | var2_7;
        if ((n17 = n17 - var2_7 | n18) < 0) {
            Integer n19 = n16;
            Object object2 = n8;
            Integer n20 = (int)var2_7;
            Object[] objectArray = new Object[n10];
            objectArray[0] = n19;
            objectArray[n15] = object2;
            objectArray[n14] = n20;
            object2 = String.format("buffer length=%d, index=%d, size=%d", objectArray);
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)object2);
            throw arrayIndexOutOfBoundsException;
        }
        n16 = n8 + var2_7;
        char[] cArray = new char[var2_7];
        n17 = 0;
        while (n8 < n16 && (n7 = zzaeu.zzd((byte)(c2 = object[n8]))) != 0) {
            n8 += n15;
            n7 = n17 + 1;
            cArray[n17] = c2 = (char)c2;
            n17 = n7;
        }
        int n21 = n17;
        block1: while (true) {
            byte by2;
            String string2;
            char c3;
            block14: {
                block13: {
                    block12: {
                        if (n8 >= n16) {
                            return new String(cArray, 0, n21);
                        }
                        n17 = n8 + true;
                        c3 = object[n8];
                        n7 = zzaeu.zzd((byte)c3);
                        if (n7 != 0) {
                            n8 = n21 + 1;
                            cArray[n21] = c3 = (char)c3;
                            n21 = n8;
                            n8 = n17;
                            while (true) {
                                if (n8 >= n16 || (c3 = (char)(zzaeu.zzd((byte)(n17 = object[n8])) ? 1 : 0)) == '\u0000') continue block1;
                                n8 += n15;
                                c3 = (char)(n21 + 1);
                                cArray[n21] = n17 = (int)((char)n17);
                                n21 = c3;
                            }
                        }
                        n7 = -32;
                        string2 = "Protocol message had invalid UTF-8.";
                        if (c3 >= n7) break block12;
                        if (n17 >= n16) {
                            zzacq zzacq2 = new zzacq(string2);
                            throw zzacq2;
                        }
                        n7 = n21 + 1;
                        n8 += n14;
                        n17 = object[n17];
                        zzaeu.zzc((byte)c3, (byte)n17, cArray, n21);
                        break block13;
                    }
                    n7 = -16;
                    if (c3 >= n7) break block14;
                    n7 = n16 + -1;
                    if (n17 >= n7) {
                        zzacq zzacq3 = new zzacq(string2);
                        throw zzacq3;
                    }
                    n7 = n21 + 1;
                    by2 = n8 + 2;
                    n17 = object[n17];
                    n8 += n10;
                    by2 = object[by2];
                    zzaeu.zzb((byte)c3, (byte)n17, by2, cArray, n21);
                }
                n21 = n7;
                continue;
            }
            n7 = n16 + -2;
            if (n17 >= n7) {
                zzacq zzacq4 = new zzacq(string2);
                throw zzacq4;
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
            zzaeu.zza((byte)n17, (byte)c3, (byte)n7, by4, cArray, n21);
            n21 += n14;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean zze(byte[] byArray, int n3, int n4) {
        int n7;
        while (n3 < n4 && (n7 = byArray[n3]) >= 0) {
            ++n3;
        }
        if (n3 >= n4) {
            return true;
        }
        while (n3 < n4) {
            block15: {
                int n8;
                int n10;
                int n14;
                block17: {
                    block14: {
                        block16: {
                            n7 = n3 + 1;
                            n14 = byArray[n3];
                            if (n14 >= 0) break block15;
                            n10 = -32;
                            n8 = -65;
                            if (n14 >= n10) break block16;
                            if (n7 < n4) {
                                n10 = -62;
                                if (n14 < n10) return false;
                                n3 += 2;
                                if ((n7 = byArray[n7]) <= n8) continue;
                                return false;
                            }
                            break block14;
                        }
                        int n15 = -16;
                        if (n14 < n15) {
                            n15 = n4 + -1;
                            if (n7 >= n15) {
                                n14 = zzaew.zza(byArray, n7, n4);
                                break block14;
                            } else {
                                n15 = n3 + 2;
                                if ((n7 = byArray[n7]) > n8) return false;
                                int n16 = -96;
                                if (n14 == n10) {
                                    if (n7 < n16) return false;
                                }
                                if (n14 == (n10 = -19)) {
                                    if (n7 >= n16) return false;
                                }
                                n3 += 3;
                                n7 = byArray[n15];
                                if (n7 <= n8) continue;
                                return false;
                            }
                        }
                        n10 = n4 + -2;
                        if (n7 < n10) break block17;
                        n14 = zzaew.zza(byArray, n7, n4);
                    }
                    if (n14 == 0) return true;
                    return false;
                }
                n10 = n3 + 2;
                if ((n7 = byArray[n7]) > n8) return false;
                if ((n7 = n7 + 112 + (n14 <<= 28) >> 30) != 0) return false;
                n7 = n3 + 3;
                n14 = byArray[n10];
                if (n14 > n8) return false;
                n3 += 4;
                if ((n7 = byArray[n7]) > n8) return false;
                continue;
            }
            n3 = n7;
        }
        return true;
    }
}

