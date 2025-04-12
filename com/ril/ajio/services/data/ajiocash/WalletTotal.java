/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class WalletTotal {
    private List cashDetails;
    private Float total;
    private Float totalCash;
    private Float totalPoints;

    public WalletTotal(Float f5, Float f6, Float f7, List list) {
        this.total = f5;
        this.totalCash = f6;
        this.totalPoints = f7;
        this.cashDetails = list;
    }

    public static /* synthetic */ WalletTotal copy$default(WalletTotal walletTotal, Float f5, Float f6, Float f7, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = walletTotal.total;
        }
        if ((n4 = n3 & 2) != 0) {
            f6 = walletTotal.totalCash;
        }
        if ((n4 = n3 & 4) != 0) {
            f7 = walletTotal.totalPoints;
        }
        if ((n3 &= 8) != 0) {
            list = walletTotal.cashDetails;
        }
        return walletTotal.copy(f5, f6, f7, list);
    }

    public final Float component1() {
        return this.total;
    }

    public final Float component2() {
        return this.totalCash;
    }

    public final Float component3() {
        return this.totalPoints;
    }

    public final List component4() {
        return this.cashDetails;
    }

    public final WalletTotal copy(Float f5, Float f6, Float f7, List list) {
        WalletTotal walletTotal = new WalletTotal(f5, f6, f7, list);
        return walletTotal;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof WalletTotal;
        if (!bl3) {
            return false;
        }
        object = (WalletTotal)object;
        Object object2 = this.total;
        Float f5 = ((WalletTotal)object).total;
        bl3 = Intrinsics.areEqual(object2, (Object)f5);
        if (!bl3) {
            return false;
        }
        object2 = this.totalCash;
        f5 = ((WalletTotal)object).totalCash;
        bl3 = Intrinsics.areEqual(object2, (Object)f5);
        if (!bl3) {
            return false;
        }
        object2 = this.totalPoints;
        f5 = ((WalletTotal)object).totalPoints;
        bl3 = Intrinsics.areEqual(object2, (Object)f5);
        if (!bl3) {
            return false;
        }
        object2 = this.cashDetails;
        object = ((WalletTotal)object).cashDetails;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getCashDetails() {
        return this.cashDetails;
    }

    public final Float getTotal() {
        return this.total;
    }

    public final Float getTotalCash() {
        return this.totalCash;
    }

    public final Float getTotalPoints() {
        return this.totalPoints;
    }

    public int hashCode() {
        int n3;
        int n4;
        Float f5 = this.total;
        int n7 = 0;
        if (f5 == null) {
            n4 = 0;
            f5 = null;
        } else {
            n4 = ((Object)f5).hashCode();
        }
        n4 *= 31;
        Object object = this.totalCash;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalPoints;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cashDetails;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setCashDetails(List list) {
        this.cashDetails = list;
    }

    public final void setTotal(Float f5) {
        this.total = f5;
    }

    public final void setTotalCash(Float f5) {
        this.totalCash = f5;
    }

    public final void setTotalPoints(Float f5) {
        this.totalPoints = f5;
    }

    public String toString() {
        Float f5 = this.total;
        Float f6 = this.totalCash;
        Float f7 = this.totalPoints;
        List list = this.cashDetails;
        StringBuilder stringBuilder = new StringBuilder("WalletTotal(total=");
        stringBuilder.append(f5);
        stringBuilder.append(", totalCash=");
        stringBuilder.append(f6);
        stringBuilder.append(", totalPoints=");
        stringBuilder.append(f7);
        stringBuilder.append(", cashDetails=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

