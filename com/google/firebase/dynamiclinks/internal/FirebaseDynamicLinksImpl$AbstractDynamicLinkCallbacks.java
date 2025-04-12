/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.dynamiclinks.internal;

import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks$Stub;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;

class FirebaseDynamicLinksImpl$AbstractDynamicLinkCallbacks
extends IDynamicLinksCallbacks$Stub {
    public void onCreateShortDynamicLink(Status object, ShortDynamicLinkImpl shortDynamicLinkImpl) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public void onGetDynamicLink(Status object, DynamicLinkData dynamicLinkData) {
        object = new UnsupportedOperationException();
        throw object;
    }
}

