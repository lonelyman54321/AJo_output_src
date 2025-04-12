/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.EmiOptions;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PaymentFilter
implements Serializable {
    private final Boolean allowDefaultOptions;
    private final EmiOptions emiOptions;
    private final List options;

    public PaymentFilter() {
        this(null, null, null, 7, null);
    }

    public PaymentFilter(Boolean bl2, EmiOptions emiOptions, List list) {
        this.allowDefaultOptions = bl2;
        this.emiOptions = emiOptions;
        this.options = list;
    }

    public /* synthetic */ PaymentFilter(Boolean bl2, EmiOptions emiOptions, List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            emiOptions = null;
        }
        if ((n3 &= 4) != 0) {
            list = null;
        }
        this(bl2, emiOptions, list);
    }

    public static /* synthetic */ PaymentFilter copy$default(PaymentFilter paymentFilter, Boolean bl2, EmiOptions emiOptions, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = paymentFilter.allowDefaultOptions;
        }
        if ((n4 = n3 & 2) != 0) {
            emiOptions = paymentFilter.emiOptions;
        }
        if ((n3 &= 4) != 0) {
            list = paymentFilter.options;
        }
        return paymentFilter.copy(bl2, emiOptions, list);
    }

    public final Boolean component1() {
        return this.allowDefaultOptions;
    }

    public final EmiOptions component2() {
        return this.emiOptions;
    }

    public final List component3() {
        return this.options;
    }

    public final PaymentFilter copy(Boolean bl2, EmiOptions emiOptions, List list) {
        PaymentFilter paymentFilter = new PaymentFilter(bl2, emiOptions, list);
        return paymentFilter;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PaymentFilter;
        if (!bl3) {
            return false;
        }
        object = (PaymentFilter)object;
        Object object2 = this.allowDefaultOptions;
        Serializable serializable = ((PaymentFilter)object).allowDefaultOptions;
        bl3 = Intrinsics.areEqual(object2, serializable);
        if (!bl3) {
            return false;
        }
        object2 = this.emiOptions;
        serializable = ((PaymentFilter)object).emiOptions;
        bl3 = Intrinsics.areEqual(object2, serializable);
        if (!bl3) {
            return false;
        }
        object2 = this.options;
        object = ((PaymentFilter)object).options;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Boolean getAllowDefaultOptions() {
        return this.allowDefaultOptions;
    }

    public final EmiOptions getEmiOptions() {
        return this.emiOptions;
    }

    public final List getOptions() {
        return this.options;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.allowDefaultOptions;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.emiOptions;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((EmiOptions)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.options;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Boolean bl2 = this.allowDefaultOptions;
        EmiOptions emiOptions = this.emiOptions;
        List list = this.options;
        StringBuilder stringBuilder = new StringBuilder("PaymentFilter(allowDefaultOptions=");
        stringBuilder.append(bl2);
        stringBuilder.append(", emiOptions=");
        stringBuilder.append(emiOptions);
        stringBuilder.append(", options=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

