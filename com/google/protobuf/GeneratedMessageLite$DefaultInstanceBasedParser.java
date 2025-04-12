/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;

public class GeneratedMessageLite$DefaultInstanceBasedParser
extends AbstractParser {
    private final GeneratedMessageLite defaultInstance;

    public GeneratedMessageLite$DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite) {
        this.defaultInstance = generatedMessageLite;
    }

    public GeneratedMessageLite parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream, extensionRegistryLite);
    }

    public GeneratedMessageLite parsePartialFrom(byte[] byArray, int n3, int n4, ExtensionRegistryLite extensionRegistryLite) {
        return GeneratedMessageLite.access$200(this.defaultInstance, byArray, n3, n4, extensionRegistryLite);
    }
}

