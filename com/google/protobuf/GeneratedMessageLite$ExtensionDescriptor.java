/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.WireFormat$JavaType;

final class GeneratedMessageLite$ExtensionDescriptor
implements FieldSet$FieldDescriptorLite {
    final Internal$EnumLiteMap enumTypeMap;
    final boolean isPacked;
    final boolean isRepeated;
    final int number;
    final WireFormat$FieldType type;

    public GeneratedMessageLite$ExtensionDescriptor(Internal$EnumLiteMap internal$EnumLiteMap, int n3, WireFormat$FieldType wireFormat$FieldType, boolean bl2, boolean bl3) {
        this.enumTypeMap = internal$EnumLiteMap;
        this.number = n3;
        this.type = wireFormat$FieldType;
        this.isRepeated = bl2;
        this.isPacked = bl3;
    }

    public int compareTo(GeneratedMessageLite$ExtensionDescriptor generatedMessageLite$ExtensionDescriptor) {
        int n3 = this.number;
        int n4 = generatedMessageLite$ExtensionDescriptor.number;
        return n3 - n4;
    }

    public Internal$EnumLiteMap getEnumType() {
        return this.enumTypeMap;
    }

    public WireFormat$JavaType getLiteJavaType() {
        return this.type.getJavaType();
    }

    public WireFormat$FieldType getLiteType() {
        return this.type;
    }

    public int getNumber() {
        return this.number;
    }

    public MessageLite$Builder internalMergeFrom(MessageLite$Builder messageLite$Builder, MessageLite messageLite) {
        messageLite$Builder = (GeneratedMessageLite$Builder)messageLite$Builder;
        messageLite = (GeneratedMessageLite)messageLite;
        return ((GeneratedMessageLite$Builder)messageLite$Builder).mergeFrom((GeneratedMessageLite)messageLite);
    }

    public boolean isPacked() {
        return this.isPacked;
    }

    public boolean isRepeated() {
        return this.isRepeated;
    }
}

