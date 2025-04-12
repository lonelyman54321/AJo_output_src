/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.events.subscription;

import com.affise.attribution.events.subscription.BaseSubscriptionEvent;
import com.affise.attribution.events.subscription.SubscriptionEventName;
import com.affise.attribution.events.subscription.SubscriptionSubType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

public final class FailedOfferFromRetryEvent
extends BaseSubscriptionEvent {
    private final String subtype;
    private final String type;

    public FailedOfferFromRetryEvent() {
        this(null, null, 3, null);
    }

    public FailedOfferFromRetryEvent(JSONObject jSONObject) {
        this(jSONObject, null, 2, null);
    }

    public FailedOfferFromRetryEvent(JSONObject object, String string2) {
        super((JSONObject)object, string2);
        object = SubscriptionEventName.AFFISE_SUBSCRIPTION_CANCELLATION.getEventName();
        this.type = object;
        object = SubscriptionSubType.AFFISE_SUB_FAILED_OFFER_FROM_RETRY.getTypeName();
        this.subtype = object;
    }

    public /* synthetic */ FailedOfferFromRetryEvent(JSONObject jSONObject, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            jSONObject = null;
        }
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(jSONObject, string2);
    }

    public String getSubtype() {
        return this.subtype;
    }

    public String getType() {
        return this.type;
    }
}

