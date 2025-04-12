/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.predefined;

import com.affise.attribution.events.EventName;
import com.affise.attribution.events.NativeEvent;
import com.affise.attribution.utils.TimestampKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PurchaseEvent
extends NativeEvent {
    private final long timeStampMillis;
    private final String userData;

    public PurchaseEvent() {
        this(null, 0L, 3, null);
    }

    public PurchaseEvent(String string2) {
        this(string2, 0L, 2, null);
    }

    public PurchaseEvent(String string2, long l2) {
        super(string2, l2);
        this.userData = string2;
        this.timeStampMillis = l2;
    }

    public /* synthetic */ PurchaseEvent(String string2, long l2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            l2 = TimestampKt.timestamp();
        }
        this(string2, l2);
    }

    public String getName() {
        return EventName.PURCHASE.getEventName();
    }
}

