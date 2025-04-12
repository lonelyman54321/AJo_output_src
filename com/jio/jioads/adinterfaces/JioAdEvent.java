/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.AdMetaData;
import com.jio.jioads.adinterfaces.JioAdEvent$AdEventType;
import kotlin.jvm.internal.Intrinsics;

public final class JioAdEvent {
    public final JioAdEvent$AdEventType a;

    public JioAdEvent(JioAdEvent$AdEventType jioAdEvent$AdEventType) {
        Intrinsics.checkNotNullParameter((Object)jioAdEvent$AdEventType, "mEvent");
        this.a = jioAdEvent$AdEventType;
    }

    public final AdMetaData getAdMetaData() {
        return null;
    }

    public final JioAdEvent$AdEventType getMEvent() {
        return this.a;
    }

    public final JioAdEvent$AdEventType getType() {
        return this.a;
    }
}

