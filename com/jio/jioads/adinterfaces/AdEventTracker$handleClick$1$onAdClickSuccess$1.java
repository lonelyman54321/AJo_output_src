/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.AdEventTracker;
import java.util.List;

public final class AdEventTracker$handleClick$1$onAdClickSuccess$1
extends Thread {
    public final /* synthetic */ AdEventTracker a;
    public final /* synthetic */ List b;

    public AdEventTracker$handleClick$1$onAdClickSuccess$1(AdEventTracker adEventTracker, List list) {
        this.a = adEventTracker;
        this.b = list;
    }

    public final void run() {
        List list = this.b;
        AdEventTracker.access$fireEvent(this.a, "Click", list);
    }
}

