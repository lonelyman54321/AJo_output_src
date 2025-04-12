/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 */
package com.google.firebase.dynamiclinks.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;

public interface IDynamicLinksCallbacks
extends IInterface {
    public static final String DESCRIPTOR = "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks";

    public void onCreateShortDynamicLink(Status var1, ShortDynamicLinkImpl var2);

    public void onGetDynamicLink(Status var1, DynamicLinkData var2);
}

