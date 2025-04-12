/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.reviewRatings;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CustomerReviewsModel {
    private final Integer pageNumber;
    private final Integer pageSize;
    private final ArrayList productReviewImages;
    private final ArrayList productReviews;
    private final Integer totalPages;
    private final Integer totalReviews;

    public CustomerReviewsModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public CustomerReviewsModel(Integer n3, Integer n4, ArrayList arrayList, ArrayList arrayList2, Integer n7, Integer n8) {
        this.pageNumber = n3;
        this.pageSize = n4;
        this.productReviews = arrayList;
        this.productReviewImages = arrayList2;
        this.totalPages = n7;
        this.totalReviews = n8;
    }

    public /* synthetic */ CustomerReviewsModel(Integer object, Integer object2, ArrayList serializable, ArrayList arrayList, Integer serializable2, Integer n3, int n4, DefaultConstructorMarker object3) {
        int n7 = n4 & 1;
        Integer n8 = 0;
        object3 = n7 != 0 ? n8 : object;
        int n10 = n4 & 2;
        Object object4 = n10 != 0 ? n8 : object2;
        n10 = n4 & 4;
        if (n10 != 0) {
            serializable = new Serializable();
        }
        ArrayList arrayList2 = serializable;
        n10 = n4 & 8;
        if (n10 != 0) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList3 = arrayList;
        n10 = n4 & 0x10;
        Integer n14 = n10 != 0 ? n8 : serializable2;
        n10 = n4 & 0x20;
        Integer n15 = n10 != 0 ? n8 : n3;
        object = this;
        object2 = object3;
        serializable = object4;
        arrayList = arrayList2;
        serializable2 = arrayList3;
        n3 = n14;
        this((Integer)object3, (Integer)object4, arrayList2, arrayList3, n14, n15);
    }

    public static /* synthetic */ CustomerReviewsModel copy$default(CustomerReviewsModel customerReviewsModel, Integer n3, Integer object, ArrayList serializable, ArrayList object2, Integer serializable2, Integer serializable3, int n4, Object object3) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = customerReviewsModel.pageNumber;
        }
        if ((n7 = n4 & 2) != 0) {
            object = customerReviewsModel.pageSize;
        }
        object3 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            serializable = customerReviewsModel.productReviews;
        }
        ArrayList arrayList = serializable;
        n8 = n4 & 8;
        if (n8 != 0) {
            object2 = customerReviewsModel.productReviewImages;
        }
        ArrayList arrayList2 = object2;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            serializable2 = customerReviewsModel.totalPages;
        }
        Integer n10 = serializable2;
        n8 = n4 & 0x20;
        if (n8 != 0) {
            serializable3 = customerReviewsModel.totalReviews;
        }
        Integer n14 = serializable3;
        object = customerReviewsModel;
        serializable = n3;
        object2 = object3;
        serializable2 = arrayList;
        serializable3 = arrayList2;
        object3 = n14;
        return customerReviewsModel.copy(n3, (Integer)object2, arrayList, arrayList2, n10, n14);
    }

    public final Integer component1() {
        return this.pageNumber;
    }

    public final Integer component2() {
        return this.pageSize;
    }

    public final ArrayList component3() {
        return this.productReviews;
    }

    public final ArrayList component4() {
        return this.productReviewImages;
    }

    public final Integer component5() {
        return this.totalPages;
    }

    public final Integer component6() {
        return this.totalReviews;
    }

    public final CustomerReviewsModel copy(Integer n3, Integer n4, ArrayList arrayList, ArrayList arrayList2, Integer n7, Integer n8) {
        CustomerReviewsModel customerReviewsModel = new CustomerReviewsModel(n3, n4, arrayList, arrayList2, n7, n8);
        return customerReviewsModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CustomerReviewsModel;
        if (!bl3) {
            return false;
        }
        object = (CustomerReviewsModel)object;
        Serializable serializable = this.pageNumber;
        Serializable serializable2 = ((CustomerReviewsModel)object).pageNumber;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.pageSize;
        serializable2 = ((CustomerReviewsModel)object).pageSize;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.productReviews;
        serializable2 = ((CustomerReviewsModel)object).productReviews;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.productReviewImages;
        serializable2 = ((CustomerReviewsModel)object).productReviewImages;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.totalPages;
        serializable2 = ((CustomerReviewsModel)object).totalPages;
        bl3 = Intrinsics.areEqual(serializable, serializable2);
        if (!bl3) {
            return false;
        }
        serializable = this.totalReviews;
        object = ((CustomerReviewsModel)object).totalReviews;
        boolean bl4 = Intrinsics.areEqual(serializable, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getPageNumber() {
        return this.pageNumber;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final ArrayList getProductReviewImages() {
        return this.productReviewImages;
    }

    public final ArrayList getProductReviews() {
        return this.productReviews;
    }

    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public final Integer getTotalReviews() {
        return this.totalReviews;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.pageNumber;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Serializable serializable = this.pageSize;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.productReviews;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = ((ArrayList)serializable).hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.productReviewImages;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = ((ArrayList)serializable).hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.totalPages;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.totalReviews;
        if (serializable != null) {
            n8 = serializable.hashCode();
        }
        return n4 + n8;
    }

    public String toString() {
        Integer n3 = this.pageNumber;
        Integer n4 = this.pageSize;
        ArrayList arrayList = this.productReviews;
        ArrayList arrayList2 = this.productReviewImages;
        Integer n7 = this.totalPages;
        Integer n8 = this.totalReviews;
        StringBuilder stringBuilder = new StringBuilder("CustomerReviewsModel(pageNumber=");
        stringBuilder.append(n3);
        stringBuilder.append(", pageSize=");
        stringBuilder.append(n4);
        stringBuilder.append(", productReviews=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", productReviewImages=");
        stringBuilder.append(arrayList2);
        stringBuilder.append(", totalPages=");
        stringBuilder.append(n7);
        stringBuilder.append(", totalReviews=");
        stringBuilder.append(n8);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

