/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FieldSet;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Reader;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.Writer;
import java.util.Map;

abstract class ExtensionSchema {
    public abstract int extensionNumber(Map.Entry var1);

    public abstract Object findExtensionByNumber(ExtensionRegistryLite var1, MessageLite var2, int var3);

    public abstract FieldSet getExtensions(Object var1);

    public abstract FieldSet getMutableExtensions(Object var1);

    public abstract boolean hasExtensions(MessageLite var1);

    public abstract void makeImmutable(Object var1);

    public abstract Object parseExtension(Object var1, Reader var2, Object var3, ExtensionRegistryLite var4, FieldSet var5, Object var6, UnknownFieldSchema var7);

    public abstract void parseLengthPrefixedMessageSetItem(Reader var1, Object var2, ExtensionRegistryLite var3, FieldSet var4);

    public abstract void parseMessageSetItem(ByteString var1, Object var2, ExtensionRegistryLite var3, FieldSet var4);

    public abstract void serializeExtension(Writer var1, Map.Entry var2);

    public abstract void setExtensions(Object var1, FieldSet var2);
}

