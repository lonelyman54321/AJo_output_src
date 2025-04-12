/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PaginationInfo {
    private Integer currentPage;
    private Integer pageSize;
    private Integer totalComponents;
    private Integer totalPages;

    public PaginationInfo() {
        this(null, null, null, null, 15, null);
    }

    public PaginationInfo(Integer n3, Integer n4, Integer n7, Integer n8) {
        this.totalPages = n3;
        this.totalComponents = n4;
        this.pageSize = n7;
        this.currentPage = n8;
    }

    public /* synthetic */ PaginationInfo(Integer n3, Integer n4, Integer n7, Integer n8, int n10, DefaultConstructorMarker defaultConstructorMarker) {
        int n14 = n10 & 1;
        if (n14 != 0) {
            n3 = null;
        }
        if ((n14 = n10 & 2) != 0) {
            n4 = null;
        }
        if ((n14 = n10 & 4) != 0) {
            n7 = null;
        }
        if ((n10 &= 8) != 0) {
            n8 = null;
        }
        this(n3, n4, n7, n8);
    }

    public static /* synthetic */ PaginationInfo copy$default(PaginationInfo paginationInfo, Integer n3, Integer n4, Integer n7, Integer n8, int n10, Object object) {
        int n14 = n10 & 1;
        if (n14 != 0) {
            n3 = paginationInfo.totalPages;
        }
        if ((n14 = n10 & 2) != 0) {
            n4 = paginationInfo.totalComponents;
        }
        if ((n14 = n10 & 4) != 0) {
            n7 = paginationInfo.pageSize;
        }
        if ((n10 &= 8) != 0) {
            n8 = paginationInfo.currentPage;
        }
        return paginationInfo.copy(n3, n4, n7, n8);
    }

    public final Integer component1() {
        return this.totalPages;
    }

    public final Integer component2() {
        return this.totalComponents;
    }

    public final Integer component3() {
        return this.pageSize;
    }

    public final Integer component4() {
        return this.currentPage;
    }

    public final PaginationInfo copy(Integer n3, Integer n4, Integer n7, Integer n8) {
        PaginationInfo paginationInfo = new PaginationInfo(n3, n4, n7, n8);
        return paginationInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PaginationInfo;
        if (!bl3) {
            return false;
        }
        object = (PaginationInfo)object;
        Integer n3 = this.totalPages;
        Integer n4 = ((PaginationInfo)object).totalPages;
        bl3 = Intrinsics.areEqual(n3, n4);
        if (!bl3) {
            return false;
        }
        n3 = this.totalComponents;
        n4 = ((PaginationInfo)object).totalComponents;
        bl3 = Intrinsics.areEqual(n3, n4);
        if (!bl3) {
            return false;
        }
        n3 = this.pageSize;
        n4 = ((PaginationInfo)object).pageSize;
        bl3 = Intrinsics.areEqual(n3, n4);
        if (!bl3) {
            return false;
        }
        n3 = this.currentPage;
        object = ((PaginationInfo)object).currentPage;
        boolean bl4 = Intrinsics.areEqual(n3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final Integer getTotalComponents() {
        return this.totalComponents;
    }

    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.totalPages;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Integer n10 = this.totalComponents;
        if (n10 == null) {
            n3 = 0;
            n10 = null;
        } else {
            n3 = ((Object)n10).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n10 = this.pageSize;
        if (n10 == null) {
            n3 = 0;
            n10 = null;
        } else {
            n3 = ((Object)n10).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n10 = this.currentPage;
        if (n10 != null) {
            n8 = ((Object)n10).hashCode();
        }
        return n4 + n8;
    }

    public final void setCurrentPage(Integer n3) {
        this.currentPage = n3;
    }

    public final void setPageSize(Integer n3) {
        this.pageSize = n3;
    }

    public final void setTotalComponents(Integer n3) {
        this.totalComponents = n3;
    }

    public final void setTotalPages(Integer n3) {
        this.totalPages = n3;
    }

    public String toString() {
        Integer n3 = this.totalPages;
        Integer n4 = this.totalComponents;
        Integer n7 = this.pageSize;
        Integer n8 = this.currentPage;
        StringBuilder stringBuilder = new StringBuilder("PaginationInfo(totalPages=");
        stringBuilder.append(n3);
        stringBuilder.append(", totalComponents=");
        stringBuilder.append(n4);
        stringBuilder.append(", pageSize=");
        stringBuilder.append(n7);
        stringBuilder.append(", currentPage=");
        stringBuilder.append(n8);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

