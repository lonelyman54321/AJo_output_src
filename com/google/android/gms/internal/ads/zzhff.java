/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzm;
import com.google.android.gms.internal.ads.zzhfa;
import com.google.android.gms.internal.ads.zzhfc;
import com.google.android.gms.internal.ads.zzhfd;
import com.google.android.gms.internal.ads.zzhfe;
import java.nio.ByteBuffer;

final class zzhff {
    private static final zzhfc zza;

    static {
        int n3 = zzhfa.zzA();
        if (n3 != 0 && (n3 = zzhfa.zzB()) != 0) {
            n3 = zzgzm.zza;
        }
        zzhfd zzhfd2 = new zzhfd();
        zza = zzhfd2;
    }

    public static /* bridge */ /* synthetic */ int zza(int n3, int n4) {
        return zzhff.zzk(n3, n4);
    }

    public static /* bridge */ /* synthetic */ int zzb(int n3, int n4, int n7) {
        return zzhff.zzl(n3, n4, n7);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* bridge */ /* synthetic */ int zzc(byte[] object, int n3, int n4) {
        void var1_2;
        int n7 = var1_2 + -1;
        n7 = object[n7];
        if ((by2 -= var1_2) != 0) {
            byte by2;
            byte by4 = 1;
            if (by2 != by4) {
                byte by5 = 2;
                if (by2 == by5) {
                    by2 = object[var1_2];
                    byte by6 = object[var1_2 += by4];
                    return zzhff.zzl(n7, by2, by6);
                }
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            byte by7 = object[var1_2];
            return zzhff.zzk(n7, by7);
        }
        int n8 = -12;
        if (n7 <= n8) return n7;
        return -1;
    }

    public static int zzd(String object, byte[] object2, int n3, int n4) {
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
                            object = new zzhfe(c3 += -1, c5);
                            throw object;
                        }
                        if (n4 < n7 || n4 > c2) break block15;
                        int n16 = c3 + 1;
                        n10 = ((String)object).length();
                        if (n16 == n10) break block16;
                        char c6 = ((String)object).charAt(n16);
                        if ((c6 = (char)(Character.isSurrogatePair((char)n4, c6) ? 1 : 0)) != '\u0000') break block15;
                    }
                    object = new zzhfe(c3, c5);
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

    public static int zze(String object) {
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
                            object = new zzhfe(n7, n3);
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

    public static int zzf(int n3, byte[] byArray, int n4, int n7) {
        return zza.zza(n3, byArray, n4, n7);
    }

    public static String zzg(ByteBuffer object, int n3, int n4) {
        zzhfc zzhfc2 = zza;
        boolean n7 = ((ByteBuffer)object).hasArray();
        if (n7) {
            int n8 = ((ByteBuffer)object).arrayOffset();
            object = ((ByteBuffer)object).array();
            int n10 = n8 + n3;
            object = zzhfc2.zzb((byte[])object, n10, n4);
        } else {
            boolean bl2 = ((ByteBuffer)object).isDirect();
            object = bl2 ? zzhfc.zzd((ByteBuffer)object, n3, n4) : zzhfc.zzd((ByteBuffer)object, n3, n4);
        }
        return object;
    }

    public static String zzh(byte[] byArray, int n3, int n4) {
        return zza.zzb(byArray, n3, n4);
    }

    public static boolean zzi(byte[] byArray) {
        zzhfc zzhfc2 = zza;
        int n3 = byArray.length;
        return zzhfc2.zzc(byArray, 0, n3);
    }

    public static boolean zzj(byte[] byArray, int n3, int n4) {
        return zza.zzc(byArray, n3, n4);
    }

    private static int zzk(int n3, int n4) {
        int n7 = -12;
        if (n3 <= n7 && n4 <= (n7 = -65)) {
            return n3 ^ (n4 <<= 8);
        }
        return -1;
    }

    private static int zzl(int n3, int n4, int n7) {
        int n8 = -12;
        if (n3 <= n8 && n4 <= (n8 = -65) && n7 <= n8) {
            return n3 ^ (n4 <<= 8) ^ (n7 <<= 16);
        }
        return -1;
    }
}

