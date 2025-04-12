/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.FieldBehavior;
import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.WireFormat$FieldType;

public final class FieldBehaviorProto {
    public static final int FIELD_BEHAVIOR_FIELD_NUMBER = 1052;
    public static final GeneratedMessageLite$GeneratedExtension fieldBehavior;

    static {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = DescriptorProtos$FieldOptions.getDefaultInstance();
        Internal.EnumLiteMap enumLiteMap = FieldBehavior.internalGetValueMap();
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.ENUM;
        fieldBehavior = GeneratedMessageLite.newRepeatedGeneratedExtension(descriptorProtos$FieldOptions, null, enumLiteMap, 1052, wireFormat$FieldType, true, FieldBehavior.class);
    }

    private FieldBehaviorProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension = fieldBehavior;
        extensionRegistryLite.add(generatedMessageLite$GeneratedExtension);
    }
}

