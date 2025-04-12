/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class PreventionTips
implements Serializable {
    private final String title;
    private final List values;

    public PreventionTips(String string2, List list) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(list, "values");
        this.title = string2;
        this.values = list;
    }

    public static /* synthetic */ PreventionTips copy$default(PreventionTips preventionTips, String string2, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = preventionTips.title;
        }
        if ((n3 &= 2) != 0) {
            list = preventionTips.values;
        }
        return preventionTips.copy(string2, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List component2() {
        return this.values;
    }

    public final PreventionTips copy(String string2, List list) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(list, "values");
        PreventionTips preventionTips = new PreventionTips(string2, list);
        return preventionTips;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PreventionTips;
        if (!bl3) {
            return false;
        }
        object = (PreventionTips)object;
        Object object2 = this.title;
        String string2 = ((PreventionTips)object).title;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.values;
        object = ((PreventionTips)object).values;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List getValues() {
        return this.values;
    }

    public int hashCode() {
        int n3 = this.title.hashCode() * 31;
        return ((Object)this.values).hashCode() + n3;
    }

    public String toString() {
        String string2 = this.title;
        List list = this.values;
        StringBuilder stringBuilder = new StringBuilder("PreventionTips(title=");
        stringBuilder.append(string2);
        stringBuilder.append(", values=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

