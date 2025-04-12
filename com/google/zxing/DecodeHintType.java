/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.ResultPointCallback;
import java.util.List;

public final class DecodeHintType
extends Enum {
    private static final /* synthetic */ DecodeHintType[] $VALUES;
    public static final /* enum */ DecodeHintType ALLOWED_EAN_EXTENSIONS;
    public static final /* enum */ DecodeHintType ALLOWED_LENGTHS;
    public static final /* enum */ DecodeHintType ASSUME_CODE_39_CHECK_DIGIT;
    public static final /* enum */ DecodeHintType ASSUME_GS1;
    public static final /* enum */ DecodeHintType CHARACTER_SET;
    public static final /* enum */ DecodeHintType NEED_RESULT_POINT_CALLBACK;
    public static final /* enum */ DecodeHintType OTHER;
    public static final /* enum */ DecodeHintType POSSIBLE_FORMATS;
    public static final /* enum */ DecodeHintType PURE_BARCODE;
    public static final /* enum */ DecodeHintType RETURN_CODABAR_START_END;
    public static final /* enum */ DecodeHintType TRY_HARDER;
    private final Class valueType;

    static {
        DecodeHintType decodeHintType;
        DecodeHintType decodeHintType2;
        DecodeHintType decodeHintType3;
        DecodeHintType decodeHintType4;
        DecodeHintType decodeHintType5;
        DecodeHintType decodeHintType6;
        DecodeHintType decodeHintType7;
        DecodeHintType decodeHintType8;
        DecodeHintType decodeHintType9;
        DecodeHintType decodeHintType10;
        OTHER = decodeHintType10 = new DecodeHintType("OTHER", 0, Object.class);
        int n3 = 1;
        Object object = Void.class;
        PURE_BARCODE = decodeHintType9 = new DecodeHintType("PURE_BARCODE", n3, object);
        POSSIBLE_FORMATS = decodeHintType8 = new DecodeHintType("POSSIBLE_FORMATS", 2, List.class);
        TRY_HARDER = decodeHintType7 = new DecodeHintType("TRY_HARDER", 3, object);
        CHARACTER_SET = decodeHintType6 = new DecodeHintType("CHARACTER_SET", 4, String.class);
        Class<int[]> clazz = int[].class;
        ALLOWED_LENGTHS = decodeHintType5 = new DecodeHintType("ALLOWED_LENGTHS", 5, clazz);
        ASSUME_CODE_39_CHECK_DIGIT = decodeHintType4 = new DecodeHintType("ASSUME_CODE_39_CHECK_DIGIT", 6, object);
        ASSUME_GS1 = decodeHintType3 = new DecodeHintType("ASSUME_GS1", 7, object);
        RETURN_CODABAR_START_END = decodeHintType2 = new DecodeHintType("RETURN_CODABAR_START_END", 8, object);
        object = new Object("NEED_RESULT_POINT_CALLBACK", 9, ResultPointCallback.class);
        NEED_RESULT_POINT_CALLBACK = object;
        int n4 = 10;
        ALLOWED_EAN_EXTENSIONS = decodeHintType = new DecodeHintType("ALLOWED_EAN_EXTENSIONS", n4, clazz);
        DecodeHintType[] decodeHintTypeArray = new DecodeHintType[11];
        decodeHintTypeArray[0] = decodeHintType10;
        decodeHintTypeArray[n3] = decodeHintType9;
        decodeHintTypeArray[2] = decodeHintType8;
        decodeHintTypeArray[3] = decodeHintType7;
        decodeHintTypeArray[4] = decodeHintType6;
        decodeHintTypeArray[5] = decodeHintType5;
        decodeHintTypeArray[6] = decodeHintType4;
        decodeHintTypeArray[7] = decodeHintType3;
        decodeHintTypeArray[8] = decodeHintType2;
        decodeHintTypeArray[9] = object;
        decodeHintTypeArray[n4] = decodeHintType;
        $VALUES = decodeHintTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DecodeHintType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.valueType = var3_2;
    }

    public static DecodeHintType valueOf(String string2) {
        return Enum.valueOf(DecodeHintType.class, string2);
    }

    public static DecodeHintType[] values() {
        return (DecodeHintType[])$VALUES.clone();
    }

    public Class getValueType() {
        return this.valueType;
    }
}

