/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.subscription;

import com.affise.attribution.events.subscription.SubscriptionSubType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubscriptionSubType$Companion {
    private SubscriptionSubType$Companion() {
    }

    public /* synthetic */ SubscriptionSubType$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final SubscriptionSubType from(String string2) {
        SubscriptionSubType subscriptionSubType = null;
        if (string2 != null) {
            for (SubscriptionSubType subscriptionSubType2 : SubscriptionSubType.values()) {
                String string3 = subscriptionSubType2.getTypeName();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                subscriptionSubType = subscriptionSubType2;
                break;
            }
        }
        return subscriptionSubType;
    }
}

