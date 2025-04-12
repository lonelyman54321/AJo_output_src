/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.PredefinedFloat;
import com.affise.attribution.events.parameters.PredefinedListObject;
import com.affise.attribution.events.parameters.PredefinedListString;
import com.affise.attribution.events.parameters.PredefinedLong;
import com.affise.attribution.events.parameters.PredefinedObject;
import com.affise.attribution.events.parameters.PredefinedSimple;
import com.affise.attribution.events.parameters.PredefinedString;
import java.util.List;
import org.json.JSONObject;

public interface PredefinedParameter
extends PredefinedSimple {
    public PredefinedParameter addPredefinedParameter(PredefinedFloat var1, float var2);

    public PredefinedParameter addPredefinedParameter(PredefinedListObject var1, List var2);

    public PredefinedParameter addPredefinedParameter(PredefinedListString var1, List var2);

    public PredefinedParameter addPredefinedParameter(PredefinedLong var1, long var2);

    public PredefinedParameter addPredefinedParameter(PredefinedObject var1, JSONObject var2);

    public PredefinedParameter addPredefinedParameter(PredefinedString var1, String var2);
}

