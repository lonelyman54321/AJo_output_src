/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal.components.network.http;

import java.util.List;

public interface ResponseNetwork {
    public Object getBody();

    public List getHeaderField(String var1);

    public int getStatusCode();

    public boolean isSuccessful();
}

