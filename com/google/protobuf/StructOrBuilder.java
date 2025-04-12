/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Value;
import java.util.Map;

public interface StructOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsFields(String var1);

    public Map getFields();

    public int getFieldsCount();

    public Map getFieldsMap();

    public Value getFieldsOrDefault(String var1, Value var2);

    public Value getFieldsOrThrow(String var1);
}

