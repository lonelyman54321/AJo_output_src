/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zaaf {
    private final ApiKey zaa;
    private final TaskCompletionSource zab;

    public zaaf(ApiKey apiKey) {
        TaskCompletionSource taskCompletionSource;
        this.zab = taskCompletionSource = new TaskCompletionSource();
        this.zaa = apiKey;
    }

    public final ApiKey zaa() {
        return this.zaa;
    }

    public final TaskCompletionSource zab() {
        return this.zab;
    }
}

