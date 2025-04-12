/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zacv
extends TaskApiCall {
    final /* synthetic */ TaskApiCall$Builder zaa;

    public zacv(TaskApiCall$Builder taskApiCall$Builder, Feature[] featureArray, boolean bl2, int n3) {
        this.zaa = taskApiCall$Builder;
        super(featureArray, bl2, n3);
    }

    public final void doExecute(Api$AnyClient api$AnyClient, TaskCompletionSource taskCompletionSource) {
        TaskApiCall$Builder.zaa(this.zaa).accept(api$AnyClient, taskCompletionSource);
    }
}

