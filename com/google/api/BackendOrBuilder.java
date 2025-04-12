/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.BackendRule;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface BackendOrBuilder
extends MessageLiteOrBuilder {
    public BackendRule getRules(int var1);

    public int getRulesCount();

    public List getRulesList();
}

