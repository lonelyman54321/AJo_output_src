/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class UnregisterListenerMethod {
    private final ListenerHolder$ListenerKey zaa;

    public UnregisterListenerMethod(ListenerHolder$ListenerKey listenerHolder$ListenerKey) {
        this.zaa = listenerHolder$ListenerKey;
    }

    public ListenerHolder$ListenerKey getListenerKey() {
        return this.zaa;
    }

    public abstract void unregisterListener(Api$AnyClient var1, TaskCompletionSource var2);
}

