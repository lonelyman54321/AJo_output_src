/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ExtraResponseKeyValue
implements Serializable {
    private String type;
    private String value;

    public ExtraResponseKeyValue() {
        this(null, null, 3, null);
    }

    public ExtraResponseKeyValue(String string2, String string3) {
        this.type = string2;
        this.value = string3;
    }

    public /* synthetic */ ExtraResponseKeyValue(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        String string4 = "";
        if (n4 != 0) {
            string2 = string4;
        }
        if ((n3 &= 2) != 0) {
            string3 = string4;
        }
        this(string2, string3);
    }

    public static /* synthetic */ ExtraResponseKeyValue copy$default(ExtraResponseKeyValue extraResponseKeyValue, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = extraResponseKeyValue.type;
        }
        if ((n3 &= 2) != 0) {
            string3 = extraResponseKeyValue.value;
        }
        return extraResponseKeyValue.copy(string2, string3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final ExtraResponseKeyValue copy(String string2, String string3) {
        ExtraResponseKeyValue extraResponseKeyValue = new ExtraResponseKeyValue(string2, string3);
        return extraResponseKeyValue;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ExtraResponseKeyValue;
        if (!bl3) {
            return false;
        }
        object = (ExtraResponseKeyValue)object;
        String string2 = this.type;
        String string3 = ((ExtraResponseKeyValue)object).type;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.value;
        object = ((ExtraResponseKeyValue)object).value;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        String string2 = this.type;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.value;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public String toString() {
        String string2 = this.type;
        String string3 = this.value;
        return uc0_0.a("ExtraResponseKeyValue(type=", string2, ", value=", string3, ")");
    }
}

