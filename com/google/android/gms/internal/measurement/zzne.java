/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzna;
import com.google.android.gms.internal.measurement.zznb;
import com.google.android.gms.internal.measurement.zznc;
import com.google.android.gms.internal.measurement.zznd;

final class zzne
extends zznb {
    public final int zza(int n3, byte[] byArray, int n4, int n7) {
        while (n4 < n7 && (n3 = byArray[n4]) >= 0) {
            ++n4;
        }
        n3 = 0;
        if (n4 >= n7) {
            return 0;
        }
        while (n4 < n7) {
            int n8 = n4 + 1;
            int n10 = byArray[n4];
            if (n10 < 0) {
                int n14 = -32;
                int n15 = -1;
                int n16 = -65;
                if (n10 < n14) {
                    if (n8 >= n7) {
                        return n10;
                    }
                    n14 = -62;
                    if (n10 >= n14) {
                        n4 += 2;
                        if ((n8 = byArray[n8]) <= n16) continue;
                    }
                    return n15;
                }
                int n17 = -16;
                if (n10 < n17) {
                    n17 = n7 + -1;
                    if (n8 >= n17) {
                        return zzna.zza(byArray, n8, n7);
                    }
                    n17 = n4 + 2;
                    if ((n8 = byArray[n8]) <= n16) {
                        int n18 = -96;
                        if (!(n10 == n14 && n8 < n18 || n10 == (n14 = -19) && n8 >= n18)) {
                            n4 += 3;
                            n8 = byArray[n17];
                            if (n8 <= n16) continue;
                        }
                    }
                    return n15;
                }
                n14 = n7 + -2;
                if (n8 >= n14) {
                    return zzna.zza(byArray, n8, n7);
                }
                n14 = n4 + 2;
                if ((n8 = byArray[n8]) <= n16 && (n8 = n8 + 112 + (n10 <<= 28) >> 30) == 0) {
                    n8 = n4 + 3;
                    n10 = byArray[n14];
                    if (n10 <= n16) {
                        n4 += 4;
                        if ((n8 = byArray[n8]) <= n16) continue;
                    }
                }
                return n15;
            }
            n4 = n8;
        }
        return 0;
    }

    public final int zza(String object, byte[] object2, int n3, int n4) {
        int n7;
        int n8;
        int n10;
        int n14 = ((String)object).length();
        n4 += n3;
        int n15 = 0;
        while (true) {
            n10 = 128;
            if (n15 >= n14 || (n8 = n15 + n3) >= n4 || (n7 = ((String)object).charAt(n15)) >= n10) break;
            object2[n8] = n10 = (int)((byte)n7);
            ++n15;
        }
        if (n15 == n14) {
            return n3 + n14;
        }
        n3 += n15;
        while (n15 < n14) {
            block16: {
                block17: {
                    int n16;
                    block13: {
                        block14: {
                            block15: {
                                block10: {
                                    int n17;
                                    block12: {
                                        block11: {
                                            block9: {
                                                n8 = ((String)object).charAt(n15);
                                                if (n8 >= n10 || n3 >= n4) break block9;
                                                n7 = n3 + 1;
                                                object2[n3] = n8 = (int)((byte)n8);
                                                n3 = n7;
                                                break block10;
                                            }
                                            n7 = 2048;
                                            if (n8 >= n7 || n3 > (n7 = n4 + -2)) break block11;
                                            n7 = n3 + 1;
                                            object2[n3] = n16 = (int)((byte)(n8 >>> 6 | 0x3C0));
                                            n3 += 2;
                                            n8 = (byte)(n8 & 0x3F | n10);
                                            object2[n7] = n8;
                                            break block10;
                                        }
                                        n7 = 57343;
                                        n16 = 55296;
                                        if (n8 >= n16 && n7 >= n8 || n3 > (n17 = n4 + -3)) break block12;
                                        n7 = n3 + 1;
                                        object2[n3] = n16 = (int)((byte)(n8 >>> 12 | 0x1E0));
                                        n16 = n3 + 2;
                                        n17 = (byte)(n8 >>> 6 & 0x3F | n10);
                                        object2[n7] = n17;
                                        n3 += 3;
                                        n8 = (byte)(n8 & 0x3F | n10);
                                        object2[n16] = n8;
                                        break block10;
                                    }
                                    n17 = n4 + -4;
                                    if (n3 > n17) break block13;
                                    n7 = n15 + 1;
                                    n16 = ((String)object).length();
                                    if (n7 == n16) break block14;
                                    n15 = ((String)object).charAt(n7);
                                    n16 = (int)(Character.isSurrogatePair((char)n8, (char)n15) ? 1 : 0);
                                    if (n16 == 0) break block15;
                                    n15 = Character.toCodePoint((char)n8, (char)n15);
                                    n8 = n3 + 1;
                                    n16 = (byte)(n15 >>> 18 | 0xF0);
                                    object2[n3] = n16;
                                    n16 = n3 + 2;
                                    n17 = (byte)(n15 >>> 12 & 0x3F | n10);
                                    object2[n8] = n17;
                                    n8 = n3 + 3;
                                    n17 = (byte)(n15 >>> 6 & 0x3F | n10);
                                    object2[n16] = n17;
                                    n3 += 4;
                                    n15 = (byte)(n15 & 0x3F | n10);
                                    object2[n8] = n15;
                                    n15 = n7;
                                }
                                ++n15;
                                continue;
                            }
                            n15 = n7;
                        }
                        object = new zznd(n15 += -1, n14);
                        throw object;
                    }
                    if (n16 > n8 || n8 > n7) break block16;
                    int n18 = n15 + 1;
                    n4 = ((String)object).length();
                    if (n18 == n4) break block17;
                    char c2 = ((String)object).charAt(n18);
                    if ((c2 = (char)(Character.isSurrogatePair((char)n8, c2) ? 1 : 0)) != '\u0000') break block16;
                }
                object = new zznd(n15, n14);
                throw object;
            }
            object2 = new StringBuilder;
            ((StringBuilder)object2)("Failed writing ");
            ((StringBuilder)object2).append((char)n8);
            ((StringBuilder)object2).append(" at index ");
            ((StringBuilder)object2).append(n3);
            object2 = ((StringBuilder)object2).toString();
            object = new ArrayIndexOutOfBoundsException((String)object2);
            throw object;
        }
        return n3;
    }

    public final String zza(byte[] object, int n3, int n4) {
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        int n14 = n3 | n4;
        int n15 = ((byte[])object).length - n3 - n4;
        if ((n14 |= n15) >= 0) {
            int n16;
            int n17;
            n14 = n3 + n4;
            char[] cArray = new char[n4];
            n15 = 0;
            while (n3 < n14 && (n17 = object[n3]) >= 0) {
                n3 += n10;
                n16 = n15 + 1;
                zznc.zza((byte)n17, cArray, n15);
                n15 = n16;
            }
            int n18 = n15;
            while (n3 < n14) {
                int n19;
                n15 = n3 + 1;
                n17 = object[n3];
                if (n17 >= 0) {
                    n3 = n18 + 1;
                    zznc.zza((byte)n17, cArray, n18);
                    while (n15 < n14 && (n17 = object[n15]) >= 0) {
                        n15 += n10;
                        n16 = n3 + 1;
                        zznc.zza((byte)n17, cArray, n3);
                        n3 = n16;
                    }
                    n18 = n3;
                    n3 = n15;
                    continue;
                }
                n16 = -32;
                if (n17 < n16) {
                    if (n15 < n14) {
                        n3 += n8;
                        n15 = object[n15];
                        n16 = n18 + 1;
                        zznc.zza((byte)n17, (byte)n15, cArray, n18);
                        n18 = n16;
                        continue;
                    }
                    throw zzkp.zzd();
                }
                n16 = -16;
                if (n17 < n16) {
                    n16 = n14 + -1;
                    if (n15 < n16) {
                        n16 = n3 + 2;
                        n15 = object[n15];
                        n3 = n3 + n7;
                        n16 = object[n16];
                        n19 = n18 + 1;
                        zznc.zza((byte)n17, (byte)n15, (byte)n16, cArray, n18);
                        n18 = n19;
                        continue;
                    }
                    throw zzkp.zzd();
                }
                n16 = n14 + -2;
                if (n15 < n16) {
                    n16 = n3 + 2;
                    n19 = object[n15];
                    n15 = n3 + 3;
                    n16 = object[n16];
                    n3 += 4;
                    int n20 = object[n15];
                    n15 = n17;
                    n17 = n19;
                    n19 = n20;
                    zznc.zza((byte)n15, (byte)n17, (byte)n16, (byte)n20, cArray, n18);
                    n18 += n8;
                    continue;
                }
                throw zzkp.zzd();
            }
            object = new String;
            object(cArray, 0, n18);
            return object;
        }
        object = ((byte[])object).length;
        Integer n21 = n3;
        Integer n22 = n4;
        Object[] objectArray = new Object[n7];
        objectArray[0] = object;
        objectArray[n10] = n21;
        objectArray[n8] = n22;
        object = String.format("buffer length=%d, index=%d, size=%d", objectArray);
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)object);
        throw arrayIndexOutOfBoundsException;
    }
}

