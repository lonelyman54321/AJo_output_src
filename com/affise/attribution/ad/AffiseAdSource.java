/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.ad;

import com.affise.attribution.ad.AffiseAdSource$Companion;

public final class AffiseAdSource
extends Enum {
    private static final /* synthetic */ AffiseAdSource[] $VALUES;
    public static final /* enum */ AffiseAdSource ADMOB;
    public static final /* enum */ AffiseAdSource ADMOST;
    public static final /* enum */ AffiseAdSource APPLOVIN_MAX;
    public static final AffiseAdSource$Companion Companion;
    public static final /* enum */ AffiseAdSource HELIUM_CHARTBOOST;
    public static final /* enum */ AffiseAdSource IRONSOURCE;
    private final String type;

    private static final /* synthetic */ AffiseAdSource[] $values() {
        AffiseAdSource affiseAdSource = ADMOB;
        affiseAdSource = ADMOST;
        affiseAdSource = APPLOVIN_MAX;
        affiseAdSource = HELIUM_CHARTBOOST;
        affiseAdSource = IRONSOURCE;
        AffiseAdSource[] affiseAdSourceArray = new AffiseAdSource[]{affiseAdSource, affiseAdSource, affiseAdSource, affiseAdSource, affiseAdSource};
        return affiseAdSourceArray;
    }

    static {
        Object object;
        ADMOB = object = new AffiseAdSource("ADMOB", 0, "admob");
        ADMOST = object = new AffiseAdSource("ADMOST", 1, "admost");
        APPLOVIN_MAX = object = new AffiseAdSource("APPLOVIN_MAX", 2, "applovin_max");
        HELIUM_CHARTBOOST = object = new AffiseAdSource("HELIUM_CHARTBOOST", 3, "helium_chartboost");
        IRONSOURCE = object = new AffiseAdSource("IRONSOURCE", 4, "ironsource");
        $VALUES = AffiseAdSource.$values();
        object = new AffiseAdSource$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AffiseAdSource() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static final AffiseAdSource from(String string2) {
        return Companion.from(string2);
    }

    public static AffiseAdSource valueOf(String string2) {
        return Enum.valueOf(AffiseAdSource.class, string2);
    }

    public static AffiseAdSource[] values() {
        return (AffiseAdSource[])$VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}

