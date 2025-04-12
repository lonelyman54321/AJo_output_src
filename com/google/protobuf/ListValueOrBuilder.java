/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Value;
import java.util.List;

public interface ListValueOrBuilder
extends MessageLiteOrBuilder {
    public Value getValues(int var1);

    public int getValuesCount();

    public List getValuesList();
}

