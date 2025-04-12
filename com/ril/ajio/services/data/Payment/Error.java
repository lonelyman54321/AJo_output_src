/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.OOSProduct;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Error
implements Serializable {
    private String code;
    private String description;
    private OOSProduct productsOutOfStock;
    private String subReason;

    public Error() {
        this(null, null, null, null, 15, null);
    }

    public Error(String string2, String string3, String string4, OOSProduct oOSProduct) {
        this.code = string2;
        this.description = string3;
        this.subReason = string4;
        this.productsOutOfStock = oOSProduct;
    }

    public /* synthetic */ Error(String string2, String string3, String string4, OOSProduct oOSProduct, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = null;
        }
        if ((n3 &= 8) != 0) {
            oOSProduct = null;
        }
        this(string2, string3, string4, oOSProduct);
    }

    public static /* synthetic */ Error copy$default(Error error, String string2, String string3, String string4, OOSProduct oOSProduct, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = error.code;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = error.description;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = error.subReason;
        }
        if ((n3 &= 8) != 0) {
            oOSProduct = error.productsOutOfStock;
        }
        return error.copy(string2, string3, string4, oOSProduct);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.subReason;
    }

    public final OOSProduct component4() {
        return this.productsOutOfStock;
    }

    public final Error copy(String string2, String string3, String string4, OOSProduct oOSProduct) {
        Error error = new Error(string2, string3, string4, oOSProduct);
        return error;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Error;
        if (!bl3) {
            return false;
        }
        object = (Error)object;
        Object object2 = this.code;
        String string2 = ((Error)object).code;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.description;
        string2 = ((Error)object).description;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.subReason;
        string2 = ((Error)object).subReason;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.productsOutOfStock;
        object = ((Error)object).productsOutOfStock;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final OOSProduct getProductsOutOfStock() {
        return this.productsOutOfStock;
    }

    public final String getSubReason() {
        return this.subReason;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.code;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.description;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subReason;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productsOutOfStock;
        if (object != null) {
            n7 = ((OOSProduct)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setProductsOutOfStock(OOSProduct oOSProduct) {
        this.productsOutOfStock = oOSProduct;
    }

    public final void setSubReason(String string2) {
        this.subReason = string2;
    }

    public String toString() {
        CharSequence charSequence = this.code;
        String string2 = this.description;
        String string3 = this.subReason;
        OOSProduct oOSProduct = this.productsOutOfStock;
        charSequence = og_1.a("Error(code=", (String)charSequence, ", description=", string2, ", subReason=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", productsOutOfStock=");
        ((StringBuilder)charSequence).append(oOSProduct);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

