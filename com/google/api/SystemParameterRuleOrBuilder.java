/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.SystemParameter;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface SystemParameterRuleOrBuilder
extends MessageLiteOrBuilder {
    public SystemParameter getParameters(int var1);

    public int getParametersCount();

    public List getParametersList();

    public String getSelector();

    public ByteString getSelectorBytes();
}

