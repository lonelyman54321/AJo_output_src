/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class IssuerFilter
implements Serializable {
    private final Boolean enable;
    private final List issuers;

    public IssuerFilter() {
        this(null, null, 3, null);
    }

    public IssuerFilter(Boolean bl2, List list) {
        this.enable = bl2;
        this.issuers = list;
    }

    public /* synthetic */ IssuerFilter(Boolean bl2, List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = null;
        }
        if ((n3 &= 2) != 0) {
            list = null;
        }
        this(bl2, list);
    }

    public static /* synthetic */ IssuerFilter copy$default(IssuerFilter issuerFilter, Boolean bl2, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = issuerFilter.enable;
        }
        if ((n3 &= 2) != 0) {
            list = issuerFilter.issuers;
        }
        return issuerFilter.copy(bl2, list);
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final List component2() {
        return this.issuers;
    }

    public final IssuerFilter copy(Boolean bl2, List list) {
        IssuerFilter issuerFilter = new IssuerFilter(bl2, list);
        return issuerFilter;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof IssuerFilter;
        if (!bl3) {
            return false;
        }
        object = (IssuerFilter)object;
        Object object2 = this.enable;
        Boolean bl4 = ((IssuerFilter)object).enable;
        bl3 = Intrinsics.areEqual(object2, bl4);
        if (!bl3) {
            return false;
        }
        object2 = this.issuers;
        object = ((IssuerFilter)object).issuers;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final List getIssuers() {
        return this.issuers;
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
        List list = this.issuers;
        if (list != null) {
            n4 = ((Object)list).hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        Boolean bl2 = this.enable;
        List list = this.issuers;
        StringBuilder stringBuilder = new StringBuilder("IssuerFilter(enable=");
        stringBuilder.append(bl2);
        stringBuilder.append(", issuers=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

