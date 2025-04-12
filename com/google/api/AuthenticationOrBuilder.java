/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.AuthProvider;
import com.google.api.AuthenticationRule;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface AuthenticationOrBuilder
extends MessageLiteOrBuilder {
    public AuthProvider getProviders(int var1);

    public int getProvidersCount();

    public List getProvidersList();

    public AuthenticationRule getRules(int var1);

    public int getRulesCount();

    public List getRulesList();
}

