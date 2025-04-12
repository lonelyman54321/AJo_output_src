/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;

public abstract class RolloutAssignment$Builder {
    public abstract RolloutAssignment build();

    public abstract RolloutAssignment$Builder setParameterKey(String var1);

    public abstract RolloutAssignment$Builder setParameterValue(String var1);

    public abstract RolloutAssignment$Builder setRolloutId(String var1);

    public abstract RolloutAssignment$Builder setTemplateVersion(long var1);

    public abstract RolloutAssignment$Builder setVariantId(String var1);
}

