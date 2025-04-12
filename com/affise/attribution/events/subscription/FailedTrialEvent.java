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
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class FailedTrialEvent
extends BaseSubscriptionEvent {
    private final String subtype;
    private final String type;

    public FailedTrialEvent(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        this(jSONObject, null, 2, null);
    }

    public FailedTrialEvent(JSONObject object, String string2) {
        Intrinsics.checkNotNullParameter(object, "data");
        super((JSONObject)object, string2);
        object = SubscriptionEventName.AFFISE_SUBSCRIPTION_CANCELLATION.getEventName();
        this.type = object;
        object = SubscriptionSubType.AFFISE_SUB_FAILED_TRIAL.getTypeName();
        this.subtype = object;
    }

    public /* synthetic */ FailedTrialEvent(JSONObject jSONObject, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
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

