/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.internal;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.events.SerializedEvent;
import com.affise.attribution.internal.InternalEvent;
import com.affise.attribution.utils.UUIDKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class InternalEventToSerializedEventConverter
implements Converter {
    public SerializedEvent convert(InternalEvent object) {
        Intrinsics.checkNotNullParameter(object, "from");
        String string2 = UUIDKt.generateUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "generateUUID().toString()");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("internal_event_id", (Object)string2);
        String string3 = ((InternalEvent)object).getName().getEventName();
        jSONObject.put("internal_event_name", (Object)string3);
        long l2 = ((InternalEvent)object).getTimestamp();
        jSONObject.put("internal_event_timestamp", l2);
        object = ((InternalEvent)object).serialize();
        jSONObject.put("internal_event_data", object);
        object = new SerializedEvent(string2, jSONObject);
        return object;
    }
}

