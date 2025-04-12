/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment$Builder;

final class AutoValue_RolloutAssignment$Builder
extends RolloutAssignment$Builder {
    private String parameterKey;
    private String parameterValue;
    private String rolloutId;
    private byte set$0;
    private long templateVersion;
    private String variantId;

    public RolloutAssignment build() {
        Object object;
        byte by2;
        Object object2;
        int n3 = this.set$0;
        int n4 = 1;
        if (n3 == n4 && (object2 = this.rolloutId) != null && (object2 = this.variantId) != null && (object2 = this.parameterKey) != null && (object2 = this.parameterValue) != null) {
            String string2 = this.rolloutId;
            String string3 = this.variantId;
            String string4 = this.parameterKey;
            String string5 = this.parameterValue;
            long l2 = this.templateVersion;
            Object object3 = object2;
            object2 = new AutoValue_RolloutAssignment(string2, string3, string4, string5, l2, null);
            return object2;
        }
        object2 = new StringBuilder();
        String string6 = this.rolloutId;
        if (string6 == null) {
            string6 = " rolloutId";
            ((StringBuilder)object2).append(string6);
        }
        if ((string6 = this.variantId) == null) {
            string6 = " variantId";
            ((StringBuilder)object2).append(string6);
        }
        if ((string6 = this.parameterKey) == null) {
            string6 = " parameterKey";
            ((StringBuilder)object2).append(string6);
        }
        if ((string6 = this.parameterValue) == null) {
            string6 = " parameterValue";
            ((StringBuilder)object2).append(string6);
        }
        if ((n4 &= (by2 = this.set$0)) == 0) {
            object = " templateVersion";
            ((StringBuilder)object2).append((String)object);
        }
        object2 = Gs.a("Missing required properties:", (StringBuilder)object2);
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public RolloutAssignment$Builder setParameterKey(String object) {
        if (object != null) {
            this.parameterKey = object;
            return this;
        }
        object = new NullPointerException("Null parameterKey");
        throw object;
    }

    public RolloutAssignment$Builder setParameterValue(String object) {
        if (object != null) {
            this.parameterValue = object;
            return this;
        }
        object = new NullPointerException("Null parameterValue");
        throw object;
    }

    public RolloutAssignment$Builder setRolloutId(String object) {
        if (object != null) {
            this.rolloutId = object;
            return this;
        }
        object = new NullPointerException("Null rolloutId");
        throw object;
    }

    public RolloutAssignment$Builder setTemplateVersion(long l2) {
        byte by2;
        this.templateVersion = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 1);
        return this;
    }

    public RolloutAssignment$Builder setVariantId(String object) {
        if (object != null) {
            this.variantId = object;
            return this;
        }
        object = new NullPointerException("Null variantId");
        throw object;
    }
}

