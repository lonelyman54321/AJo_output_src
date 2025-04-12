/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class OptionsCode {
    private String optionCode;
    private String sourceStoreId;

    public OptionsCode() {
        this(null, null, 3, null);
    }

    public OptionsCode(String string2, String string3) {
        this.optionCode = string2;
        this.sourceStoreId = string3;
    }

    public /* synthetic */ OptionsCode(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ OptionsCode copy$default(OptionsCode optionsCode, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = optionsCode.optionCode;
        }
        if ((n3 &= 2) != 0) {
            string3 = optionsCode.sourceStoreId;
        }
        return optionsCode.copy(string2, string3);
    }

    public final String component1() {
        return this.optionCode;
    }

    public final String component2() {
        return this.sourceStoreId;
    }

    public final OptionsCode copy(String string2, String string3) {
        OptionsCode optionsCode = new OptionsCode(string2, string3);
        return optionsCode;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OptionsCode;
        if (!bl3) {
            return false;
        }
        object = (OptionsCode)object;
        String string2 = this.optionCode;
        String string3 = ((OptionsCode)object).optionCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.sourceStoreId;
        object = ((OptionsCode)object).sourceStoreId;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getOptionCode() {
        return this.optionCode;
    }

    public final String getSourceStoreId() {
        return this.sourceStoreId;
    }

    public int hashCode() {
        int n3;
        String string2 = this.optionCode;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.sourceStoreId;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setOptionCode(String string2) {
        this.optionCode = string2;
    }

    public final void setSourceStoreId(String string2) {
        this.sourceStoreId = string2;
    }

    public String toString() {
        String string2 = this.optionCode;
        String string3 = this.sourceStoreId;
        return uc0_0.a("OptionsCode(optionCode=", string2, ", sourceStoreId=", string3, ")");
    }
}

