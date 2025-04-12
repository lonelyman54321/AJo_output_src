/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.internal;

import com.affise.attribution.Affise;
import com.affise.attribution.events.property.AffisePropertyBuilder;
import com.affise.attribution.internal.InternalEventName;
import com.affise.attribution.internal.property.InternalProperty;
import com.affise.attribution.utils.TimestampKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public abstract class InternalEvent {
    private final AffisePropertyBuilder serializeBuilder;

    public InternalEvent() {
        AffisePropertyBuilder affisePropertyBuilder;
        this.serializeBuilder = affisePropertyBuilder = new AffisePropertyBuilder();
    }

    public final InternalEvent addProperty(InternalProperty object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "property");
        AffisePropertyBuilder affisePropertyBuilder = this.serializeBuilder;
        object = object.getType();
        affisePropertyBuilder.addRaw((String)object, object2);
        return this;
    }

    public final InternalEvent addPropertyRaw(String string2, Object object) {
        Intrinsics.checkNotNullParameter(string2, "property");
        this.serializeBuilder.addRaw(string2, object);
        return this;
    }

    public abstract InternalEventName getName();

    public final long getTimestamp() {
        return TimestampKt.timestamp();
    }

    public final void send() {
        Affise.sendInternalEvent$attribution_release(this);
    }

    public final JSONObject serialize() {
        return this.serializeBuilder().build();
    }

    public AffisePropertyBuilder serializeBuilder() {
        return this.serializeBuilder;
    }
}

