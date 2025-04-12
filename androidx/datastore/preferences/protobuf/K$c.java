/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.K$a;
import androidx.datastore.preferences.protobuf.K$b;
import androidx.datastore.preferences.protobuf.K$d;

public final class K$c
extends K$b {
    public final String a(byte[] object, int by2, int n3) {
        int n4 = 3;
        int n7 = 2;
        int n8 = 1;
        int n10 = by2 | n3;
        int by4 = ((Object)object).length - by2 - n3;
        if ((n10 |= by4) >= 0) {
            int n14;
            Object object2;
            byte by5;
            n10 = by2 + n3;
            char[] cArray = new char[n3];
            boolean bl2 = false;
            while (by2 < n10 && (by5 = K$a.b((byte)(object2 = object[by2]))) != 0) {
                by2 = by2 + n8;
                by5 = n14 + true;
                object2 = (char)object2;
                cArray[n14] = (char)object2;
                n14 = by5;
            }
            Object object3 = n14;
            while (by2 < n10) {
                Object object4;
                byte by6 = by2 + 1;
                object2 = object[by2];
                by5 = (byte)K$a.b((byte)object2);
                if (by5 != 0) {
                    by2 = object3 + true;
                    object2 = (char)object2;
                    cArray[object3] = (char)object2;
                    while (by6 < n10 && (by5 = (byte)(K$a.b((byte)(object2 = object[by6])) ? 1 : 0)) != 0) {
                        by6 += n8;
                        by5 = by2 + 1;
                        object2 = (char)object2;
                        cArray[by2] = (char)object2;
                        by2 = by5;
                    }
                    object3 = by2;
                    by2 = by6;
                    continue;
                }
                by5 = (byte)-32;
                if (object2 < by5) {
                    if (by6 < n10) {
                        by2 = by2 + n7;
                        by6 = (byte)object[by6];
                        by5 = object3 + 1;
                        K$a.c((byte)object2, by6, cArray, object3);
                        object3 = by5;
                        continue;
                    }
                    throw InvalidProtocolBufferException.a();
                }
                by5 = (byte)-16;
                if (object2 < by5) {
                    by5 = (byte)(n10 + -1);
                    if (by6 < by5) {
                        by5 = by2 + 2;
                        by6 = (byte)object[by6];
                        by2 += n4;
                        by5 = (byte)object[by5];
                        object4 = object3 + 1;
                        K$a.d((byte)object2, by6, by5, cArray, object3);
                        object3 = object4;
                        continue;
                    }
                    throw InvalidProtocolBufferException.a();
                }
                by5 = (byte)(n10 + -2);
                if (by6 < by5) {
                    by5 = by2 + 2;
                    object4 = object[by6];
                    by6 = by2 + 3;
                    by5 = (byte)object[by5];
                    by2 += 4;
                    Object object5 = object[by6];
                    by6 = (byte)object2;
                    object2 = object4;
                    object4 = object5;
                    K$a.a(by6, (byte)object2, by5, (byte)object5, cArray, object3);
                    object3 += n7;
                    continue;
                }
                throw InvalidProtocolBufferException.a();
            }
            object = new String(cArray, 0, (int)object3);
            return object;
        }
        object = ((Object)object).length;
        Integer n15 = by2;
        Integer n16 = n3;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object;
        objectArray[n8] = n15;
        objectArray[n7] = n16;
        object = String.format("buffer length=%d, index=%d, size=%d", objectArray);
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)object);
        throw arrayIndexOutOfBoundsException;
    }

    public final int b(CharSequence object, byte[] object2, int n3, int n4) {
        int n7;
        int n8;
        int n10;
        int n14 = object.length();
        n4 += n3;
        int n15 = 0;
        while (true) {
            n10 = 128;
            if (n15 >= n14 || (n8 = n15 + n3) >= n4 || (n7 = object.charAt(n15)) >= n10) break;
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
                                                n8 = object.charAt(n15);
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
                                    n16 = object.length();
                                    if (n7 == n16) break block14;
                                    n15 = object.charAt(n7);
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
                        object = new K$d(n15 += -1, n14);
                        throw object;
                    }
                    if (n16 > n8 || n8 > n7) break block16;
                    int n18 = n15 + 1;
                    n4 = object.length();
                    if (n18 == n4) break block17;
                    char c2 = object.charAt(n18);
                    if ((c2 = (char)(Character.isSurrogatePair((char)n8, c2) ? 1 : 0)) != '\u0000') break block16;
                }
                object = new K$d(n15, n14);
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int c(byte[] byArray, int n3, int n4) {
        int n7;
        while (n3 < n4 && (n7 = byArray[n3]) >= 0) {
            ++n3;
        }
        n7 = 0;
        if (n3 >= n4) return n7;
        while (n3 < n4) {
            int n8 = n3 + 1;
            int n10 = byArray[n3];
            if (n10 < 0) {
                int n14 = -32;
                int n15 = -65;
                if (n10 < n14) {
                    if (n8 >= n4) {
                        return n10;
                    }
                    n14 = -62;
                    if (n10 < n14) return -1;
                    n3 += 2;
                    if ((n8 = byArray[n8]) <= n15) continue;
                    return -1;
                }
                int n16 = -16;
                if (n10 < n16) {
                    n16 = n4 + -1;
                    if (n8 >= n16) {
                        return K.a(byArray, n8, n4);
                    }
                    n16 = n3 + 2;
                    if ((n8 = byArray[n8]) > n15) return -1;
                    int n17 = -96;
                    if (n10 == n14) {
                        if (n8 < n17) return -1;
                    }
                    if (n10 == (n14 = -19)) {
                        if (n8 >= n17) return -1;
                    }
                    n3 += 3;
                    n8 = byArray[n16];
                    if (n8 <= n15) continue;
                    return -1;
                }
                n14 = n4 + -2;
                if (n8 >= n14) {
                    return K.a(byArray, n8, n4);
                }
                n14 = n3 + 2;
                if ((n8 = byArray[n8]) > n15) return -1;
                if ((n8 = n8 + 112 + (n10 <<= 28) >> 30) != 0) return -1;
                n8 = n3 + 3;
                n10 = byArray[n14];
                if (n10 > n15) return -1;
                n3 += 4;
                if ((n8 = byArray[n8]) <= n15) continue;
                return -1;
            }
            n3 = n8;
        }
        return n7;
    }
}

