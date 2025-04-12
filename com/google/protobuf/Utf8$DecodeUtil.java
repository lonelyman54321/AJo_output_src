/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

class Utf8$DecodeUtil {
    private Utf8$DecodeUtil() {
    }

    public static /* synthetic */ void access$1000(byte by2, byte by4, byte by5, byte by6, char[] cArray, int n3) {
        Utf8$DecodeUtil.handleFourBytes(by2, by4, by5, by6, cArray, n3);
    }

    public static /* synthetic */ boolean access$400(byte by2) {
        return Utf8$DecodeUtil.isOneByte(by2);
    }

    public static /* synthetic */ void access$500(byte by2, char[] cArray, int n3) {
        Utf8$DecodeUtil.handleOneByte(by2, cArray, n3);
    }

    public static /* synthetic */ boolean access$600(byte by2) {
        return Utf8$DecodeUtil.isTwoBytes(by2);
    }

    public static /* synthetic */ void access$700(byte by2, byte by4, char[] cArray, int n3) {
        Utf8$DecodeUtil.handleTwoBytes(by2, by4, cArray, n3);
    }

    public static /* synthetic */ boolean access$800(byte by2) {
        return Utf8$DecodeUtil.isThreeBytes(by2);
    }

    public static /* synthetic */ void access$900(byte by2, byte by4, byte by5, char[] cArray, int n3) {
        Utf8$DecodeUtil.handleThreeBytes(by2, by4, by5, cArray, n3);
    }

    private static void handleFourBytes(byte by2, byte by4, byte by5, byte by6, char[] cArray, int n3) {
        int n4 = Utf8$DecodeUtil.isNotTrailingByte(by4);
        if (n4 == 0) {
            n4 = by2 << 28;
            int n7 = by4 + 112 + n4;
            if ((n4 = n7 >> 30) == 0 && (n4 = (int)(Utf8$DecodeUtil.isNotTrailingByte(by5) ? 1 : 0)) == 0 && (n4 = (int)(Utf8$DecodeUtil.isNotTrailingByte(by6) ? 1 : 0)) == 0) {
                by2 = (byte)((by2 & 7) << 18);
                by4 = (byte)(Utf8$DecodeUtil.trailingByteValue(by4) << 12);
                by2 = (byte)(by2 | by4);
                by4 = (byte)(Utf8$DecodeUtil.trailingByteValue(by5) << 6);
                by2 = (byte)(by2 | by4);
                by4 = (byte)Utf8$DecodeUtil.trailingByteValue(by6);
                by2 = (byte)(by2 | by4);
                by4 = (byte)Utf8$DecodeUtil.highSurrogate(by2);
                cArray[n3] = (char)by4;
                by2 = (byte)Utf8$DecodeUtil.lowSurrogate(by2);
                cArray[++n3] = (char)by2;
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    private static void handleOneByte(byte by2, char[] cArray, int n3) {
        by2 = by2;
        cArray[n3] = (char)by2;
    }

    private static void handleThreeBytes(byte n3, byte by2, byte by4, char[] cArray, int n4) {
        int n7 = Utf8$DecodeUtil.isNotTrailingByte(by2);
        if (n7 == 0) {
            n7 = -32;
            byte by5 = -96;
            if (!(n3 == n7 && by2 < by5 || n3 == (n7 = -19) && by2 >= by5 || (n7 = (int)(Utf8$DecodeUtil.isNotTrailingByte(by4) ? 1 : 0)) != 0)) {
                n3 = (n3 & 0xF) << 12;
                by2 = (byte)(Utf8$DecodeUtil.trailingByteValue(by2) << 6);
                n3 |= by2;
                by2 = (byte)Utf8$DecodeUtil.trailingByteValue(by4);
                cArray[n4] = n3 = (int)((char)(n3 | by2));
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    private static void handleTwoBytes(byte by2, byte by4, char[] cArray, int n3) {
        byte by5 = -62;
        if (by2 >= by5 && (by5 = (byte)(Utf8$DecodeUtil.isNotTrailingByte(by4) ? 1 : 0)) == 0) {
            by2 = (byte)((by2 & 0x1F) << 6);
            by4 = (byte)Utf8$DecodeUtil.trailingByteValue(by4);
            by2 = (byte)(by2 | by4);
            cArray[n3] = (char)by2;
            return;
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    private static char highSurrogate(int n3) {
        return (char)((n3 >>> 10) + 55232);
    }

    private static boolean isNotTrailingByte(byte by2) {
        byte by4 = -65;
        by2 = by2 > by4 ? (byte)1 : 0;
        return by2 != 0;
    }

    private static boolean isOneByte(byte by2) {
        by2 = by2 >= 0 ? (byte)1 : 0;
        return by2 != 0;
    }

    private static boolean isThreeBytes(byte by2) {
        byte by4 = -16;
        by2 = by2 < by4 ? (byte)1 : 0;
        return by2 != 0;
    }

    private static boolean isTwoBytes(byte by2) {
        byte by4 = -32;
        by2 = by2 < by4 ? (byte)1 : 0;
        return by2 != 0;
    }

    private static char lowSurrogate(int n3) {
        return (char)((n3 & 0x3FF) + 56320);
    }

    private static int trailingByteValue(byte by2) {
        return by2 & 0x3F;
    }
}

