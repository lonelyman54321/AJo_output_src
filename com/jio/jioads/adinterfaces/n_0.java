/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.AdEventTracker;
import com.jio.jioads.adinterfaces.AdEventTracker$handleClick$1$onAdClickSuccess$1;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.jioreel.ssai.a;
import java.util.List;

/*
 * Renamed from com.jio.jioads.adinterfaces.n
 */
public final class n_0
implements a {
    public final /* synthetic */ AdEventTracker a;
    public final /* synthetic */ List b;

    public n_0(AdEventTracker adEventTracker, List list) {
        this.a = adEventTracker;
        this.b = list;
    }

    public final void a() {
        Object object;
        AdEventTracker adEventTracker = this.a;
        Object object2 = AdEventTracker.access$getMJioAdView$p(adEventTracker).getMAdState();
        if (object2 != (object = JioAdView$AdState.DESTROYED)) {
            object = this.b;
            object2 = new AdEventTracker$handleClick$1$onAdClickSuccess$1(adEventTracker, (List)object);
            ((Thread)object2).start();
        }
    }
}

