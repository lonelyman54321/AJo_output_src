/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import java.lang.constant.Constable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AWPaginationDetails {
    private Boolean nextLoad;
    private int nextNtPageOffset;
    private Integer nextPageOffset;
    private int nextRcsPageOffset;
    private Integer transactionLimit;

    public AWPaginationDetails(int n3, int n4, Integer n7, Integer n8, Boolean bl2) {
        this.nextRcsPageOffset = n3;
        this.nextNtPageOffset = n4;
        this.nextPageOffset = n7;
        this.transactionLimit = n8;
        this.nextLoad = bl2;
    }

    public /* synthetic */ AWPaginationDetails(int n3, int n4, Integer n7, Integer n8, Boolean bl2, int n10, DefaultConstructorMarker defaultConstructorMarker) {
        int n14 = n10 & 1;
        int n15 = n14 != 0 ? 0 : n3;
        n3 = n10 & 2;
        int n16 = n3 != 0 ? 0 : n4;
        this(n15, n16, n7, n8, bl2);
    }

    public static /* synthetic */ AWPaginationDetails copy$default(AWPaginationDetails aWPaginationDetails, int n3, int n4, Integer n7, Integer n8, Boolean comparable, int n10, Object object) {
        int n14 = n10 & 1;
        if (n14 != 0) {
            n3 = aWPaginationDetails.nextRcsPageOffset;
        }
        if ((n14 = n10 & 2) != 0) {
            n4 = aWPaginationDetails.nextNtPageOffset;
        }
        n14 = n4;
        n4 = n10 & 4;
        if (n4 != 0) {
            n7 = aWPaginationDetails.nextPageOffset;
        }
        Integer n15 = n7;
        n4 = n10 & 8;
        if (n4 != 0) {
            n8 = aWPaginationDetails.transactionLimit;
        }
        Integer n16 = n8;
        n4 = n10 & 0x10;
        if (n4 != 0) {
            comparable = aWPaginationDetails.nextLoad;
        }
        Boolean bl2 = comparable;
        comparable = n15;
        return aWPaginationDetails.copy(n3, n14, n15, n16, bl2);
    }

    public final int component1() {
        return this.nextRcsPageOffset;
    }

    public final int component2() {
        return this.nextNtPageOffset;
    }

    public final Integer component3() {
        return this.nextPageOffset;
    }

    public final Integer component4() {
        return this.transactionLimit;
    }

    public final Boolean component5() {
        return this.nextLoad;
    }

    public final AWPaginationDetails copy(int n3, int n4, Integer n7, Integer n8, Boolean bl2) {
        AWPaginationDetails aWPaginationDetails = new AWPaginationDetails(n3, n4, n7, n8, bl2);
        return aWPaginationDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof AWPaginationDetails;
        if (n3 == 0) {
            return false;
        }
        object = (AWPaginationDetails)object;
        n3 = this.nextRcsPageOffset;
        int n4 = ((AWPaginationDetails)object).nextRcsPageOffset;
        if (n3 != n4) {
            return false;
        }
        n3 = this.nextNtPageOffset;
        n4 = ((AWPaginationDetails)object).nextNtPageOffset;
        if (n3 != n4) {
            return false;
        }
        Constable constable = this.nextPageOffset;
        Integer n7 = ((AWPaginationDetails)object).nextPageOffset;
        n3 = (int)(Intrinsics.areEqual(constable, n7) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        constable = this.transactionLimit;
        n7 = ((AWPaginationDetails)object).transactionLimit;
        n3 = (int)(Intrinsics.areEqual(constable, n7) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        constable = this.nextLoad;
        object = ((AWPaginationDetails)object).nextLoad;
        boolean bl3 = Intrinsics.areEqual(constable, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final Boolean getNextLoad() {
        return this.nextLoad;
    }

    public final int getNextNtPageOffset() {
        return this.nextNtPageOffset;
    }

    public final Integer getNextPageOffset() {
        return this.nextPageOffset;
    }

    public final int getNextRcsPageOffset() {
        return this.nextRcsPageOffset;
    }

    public final Integer getTransactionLimit() {
        return this.transactionLimit;
    }

    public int hashCode() {
        int n3 = this.nextRcsPageOffset * 31;
        int n4 = this.nextNtPageOffset;
        n3 = (n3 + n4) * 31;
        Constable constable = this.nextPageOffset;
        int n7 = 0;
        if (constable == null) {
            n4 = 0;
            constable = null;
        } else {
            n4 = constable.hashCode();
        }
        n3 = (n3 + n4) * 31;
        constable = this.transactionLimit;
        if (constable == null) {
            n4 = 0;
            constable = null;
        } else {
            n4 = constable.hashCode();
        }
        n3 = (n3 + n4) * 31;
        constable = this.nextLoad;
        if (constable != null) {
            n7 = constable.hashCode();
        }
        return n3 + n7;
    }

    public final void setNextLoad(Boolean bl2) {
        this.nextLoad = bl2;
    }

    public final void setNextNtPageOffset(int n3) {
        this.nextNtPageOffset = n3;
    }

    public final void setNextPageOffset(Integer n3) {
        this.nextPageOffset = n3;
    }

    public final void setNextRcsPageOffset(int n3) {
        this.nextRcsPageOffset = n3;
    }

    public final void setTransactionLimit(Integer n3) {
        this.transactionLimit = n3;
    }

    public String toString() {
        int n3 = this.nextRcsPageOffset;
        int n4 = this.nextNtPageOffset;
        Integer n7 = this.nextPageOffset;
        Integer n8 = this.transactionLimit;
        Boolean bl2 = this.nextLoad;
        StringBuilder stringBuilder = fQ2.a("AWPaginationDetails(nextRcsPageOffset=", ", nextNtPageOffset=", ", nextPageOffset=", n3, n4);
        stringBuilder.append(n7);
        stringBuilder.append(", transactionLimit=");
        stringBuilder.append(n8);
        stringBuilder.append(", nextLoad=");
        return nx3_0.a(stringBuilder, bl2, ")");
    }
}

