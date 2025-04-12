/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class TaskApiCall {
    private final Feature[] zaa;
    private final boolean zab;
    private final int zac;

    public TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    public TaskApiCall(Feature[] featureArray, boolean bl2, int n3) {
        this.zaa = featureArray;
        boolean bl3 = false;
        if (featureArray != null && bl2) {
            bl3 = true;
        }
        this.zab = bl3;
        this.zac = n3;
    }

    public static TaskApiCall$Builder builder() {
        TaskApiCall$Builder taskApiCall$Builder = new TaskApiCall$Builder(null);
        return taskApiCall$Builder;
    }

    public abstract void doExecute(Api$AnyClient var1, TaskCompletionSource var2);

    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    public final int zaa() {
        return this.zac;
    }

    public final Feature[] zab() {
        return this.zaa;
    }
}

