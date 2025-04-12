/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.ExtraResponseKeyValue;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ExtraResponseParams
implements Serializable {
    private ExtraResponseKeyValue key;
    private ExtraResponseKeyValue value;

    public ExtraResponseParams() {
        this(null, null, 3, null);
    }

    public ExtraResponseParams(ExtraResponseKeyValue extraResponseKeyValue, ExtraResponseKeyValue extraResponseKeyValue2) {
        this.key = extraResponseKeyValue;
        this.value = extraResponseKeyValue2;
    }

    public /* synthetic */ ExtraResponseParams(ExtraResponseKeyValue extraResponseKeyValue, ExtraResponseKeyValue extraResponseKeyValue2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            extraResponseKeyValue = null;
        }
        if ((n3 &= 2) != 0) {
            extraResponseKeyValue2 = null;
        }
        this(extraResponseKeyValue, extraResponseKeyValue2);
    }

    public static /* synthetic */ ExtraResponseParams copy$default(ExtraResponseParams extraResponseParams, ExtraResponseKeyValue extraResponseKeyValue, ExtraResponseKeyValue extraResponseKeyValue2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            extraResponseKeyValue = extraResponseParams.key;
        }
        if ((n3 &= 2) != 0) {
            extraResponseKeyValue2 = extraResponseParams.value;
        }
        return extraResponseParams.copy(extraResponseKeyValue, extraResponseKeyValue2);
    }

    public final ExtraResponseKeyValue component1() {
        return this.key;
    }

    public final ExtraResponseKeyValue component2() {
        return this.value;
    }

    public final ExtraResponseParams copy(ExtraResponseKeyValue extraResponseKeyValue, ExtraResponseKeyValue extraResponseKeyValue2) {
        ExtraResponseParams extraResponseParams = new ExtraResponseParams(extraResponseKeyValue, extraResponseKeyValue2);
        return extraResponseParams;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ExtraResponseParams;
        if (!bl3) {
            return false;
        }
        object = (ExtraResponseParams)object;
        ExtraResponseKeyValue extraResponseKeyValue = this.key;
        ExtraResponseKeyValue extraResponseKeyValue2 = ((ExtraResponseParams)object).key;
        bl3 = Intrinsics.areEqual(extraResponseKeyValue, extraResponseKeyValue2);
        if (!bl3) {
            return false;
        }
        extraResponseKeyValue = this.value;
        object = ((ExtraResponseParams)object).value;
        boolean bl4 = Intrinsics.areEqual(extraResponseKeyValue, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ExtraResponseKeyValue getKey() {
        return this.key;
    }

    public final ExtraResponseKeyValue getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        ExtraResponseKeyValue extraResponseKeyValue = this.key;
        int n4 = 0;
        if (extraResponseKeyValue == null) {
            n3 = 0;
            extraResponseKeyValue = null;
        } else {
            n3 = extraResponseKeyValue.hashCode();
        }
        n3 *= 31;
        ExtraResponseKeyValue extraResponseKeyValue2 = this.value;
        if (extraResponseKeyValue2 != null) {
            n4 = extraResponseKeyValue2.hashCode();
        }
        return n3 + n4;
    }

    public final void setKey(ExtraResponseKeyValue extraResponseKeyValue) {
        this.key = extraResponseKeyValue;
    }

    public final void setValue(ExtraResponseKeyValue extraResponseKeyValue) {
        this.value = extraResponseKeyValue;
    }

    public String toString() {
        ExtraResponseKeyValue extraResponseKeyValue = this.key;
        ExtraResponseKeyValue extraResponseKeyValue2 = this.value;
        StringBuilder stringBuilder = new StringBuilder("ExtraResponseParams(key=");
        stringBuilder.append(extraResponseKeyValue);
        stringBuilder.append(", value=");
        stringBuilder.append(extraResponseKeyValue2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

