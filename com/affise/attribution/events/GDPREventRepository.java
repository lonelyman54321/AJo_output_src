/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  org.json.JSONObject
 */
package com.affise.attribution.events;

import android.content.SharedPreferences;
import com.affise.attribution.converter.Converter;
import com.affise.attribution.events.GDPREventRepository$Companion;
import com.affise.attribution.events.SerializedEvent;
import com.affise.attribution.events.predefined.GDPREvent;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class GDPREventRepository {
    public static final GDPREventRepository$Companion Companion;
    private static final String GDPR_EVENT_CONTENT_KEY = "com.affise.attribution.usecase.GDPR_EVENT.content";
    private static final String GDPR_EVENT_ID_KEY = "com.affise.attribution.usecase.GDPR_EVENT.id";
    private final Converter eventToSerializedEventConverter;
    private final SharedPreferences sharedPreferences;

    static {
        GDPREventRepository$Companion gDPREventRepository$Companion;
        Companion = gDPREventRepository$Companion = new GDPREventRepository$Companion(null);
    }

    public GDPREventRepository(SharedPreferences sharedPreferences2, Converter converter) {
        Intrinsics.checkNotNullParameter(sharedPreferences2, "sharedPreferences");
        Intrinsics.checkNotNullParameter(converter, "eventToSerializedEventConverter");
        this.sharedPreferences = sharedPreferences2;
        this.eventToSerializedEventConverter = converter;
    }

    public final void clear() {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.remove(GDPR_EVENT_ID_KEY);
        editor.remove(GDPR_EVENT_CONTENT_KEY);
        editor.commit();
    }

    public final SerializedEvent getEvent() {
        Object object = this.sharedPreferences;
        String string2 = GDPR_EVENT_ID_KEY;
        SerializedEvent serializedEvent = null;
        if ((object = object.getString(string2, null)) == null) {
            return null;
        }
        string2 = this.sharedPreferences;
        String string3 = GDPR_EVENT_CONTENT_KEY;
        if ((string2 = string2.getString(string3, null)) == null) {
            return null;
        }
        string3 = new JSONObject(string2);
        serializedEvent = new SerializedEvent((String)object, (JSONObject)string3);
        return serializedEvent;
    }

    public final void setEvent(GDPREvent object) {
        Intrinsics.checkNotNullParameter(object, "event");
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        object = (SerializedEvent)this.eventToSerializedEventConverter.convert(object);
        String string2 = ((SerializedEvent)object).getId();
        editor.putString(GDPR_EVENT_ID_KEY, string2);
        object = ((SerializedEvent)object).getData().toString();
        editor.putString(GDPR_EVENT_CONTENT_KEY, (String)object);
        editor.commit();
    }
}

