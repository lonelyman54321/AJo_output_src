/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IInterface
 */
package com.google.firebase.dynamiclinks.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;

public interface IDynamicLinksService
extends IInterface {
    public static final String DESCRIPTOR = "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";

    public void createShortDynamicLink(IDynamicLinksCallbacks var1, Bundle var2);

    public void getDynamicLink(IDynamicLinksCallbacks var1, String var2);
}

