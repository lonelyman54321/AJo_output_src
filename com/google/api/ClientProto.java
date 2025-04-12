/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.google.protobuf.DescriptorProtos$ServiceOptions;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.WireFormat$FieldType;

public final class ClientProto {
    public static final int DEFAULT_HOST_FIELD_NUMBER = 1049;
    public static final int METHOD_SIGNATURE_FIELD_NUMBER = 1051;
    public static final int OAUTH_SCOPES_FIELD_NUMBER = 1050;
    public static final GeneratedMessageLite$GeneratedExtension defaultHost;
    public static final GeneratedMessageLite$GeneratedExtension methodSignature;
    public static final GeneratedMessageLite$GeneratedExtension oauthScopes;

    static {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = DescriptorProtos$MethodOptions.getDefaultInstance();
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
        methodSignature = GeneratedMessageLite.newRepeatedGeneratedExtension(descriptorProtos$MethodOptions, null, null, 1051, wireFormat$FieldType, false, String.class);
        defaultHost = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos$ServiceOptions.getDefaultInstance(), "", null, null, 1049, wireFormat$FieldType, String.class);
        oauthScopes = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos$ServiceOptions.getDefaultInstance(), "", null, null, 1050, wireFormat$FieldType, String.class);
    }

    private ClientProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension = methodSignature;
        extensionRegistryLite.add(generatedMessageLite$GeneratedExtension);
        generatedMessageLite$GeneratedExtension = defaultHost;
        extensionRegistryLite.add(generatedMessageLite$GeneratedExtension);
        generatedMessageLite$GeneratedExtension = oauthScopes;
        extensionRegistryLite.add(generatedMessageLite$GeneratedExtension);
    }
}

