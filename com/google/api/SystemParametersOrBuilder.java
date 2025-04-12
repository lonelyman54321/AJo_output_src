/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.SystemParameterRule;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface SystemParametersOrBuilder
extends MessageLiteOrBuilder {
    public SystemParameterRule getRules(int var1);

    public int getRulesCount();

    public List getRulesList();
}

