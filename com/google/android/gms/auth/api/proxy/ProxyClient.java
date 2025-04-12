/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

public interface ProxyClient
extends HasApiKey {
    public Task getSpatulaHeader();

    public Task performProxyRequest(ProxyRequest var1);
}

