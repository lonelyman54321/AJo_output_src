/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant
extends CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant {
    private final String rolloutId;
    private final String variantId;

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(String string2, String string3) {
        this.rolloutId = string2;
        this.variantId = string3;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(String string2, String string3, AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$1 autoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$1) {
        this(string2, string3);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;
        if (bl3) {
            boolean bl4;
            String string2 = this.rolloutId;
            String string3 = ((CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant)(object = (CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant)object)).getRolloutId();
            bl3 = string2.equals(string3);
            if (!bl3 || !(bl4 = (string2 = this.variantId).equals(object = ((CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant)object).getVariantId()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getRolloutId() {
        return this.rolloutId;
    }

    public String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        int n3 = this.rolloutId.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        n4 = this.variantId.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RolloutVariant{rolloutId=");
        String string2 = this.rolloutId;
        stringBuilder.append(string2);
        stringBuilder.append(", variantId=");
        string2 = this.variantId;
        return h30_0.a(stringBuilder, string2, "}");
    }
}

