/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ContextRule;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ContextOrBuilder
extends MessageLiteOrBuilder {
    public ContextRule getRules(int var1);

    public int getRulesCount();

    public List getRulesList();
}

