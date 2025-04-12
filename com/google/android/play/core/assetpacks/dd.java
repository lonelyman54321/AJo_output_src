/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.co;
import com.google.android.play.core.assetpacks.dv;
import java.util.HashMap;
import java.util.Map;

final class dd {
    private final Map a;

    public dd() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final double a(String object) {
        synchronized (this) {
            Map map2 = this.a;
            object = map2.get(object);
            object = (Double)object;
            if (object != null) return (Double)object;
            return 0.0;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final double b(String string2, dv object) {
        synchronized (this) {
            object = (co)object;
            int n3 = ((co)object).f;
            int n4 = ((co)object).g;
            double d2 = n3;
            double d5 = 1.0;
            d2 += d5;
            Map map2 = this.a;
            double d7 = n4;
            object = d2 /= d7;
            map2.put(string2, object);
            return d2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(String string2) {
        synchronized (this) {
            double d2 = 0.0;
            Double d5 = d2;
            Map map2 = this.a;
            map2.put(string2, d5);
            return;
        }
    }
}

