/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.Version;

public final class Mode
extends Enum {
    private static final /* synthetic */ Mode[] $VALUES;
    public static final /* enum */ Mode ALPHANUMERIC;
    public static final /* enum */ Mode BYTE;
    public static final /* enum */ Mode ECI;
    public static final /* enum */ Mode FNC1_FIRST_POSITION;
    public static final /* enum */ Mode FNC1_SECOND_POSITION;
    public static final /* enum */ Mode HANZI;
    public static final /* enum */ Mode KANJI;
    public static final /* enum */ Mode NUMERIC;
    public static final /* enum */ Mode STRUCTURED_APPEND;
    public static final /* enum */ Mode TERMINATOR;
    private final int bits;
    private final int[] characterCountBitsForVersions;

    static {
        Mode mode;
        Mode mode2;
        Mode mode3;
        Object object = new int[]{0, 0, 0};
        TERMINATOR = mode3 = new Mode("TERMINATOR", 0, object, 0);
        object = (Object)new Mode;
        int n3 = 10;
        int n4 = 12;
        Object object2 = new int[]{n3, n4, 14};
        int n7 = 1;
        object("NUMERIC", n7, object2, n7);
        NUMERIC = (Mode)((Object)object);
        object2 = (Object)new Mode;
        int n8 = 9;
        Object object3 = new int[]{n8, 11, 13};
        int n10 = 2;
        object2("ALPHANUMERIC", n10, object3, n10);
        ALPHANUMERIC = (Mode)((Object)object2);
        object3 = (Object)new Mode;
        int n14 = 3;
        Object object4 = new int[]{0, 0, 0};
        object3("STRUCTURED_APPEND", n14, object4, n14);
        STRUCTURED_APPEND = (Mode)((Object)object3);
        object4 = (Object)new Mode;
        int n15 = 16;
        int n16 = 8;
        Object object5 = new int[]{n16, n15, n15};
        n14 = 4;
        object4("BYTE", n14, object5, n14);
        BYTE = (Mode)((Object)object4);
        object5 = (Object)new Mode;
        int[] nArray = new int[]{0, 0, 0};
        n10 = 5;
        n7 = 7;
        object5("ECI", n10, nArray, n7);
        ECI = (Mode)((Object)object5);
        Object object6 = new int[]{n16, n3, n4};
        KANJI = mode2 = new Mode("KANJI", 6, object6, n16);
        nArray = new int[]{0, 0, 0};
        FNC1_FIRST_POSITION = mode = new Mode("FNC1_FIRST_POSITION", n7, nArray, n10);
        object6 = (Object)new Mode;
        Object object7 = new int[]{0, 0, 0};
        object6("FNC1_SECOND_POSITION", n16, object7, n8);
        FNC1_SECOND_POSITION = (Mode)((Object)object6);
        object7 = (Object)new Mode;
        n10 = 10;
        Object[] objectArray = new int[]{n16, n10, n4};
        object7("HANZI", n8, objectArray, 13);
        HANZI = (Mode)((Object)object7);
        objectArray = (Object[])new Mode[n10];
        objectArray[0] = (int)mode3;
        objectArray[1] = (int)object;
        objectArray[2] = (int)object2;
        objectArray[3] = (int)object3;
        objectArray[4] = (int)object4;
        objectArray[5] = (int)object5;
        objectArray[6] = (int)mode2;
        objectArray[7] = (int)mode;
        objectArray[8] = (int)object6;
        objectArray[n8] = (int)object7;
        $VALUES = (Mode[])objectArray;
    }

    /*
     * WARNING - void declaration
     */
    private Mode() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.characterCountBitsForVersions = var3_2;
        this.bits = var4_1;
    }

    public static Mode forBits(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            n4 = 5;
                            if (n3 != n4) {
                                n4 = 7;
                                if (n3 != n4) {
                                    n4 = 8;
                                    if (n3 != n4) {
                                        n4 = 9;
                                        if (n3 != n4) {
                                            n4 = 13;
                                            if (n3 == n4) {
                                                return HANZI;
                                            }
                                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                                            throw illegalArgumentException;
                                        }
                                        return FNC1_SECOND_POSITION;
                                    }
                                    return KANJI;
                                }
                                return ECI;
                            }
                            return FNC1_FIRST_POSITION;
                        }
                        return BYTE;
                    }
                    return STRUCTURED_APPEND;
                }
                return ALPHANUMERIC;
            }
            return NUMERIC;
        }
        return TERMINATOR;
    }

    public static Mode valueOf(String string2) {
        return Enum.valueOf(Mode.class, string2);
    }

    public static Mode[] values() {
        return (Mode[])$VALUES.clone();
    }

    public int getBits() {
        return this.bits;
    }

    public int getCharacterCountBits(Version version) {
        int n3;
        int n4 = version.getVersionNumber();
        if (n4 <= (n3 = 9)) {
            n4 = 0;
            version = null;
        } else {
            n3 = 26;
            n4 = n4 <= n3 ? 1 : 2;
        }
        return this.characterCountBitsForVersions[n4];
    }
}

