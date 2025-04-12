/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl$AbstractDynamicLinkCallbacks;
import com.google.firebase.inject.Provider;

class FirebaseDynamicLinksImpl$DynamicLinkCallbacks
extends FirebaseDynamicLinksImpl$AbstractDynamicLinkCallbacks {
    private final Provider analytics;
    private final TaskCompletionSource completionSource;

    public FirebaseDynamicLinksImpl$DynamicLinkCallbacks(Provider provider, TaskCompletionSource taskCompletionSource) {
        this.analytics = provider;
        this.completionSource = taskCompletionSource;
    }

    public void onGetDynamicLink(Status status, DynamicLinkData object) {
        Object object2 = object == null ? null : new PendingDynamicLinkData((DynamicLinkData)object);
        Object object3 = this.completionSource;
        TaskUtil.setResultOrApiException(status, object2, (TaskCompletionSource)object3);
        if (object == null) {
            return;
        }
        status = ((DynamicLinkData)object).getExtensionBundle();
        object = "scionData";
        if ((status = status.getBundle((String)object)) != null && (object = status.keySet()) != null) {
            boolean bl2;
            object = (AnalyticsConnector)this.analytics.get();
            if (object == null) {
                return;
            }
            object2 = status.keySet().iterator();
            while (bl2 = object2.hasNext()) {
                object3 = (String)object2.next();
                Bundle bundle = status.getBundle((String)object3);
                String string2 = "fdl";
                object.logEvent(string2, (String)object3, bundle);
            }
        }
    }
}

