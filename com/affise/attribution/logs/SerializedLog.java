/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.logs;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class SerializedLog {
    private final JSONObject data;
    private final String id;
    private final String type;

    public SerializedLog(String string2, String string3, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(string2, "id");
        Intrinsics.checkNotNullParameter(string3, "type");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        this.id = string2;
        this.type = string3;
        this.data = jSONObject;
    }

    public static /* synthetic */ SerializedLog copy$default(SerializedLog serializedLog, String string2, String string3, JSONObject jSONObject, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = serializedLog.id;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = serializedLog.type;
        }
        if ((n3 &= 4) != 0) {
            jSONObject = serializedLog.data;
        }
        return serializedLog.copy(string2, string3, jSONObject);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final JSONObject component3() {
        return this.data;
    }

    public final SerializedLog copy(String string2, String string3, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(string2, "id");
        Intrinsics.checkNotNullParameter(string3, "type");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        SerializedLog serializedLog = new SerializedLog(string2, string3, jSONObject);
        return serializedLog;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SerializedLog;
        if (!bl3) {
            return false;
        }
        object = (SerializedLog)object;
        String string2 = this.id;
        String string3 = ((SerializedLog)object).id;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.type;
        string3 = ((SerializedLog)object).type;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.data;
        object = ((SerializedLog)object).data;
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

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3 = this.id.hashCode() * 31;
        String string2 = this.type;
        n3 = zy_2.b(n3, 31, string2);
        return this.data.hashCode() + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SerializedLog(id=");
        String string2 = this.id;
        stringBuilder.append(string2);
        stringBuilder.append(", type=");
        string2 = this.type;
        stringBuilder.append(string2);
        stringBuilder.append(", data=");
        string2 = this.data;
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

