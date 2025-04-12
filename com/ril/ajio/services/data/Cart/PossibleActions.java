/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class PossibleActions
implements Serializable {
    private final String title;
    private final List values;

    public PossibleActions(String string2, List list) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(list, "values");
        this.title = string2;
        this.values = list;
    }

    public static /* synthetic */ PossibleActions copy$default(PossibleActions possibleActions, String string2, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = possibleActions.title;
        }
        if ((n3 &= 2) != 0) {
            list = possibleActions.values;
        }
        return possibleActions.copy(string2, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List component2() {
        return this.values;
    }

    public final PossibleActions copy(String string2, List list) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(list, "values");
        PossibleActions possibleActions = new PossibleActions(string2, list);
        return possibleActions;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PossibleActions;
        if (!bl3) {
            return false;
        }
        object = (PossibleActions)object;
        Object object2 = this.title;
        String string2 = ((PossibleActions)object).title;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.values;
        object = ((PossibleActions)object).values;
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
        StringBuilder stringBuilder = new StringBuilder("PossibleActions(title=");
        stringBuilder.append(string2);
        stringBuilder.append(", values=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

