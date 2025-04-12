/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.bonanza.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ICouponsAvailable {
    public static final int $stable = 8;
    private p83_0 filters;
    private Integer pageNumber;
    private Integer pageSize;
    private p83_0 responseBody;
    private Integer totalPages;
    private Integer totalSize;

    public ICouponsAvailable() {
        this(null, null, null, null, null, null, 63, null);
    }

    public ICouponsAvailable(p83_0 p83_02, Integer n3, Integer n4, p83_0 p83_03, Integer n7, Integer n8) {
        this.filters = p83_02;
        this.pageNumber = n3;
        this.pageSize = n4;
        this.responseBody = p83_03;
        this.totalPages = n7;
        this.totalSize = n8;
    }

    public /* synthetic */ ICouponsAvailable(p83_0 object, Integer object2, Integer n3, p83_0 object3, Integer object4, Integer n4, int n7, DefaultConstructorMarker object5) {
        Integer n8;
        int n10 = n7 & 1;
        if (n10 != 0) {
            n10 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n14 = n7 & 2;
        Object object6 = n14 != 0 ? null : object2;
        n14 = n7 & 4;
        Integer n15 = n14 != 0 ? null : n3;
        n14 = n7 & 8;
        Object object7 = n14 != 0 ? null : object3;
        n14 = n7 & 0x10;
        Object object8 = n14 != 0 ? null : object4;
        n14 = n7 & 0x20;
        if (n14 != 0) {
            n7 = 0;
            n8 = null;
        } else {
            n8 = n4;
        }
        object = this;
        object2 = object5;
        n3 = object6;
        object3 = n15;
        object4 = object7;
        n4 = object8;
        this((p83_0)object5, (Integer)object6, n15, (p83_0)object7, (Integer)object8, n8);
    }

    public static /* synthetic */ ICouponsAvailable copy$default(ICouponsAvailable iCouponsAvailable, p83_0 p83_02, Integer object, Integer object2, p83_0 object3, Integer n3, Integer object4, int n4, Object object5) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            p83_02 = iCouponsAvailable.filters;
        }
        if ((n7 = n4 & 2) != 0) {
            object = iCouponsAvailable.pageNumber;
        }
        object5 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            object2 = iCouponsAvailable.pageSize;
        }
        Integer n10 = object2;
        n8 = n4 & 8;
        if (n8 != 0) {
            object3 = iCouponsAvailable.responseBody;
        }
        p83_0 p83_03 = object3;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            n3 = iCouponsAvailable.totalPages;
        }
        Integer n14 = n3;
        n8 = n4 & 0x20;
        if (n8 != 0) {
            object4 = iCouponsAvailable.totalSize;
        }
        Integer n15 = object4;
        object = iCouponsAvailable;
        object2 = p83_02;
        object3 = object5;
        n3 = n10;
        object4 = p83_03;
        object5 = n15;
        return iCouponsAvailable.copy(p83_02, (Integer)object3, n10, p83_03, n14, n15);
    }

    public final p83_0 component1() {
        return this.filters;
    }

    public final Integer component2() {
        return this.pageNumber;
    }

    public final Integer component3() {
        return this.pageSize;
    }

    public final p83_0 component4() {
        return this.responseBody;
    }

    public final Integer component5() {
        return this.totalPages;
    }

    public final Integer component6() {
        return this.totalSize;
    }

    public final ICouponsAvailable copy(p83_0 p83_02, Integer n3, Integer n4, p83_0 p83_03, Integer n7, Integer n8) {
        ICouponsAvailable iCouponsAvailable = new ICouponsAvailable(p83_02, n3, n4, p83_03, n7, n8);
        return iCouponsAvailable;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ICouponsAvailable;
        if (!bl3) {
            return false;
        }
        object = (ICouponsAvailable)object;
        Object object2 = this.filters;
        Object object3 = ((ICouponsAvailable)object).filters;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageNumber;
        object3 = ((ICouponsAvailable)object).pageNumber;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageSize;
        object3 = ((ICouponsAvailable)object).pageSize;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.responseBody;
        object3 = ((ICouponsAvailable)object).responseBody;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalPages;
        object3 = ((ICouponsAvailable)object).totalPages;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalSize;
        object = ((ICouponsAvailable)object).totalSize;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final p83_0 getFilters() {
        return this.filters;
    }

    public final Integer getPageNumber() {
        return this.pageNumber;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final p83_0 getResponseBody() {
        return this.responseBody;
    }

    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public final Integer getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        int n3;
        int n4;
        p83_0 p83_02 = this.filters;
        int n7 = 0;
        if (p83_02 == null) {
            n4 = 0;
            p83_02 = null;
        } else {
            n4 = p83_02.hashCode();
        }
        n4 *= 31;
        Object object = this.pageNumber;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageSize;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.responseBody;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalPages;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalSize;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setFilters(p83_0 p83_02) {
        this.filters = p83_02;
    }

    public final void setPageNumber(Integer n3) {
        this.pageNumber = n3;
    }

    public final void setPageSize(Integer n3) {
        this.pageSize = n3;
    }

    public final void setResponseBody(p83_0 p83_02) {
        this.responseBody = p83_02;
    }

    public final void setTotalPages(Integer n3) {
        this.totalPages = n3;
    }

    public final void setTotalSize(Integer n3) {
        this.totalSize = n3;
    }

    public String toString() {
        p83_0 p83_02 = this.filters;
        Integer n3 = this.pageNumber;
        Integer n4 = this.pageSize;
        p83_0 p83_03 = this.responseBody;
        Integer n7 = this.totalPages;
        Integer n8 = this.totalSize;
        StringBuilder stringBuilder = new StringBuilder("ICouponsAvailable(filters=");
        stringBuilder.append(p83_02);
        stringBuilder.append(", pageNumber=");
        stringBuilder.append(n3);
        stringBuilder.append(", pageSize=");
        stringBuilder.append(n4);
        stringBuilder.append(", responseBody=");
        stringBuilder.append(p83_03);
        stringBuilder.append(", totalPages=");
        stringBuilder.append(n7);
        stringBuilder.append(", totalSize=");
        stringBuilder.append(n8);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

