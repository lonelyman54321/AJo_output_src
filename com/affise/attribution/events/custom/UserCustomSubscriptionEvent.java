/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.events.custom;

import com.affise.attribution.events.subscription.BaseSubscriptionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class UserCustomSubscriptionEvent
extends BaseSubscriptionEvent {
    private final String subtype;
    private final String type;

    public UserCustomSubscriptionEvent(String string2, String string3, JSONObject jSONObject, String string4) {
        Intrinsics.checkNotNullParameter(string2, "type");
        Intrinsics.checkNotNullParameter(string3, "subtype");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        super(jSONObject, string4);
        this.type = string2;
        this.subtype = string3;
    }

    public /* synthetic */ UserCustomSubscriptionEvent(String string2, String string3, JSONObject jSONObject, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 8) != 0) {
            string4 = null;
        }
        this(string2, string3, jSONObject, string4);
    }

    public String getSubtype() {
        return this.subtype;
    }

    public String getType() {
        return this.type;
    }
}

