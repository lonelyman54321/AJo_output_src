/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.IssuerFilter;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Filter
implements Serializable {
    private final Boolean enable;
    private final IssuerFilter issuerFilter;
    private final String paymentMethod;
    private final String paymentMethodType;

    public Filter() {
        this(null, null, null, null, 15, null);
    }

    public Filter(Boolean bl2, IssuerFilter issuerFilter, String string2, String string3) {
        this.enable = bl2;
        this.issuerFilter = issuerFilter;
        this.paymentMethod = string2;
        this.paymentMethodType = string3;
    }

    public /* synthetic */ Filter(Boolean bl2, IssuerFilter issuerFilter, String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            issuerFilter = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string2 = null;
        }
        if ((n3 &= 8) != 0) {
            string3 = null;
        }
        this(bl2, issuerFilter, string2, string3);
    }

    public static /* synthetic */ Filter copy$default(Filter filter, Boolean bl2, IssuerFilter issuerFilter, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = filter.enable;
        }
        if ((n4 = n3 & 2) != 0) {
            issuerFilter = filter.issuerFilter;
        }
        if ((n4 = n3 & 4) != 0) {
            string2 = filter.paymentMethod;
        }
        if ((n3 &= 8) != 0) {
            string3 = filter.paymentMethodType;
        }
        return filter.copy(bl2, issuerFilter, string2, string3);
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final IssuerFilter component2() {
        return this.issuerFilter;
    }

    public final String component3() {
        return this.paymentMethod;
    }

    public final String component4() {
        return this.paymentMethodType;
    }

    public final Filter copy(Boolean bl2, IssuerFilter issuerFilter, String string2, String string3) {
        Filter filter = new Filter(bl2, issuerFilter, string2, string3);
        return filter;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Filter;
        if (!bl3) {
            return false;
        }
        object = (Filter)object;
        Object object2 = this.enable;
        Object object3 = ((Filter)object).enable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.issuerFilter;
        object3 = ((Filter)object).issuerFilter;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentMethod;
        object3 = ((Filter)object).paymentMethod;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentMethodType;
        object = ((Filter)object).paymentMethodType;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final IssuerFilter getIssuerFilter() {
        return this.issuerFilter;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.enable;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.issuerFilter;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((IssuerFilter)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentMethod;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentMethodType;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Boolean bl2 = this.enable;
        IssuerFilter issuerFilter = this.issuerFilter;
        String string2 = this.paymentMethod;
        String string3 = this.paymentMethodType;
        StringBuilder stringBuilder = new StringBuilder("Filter(enable=");
        stringBuilder.append(bl2);
        stringBuilder.append(", issuerFilter=");
        stringBuilder.append(issuerFilter);
        stringBuilder.append(", paymentMethod=");
        return ko_0.a(stringBuilder, string2, ", paymentMethodType=", string3, ")");
    }
}

