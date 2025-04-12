/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 */
package com.google.firebase.dynamiclinks.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;

public class IDynamicLinksCallbacks$Default
implements IDynamicLinksCallbacks {
    public IBinder asBinder() {
        return null;
    }

    public void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
    }

    public void onGetDynamicLink(Status status, DynamicLinkData dynamicLinkData) {
    }
}

