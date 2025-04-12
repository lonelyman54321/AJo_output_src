/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.events;

import com.affise.attribution.events.Event;
import com.affise.attribution.events.property.AffiseProperty;
import com.affise.attribution.events.property.AffisePropertyBuilder;
import com.affise.attribution.utils.TimestampKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

public abstract class NativeEvent
extends Event {
    private final long timeStampMillis;
    private final String userData;

    public NativeEvent() {
        this(null, 0L, 3, null);
    }

    public NativeEvent(String string2, long l2) {
        this.userData = string2;
        this.timeStampMillis = l2;
    }

    public /* synthetic */ NativeEvent(String string2, long l2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            l2 = TimestampKt.timestamp();
        }
        this(string2, l2);
    }

    public String getCategory() {
        return "native";
    }

    public String getUserData() {
        return this.userData;
    }

    public JSONObject serialize() {
        return this.serializeBuilder().build();
    }

    public AffisePropertyBuilder serializeBuilder() {
        AffisePropertyBuilder affisePropertyBuilder = new AffisePropertyBuilder();
        Object object = this.getName();
        affisePropertyBuilder = affisePropertyBuilder.init((String)object);
        object = AffiseProperty.TIMESTAMP;
        Long l2 = this.timeStampMillis;
        return affisePropertyBuilder.add((AffiseProperty)((Object)object), (Object)l2);
    }
}

