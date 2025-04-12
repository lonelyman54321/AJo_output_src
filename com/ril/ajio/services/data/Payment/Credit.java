/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Credit
implements Serializable {
    private final Boolean enable;
    private final List filters;

    public Credit() {
        this(null, null, 3, null);
    }

    public Credit(Boolean bl2, List list) {
        this.enable = bl2;
        this.filters = list;
    }

    public /* synthetic */ Credit(Boolean bl2, List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = null;
        }
        if ((n3 &= 2) != 0) {
            list = null;
        }
        this(bl2, list);
    }

    public static /* synthetic */ Credit copy$default(Credit credit, Boolean bl2, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = credit.enable;
        }
        if ((n3 &= 2) != 0) {
            list = credit.filters;
        }
        return credit.copy(bl2, list);
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final List component2() {
        return this.filters;
    }

    public final Credit copy(Boolean bl2, List list) {
        Credit credit = new Credit(bl2, list);
        return credit;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Credit;
        if (!bl3) {
            return false;
        }
        object = (Credit)object;
        Object object2 = this.enable;
        Boolean bl4 = ((Credit)object).enable;
        bl3 = Intrinsics.areEqual(object2, bl4);
        if (!bl3) {
            return false;
        }
        object2 = this.filters;
        object = ((Credit)object).filters;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final List getFilters() {
        return this.filters;
    }

    public int hashCode() {
        int n3;
        Boolean bl2 = this.enable;
        int n4 = 0;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n3 *= 31;
        List list = this.filters;
        if (list != null) {
            n4 = ((Object)list).hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        Boolean bl2 = this.enable;
        List list = this.filters;
        StringBuilder stringBuilder = new StringBuilder("Credit(enable=");
        stringBuilder.append(bl2);
        stringBuilder.append(", filters=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

