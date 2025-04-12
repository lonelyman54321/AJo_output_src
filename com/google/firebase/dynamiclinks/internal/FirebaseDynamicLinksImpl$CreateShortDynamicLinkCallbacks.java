/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.dynamiclinks.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl$AbstractDynamicLinkCallbacks;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;

class FirebaseDynamicLinksImpl$CreateShortDynamicLinkCallbacks
extends FirebaseDynamicLinksImpl$AbstractDynamicLinkCallbacks {
    private final TaskCompletionSource completionSource;

    public FirebaseDynamicLinksImpl$CreateShortDynamicLinkCallbacks(TaskCompletionSource taskCompletionSource) {
        this.completionSource = taskCompletionSource;
    }

    public void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
        TaskCompletionSource taskCompletionSource = this.completionSource;
        TaskUtil.setResultOrApiException(status, shortDynamicLinkImpl, taskCompletionSource);
    }
}

