/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.custom;

import com.affise.attribution.events.NativeEvent;
import com.affise.attribution.utils.TimestampKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class UserCustomEvent
extends NativeEvent {
    private final String eventName;
    private final long timeStampMillis;
    private final String userData;

    public UserCustomEvent(String string2, String string3, long l2) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        super(string3, l2);
        this.eventName = string2;
        this.userData = string3;
        this.timeStampMillis = l2;
    }

    public /* synthetic */ UserCustomEvent(String string2, String string3, long l2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            l2 = TimestampKt.timestamp();
        }
        this(string2, string3, l2);
    }

    public String getName() {
        return this.eventName;
    }
}

