/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import com.ril.ajio.services.query.CurrentQuery;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ImageSearchResponse {
    private final CurrentQuery currentQuery;
    private final List facets;
    private final String im_id;
    private final Pagination pagination;
    private final PriceRevealMetaInfo priceRevealMetaInfo;
    private final List product_types;
    private final List products;
    private List quickFilters;
    private List sorts;

    public ImageSearchResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public ImageSearchResponse(String string2, Pagination pagination, List list, CurrentQuery currentQuery, List list2, List list3, List list4, PriceRevealMetaInfo priceRevealMetaInfo, List list5) {
        this.im_id = string2;
        this.pagination = pagination;
        this.product_types = list;
        this.currentQuery = currentQuery;
        this.products = list2;
        this.sorts = list3;
        this.facets = list4;
        this.priceRevealMetaInfo = priceRevealMetaInfo;
        this.quickFilters = list5;
    }

    public /* synthetic */ ImageSearchResponse(String object, Pagination object2, List object3, CurrentQuery object4, List object5, List list, List list2, PriceRevealMetaInfo object6, List object7, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        PriceRevealMetaInfo priceRevealMetaInfo;
        List list3;
        List list4;
        List list5;
        CurrentQuery currentQuery;
        List list6;
        Pagination pagination;
        String string2;
        int n4 = n3;
        int n7 = n3 & 1;
        List list7 = null;
        if (n7 != 0) {
            n7 = 0;
            string2 = null;
        } else {
            string2 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            pagination = null;
        } else {
            pagination = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            list6 = null;
        } else {
            list6 = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            currentQuery = null;
        } else {
            currentQuery = object4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            list5 = null;
        } else {
            list5 = object5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            list4 = null;
        } else {
            list4 = list;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            list3 = null;
        } else {
            list3 = list2;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            priceRevealMetaInfo = null;
        } else {
            priceRevealMetaInfo = object6;
        }
        if ((n4 &= 0x100) == 0) {
            list7 = object7;
        }
        object = this;
        object2 = string2;
        object3 = pagination;
        object4 = list6;
        object5 = currentQuery;
        list = list5;
        list2 = list4;
        object6 = list3;
        object7 = priceRevealMetaInfo;
        this(string2, pagination, list6, currentQuery, list5, list4, list3, priceRevealMetaInfo, list7);
    }

    public static /* synthetic */ ImageSearchResponse copy$default(ImageSearchResponse imageSearchResponse, String string2, Pagination pagination, List list, CurrentQuery currentQuery, List list2, List list3, List list4, PriceRevealMetaInfo priceRevealMetaInfo, List list5, int n3, Object object) {
        ImageSearchResponse imageSearchResponse2 = imageSearchResponse;
        int n4 = n3;
        int n7 = n3 & 1;
        String string3 = n7 != 0 ? imageSearchResponse.im_id : string2;
        int n8 = n4 & 2;
        Pagination pagination2 = n8 != 0 ? imageSearchResponse2.pagination : pagination;
        int n10 = n4 & 4;
        List list6 = n10 != 0 ? imageSearchResponse2.product_types : list;
        int n14 = n4 & 8;
        CurrentQuery currentQuery2 = n14 != 0 ? imageSearchResponse2.currentQuery : currentQuery;
        int n15 = n4 & 0x10;
        List list7 = n15 != 0 ? imageSearchResponse2.products : list2;
        int n16 = n4 & 0x20;
        List list8 = n16 != 0 ? imageSearchResponse2.sorts : list3;
        int n17 = n4 & 0x40;
        List list9 = n17 != 0 ? imageSearchResponse2.facets : list4;
        int n18 = n4 & 0x80;
        PriceRevealMetaInfo priceRevealMetaInfo2 = n18 != 0 ? imageSearchResponse2.priceRevealMetaInfo : priceRevealMetaInfo;
        List list10 = (n4 &= 0x100) != 0 ? imageSearchResponse2.quickFilters : list5;
        string2 = string3;
        pagination = pagination2;
        list = list6;
        currentQuery = currentQuery2;
        list2 = list7;
        list3 = list8;
        list4 = list9;
        priceRevealMetaInfo = priceRevealMetaInfo2;
        list5 = list10;
        return imageSearchResponse.copy(string3, pagination2, list6, currentQuery2, list7, list8, list9, priceRevealMetaInfo2, list10);
    }

    public final String component1() {
        return this.im_id;
    }

    public final Pagination component2() {
        return this.pagination;
    }

    public final List component3() {
        return this.product_types;
    }

    public final CurrentQuery component4() {
        return this.currentQuery;
    }

    public final List component5() {
        return this.products;
    }

    public final List component6() {
        return this.sorts;
    }

    public final List component7() {
        return this.facets;
    }

    public final PriceRevealMetaInfo component8() {
        return this.priceRevealMetaInfo;
    }

    public final List component9() {
        return this.quickFilters;
    }

    public final ImageSearchResponse copy(String string2, Pagination pagination, List list, CurrentQuery currentQuery, List list2, List list3, List list4, PriceRevealMetaInfo priceRevealMetaInfo, List list5) {
        ImageSearchResponse imageSearchResponse = new ImageSearchResponse(string2, pagination, list, currentQuery, list2, list3, list4, priceRevealMetaInfo, list5);
        return imageSearchResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ImageSearchResponse;
        if (!bl3) {
            return false;
        }
        object = (ImageSearchResponse)object;
        Object object2 = this.im_id;
        Object object3 = ((ImageSearchResponse)object).im_id;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pagination;
        object3 = ((ImageSearchResponse)object).pagination;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.product_types;
        object3 = ((ImageSearchResponse)object).product_types;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.currentQuery;
        object3 = ((ImageSearchResponse)object).currentQuery;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.products;
        object3 = ((ImageSearchResponse)object).products;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sorts;
        object3 = ((ImageSearchResponse)object).sorts;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.facets;
        object3 = ((ImageSearchResponse)object).facets;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priceRevealMetaInfo;
        object3 = ((ImageSearchResponse)object).priceRevealMetaInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.quickFilters;
        object = ((ImageSearchResponse)object).quickFilters;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final CurrentQuery getCurrentQuery() {
        return this.currentQuery;
    }

    public final List getFacets() {
        return this.facets;
    }

    public final String getIm_id() {
        return this.im_id;
    }

    public final Pagination getPagination() {
        return this.pagination;
    }

    public final PriceRevealMetaInfo getPriceRevealMetaInfo() {
        return this.priceRevealMetaInfo;
    }

    public final List getProduct_types() {
        return this.product_types;
    }

    public final List getProducts() {
        return this.products;
    }

    public final List getQuickFilters() {
        return this.quickFilters;
    }

    public final List getSorts() {
        return this.sorts;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.im_id;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.pagination;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.product_types;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.currentQuery;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.products;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sorts;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.facets;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priceRevealMetaInfo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PriceRevealMetaInfo)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.quickFilters;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setQuickFilters(List list) {
        this.quickFilters = list;
    }

    public final void setSorts(List list) {
        this.sorts = list;
    }

    public String toString() {
        String string2 = this.im_id;
        Pagination pagination = this.pagination;
        List list = this.product_types;
        CurrentQuery currentQuery = this.currentQuery;
        List list2 = this.products;
        List list3 = this.sorts;
        List list4 = this.facets;
        PriceRevealMetaInfo priceRevealMetaInfo = this.priceRevealMetaInfo;
        List list5 = this.quickFilters;
        StringBuilder stringBuilder = new StringBuilder("ImageSearchResponse(im_id=");
        stringBuilder.append(string2);
        stringBuilder.append(", pagination=");
        stringBuilder.append(pagination);
        stringBuilder.append(", product_types=");
        stringBuilder.append(list);
        stringBuilder.append(", currentQuery=");
        stringBuilder.append(currentQuery);
        stringBuilder.append(", products=");
        stringBuilder.append(list2);
        stringBuilder.append(", sorts=");
        stringBuilder.append(list3);
        stringBuilder.append(", facets=");
        stringBuilder.append(list4);
        stringBuilder.append(", priceRevealMetaInfo=");
        stringBuilder.append(priceRevealMetaInfo);
        stringBuilder.append(", quickFilters=");
        stringBuilder.append(list5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

