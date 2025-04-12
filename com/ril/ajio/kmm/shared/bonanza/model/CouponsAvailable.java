/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.Coupon$$serializer;
import com.ril.ajio.kmm.shared.bonanza.model.CouponsAvailable$Companion;
import com.ril.ajio.kmm.shared.bonanza.model.Filters$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class CouponsAvailable {
    private static final KSerializer[] $childSerializers;
    public static final CouponsAvailable$Companion Companion;
    private List filters;
    private Integer pageNumber;
    private Integer pageSize;
    private List responseBody;
    private Integer totalPages;
    private Integer totalSize;

    static {
        Object object = new CouponsAvailable$Companion(null);
        Companion = object;
        KSerializer kSerializer = Filters$$serializer.INSTANCE;
        object = new ip_2(kSerializer);
        KSerializer[] kSerializerArray = Coupon$$serializer.INSTANCE;
        kSerializer = new ip_2((KSerializer)kSerializerArray);
        kSerializerArray = new KSerializer[]{object, null, null, kSerializer, null, null};
        $childSerializers = kSerializerArray;
    }

    public CouponsAvailable() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ CouponsAvailable(int n3, List list, Integer n4, Integer n7, List list2, Integer n8, Integer n10, a03_0 a03_02) {
        int n14 = n3 & 1;
        this.filters = n14 == 0 ? null : list;
        int n15 = n3 & 2;
        this.pageNumber = n15 == 0 ? null : n4;
        n15 = n3 & 4;
        this.pageSize = n15 == 0 ? null : n7;
        n15 = n3 & 8;
        this.responseBody = n15 == 0 ? null : list2;
        n15 = n3 & 0x10;
        this.totalPages = n15 == 0 ? null : n8;
        this.totalSize = (n3 &= 0x20) == 0 ? null : n10;
    }

    public CouponsAvailable(List list, Integer n3, Integer n4, List list2, Integer n7, Integer n8) {
        this.filters = list;
        this.pageNumber = n3;
        this.pageSize = n4;
        this.responseBody = list2;
        this.totalPages = n7;
        this.totalSize = n8;
    }

    public /* synthetic */ CouponsAvailable(List object, Integer object2, Integer n3, List object3, Integer object4, Integer n4, int n7, DefaultConstructorMarker object5) {
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
        this((List)object5, (Integer)object6, n15, (List)object7, (Integer)object8, n8);
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ CouponsAvailable copy$default(CouponsAvailable couponsAvailable, List list, Integer object, Integer object2, List object3, Integer n3, Integer object4, int n4, Object object5) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            list = couponsAvailable.filters;
        }
        if ((n7 = n4 & 2) != 0) {
            object = couponsAvailable.pageNumber;
        }
        object5 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            object2 = couponsAvailable.pageSize;
        }
        Integer n10 = object2;
        n8 = n4 & 8;
        if (n8 != 0) {
            object3 = couponsAvailable.responseBody;
        }
        List list2 = object3;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            n3 = couponsAvailable.totalPages;
        }
        Integer n14 = n3;
        n8 = n4 & 0x20;
        if (n8 != 0) {
            object4 = couponsAvailable.totalSize;
        }
        Integer n15 = object4;
        object = couponsAvailable;
        object2 = list;
        object3 = object5;
        n3 = n10;
        object4 = list2;
        object5 = n15;
        return couponsAvailable.copy(list, (Integer)object3, n10, list2, n14, n15);
    }

    public static final /* synthetic */ void write$Self$shared_release(CouponsAvailable object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        int n3;
        Object object2;
        Object object3;
        Object object4 = $childSerializers;
        int n4 = 0;
        Object object5 = null;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object3 = ((CouponsAvailable)object).filters) != null) {
            object3 = object4[0];
            object2 = ((CouponsAvailable)object).filters;
            u30_02.r(serialDescriptor, 0, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 1)) || (object3 = ((CouponsAvailable)object).pageNumber) != null) {
            object3 = yi1_2.a;
            object2 = ((CouponsAvailable)object).pageNumber;
            u30_02.r(serialDescriptor, n4, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 2)) || (object3 = ((CouponsAvailable)object).pageSize) != null) {
            object3 = yi1_2.a;
            object2 = ((CouponsAvailable)object).pageSize;
            u30_02.r(serialDescriptor, n4, (b03_0)object3, object2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 3)) || (object3 = ((CouponsAvailable)object).responseBody) != null) {
            object4 = object4[n4];
            object3 = ((CouponsAvailable)object).responseBody;
            u30_02.r(serialDescriptor, n4, (b03_0)object4, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 4) ? 1 : 0)) != 0 || (object5 = ((CouponsAvailable)object).totalPages) != null) {
            object5 = yi1_2.a;
            object3 = ((CouponsAvailable)object).totalPages;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object3);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 5) ? 1 : 0)) != 0 || (object5 = ((CouponsAvailable)object).totalSize) != null) {
            object5 = yi1_2.a;
            object = ((CouponsAvailable)object).totalSize;
            u30_02.r(serialDescriptor, n3, (b03_0)object5, object);
        }
    }

    public final List component1() {
        return this.filters;
    }

    public final Integer component2() {
        return this.pageNumber;
    }

    public final Integer component3() {
        return this.pageSize;
    }

    public final List component4() {
        return this.responseBody;
    }

    public final Integer component5() {
        return this.totalPages;
    }

    public final Integer component6() {
        return this.totalSize;
    }

    public final CouponsAvailable copy(List list, Integer n3, Integer n4, List list2, Integer n7, Integer n8) {
        CouponsAvailable couponsAvailable = new CouponsAvailable(list, n3, n4, list2, n7, n8);
        return couponsAvailable;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CouponsAvailable;
        if (!bl3) {
            return false;
        }
        object = (CouponsAvailable)object;
        Object object2 = this.filters;
        Object object3 = ((CouponsAvailable)object).filters;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageNumber;
        object3 = ((CouponsAvailable)object).pageNumber;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageSize;
        object3 = ((CouponsAvailable)object).pageSize;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.responseBody;
        object3 = ((CouponsAvailable)object).responseBody;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalPages;
        object3 = ((CouponsAvailable)object).totalPages;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalSize;
        object = ((CouponsAvailable)object).totalSize;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getFilters() {
        return this.filters;
    }

    public final Integer getPageNumber() {
        return this.pageNumber;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final List getResponseBody() {
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
        List list = this.filters;
        int n7 = 0;
        if (list == null) {
            n4 = 0;
            list = null;
        } else {
            n4 = ((Object)list).hashCode();
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

    public final void setFilters(List list) {
        this.filters = list;
    }

    public final void setPageNumber(Integer n3) {
        this.pageNumber = n3;
    }

    public final void setPageSize(Integer n3) {
        this.pageSize = n3;
    }

    public final void setResponseBody(List list) {
        this.responseBody = list;
    }

    public final void setTotalPages(Integer n3) {
        this.totalPages = n3;
    }

    public final void setTotalSize(Integer n3) {
        this.totalSize = n3;
    }

    public String toString() {
        List list = this.filters;
        Integer n3 = this.pageNumber;
        Integer n4 = this.pageSize;
        List list2 = this.responseBody;
        Integer n7 = this.totalPages;
        Integer n8 = this.totalSize;
        StringBuilder stringBuilder = new StringBuilder("CouponsAvailable(filters=");
        stringBuilder.append(list);
        stringBuilder.append(", pageNumber=");
        stringBuilder.append(n3);
        stringBuilder.append(", pageSize=");
        stringBuilder.append(n4);
        stringBuilder.append(", responseBody=");
        stringBuilder.append(list2);
        stringBuilder.append(", totalPages=");
        stringBuilder.append(n7);
        stringBuilder.append(", totalSize=");
        stringBuilder.append(n8);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

