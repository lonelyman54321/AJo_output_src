/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ImageReviewResponse {
    private final Integer pageNumber;
    private final Integer pageSize;
    private final ArrayList productReviewImages;
    private final Integer totalPages;
    private Integer totalReviews;

    public ImageReviewResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public ImageReviewResponse(Integer n3, Integer n4, Integer n7, Integer n8, ArrayList arrayList) {
        this.pageSize = n3;
        this.pageNumber = n4;
        this.totalPages = n7;
        this.totalReviews = n8;
        this.productReviewImages = arrayList;
    }

    public /* synthetic */ ImageReviewResponse(Integer object, Integer object2, Integer n3, Integer n4, ArrayList serializable, int n7, DefaultConstructorMarker object3) {
        int n8 = n7 & 1;
        Integer n10 = 0;
        object3 = n8 != 0 ? n10 : object;
        int n14 = n7 & 2;
        Object object4 = n14 != 0 ? n10 : object2;
        n14 = n7 & 4;
        Integer n15 = n14 != 0 ? n10 : n3;
        n14 = n7 & 8;
        if (n14 == 0) {
            n10 = n4;
        }
        n14 = n7 & 0x10;
        if (n14 != 0) {
            serializable = new Serializable();
        }
        ArrayList arrayList = serializable;
        object = this;
        object2 = object3;
        n3 = object4;
        n4 = n15;
        serializable = n10;
        this((Integer)object3, (Integer)object4, n15, n10, arrayList);
    }

    public static /* synthetic */ ImageReviewResponse copy$default(ImageReviewResponse imageReviewResponse, Integer n3, Integer object, Integer n4, Integer object2, ArrayList serializable, int n7, Object object3) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = imageReviewResponse.pageSize;
        }
        if ((n8 = n7 & 2) != 0) {
            object = imageReviewResponse.pageNumber;
        }
        object3 = object;
        int n10 = n7 & 4;
        if (n10 != 0) {
            n4 = imageReviewResponse.totalPages;
        }
        Integer n14 = n4;
        n10 = n7 & 8;
        if (n10 != 0) {
            object2 = imageReviewResponse.totalReviews;
        }
        Integer n15 = object2;
        n10 = n7 & 0x10;
        if (n10 != 0) {
            serializable = imageReviewResponse.productReviewImages;
        }
        ArrayList arrayList = serializable;
        object = imageReviewResponse;
        n4 = n3;
        object2 = object3;
        serializable = n14;
        object3 = arrayList;
        return imageReviewResponse.copy(n3, (Integer)object2, n14, n15, arrayList);
    }

    public final Integer component1() {
        return this.pageSize;
    }

    public final Integer component2() {
        return this.pageNumber;
    }

    public final Integer component3() {
        return this.totalPages;
    }

    public final Integer component4() {
        return this.totalReviews;
    }

    public final ArrayList component5() {
        return this.productReviewImages;
    }

    public final ImageReviewResponse copy(Integer n3, Integer n4, Integer n7, Integer n8, ArrayList arrayList) {
        ImageReviewResponse imageReviewResponse = new ImageReviewResponse(n3, n4, n7, n8, arrayList);
        return imageReviewResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ImageReviewResponse;
        if (!bl3) {
            return false;
        }
        object = (ImageReviewResponse)object;
        Serializable serializable = this.pageSize;
        Integer n3 = ((ImageReviewResponse)object).pageSize;
        bl3 = Intrinsics.areEqual(serializable, n3);
        if (!bl3) {
            return false;
        }
        serializable = this.pageNumber;
        n3 = ((ImageReviewResponse)object).pageNumber;
        bl3 = Intrinsics.areEqual(serializable, n3);
        if (!bl3) {
            return false;
        }
        serializable = this.totalPages;
        n3 = ((ImageReviewResponse)object).totalPages;
        bl3 = Intrinsics.areEqual(serializable, n3);
        if (!bl3) {
            return false;
        }
        serializable = this.totalReviews;
        n3 = ((ImageReviewResponse)object).totalReviews;
        bl3 = Intrinsics.areEqual(serializable, n3);
        if (!bl3) {
            return false;
        }
        serializable = this.productReviewImages;
        object = ((ImageReviewResponse)object).productReviewImages;
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

    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public final Integer getTotalReviews() {
        return this.totalReviews;
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
        Serializable serializable = this.pageNumber;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
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
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.productReviewImages;
        if (serializable != null) {
            n8 = ((ArrayList)serializable).hashCode();
        }
        return n4 + n8;
    }

    public final void setTotalReviews(Integer n3) {
        this.totalReviews = n3;
    }

    public String toString() {
        Integer n3 = this.pageSize;
        Integer n4 = this.pageNumber;
        Integer n7 = this.totalPages;
        Integer n8 = this.totalReviews;
        ArrayList arrayList = this.productReviewImages;
        StringBuilder stringBuilder = new StringBuilder("ImageReviewResponse(pageSize=");
        stringBuilder.append(n3);
        stringBuilder.append(", pageNumber=");
        stringBuilder.append(n4);
        stringBuilder.append(", totalPages=");
        stringBuilder.append(n7);
        stringBuilder.append(", totalReviews=");
        stringBuilder.append(n8);
        stringBuilder.append(", productReviewImages=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

