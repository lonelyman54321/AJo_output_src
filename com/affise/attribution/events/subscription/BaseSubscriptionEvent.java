/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.events.subscription;

import com.affise.attribution.events.NativeEvent;
import com.affise.attribution.events.property.AffisePropertyBuilder;
import com.affise.attribution.utils.TimestampKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public abstract class BaseSubscriptionEvent
extends NativeEvent {
    private final JSONObject data;
    private final String userData;

    public BaseSubscriptionEvent(JSONObject jSONObject, String string2) {
        long l2 = TimestampKt.timestamp();
        super(string2, l2);
        this.data = jSONObject;
        this.userData = string2;
    }

    public /* synthetic */ BaseSubscriptionEvent(JSONObject jSONObject, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(jSONObject, string2);
    }

    public String getName() {
        return this.getType();
    }

    public abstract String getSubtype();

    public abstract String getType();

    public AffisePropertyBuilder serializeBuilder() {
        AffisePropertyBuilder affisePropertyBuilder = super.serializeBuilder();
        Object object = this.getSubtype();
        affisePropertyBuilder = affisePropertyBuilder.addRaw("affise_event_type", object);
        JSONObject jSONObject = this.data;
        if (jSONObject != null) {
            boolean bl2;
            object = jSONObject.keys();
            String string2 = "it.keys()";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            while (bl2 = object.hasNext()) {
                string2 = (String)object.next();
                Intrinsics.checkNotNullExpressionValue(string2, "key");
                Object object2 = jSONObject.get(string2);
                affisePropertyBuilder.addRaw(string2, object2);
            }
        }
        return affisePropertyBuilder;
    }
}

