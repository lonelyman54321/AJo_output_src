/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel$1;
import com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel$IdempotencyLevelVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class DescriptorProtos$MethodOptions$IdempotencyLevel
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ DescriptorProtos$MethodOptions$IdempotencyLevel[] $VALUES;
    public static final /* enum */ DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENCY_UNKNOWN;
    public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
    public static final /* enum */ DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENT;
    public static final int IDEMPOTENT_VALUE = 2;
    public static final /* enum */ DescriptorProtos$MethodOptions$IdempotencyLevel NO_SIDE_EFFECTS;
    public static final int NO_SIDE_EFFECTS_VALUE = 1;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        DescriptorProtos$MethodOptions$IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevel;
        DescriptorProtos$MethodOptions$IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevel2;
        Object object = new DescriptorProtos$MethodOptions$IdempotencyLevel("IDEMPOTENCY_UNKNOWN", 0, 0);
        IDEMPOTENCY_UNKNOWN = object;
        int n3 = 1;
        NO_SIDE_EFFECTS = descriptorProtos$MethodOptions$IdempotencyLevel2 = new DescriptorProtos$MethodOptions$IdempotencyLevel("NO_SIDE_EFFECTS", n3, n3);
        int n4 = 2;
        IDEMPOTENT = descriptorProtos$MethodOptions$IdempotencyLevel = new DescriptorProtos$MethodOptions$IdempotencyLevel("IDEMPOTENT", n4, n4);
        DescriptorProtos$MethodOptions$IdempotencyLevel[] descriptorProtos$MethodOptions$IdempotencyLevelArray = new DescriptorProtos$MethodOptions$IdempotencyLevel[3];
        descriptorProtos$MethodOptions$IdempotencyLevelArray[0] = object;
        descriptorProtos$MethodOptions$IdempotencyLevelArray[n3] = descriptorProtos$MethodOptions$IdempotencyLevel2;
        descriptorProtos$MethodOptions$IdempotencyLevelArray[n4] = descriptorProtos$MethodOptions$IdempotencyLevel;
        $VALUES = descriptorProtos$MethodOptions$IdempotencyLevelArray;
        internalValueMap = object = new DescriptorProtos$MethodOptions$IdempotencyLevel$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DescriptorProtos$MethodOptions$IdempotencyLevel() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static DescriptorProtos$MethodOptions$IdempotencyLevel forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return IDEMPOTENT;
            }
            return NO_SIDE_EFFECTS;
        }
        return IDEMPOTENCY_UNKNOWN;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return DescriptorProtos$MethodOptions$IdempotencyLevel$IdempotencyLevelVerifier.INSTANCE;
    }

    public static DescriptorProtos$MethodOptions$IdempotencyLevel valueOf(int n3) {
        return DescriptorProtos$MethodOptions$IdempotencyLevel.forNumber(n3);
    }

    public static DescriptorProtos$MethodOptions$IdempotencyLevel valueOf(String string2) {
        return Enum.valueOf(DescriptorProtos$MethodOptions$IdempotencyLevel.class, string2);
    }

    public static DescriptorProtos$MethodOptions$IdempotencyLevel[] values() {
        return (DescriptorProtos$MethodOptions$IdempotencyLevel[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

