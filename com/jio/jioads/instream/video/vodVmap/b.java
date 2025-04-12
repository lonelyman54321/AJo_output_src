/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.video.vodVmap;

import com.jio.jioads.adinterfaces.JioAdEvent;
import com.jio.jioads.adinterfaces.JioAdEvent$AdEventType;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$JioVmapListener;
import com.jio.jioads.instream.video.vodVmap.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b
extends Lambda
implements Function0 {
    public final /* synthetic */ m c;

    public b(m m2) {
        this.c = m2;
        super(0);
    }

    public final Object invoke() {
        JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener = this.c.d;
        if (jioVmapAdsLoader$JioVmapListener != null) {
            Intrinsics.checkNotNull(jioVmapAdsLoader$JioVmapListener);
            JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.CONTENT_RESUME_REQUESTED;
            JioAdEvent jioAdEvent = new JioAdEvent(jioAdEvent$AdEventType);
            jioAdEvent$AdEventType = null;
            jioVmapAdsLoader$JioVmapListener.onJioVmapEvent(jioAdEvent, null);
        }
        return Unit.a;
    }
}

