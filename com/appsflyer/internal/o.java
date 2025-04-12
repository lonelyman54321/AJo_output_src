/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFf1iSDK;
import com.appsflyer.internal.AFj1sSDK;
import java.util.Observable;
import java.util.Observer;

public final class o
implements Observer {
    public final /* synthetic */ AFj1sSDK a;
    public final /* synthetic */ AFf1iSDK b;

    public /* synthetic */ o(AFj1sSDK aFj1sSDK, AFf1iSDK aFf1iSDK) {
        this.a = aFj1sSDK;
        this.b = aFf1iSDK;
    }

    public final void update(Observable observable, Object object) {
        AFj1sSDK aFj1sSDK = this.a;
        AFf1iSDK aFf1iSDK = this.b;
        AFf1iSDK.a(aFj1sSDK, aFf1iSDK, observable, object);
    }
}

