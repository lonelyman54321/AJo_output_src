/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SPCartProductInfo {
    private String optionCode;
    private String size;
    private String store;

    public SPCartProductInfo(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string4, "store");
        this.optionCode = string2;
        this.size = string3;
        this.store = string4;
    }

    public /* synthetic */ SPCartProductInfo(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ SPCartProductInfo copy$default(SPCartProductInfo sPCartProductInfo, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = sPCartProductInfo.optionCode;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = sPCartProductInfo.size;
        }
        if ((n3 &= 4) != 0) {
            string4 = sPCartProductInfo.store;
        }
        return sPCartProductInfo.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.optionCode;
    }

    public final String component2() {
        return this.size;
    }

    public final String component3() {
        return this.store;
    }

    public final SPCartProductInfo copy(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string4, "store");
        SPCartProductInfo sPCartProductInfo = new SPCartProductInfo(string2, string3, string4);
        return sPCartProductInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SPCartProductInfo;
        if (!bl3) {
            return false;
        }
        object = (SPCartProductInfo)object;
        String string2 = this.optionCode;
        String string3 = ((SPCartProductInfo)object).optionCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.size;
        string3 = ((SPCartProductInfo)object).size;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.store;
        object = ((SPCartProductInfo)object).store;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getOptionCode() {
        return this.optionCode;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getStore() {
        return this.store;
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
        String string3 = this.size;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        n3 = (n3 + n4) * 31;
        return this.store.hashCode() + n3;
    }

    public final void setOptionCode(String string2) {
        this.optionCode = string2;
    }

    public final void setSize(String string2) {
        this.size = string2;
    }

    public final void setStore(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.store = string2;
    }

    public String toString() {
        String string2 = this.optionCode;
        String string3 = this.size;
        String string4 = this.store;
        return h30_0.a(og_1.a("SPCartProductInfo(optionCode=", string2, ", size=", string3, ", store="), string4, ")");
    }
}

