/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Utf8;
import com.google.protobuf.Utf8$DecodeUtil;
import com.google.protobuf.Utf8$Processor;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import java.nio.ByteBuffer;

final class Utf8$SafeProcessor
extends Utf8$Processor {
    private static int partialIsValidUtf8(byte[] byArray, int n3, int n4) {
        int n7;
        byte by2;
        while (n3 < n4 && (by2 = byArray[n3]) >= 0) {
            ++n3;
        }
        if (n3 >= n4) {
            n7 = 0;
            byArray = null;
        } else {
            n7 = Utf8$SafeProcessor.partialIsValidUtf8NonAscii(byArray, n3, n4);
        }
        return n7;
    }

    private static int partialIsValidUtf8NonAscii(byte[] byArray, int n3, int n4) {
        while (n3 < n4) {
            int n7 = n3 + 1;
            int n8 = byArray[n3];
            if (n8 < 0) {
                int n10 = -32;
                int n14 = -1;
                int n15 = -65;
                if (n8 < n10) {
                    if (n7 >= n4) {
                        return n8;
                    }
                    n10 = -62;
                    if (n8 >= n10) {
                        n3 += 2;
                        if ((n7 = byArray[n7]) <= n15) continue;
                    }
                    return n14;
                }
                int n16 = -16;
                if (n8 < n16) {
                    n16 = n4 + -1;
                    if (n7 >= n16) {
                        return Utf8.access$1100(byArray, n7, n4);
                    }
                    n16 = n3 + 2;
                    if ((n7 = byArray[n7]) <= n15) {
                        int n17 = -96;
                        if (!(n8 == n10 && n7 < n17 || n8 == (n10 = -19) && n7 >= n17)) {
                            n3 += 3;
                            n7 = byArray[n16];
                            if (n7 <= n15) continue;
                        }
                    }
                    return n14;
                }
                n10 = n4 + -2;
                if (n7 >= n10) {
                    return Utf8.access$1100(byArray, n7, n4);
                }
                n10 = n3 + 2;
                if ((n7 = byArray[n7]) <= n15 && (n7 = n7 + 112 + (n8 <<= 28) >> 30) == 0) {
                    n7 = n3 + 3;
                    n8 = byArray[n10];
                    if (n8 <= n15) {
                        n3 += 4;
                        if ((n7 = byArray[n7]) <= n15) continue;
                    }
                }
                return n14;
            }
            n3 = n7;
        }
        return 0;
    }

    public String decodeUtf8(byte[] object, int n3, int n4) {
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
            while (n3 < n14 && (n17 = Utf8$DecodeUtil.access$400((byte)(n16 = object[n3]))) != 0) {
                n3 += n10;
                n17 = n15 + 1;
                Utf8$DecodeUtil.access$500((byte)n16, cArray, n15);
                n15 = n17;
            }
            int n18 = n15;
            while (n3 < n14) {
                int n19;
                n15 = n3 + 1;
                n16 = object[n3];
                n17 = Utf8$DecodeUtil.access$400((byte)n16);
                if (n17 != 0) {
                    n3 = n18 + 1;
                    Utf8$DecodeUtil.access$500((byte)n16, cArray, n18);
                    while (n15 < n14 && (n17 = (int)(Utf8$DecodeUtil.access$400((byte)(n16 = object[n15])) ? 1 : 0)) != 0) {
                        n15 += n10;
                        n17 = n3 + 1;
                        Utf8$DecodeUtil.access$500((byte)n16, cArray, n3);
                        n3 = n17;
                    }
                    n18 = n3;
                    n3 = n15;
                    continue;
                }
                n17 = (int)(Utf8$DecodeUtil.access$600((byte)n16) ? 1 : 0);
                if (n17 != 0) {
                    if (n15 < n14) {
                        n3 += n8;
                        n15 = object[n15];
                        n17 = n18 + 1;
                        Utf8$DecodeUtil.access$700((byte)n16, (byte)n15, cArray, n18);
                        n18 = n17;
                        continue;
                    }
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                n17 = (int)(Utf8$DecodeUtil.access$800((byte)n16) ? 1 : 0);
                if (n17 != 0) {
                    n17 = n14 + -1;
                    if (n15 < n17) {
                        n17 = n3 + 2;
                        n15 = object[n15];
                        n3 += n7;
                        n17 = object[n17];
                        n19 = n18 + 1;
                        Utf8$DecodeUtil.access$900((byte)n16, (byte)n15, (byte)n17, cArray, n18);
                        n18 = n19;
                        continue;
                    }
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                n17 = n14 + -2;
                if (n15 < n17) {
                    n17 = n3 + 2;
                    n19 = object[n15];
                    n15 = n3 + 3;
                    n17 = object[n17];
                    n3 += 4;
                    int n20 = object[n15];
                    n15 = n16;
                    n16 = n19;
                    n19 = n20;
                    Utf8$DecodeUtil.access$1000((byte)n15, (byte)n16, (byte)n17, (byte)n20, cArray, n18);
                    n18 += n8;
                    continue;
                }
                throw InvalidProtocolBufferException.invalidUtf8();
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

    public String decodeUtf8Direct(ByteBuffer byteBuffer, int n3, int n4) {
        return this.decodeUtf8Default(byteBuffer, n3, n4);
    }

    public int encodeUtf8(CharSequence object, byte[] object2, int n3, int n4) {
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
                        object = new Utf8$UnpairedSurrogateException(n15 += -1, n14);
                        throw object;
                    }
                    if (n16 > n8 || n8 > n7) break block16;
                    int n18 = n15 + 1;
                    n4 = object.length();
                    if (n18 == n4) break block17;
                    char c2 = object.charAt(n18);
                    if ((c2 = (char)(Character.isSurrogatePair((char)n8, c2) ? 1 : 0)) != '\u0000') break block16;
                }
                object = new Utf8$UnpairedSurrogateException(n15, n14);
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

    public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
        this.encodeUtf8Default(charSequence, byteBuffer);
    }

    /*
     * Enabled aggressive block sorting
     */
    public int partialIsValidUtf8(int n3, byte[] byArray, int n4, int n7) {
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        block17: {
            block18: {
                block16: {
                    block15: {
                        if (n3 == 0) return Utf8$SafeProcessor.partialIsValidUtf8(byArray, n4, n7);
                        if (n4 >= n7) {
                            return n3;
                        }
                        n16 = n3;
                        n15 = -32;
                        n14 = -1;
                        n10 = -65;
                        if (n16 >= n15) break block15;
                        n3 = -62;
                        if (n16 < n3) return n14;
                        n3 = n4 + 1;
                        if ((n4 = byArray[n4]) > n10) {
                            return n14;
                        }
                        break block16;
                    }
                    int n17 = -16;
                    if (n16 >= n17) break block17;
                    if ((n3 = (int)((byte)(~(n3 >> 8)))) == 0) {
                        n3 = n4 + 1;
                        n4 = byArray[n4];
                        if (n3 >= n7) {
                            return Utf8.access$000(n16, n4);
                        }
                        int n18 = n4;
                        n4 = n3;
                        n3 = n18;
                    }
                    if (n3 > n10) return n14;
                    n17 = -96;
                    if (n16 == n15) {
                        if (n3 < n17) return n14;
                    }
                    if (n16 == (n15 = -19)) {
                        if (n3 >= n17) return n14;
                    }
                    n3 = n4 + 1;
                    if ((n4 = byArray[n4]) > n10) break block18;
                }
                n4 = n3;
                return Utf8$SafeProcessor.partialIsValidUtf8(byArray, n4, n7);
            }
            return n14;
        }
        n15 = (byte)(~(n3 >> 8));
        if (n15 == 0) {
            n3 = n4 + 1;
            n15 = byArray[n4];
            if (n3 >= n7) {
                return Utf8.access$000(n16, n15);
            }
            n4 = 0;
        } else {
            n3 = (byte)(n3 >> 16);
            n8 = n4;
            n4 = n3;
            n3 = n8;
        }
        if (n4 == 0) {
            n4 = n3 + 1;
            n3 = byArray[n3];
            if (n4 >= n7) {
                return Utf8.access$100(n16, n15, n3);
            }
            n8 = n4;
            n4 = n3;
            n3 = n8;
        }
        if (n15 > n10) return n14;
        n16 <<= 28;
        if ((n16 = (n15 = n15 + 112 + n16) >> 30) != 0) return n14;
        if (n4 > n10) return n14;
        n4 = n3 + 1;
        if ((n3 = byArray[n3]) <= n10) return Utf8$SafeProcessor.partialIsValidUtf8(byArray, n4, n7);
        return n14;
    }

    public int partialIsValidUtf8Direct(int n3, ByteBuffer byteBuffer, int n4, int n7) {
        return this.partialIsValidUtf8Default(n3, byteBuffer, n4, n7);
    }
}

