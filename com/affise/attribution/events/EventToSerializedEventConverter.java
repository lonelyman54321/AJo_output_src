/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.events;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.events.Event;
import com.affise.attribution.events.SerializedEvent;
import com.affise.attribution.usecase.IndexUseCase;
import com.affise.attribution.utils.TimestampKt;
import com.affise.attribution.utils.UUIDKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class EventToSerializedEventConverter
implements Converter {
    private final IndexUseCase indexUseCase;

    public EventToSerializedEventConverter(IndexUseCase indexUseCase2) {
        Intrinsics.checkNotNullParameter(indexUseCase2, "indexUseCase");
        this.indexUseCase = indexUseCase2;
    }

    public SerializedEvent convert(Event object) {
        Intrinsics.checkNotNullParameter(object, "from");
        String string2 = UUIDKt.generateUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "generateUUID().toString()");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("affise_event_id", (Object)string2);
        String string3 = ((Event)object).getName();
        jSONObject.put("affise_event_name", (Object)string3);
        String string4 = ((Event)object).getCategory();
        jSONObject.put("affise_event_category", (Object)string4);
        long l2 = TimestampKt.timestamp();
        jSONObject.put("affise_event_timestamp", l2);
        long l3 = this.indexUseCase.getAffiseEventIdIndex();
        jSONObject.put("affise_event_id_index", l3);
        boolean bl2 = ((Event)object).isFirstForUser();
        jSONObject.put("affise_event_first_for_user", bl2);
        string4 = ((Event)object).getUserData();
        jSONObject.put("affise_event_user_data", (Object)string4);
        string4 = ((Event)object).serialize();
        jSONObject.put("affise_event_data", (Object)string4);
        object = ((Event)object).getPredefinedParameters$attribution_release();
        string3 = new JSONObject((Map)object);
        jSONObject.put("affise_parameters", (Object)string3);
        object = new SerializedEvent(string2, jSONObject);
        return object;
    }
}

