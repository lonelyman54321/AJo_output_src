/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

import com.google.android.gms.analytics.HitBuilders$HitBuilder;

public class HitBuilders$TransactionBuilder
extends HitBuilders$HitBuilder {
    public HitBuilders$TransactionBuilder() {
        this.set("&t", "transaction");
    }

    public HitBuilders$TransactionBuilder setAffiliation(String string2) {
        this.set("&ta", string2);
        return this;
    }

    public HitBuilders$TransactionBuilder setCurrencyCode(String string2) {
        this.set("&cu", string2);
        return this;
    }

    public HitBuilders$TransactionBuilder setRevenue(double d2) {
        String string2 = Double.toString(d2);
        this.set("&tr", string2);
        return this;
    }

    public HitBuilders$TransactionBuilder setShipping(double d2) {
        String string2 = Double.toString(d2);
        this.set("&ts", string2);
        return this;
    }

    public HitBuilders$TransactionBuilder setTax(double d2) {
        String string2 = Double.toString(d2);
        this.set("&tt", string2);
        return this;
    }

    public HitBuilders$TransactionBuilder setTransactionId(String string2) {
        this.set("&ti", string2);
        return this;
    }
}

