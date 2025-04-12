/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutAssignment$1;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;

final class AutoValue_RolloutAssignment
extends RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final String rolloutId;
    private final long templateVersion;
    private final String variantId;

    private AutoValue_RolloutAssignment(String string2, String string3, String string4, String string5, long l2) {
        this.rolloutId = string2;
        this.variantId = string3;
        this.parameterKey = string4;
        this.parameterValue = string5;
        this.templateVersion = l2;
    }

    public /* synthetic */ AutoValue_RolloutAssignment(String string2, String string3, String string4, String string5, long l2, AutoValue_RolloutAssignment$1 autoValue_RolloutAssignment$1) {
        this(string2, string3, string4, string5, l2);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof RolloutAssignment;
        if (bl3) {
            long l2;
            long l3;
            long l4;
            long l7;
            String string2 = this.rolloutId;
            String string3 = ((RolloutAssignment)(object = (RolloutAssignment)object)).getRolloutId();
            bl3 = string2.equals(string3);
            if (!(bl3 && (bl3 = (string2 = this.variantId).equals(string3 = ((RolloutAssignment)object).getVariantId())) && (bl3 = (string2 = this.parameterKey).equals(string3 = ((RolloutAssignment)object).getParameterKey())) && (bl3 = (string2 = this.parameterValue).equals(string3 = ((RolloutAssignment)object).getParameterValue())) && (l7 = (l4 = (l3 = this.templateVersion) - (l2 = ((RolloutAssignment)object).getTemplateVersion())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getParameterKey() {
        return this.parameterKey;
    }

    public String getParameterValue() {
        return this.parameterValue;
    }

    public String getRolloutId() {
        return this.rolloutId;
    }

    public long getTemplateVersion() {
        return this.templateVersion;
    }

    public String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        int n3 = this.rolloutId.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.variantId.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.parameterKey.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.parameterValue.hashCode();
        n3 = (n3 ^ n7) * n4;
        long l2 = this.templateVersion;
        long l3 = l2 >>> 32;
        n7 = (int)(l2 ^ l3);
        return n3 ^ n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RolloutAssignment{rolloutId=");
        String string2 = this.rolloutId;
        stringBuilder.append(string2);
        stringBuilder.append(", variantId=");
        string2 = this.variantId;
        stringBuilder.append(string2);
        stringBuilder.append(", parameterKey=");
        string2 = this.parameterKey;
        stringBuilder.append(string2);
        stringBuilder.append(", parameterValue=");
        string2 = this.parameterValue;
        stringBuilder.append(string2);
        stringBuilder.append(", templateVersion=");
        long l2 = this.templateVersion;
        return jl0_0.b(stringBuilder, l2, "}");
    }
}

