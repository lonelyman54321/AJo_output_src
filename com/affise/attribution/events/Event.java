/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.events;

import com.affise.attribution.Affise;
import com.affise.attribution.events.OnSendFailedCallback;
import com.affise.attribution.events.OnSendSuccessCallback;
import com.affise.attribution.events.parameters.PredefinedCustom;
import com.affise.attribution.events.parameters.PredefinedFloat;
import com.affise.attribution.events.parameters.PredefinedListObject;
import com.affise.attribution.events.parameters.PredefinedListString;
import com.affise.attribution.events.parameters.PredefinedLong;
import com.affise.attribution.events.parameters.PredefinedObject;
import com.affise.attribution.events.parameters.PredefinedParameter;
import com.affise.attribution.events.parameters.PredefinedString;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public abstract class Event
implements PredefinedParameter {
    private boolean firstForUser;
    private PredefinedCustom predefinedCustom;
    private final Map predefinedParameters;

    public Event() {
        Object object = new LinkedHashMap();
        this.predefinedParameters = object;
        this.predefinedCustom = object = new PredefinedCustom();
    }

    public Event addPredefinedParameter(PredefinedFloat object, float f5) {
        Intrinsics.checkNotNullParameter(object, "parameter");
        Float f6 = Float.valueOf(f5);
        Map map2 = this.predefinedParameters;
        object = ((PredefinedFloat)object).value();
        map2.put(object, f6);
        return this;
    }

    public Event addPredefinedParameter(PredefinedListObject object, List list) {
        Intrinsics.checkNotNullParameter(object, "parameter");
        Intrinsics.checkNotNullParameter(list, "value");
        Map map2 = this.predefinedParameters;
        object = ((PredefinedListObject)object).value();
        map2.put(object, list);
        return this;
    }

    public Event addPredefinedParameter(PredefinedListString object, List list) {
        Intrinsics.checkNotNullParameter(object, "parameter");
        Intrinsics.checkNotNullParameter(list, "value");
        Map map2 = this.predefinedParameters;
        object = ((PredefinedListString)object).value();
        map2.put(object, list);
        return this;
    }

    public Event addPredefinedParameter(PredefinedLong object, long l2) {
        Intrinsics.checkNotNullParameter(object, "parameter");
        Long l3 = l2;
        Map map2 = this.predefinedParameters;
        object = ((PredefinedLong)object).value();
        map2.put(object, l3);
        return this;
    }

    public Event addPredefinedParameter(PredefinedObject object, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(object, "parameter");
        Intrinsics.checkNotNullParameter(jSONObject, "value");
        Map map2 = this.predefinedParameters;
        object = ((PredefinedObject)object).value();
        map2.put(object, jSONObject);
        return this;
    }

    public Event addPredefinedParameter(PredefinedString object, String string2) {
        Intrinsics.checkNotNullParameter(object, "parameter");
        Intrinsics.checkNotNullParameter(string2, "value");
        Map map2 = this.predefinedParameters;
        object = ((PredefinedString)object).value();
        map2.put(object, string2);
        return this;
    }

    public final PredefinedCustom customPredefined() {
        return this.predefinedCustom;
    }

    public abstract String getCategory();

    public abstract String getName();

    public final Map getPredefinedParameters$attribution_release() {
        boolean bl2;
        Iterator iterator = this.predefinedCustom.get$attribution_release().entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Map map2 = this.predefinedParameters;
            Object k2 = entry.getKey();
            entry = entry.getValue();
            map2.put(k2, entry);
        }
        return fh1_2.o(this.predefinedParameters);
    }

    public abstract String getUserData();

    public final boolean isFirstForUser() {
        return this.firstForUser;
    }

    public final void send() {
        Affise.sendEvent$attribution_release(this);
    }

    public final void sendNow(OnSendSuccessCallback onSendSuccessCallback, OnSendFailedCallback onSendFailedCallback) {
        Intrinsics.checkNotNullParameter(onSendSuccessCallback, "success");
        Intrinsics.checkNotNullParameter(onSendFailedCallback, "failed");
        Affise.sendEventNow$attribution_release(this, onSendSuccessCallback, onSendFailedCallback);
    }

    public abstract JSONObject serialize();

    public final void setFirstForUser$attribution_release(boolean bl2) {
        this.firstForUser = bl2;
    }
}

