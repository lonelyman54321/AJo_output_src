/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.ad;

import com.affise.attribution.ad.AffiseAdSource;
import com.affise.attribution.events.Event;
import com.affise.attribution.events.parameters.PredefinedFloat;
import com.affise.attribution.events.parameters.PredefinedString;
import com.affise.attribution.events.predefined.AdRevenueEvent;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseAdRevenue {
    private final AdRevenueEvent event;

    public AffiseAdRevenue(AffiseAdSource object) {
        AdRevenueEvent adRevenueEvent;
        Intrinsics.checkNotNullParameter(object, "source");
        Object object2 = adRevenueEvent;
        this.event = adRevenueEvent = new AdRevenueEvent(null, 0L, 3, null);
        object2 = PredefinedString.SOURCE;
        object = object.getType();
        adRevenueEvent.addPredefinedParameter((PredefinedString)object2, (String)object);
    }

    public final void send() {
        this.event.send();
    }

    public final AffiseAdRevenue setNetwork(String string2) {
        if (string2 != null) {
            AdRevenueEvent adRevenueEvent = this.event;
            PredefinedString predefinedString = PredefinedString.NETWORK;
            adRevenueEvent.addPredefinedParameter(predefinedString, string2);
        }
        return this;
    }

    public final AffiseAdRevenue setPlacement(String string2) {
        if (string2 != null) {
            AdRevenueEvent adRevenueEvent = this.event;
            PredefinedString predefinedString = PredefinedString.PLACEMENT;
            adRevenueEvent.addPredefinedParameter(predefinedString, string2);
        }
        return this;
    }

    public final AffiseAdRevenue setRevenue(double d2, String string2) {
        Intrinsics.checkNotNullParameter(string2, "currency");
        AdRevenueEvent adRevenueEvent = this.event;
        PredefinedFloat predefinedFloat = PredefinedFloat.REVENUE;
        float f5 = (float)d2;
        adRevenueEvent.addPredefinedParameter(predefinedFloat, f5);
        AdRevenueEvent adRevenueEvent2 = this.event;
        PredefinedString predefinedString = PredefinedString.CURRENCY;
        adRevenueEvent2.addPredefinedParameter(predefinedString, string2);
        return this;
    }

    public final AffiseAdRevenue setRevenue(float f5, String string2) {
        Intrinsics.checkNotNullParameter(string2, "currency");
        Object object = this.event;
        PredefinedFloat predefinedFloat = PredefinedFloat.REVENUE;
        ((Event)object).addPredefinedParameter(predefinedFloat, f5);
        AdRevenueEvent adRevenueEvent = this.event;
        object = PredefinedString.CURRENCY;
        adRevenueEvent.addPredefinedParameter((PredefinedString)object, string2);
        return this;
    }

    public final AffiseAdRevenue setUnit(String string2) {
        if (string2 != null) {
            AdRevenueEvent adRevenueEvent = this.event;
            PredefinedString predefinedString = PredefinedString.UNIT;
            adRevenueEvent.addPredefinedParameter(predefinedString, string2);
        }
        return this;
    }
}

