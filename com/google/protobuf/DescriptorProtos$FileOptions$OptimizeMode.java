/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode$1;
import com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode$OptimizeModeVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class DescriptorProtos$FileOptions$OptimizeMode
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ DescriptorProtos$FileOptions$OptimizeMode[] $VALUES;
    public static final /* enum */ DescriptorProtos$FileOptions$OptimizeMode CODE_SIZE;
    public static final int CODE_SIZE_VALUE = 2;
    public static final /* enum */ DescriptorProtos$FileOptions$OptimizeMode LITE_RUNTIME;
    public static final int LITE_RUNTIME_VALUE = 3;
    public static final /* enum */ DescriptorProtos$FileOptions$OptimizeMode SPEED;
    public static final int SPEED_VALUE = 1;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        DescriptorProtos$FileOptions$OptimizeMode descriptorProtos$FileOptions$OptimizeMode;
        DescriptorProtos$FileOptions$OptimizeMode descriptorProtos$FileOptions$OptimizeMode2;
        int n3 = 1;
        Object object = new DescriptorProtos$FileOptions$OptimizeMode("SPEED", 0, n3);
        SPEED = object;
        int n4 = 2;
        CODE_SIZE = descriptorProtos$FileOptions$OptimizeMode2 = new DescriptorProtos$FileOptions$OptimizeMode("CODE_SIZE", n3, n4);
        int n7 = 3;
        LITE_RUNTIME = descriptorProtos$FileOptions$OptimizeMode = new DescriptorProtos$FileOptions$OptimizeMode("LITE_RUNTIME", n4, n7);
        DescriptorProtos$FileOptions$OptimizeMode[] descriptorProtos$FileOptions$OptimizeModeArray = new DescriptorProtos$FileOptions$OptimizeMode[n7];
        descriptorProtos$FileOptions$OptimizeModeArray[0] = object;
        descriptorProtos$FileOptions$OptimizeModeArray[n3] = descriptorProtos$FileOptions$OptimizeMode2;
        descriptorProtos$FileOptions$OptimizeModeArray[n4] = descriptorProtos$FileOptions$OptimizeMode;
        $VALUES = descriptorProtos$FileOptions$OptimizeModeArray;
        internalValueMap = object = new DescriptorProtos$FileOptions$OptimizeMode$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DescriptorProtos$FileOptions$OptimizeMode() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static DescriptorProtos$FileOptions$OptimizeMode forNumber(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    return null;
                }
                return LITE_RUNTIME;
            }
            return CODE_SIZE;
        }
        return SPEED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return DescriptorProtos$FileOptions$OptimizeMode$OptimizeModeVerifier.INSTANCE;
    }

    public static DescriptorProtos$FileOptions$OptimizeMode valueOf(int n3) {
        return DescriptorProtos$FileOptions$OptimizeMode.forNumber(n3);
    }

    public static DescriptorProtos$FileOptions$OptimizeMode valueOf(String string2) {
        return Enum.valueOf(DescriptorProtos$FileOptions$OptimizeMode.class, string2);
    }

    public static DescriptorProtos$FileOptions$OptimizeMode[] values() {
        return (DescriptorProtos$FileOptions$OptimizeMode[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

