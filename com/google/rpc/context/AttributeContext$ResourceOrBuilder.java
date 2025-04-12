/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

public interface AttributeContext$ResourceOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsLabels(String var1);

    public Map getLabels();

    public int getLabelsCount();

    public Map getLabelsMap();

    public String getLabelsOrDefault(String var1, String var2);

    public String getLabelsOrThrow(String var1);

    public String getName();

    public ByteString getNameBytes();

    public String getService();

    public ByteString getServiceBytes();

    public String getType();

    public ByteString getTypeBytes();
}

