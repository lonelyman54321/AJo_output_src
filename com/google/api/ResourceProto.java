/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ResourceDescriptor;
import com.google.api.ResourceReference;
import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MessageOptions;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat$FieldType;

public final class ResourceProto {
    public static final int RESOURCE_DEFINITION_FIELD_NUMBER = 1053;
    public static final int RESOURCE_FIELD_NUMBER = 1053;
    public static final int RESOURCE_REFERENCE_FIELD_NUMBER = 1055;
    public static final GeneratedMessageLite$GeneratedExtension resource;
    public static final GeneratedMessageLite$GeneratedExtension resourceDefinition;
    public static final GeneratedMessageLite$GeneratedExtension resourceReference;

    static {
        WireFormat$FieldType wireFormat$FieldType;
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = DescriptorProtos$FieldOptions.getDefaultInstance();
        ResourceReference resourceReference = ResourceReference.getDefaultInstance();
        ResourceReference resourceReference2 = ResourceReference.getDefaultInstance();
        Object object = wireFormat$FieldType = WireFormat$FieldType.MESSAGE;
        ResourceProto.resourceReference = GeneratedMessageLite.newSingularGeneratedExtension(descriptorProtos$FieldOptions, resourceReference, resourceReference2, null, 1055, wireFormat$FieldType, ResourceReference.class);
        GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = DescriptorProtos$FileOptions.getDefaultInstance();
        ResourceDescriptor resourceDescriptor = ResourceDescriptor.getDefaultInstance();
        resourceDefinition = GeneratedMessageLite.newRepeatedGeneratedExtension(generatedMessageLite$ExtendableMessage, resourceDescriptor, null, 1053, wireFormat$FieldType, false, ResourceDescriptor.class);
        generatedMessageLite$ExtendableMessage = DescriptorProtos$MessageOptions.getDefaultInstance();
        resourceDescriptor = ResourceDescriptor.getDefaultInstance();
        object = ResourceDescriptor.getDefaultInstance();
        resource = GeneratedMessageLite.newSingularGeneratedExtension(generatedMessageLite$ExtendableMessage, resourceDescriptor, (MessageLite)object, null, 1053, wireFormat$FieldType, ResourceDescriptor.class);
    }

    private ResourceProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension = resourceReference;
        extensionRegistryLite.add(generatedMessageLite$GeneratedExtension);
        generatedMessageLite$GeneratedExtension = resourceDefinition;
        extensionRegistryLite.add(generatedMessageLite$GeneratedExtension);
        generatedMessageLite$GeneratedExtension = resource;
        extensionRegistryLite.add(generatedMessageLite$GeneratedExtension);
    }
}

