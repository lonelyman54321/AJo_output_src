/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.PredefinedFloat;
import com.affise.attribution.events.parameters.PredefinedGroup$Companion;
import com.affise.attribution.events.parameters.PredefinedLong;
import com.affise.attribution.events.parameters.PredefinedSimple;
import com.affise.attribution.events.parameters.PredefinedString;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class PredefinedGroup
implements PredefinedSimple {
    public static final PredefinedGroup$Companion Companion;
    public static final String NAME = "affise_p_list_group";
    private final Map predefinedParameters;

    static {
        PredefinedGroup$Companion predefinedGroup$Companion;
        Companion = predefinedGroup$Companion = new PredefinedGroup$Companion(null);
    }

    public PredefinedGroup() {
        LinkedHashMap linkedHashMap;
        this.predefinedParameters = linkedHashMap = new LinkedHashMap();
    }

    public PredefinedGroup addPredefinedParameter(PredefinedFloat object, float f5) {
        Intrinsics.checkNotNullParameter(object, "parameter");
        Float f6 = Float.valueOf(f5);
        Map map2 = this.predefinedParameters;
        object = ((PredefinedFloat)object).value();
        map2.put(object, f6);
        return this;
    }

    public PredefinedGroup addPredefinedParameter(PredefinedLong object, long l2) {
        Intrinsics.checkNotNullParameter(object, "parameter");
        Long l3 = l2;
        Map map2 = this.predefinedParameters;
        object = ((PredefinedLong)object).value();
        map2.put(object, l3);
        return this;
    }

    public PredefinedGroup addPredefinedParameter(PredefinedString object, String string2) {
        Intrinsics.checkNotNullParameter(object, "parameter");
        Intrinsics.checkNotNullParameter(string2, "value");
        Map map2 = this.predefinedParameters;
        object = ((PredefinedString)object).value();
        map2.put(object, string2);
        return this;
    }

    public final Map getPredefinedParameters$attribution_release() {
        return fh1_2.o(this.predefinedParameters);
    }
}

