/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.subscription;

import com.affise.attribution.events.subscription.SubscriptionEventName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubscriptionEventName$Companion {
    private SubscriptionEventName$Companion() {
    }

    public /* synthetic */ SubscriptionEventName$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final SubscriptionEventName from(String string2) {
        SubscriptionEventName subscriptionEventName = null;
        if (string2 != null) {
            for (SubscriptionEventName subscriptionEventName2 : SubscriptionEventName.values()) {
                String string3 = subscriptionEventName2.getEventName();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                subscriptionEventName = subscriptionEventName2;
                break;
            }
        }
        return subscriptionEventName;
    }
}

