/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute;

final class AutoValue_CrashlyticsReport_CustomAttribute
extends CrashlyticsReport$CustomAttribute {
    private final String key;
    private final String value;

    private AutoValue_CrashlyticsReport_CustomAttribute(String string2, String string3) {
        this.key = string2;
        this.value = string3;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_CustomAttribute(String string2, String string3, AutoValue_CrashlyticsReport_CustomAttribute$1 autoValue_CrashlyticsReport_CustomAttribute$1) {
        this(string2, string3);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof CrashlyticsReport$CustomAttribute;
        if (bl3) {
            boolean bl4;
            String string2 = this.key;
            String string3 = ((CrashlyticsReport$CustomAttribute)(object = (CrashlyticsReport$CustomAttribute)object)).getKey();
            bl3 = string2.equals(string3);
            if (!bl3 || !(bl4 = (string2 = this.value).equals(object = ((CrashlyticsReport$CustomAttribute)object).getValue()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3 = this.key.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        n4 = this.value.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CustomAttribute{key=");
        String string2 = this.key;
        stringBuilder.append(string2);
        stringBuilder.append(", value=");
        string2 = this.value;
        return h30_0.a(stringBuilder, string2, "}");
    }
}

