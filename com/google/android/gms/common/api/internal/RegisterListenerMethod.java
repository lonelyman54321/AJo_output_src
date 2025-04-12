/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class RegisterListenerMethod {
    private final ListenerHolder zaa;
    private final Feature[] zab;
    private final boolean zac;
    private final int zad;

    public RegisterListenerMethod(ListenerHolder listenerHolder) {
        this(listenerHolder, null, false, 0);
    }

    public RegisterListenerMethod(ListenerHolder listenerHolder, Feature[] featureArray, boolean bl2) {
        this(listenerHolder, featureArray, bl2, 0);
    }

    public RegisterListenerMethod(ListenerHolder listenerHolder, Feature[] featureArray, boolean bl2, int n3) {
        this.zaa = listenerHolder;
        this.zab = featureArray;
        this.zac = bl2;
        this.zad = n3;
    }

    public void clearListener() {
        this.zaa.clear();
    }

    public ListenerHolder$ListenerKey getListenerKey() {
        return this.zaa.getListenerKey();
    }

    public Feature[] getRequiredFeatures() {
        return this.zab;
    }

    public abstract void registerListener(Api$AnyClient var1, TaskCompletionSource var2);

    public final int zaa() {
        return this.zad;
    }

    public final boolean zab() {
        return this.zac;
    }
}

