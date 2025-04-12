/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute$Builder;

final class AutoValue_CrashlyticsReport_CustomAttribute$Builder
extends CrashlyticsReport$CustomAttribute$Builder {
    private String key;
    private String value;

    public CrashlyticsReport$CustomAttribute build() {
        Object object;
        CharSequence charSequence = this.key;
        if (charSequence != null && (object = this.value) != null) {
            AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute = new AutoValue_CrashlyticsReport_CustomAttribute((String)charSequence, (String)object, null);
            return autoValue_CrashlyticsReport_CustomAttribute;
        }
        charSequence = new StringBuilder();
        object = this.key;
        if (object == null) {
            object = " key";
            ((StringBuilder)charSequence).append((String)object);
        }
        if ((object = this.value) == null) {
            object = " value";
            ((StringBuilder)charSequence).append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", (StringBuilder)charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$CustomAttribute$Builder setKey(String object) {
        if (object != null) {
            this.key = object;
            return this;
        }
        object = new NullPointerException("Null key");
        throw object;
    }

    public CrashlyticsReport$CustomAttribute$Builder setValue(String object) {
        if (object != null) {
            this.value = object;
            return this;
        }
        object = new NullPointerException("Null value");
        throw object;
    }
}

