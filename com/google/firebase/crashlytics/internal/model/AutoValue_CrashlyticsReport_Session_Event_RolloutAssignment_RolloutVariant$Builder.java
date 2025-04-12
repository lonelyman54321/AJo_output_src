/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$Builder
extends CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder {
    private String rolloutId;
    private String variantId;

    public CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant build() {
        Object object;
        CharSequence charSequence = this.rolloutId;
        if (charSequence != null && (object = this.variantId) != null) {
            AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant autoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant = new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant((String)charSequence, (String)object, null);
            return autoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant;
        }
        charSequence = new StringBuilder();
        object = this.rolloutId;
        if (object == null) {
            object = " rolloutId";
            ((StringBuilder)charSequence).append((String)object);
        }
        if ((object = this.variantId) == null) {
            object = " variantId";
            ((StringBuilder)charSequence).append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", (StringBuilder)charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder setRolloutId(String object) {
        if (object != null) {
            this.rolloutId = object;
            return this;
        }
        object = new NullPointerException("Null rolloutId");
        throw object;
    }

    public CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder setVariantId(String object) {
        if (object != null) {
            this.variantId = object;
            return this;
        }
        object = new NullPointerException("Null variantId");
        throw object;
    }
}

