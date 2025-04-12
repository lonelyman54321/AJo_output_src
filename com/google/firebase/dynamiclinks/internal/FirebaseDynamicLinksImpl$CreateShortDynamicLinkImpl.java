/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.dynamiclinks.internal.DynamicLinksClient;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl$CreateShortDynamicLinkCallbacks;

final class FirebaseDynamicLinksImpl$CreateShortDynamicLinkImpl
extends TaskApiCall {
    private final Bundle builderParameters;

    public FirebaseDynamicLinksImpl$CreateShortDynamicLinkImpl(Bundle bundle) {
        super(null, false, 13202);
        this.builderParameters = bundle;
    }

    public void doExecute(DynamicLinksClient dynamicLinksClient, TaskCompletionSource taskCompletionSource) {
        FirebaseDynamicLinksImpl$CreateShortDynamicLinkCallbacks firebaseDynamicLinksImpl$CreateShortDynamicLinkCallbacks = new FirebaseDynamicLinksImpl$CreateShortDynamicLinkCallbacks(taskCompletionSource);
        taskCompletionSource = this.builderParameters;
        dynamicLinksClient.createShortDynamicLink(firebaseDynamicLinksImpl$CreateShortDynamicLinkCallbacks, (Bundle)taskCompletionSource);
    }
}

