/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.CustomSignals;
import java.util.HashMap;
import java.util.Map;

public class CustomSignals$Builder {
    private Map customSignals;

    public CustomSignals$Builder() {
        HashMap hashMap;
        this.customSignals = hashMap = new HashMap();
    }

    public static /* synthetic */ Map access$000(CustomSignals$Builder customSignals$Builder) {
        return customSignals$Builder.customSignals;
    }

    public CustomSignals build() {
        CustomSignals customSignals = new CustomSignals(this);
        return customSignals;
    }

    public CustomSignals$Builder put(String string2, double d2) {
        Map map2 = this.customSignals;
        String string3 = Double.toString(d2);
        map2.put(string2, string3);
        return this;
    }

    public CustomSignals$Builder put(String string2, long l2) {
        Map map2 = this.customSignals;
        String string3 = Long.toString(l2);
        map2.put(string2, string3);
        return this;
    }

    public CustomSignals$Builder put(String string2, String string3) {
        this.customSignals.put(string2, string3);
        return this;
    }
}

