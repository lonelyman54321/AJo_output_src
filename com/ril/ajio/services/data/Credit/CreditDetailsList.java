/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Credit;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CreditDetailsList {
    private final Float balance;
    private final List credits;
    private int noofpages;

    public CreditDetailsList() {
        this(null, null, 0, 7, null);
    }

    public CreditDetailsList(Float f5, List list, int n3) {
        this.balance = f5;
        this.credits = list;
        this.noofpages = n3;
    }

    public /* synthetic */ CreditDetailsList(Float f5, List list, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            f5 = Float.valueOf(0.0f);
        }
        if ((n7 = n4 & 2) != 0) {
            list = null;
        }
        if ((n4 &= 4) != 0) {
            n3 = 0;
        }
        this(f5, list, n3);
    }

    public static /* synthetic */ CreditDetailsList copy$default(CreditDetailsList creditDetailsList, Float f5, List list, int n3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            f5 = creditDetailsList.balance;
        }
        if ((n7 = n4 & 2) != 0) {
            list = creditDetailsList.credits;
        }
        if ((n4 &= 4) != 0) {
            n3 = creditDetailsList.noofpages;
        }
        return creditDetailsList.copy(f5, list, n3);
    }

    public final Float component1() {
        return this.balance;
    }

    public final List component2() {
        return this.credits;
    }

    public final int component3() {
        return this.noofpages;
    }

    public final CreditDetailsList copy(Float f5, List list, int n3) {
        CreditDetailsList creditDetailsList = new CreditDetailsList(f5, list, n3);
        return creditDetailsList;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof CreditDetailsList;
        if (n3 == 0) {
            return false;
        }
        object = (CreditDetailsList)object;
        Object object2 = this.balance;
        Object object3 = ((CreditDetailsList)object).balance;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.credits;
        object3 = ((CreditDetailsList)object).credits;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.noofpages;
        int n4 = ((CreditDetailsList)object).noofpages;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final Float getBalance() {
        return this.balance;
    }

    public final List getCredits() {
        return this.credits;
    }

    public final int getNoofpages() {
        return this.noofpages;
    }

    public int hashCode() {
        int n3;
        Float f5 = this.balance;
        int n4 = 0;
        if (f5 == null) {
            n3 = 0;
            f5 = null;
        } else {
            n3 = ((Object)f5).hashCode();
        }
        n3 *= 31;
        List list = this.credits;
        if (list != null) {
            n4 = ((Object)list).hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = this.noofpages;
        return n3 + n4;
    }

    public final void setNoofpages(int n3) {
        this.noofpages = n3;
    }

    public String toString() {
        Float f5 = this.balance;
        List list = this.credits;
        int n3 = this.noofpages;
        StringBuilder stringBuilder = new StringBuilder("CreditDetailsList(balance=");
        stringBuilder.append(f5);
        stringBuilder.append(", credits=");
        stringBuilder.append(list);
        stringBuilder.append(", noofpages=");
        return g30.a(n3, ")", stringBuilder);
    }
}

