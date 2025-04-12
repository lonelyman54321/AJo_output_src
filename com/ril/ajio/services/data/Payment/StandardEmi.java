/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Credit;
import com.ril.ajio.services.data.Payment.Debit;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class StandardEmi
implements Serializable {
    private final Credit credit;
    private final Debit debit;
    private final Boolean enable;

    public StandardEmi() {
        this(null, null, null, 7, null);
    }

    public StandardEmi(Credit credit, Debit debit, Boolean bl2) {
        this.credit = credit;
        this.debit = debit;
        this.enable = bl2;
    }

    public /* synthetic */ StandardEmi(Credit credit, Debit debit, Boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            credit = null;
        }
        if ((n4 = n3 & 2) != 0) {
            debit = null;
        }
        if ((n3 &= 4) != 0) {
            bl2 = null;
        }
        this(credit, debit, bl2);
    }

    public static /* synthetic */ StandardEmi copy$default(StandardEmi standardEmi, Credit credit, Debit debit, Boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            credit = standardEmi.credit;
        }
        if ((n4 = n3 & 2) != 0) {
            debit = standardEmi.debit;
        }
        if ((n3 &= 4) != 0) {
            bl2 = standardEmi.enable;
        }
        return standardEmi.copy(credit, debit, bl2);
    }

    public final Credit component1() {
        return this.credit;
    }

    public final Debit component2() {
        return this.debit;
    }

    public final Boolean component3() {
        return this.enable;
    }

    public final StandardEmi copy(Credit credit, Debit debit, Boolean bl2) {
        StandardEmi standardEmi = new StandardEmi(credit, debit, bl2);
        return standardEmi;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof StandardEmi;
        if (!bl3) {
            return false;
        }
        object = (StandardEmi)object;
        Serializable serializable = this.credit;
        Serializable serializable2 = ((StandardEmi)object).credit;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.debit;
        serializable2 = ((StandardEmi)object).debit;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.enable;
        object = ((StandardEmi)object).enable;
        boolean bl4 = Intrinsics.areEqual(serializable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Credit getCredit() {
        return this.credit;
    }

    public final Debit getDebit() {
        return this.debit;
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public int hashCode() {
        int n3;
        int n4;
        Credit credit = this.credit;
        int n7 = 0;
        if (credit == null) {
            n4 = 0;
            credit = null;
        } else {
            n4 = credit.hashCode();
        }
        n4 *= 31;
        Serializable serializable = this.debit;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = ((Debit)serializable).hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.enable;
        if (serializable != null) {
            n7 = serializable.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Credit credit = this.credit;
        Debit debit = this.debit;
        Boolean bl2 = this.enable;
        StringBuilder stringBuilder = new StringBuilder("StandardEmi(credit=");
        stringBuilder.append(credit);
        stringBuilder.append(", debit=");
        stringBuilder.append(debit);
        stringBuilder.append(", enable=");
        return nx3_0.a(stringBuilder, bl2, ")");
    }
}

