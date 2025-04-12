/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.affise.attribution.events.property;

import com.affise.attribution.events.property.AffiseEventUtilsKt;
import com.affise.attribution.events.property.AffiseProperty;
import com.affise.attribution.utils.ToSnakeCaseKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AffisePropertyBuilder {
    private JSONObject json;
    private String name;

    public AffisePropertyBuilder() {
        JSONObject jSONObject;
        this.json = jSONObject = new JSONObject();
    }

    private final String eventName() {
        return AffiseEventUtilsKt.toAffiseEventProperty$default(this.name, null, 1, null);
    }

    private final String eventProperty(String string2) {
        return AffiseEventUtilsKt.toAffiseEventProperty(this.name, string2);
    }

    private final Object parseValue(Object jSONArray) {
        boolean bl2 = jSONArray instanceof List;
        if (bl2) {
            boolean bl3;
            JSONArray jSONArray2 = new JSONArray();
            jSONArray = ((Iterable)jSONArray).iterator();
            while (bl3 = jSONArray.hasNext()) {
                Object t3 = jSONArray.next();
                jSONArray2.put(t3);
            }
            jSONArray = jSONArray2;
        }
        return jSONArray;
    }

    public final AffisePropertyBuilder add(AffiseProperty object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "key");
        object = object.getType();
        return this.add((String)object, object2);
    }

    public final AffisePropertyBuilder add(String string2, Object object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "key");
        String string3 = this.name;
        if (string3 != null && !(bl2 = b.k(string3))) {
            string2 = this.eventProperty(string2);
            this.addRaw(string2, object);
        }
        return this;
    }

    public final AffisePropertyBuilder addRaw(String string2, Object object) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = b.k(string2) ^ true;
        if (bl2) {
            string3 = this.json;
            object = this.parseValue(object);
            string3.put(string2, object);
        }
        return this;
    }

    public final JSONObject build() {
        return this.json;
    }

    public final AffisePropertyBuilder init(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        this.name = string2 = ToSnakeCaseKt.toSnakeCase(string2);
        return this;
    }
}

