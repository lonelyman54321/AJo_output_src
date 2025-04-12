/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.HttpRule;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface HttpOrBuilder
extends MessageLiteOrBuilder {
    public boolean getFullyDecodeReservedExpansion();

    public HttpRule getRules(int var1);

    public int getRulesCount();

    public List getRulesList();
}

