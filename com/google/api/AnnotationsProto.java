/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.HttpRule;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.WireFormat$FieldType;

public final class AnnotationsProto {
    public static final int HTTP_FIELD_NUMBER = 72295728;
    public static final GeneratedMessageLite$GeneratedExtension http;

    static {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = DescriptorProtos$MethodOptions.getDefaultInstance();
        HttpRule httpRule = HttpRule.getDefaultInstance();
        HttpRule httpRule2 = HttpRule.getDefaultInstance();
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.MESSAGE;
        http = GeneratedMessageLite.newSingularGeneratedExtension(descriptorProtos$MethodOptions, httpRule, httpRule2, null, 72295728, wireFormat$FieldType, HttpRule.class);
    }

    private AnnotationsProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension = http;
        extensionRegistryLite.add(generatedMessageLite$GeneratedExtension);
    }
}

