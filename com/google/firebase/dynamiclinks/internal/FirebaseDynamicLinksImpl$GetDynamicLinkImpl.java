/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.dynamiclinks.internal;

import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.dynamiclinks.internal.DynamicLinksClient;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl$DynamicLinkCallbacks;
import com.google.firebase.inject.Provider;

final class FirebaseDynamicLinksImpl$GetDynamicLinkImpl
extends TaskApiCall {
    private final Provider analytics;
    private final String dynamicLink;

    public FirebaseDynamicLinksImpl$GetDynamicLinkImpl(Provider provider, String string2) {
        super(null, false, 13201);
        this.dynamicLink = string2;
        this.analytics = provider;
    }

    public void doExecute(DynamicLinksClient dynamicLinksClient, TaskCompletionSource object) {
        Provider provider = this.analytics;
        FirebaseDynamicLinksImpl$DynamicLinkCallbacks firebaseDynamicLinksImpl$DynamicLinkCallbacks = new FirebaseDynamicLinksImpl$DynamicLinkCallbacks(provider, (TaskCompletionSource)object);
        object = this.dynamicLink;
        dynamicLinksClient.getDynamicLink(firebaseDynamicLinksImpl$DynamicLinkCallbacks, (String)object);
    }
}

