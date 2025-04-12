/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.converter;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.logs.AffiseLog;
import com.affise.attribution.logs.AffiseLog$NetworkLog;
import com.affise.attribution.logs.SerializedLog;
import com.affise.attribution.utils.TimestampKt;
import com.affise.attribution.utils.UUIDKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class LogToSerializedLogConverter
implements Converter {
    public SerializedLog convert(AffiseLog object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "from");
        String string2 = UUIDKt.generateUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "generateUUID().toString()");
        String string3 = ((AffiseLog)object).getName().getType();
        boolean bl2 = object instanceof AffiseLog$NetworkLog;
        if (bl2) {
            object2 = object;
            object2 = ((AffiseLog$NetworkLog)object).getJsonObject();
        } else {
            object2 = ((AffiseLog)object).getValue();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(string3, object2);
        string3 = new JSONObject();
        string3.put("affise_sdkevent_id", (Object)string2);
        string3.put("affise_sdkevent_name", (Object)"affise_event_sdklog");
        long l2 = TimestampKt.timestamp();
        string3.put("affise_sdkevent_timestamp", l2);
        string3.put("affise_sdkevent_parameters", (Object)jSONObject);
        object = ((AffiseLog)object).getName().getType();
        object2 = new SerializedLog(string2, (String)object, (JSONObject)string3);
        return object2;
    }
}

