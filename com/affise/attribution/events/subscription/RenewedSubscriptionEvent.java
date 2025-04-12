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

public final class RenewedSubscriptionEvent
extends BaseSubscriptionEvent {
    private final String subtype;
    private final String type;

    public RenewedSubscriptionEvent() {
        this(null, null, 3, null);
    }

    public RenewedSubscriptionEvent(JSONObject jSONObject) {
        this(jSONObject, null, 2, null);
    }

    public RenewedSubscriptionEvent(JSONObject object, String string2) {
        super((JSONObject)object, string2);
        object = SubscriptionEventName.AFFISE_SUBSCRIPTION_RENEWAL.getEventName();
        this.type = object;
        object = SubscriptionSubType.AFFISE_SUB_RENEWED_SUBSCRIPTION.getTypeName();
        this.subtype = object;
    }

    public /* synthetic */ RenewedSubscriptionEvent(JSONObject jSONObject, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
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

