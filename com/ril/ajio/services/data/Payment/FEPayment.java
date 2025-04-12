/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Extra;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FEPayment {
    private String action;
    private Extra extra;
    private String message;
    private String rule;

    public FEPayment() {
        this(null, null, null, null, 15, null);
    }

    public FEPayment(String string2, String string3, String string4, Extra extra) {
        this.action = string2;
        this.message = string3;
        this.rule = string4;
        this.extra = extra;
    }

    public /* synthetic */ FEPayment(String string2, String string3, String string4, Extra extra, int n3, DefaultConstructorMarker defaultConstructorMarker) {
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
            extra = null;
        }
        this(string2, string3, string4, extra);
    }

    public static /* synthetic */ FEPayment copy$default(FEPayment fEPayment, String string2, String string3, String string4, Extra extra, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = fEPayment.action;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = fEPayment.message;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = fEPayment.rule;
        }
        if ((n3 &= 8) != 0) {
            extra = fEPayment.extra;
        }
        return fEPayment.copy(string2, string3, string4, extra);
    }

    public final String component1() {
        return this.action;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.rule;
    }

    public final Extra component4() {
        return this.extra;
    }

    public final FEPayment copy(String string2, String string3, String string4, Extra extra) {
        FEPayment fEPayment = new FEPayment(string2, string3, string4, extra);
        return fEPayment;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FEPayment;
        if (!bl3) {
            return false;
        }
        object = (FEPayment)object;
        Object object2 = this.action;
        String string2 = ((FEPayment)object).action;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        string2 = ((FEPayment)object).message;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.rule;
        string2 = ((FEPayment)object).rule;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.extra;
        object = ((FEPayment)object).extra;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAction() {
        return this.action;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getRule() {
        return this.rule;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.action;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.message;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.rule;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.extra;
        if (object != null) {
            n7 = ((Extra)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAction(String string2) {
        this.action = string2;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setRule(String string2) {
        this.rule = string2;
    }

    public String toString() {
        CharSequence charSequence = this.action;
        String string2 = this.message;
        String string3 = this.rule;
        Extra extra = this.extra;
        charSequence = og_1.a("FEPayment(action=", (String)charSequence, ", message=", string2, ", rule=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", extra=");
        ((StringBuilder)charSequence).append(extra);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

