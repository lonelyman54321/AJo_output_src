/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.PredefinedFloat;
import com.affise.attribution.events.parameters.PredefinedLong;
import com.affise.attribution.events.parameters.PredefinedString;

public interface PredefinedSimple {
    public PredefinedSimple addPredefinedParameter(PredefinedFloat var1, float var2);

    public PredefinedSimple addPredefinedParameter(PredefinedLong var1, long var2);

    public PredefinedSimple addPredefinedParameter(PredefinedString var1, String var2);
}

