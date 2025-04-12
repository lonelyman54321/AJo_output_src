/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.OperationInfo;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.WireFormat$FieldType;

public final class OperationsProto {
    public static final int OPERATION_INFO_FIELD_NUMBER = 1049;
    public static final GeneratedMessageLite$GeneratedExtension operationInfo;

    static {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = DescriptorProtos$MethodOptions.getDefaultInstance();
        OperationInfo operationInfo = OperationInfo.getDefaultInstance();
        OperationInfo operationInfo2 = OperationInfo.getDefaultInstance();
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.MESSAGE;
        OperationsProto.operationInfo = GeneratedMessageLite.newSingularGeneratedExtension(descriptorProtos$MethodOptions, operationInfo, operationInfo2, null, 1049, wireFormat$FieldType, OperationInfo.class);
    }

    private OperationsProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension = operationInfo;
        extensionRegistryLite.add(generatedMessageLite$GeneratedExtension);
    }
}

