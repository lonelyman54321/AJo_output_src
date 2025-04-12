/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.events;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class SerializedEvent {
    private final JSONObject data;
    private final String id;

    public SerializedEvent(String string2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(string2, "id");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        this.id = string2;
        this.data = jSONObject;
    }

    public static /* synthetic */ SerializedEvent copy$default(SerializedEvent serializedEvent, String string2, JSONObject jSONObject, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = serializedEvent.id;
        }
        if ((n3 &= 2) != 0) {
            jSONObject = serializedEvent.data;
        }
        return serializedEvent.copy(string2, jSONObject);
    }

    public final String component1() {
        return this.id;
    }

    public final JSONObject component2() {
        return this.data;
    }

    public final SerializedEvent copy(String string2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(string2, "id");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        SerializedEvent serializedEvent = new SerializedEvent(string2, jSONObject);
        return serializedEvent;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SerializedEvent;
        if (!bl3) {
            return false;
        }
        object = (SerializedEvent)object;
        String string2 = this.id;
        String string3 = ((SerializedEvent)object).id;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.data;
        object = ((SerializedEvent)object).data;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final JSONObject getData() {
        return this.data;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int n3 = this.id.hashCode() * 31;
        return this.data.hashCode() + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SerializedEvent(id=");
        String string2 = this.id;
        stringBuilder.append(string2);
        stringBuilder.append(", data=");
        string2 = this.data;
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

