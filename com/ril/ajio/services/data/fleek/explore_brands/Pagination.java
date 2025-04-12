/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Pagination {
    private Integer currentPage;
    private Integer pageSize;
    private String sort;
    private Integer totalPages;
    private Integer totalResults;

    public Pagination() {
        this(null, null, null, null, null, 31, null);
    }

    public Pagination(Integer n3, String string2, Integer n4, Integer n7, Integer n8) {
        this.pageSize = n3;
        this.sort = string2;
        this.currentPage = n4;
        this.totalResults = n7;
        this.totalPages = n8;
    }

    public /* synthetic */ Pagination(Integer object, String object2, Integer object3, Integer n3, Integer n4, int n7, DefaultConstructorMarker object4) {
        Integer n8;
        int n10 = n7 & 1;
        if (n10 != 0) {
            n10 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n14 = n7 & 2;
        Object object5 = n14 != 0 ? null : object2;
        n14 = n7 & 4;
        Object object6 = n14 != 0 ? null : object3;
        n14 = n7 & 8;
        Integer n15 = n14 != 0 ? null : n3;
        n14 = n7 & 0x10;
        if (n14 != 0) {
            n7 = 0;
            n8 = null;
        } else {
            n8 = n4;
        }
        object = this;
        object2 = object4;
        object3 = object5;
        n3 = object6;
        n4 = n15;
        this((Integer)object4, (String)object5, (Integer)object6, n15, n8);
    }

    public static /* synthetic */ Pagination copy$default(Pagination pagination, Integer n3, String object, Integer n4, Integer object2, Integer n7, int n8, Object object3) {
        int n10 = n8 & 1;
        if (n10 != 0) {
            n3 = pagination.pageSize;
        }
        if ((n10 = n8 & 2) != 0) {
            object = pagination.sort;
        }
        object3 = object;
        int n14 = n8 & 4;
        if (n14 != 0) {
            n4 = pagination.currentPage;
        }
        Integer n15 = n4;
        n14 = n8 & 8;
        if (n14 != 0) {
            object2 = pagination.totalResults;
        }
        Integer n16 = object2;
        n14 = n8 & 0x10;
        if (n14 != 0) {
            n7 = pagination.totalPages;
        }
        Integer n17 = n7;
        object = pagination;
        n4 = n3;
        object2 = object3;
        n7 = n15;
        object3 = n17;
        return pagination.copy(n3, (String)object2, n15, n16, n17);
    }

    public final Integer component1() {
        return this.pageSize;
    }

    public final String component2() {
        return this.sort;
    }

    public final Integer component3() {
        return this.currentPage;
    }

    public final Integer component4() {
        return this.totalResults;
    }

    public final Integer component5() {
        return this.totalPages;
    }

    public final Pagination copy(Integer n3, String string2, Integer n4, Integer n7, Integer n8) {
        Pagination pagination = new Pagination(n3, string2, n4, n7, n8);
        return pagination;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Pagination;
        if (!bl3) {
            return false;
        }
        object = (Pagination)object;
        Object object2 = this.pageSize;
        Object object3 = ((Pagination)object).pageSize;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sort;
        object3 = ((Pagination)object).sort;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.currentPage;
        object3 = ((Pagination)object).currentPage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalResults;
        object3 = ((Pagination)object).totalResults;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalPages;
        object = ((Pagination)object).totalPages;
        boolean bl4 = Intrinsics.areEqual(object2, object);
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

    public final String getSort() {
        return this.sort;
    }

    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public final Integer getTotalResults() {
        return this.totalResults;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.pageSize;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Object object = this.sort;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.currentPage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalResults;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalPages;
        if (object != null) {
            n8 = object.hashCode();
        }
        return n4 + n8;
    }

    public final void setCurrentPage(Integer n3) {
        this.currentPage = n3;
    }

    public final void setPageSize(Integer n3) {
        this.pageSize = n3;
    }

    public final void setSort(String string2) {
        this.sort = string2;
    }

    public final void setTotalPages(Integer n3) {
        this.totalPages = n3;
    }

    public final void setTotalResults(Integer n3) {
        this.totalResults = n3;
    }

    public String toString() {
        Integer n3 = this.pageSize;
        String string2 = this.sort;
        Integer n4 = this.currentPage;
        Integer n7 = this.totalResults;
        Integer n8 = this.totalPages;
        StringBuilder stringBuilder = new StringBuilder("Pagination(pageSize=");
        stringBuilder.append(n3);
        stringBuilder.append(", sort=");
        stringBuilder.append(string2);
        stringBuilder.append(", currentPage=");
        stringBuilder.append(n4);
        stringBuilder.append(", totalResults=");
        stringBuilder.append(n7);
        stringBuilder.append(", totalPages=");
        stringBuilder.append(n8);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

