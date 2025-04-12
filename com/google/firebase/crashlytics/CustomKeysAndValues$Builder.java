/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.CustomKeysAndValues;
import java.util.HashMap;
import java.util.Map;

public class CustomKeysAndValues$Builder {
    private Map keysAndValues;

    public CustomKeysAndValues$Builder() {
        HashMap hashMap;
        this.keysAndValues = hashMap = new HashMap();
    }

    public static /* synthetic */ Map access$000(CustomKeysAndValues$Builder customKeysAndValues$Builder) {
        return customKeysAndValues$Builder.keysAndValues;
    }

    public CustomKeysAndValues build() {
        CustomKeysAndValues customKeysAndValues = new CustomKeysAndValues(this);
        return customKeysAndValues;
    }

    public CustomKeysAndValues$Builder putBoolean(String string2, boolean bl2) {
        Map map2 = this.keysAndValues;
        String string3 = Boolean.toString(bl2);
        map2.put(string2, string3);
        return this;
    }

    public CustomKeysAndValues$Builder putDouble(String string2, double d2) {
        Map map2 = this.keysAndValues;
        String string3 = Double.toString(d2);
        map2.put(string2, string3);
        return this;
    }

    public CustomKeysAndValues$Builder putFloat(String string2, float f5) {
        Map map2 = this.keysAndValues;
        String string3 = Float.toString(f5);
        map2.put(string2, string3);
        return this;
    }

    public CustomKeysAndValues$Builder putInt(String string2, int n3) {
        Map map2 = this.keysAndValues;
        String string3 = Integer.toString(n3);
        map2.put(string2, string3);
        return this;
    }

    public CustomKeysAndValues$Builder putLong(String string2, long l2) {
        Map map2 = this.keysAndValues;
        String string3 = Long.toString(l2);
        map2.put(string2, string3);
        return this;
    }

    public CustomKeysAndValues$Builder putString(String string2, String string3) {
        this.keysAndValues.put(string2, string3);
        return this;
    }
}

