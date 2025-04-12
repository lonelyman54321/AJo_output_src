/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.affise.attribution.events.autoCatchingClick;

import com.affise.attribution.converter.StringToSHA1Converter;
import com.affise.attribution.events.Event;
import com.affise.attribution.events.autoCatchingClick.AutoCatchingClickData;
import com.affise.attribution.utils.TimestampKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AutoCatchingClickEvent
extends Event {
    private final String activityName;
    private final List data;
    private final boolean isGroup;
    private final long timeStampMillis;

    public AutoCatchingClickEvent(boolean bl2, List list, String string2, long l2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(string2, "activityName");
        this.isGroup = bl2;
        this.data = list;
        this.activityName = string2;
        this.timeStampMillis = l2;
    }

    public /* synthetic */ AutoCatchingClickEvent(boolean bl2, List list, String string2, long l2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 8) != 0) {
            l2 = TimestampKt.timestamp();
        }
        this(bl2, list, string2, l2);
    }

    private final String getEventSha1() {
        boolean bl2;
        StringToSHA1Converter stringToSHA1Converter2 = new StringToSHA1Converter();
        Object object = this.data;
        CharSequence charSequence = this.activityName;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (AutoCatchingClickData)object.next();
            charSequence = Ex0.a((String)charSequence);
            if ((object2 = ((AutoCatchingClickData)object2).getId()) == null) {
                object2 = "";
            }
            ((StringBuilder)charSequence).append((String)object2);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return stringToSHA1Converter2.convert((String)charSequence);
    }

    public String getCategory() {
        return "autoNative";
    }

    public String getName() {
        StringBuilder stringBuilder = new StringBuilder("AutoCatchingClickEvent_");
        String string2 = this.getEventSha1();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public String getUserData() {
        return "Auto generate even on click";
    }

    public JSONObject serialize() {
        Object object;
        boolean bl2;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator iterator = ((Iterable)this.data).iterator();
        while (bl2 = iterator.hasNext()) {
            object = (AutoCatchingClickData)iterator.next();
            JSONObject jSONObject2 = new JSONObject();
            String string2 = ((AutoCatchingClickData)object).getId();
            Object object2 = "";
            if (string2 == null) {
                string2 = object2;
            }
            String string3 = "id";
            jSONObject2.put(string3, (Object)string2);
            string2 = ((AutoCatchingClickData)object).getTag();
            if (string2 == null) {
                string2 = object2;
            }
            string3 = "tag";
            jSONObject2.put(string3, (Object)string2);
            string2 = ((AutoCatchingClickData)object).getText();
            if (string2 == null) {
                string2 = object2;
            }
            string3 = "text";
            jSONObject2.put(string3, (Object)string2);
            object = ((AutoCatchingClickData)object).getTypeView();
            if (object != null) {
                object2 = object;
            }
            object = "view";
            jSONObject2.put((String)object, object2);
            jSONArray.put((Object)jSONObject2);
        }
        bl2 = this.isGroup;
        jSONObject.put("affise_event_auto_catching_group", bl2);
        object = this.activityName;
        jSONObject.put("affise_event_auto_catching_activity", object);
        jSONObject.put("affise_event_auto_catching_click", (Object)jSONArray);
        long l2 = this.timeStampMillis;
        jSONObject.put("affise_event_auto_catching_click_timestamp", l2);
        return jSONObject;
    }
}

