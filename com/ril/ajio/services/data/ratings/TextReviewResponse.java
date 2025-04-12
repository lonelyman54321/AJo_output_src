/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class TextReviewResponse {
    private final Integer pageNumber;
    private final Integer pageSize;
    private ArrayList productReviews;
    private final Integer totalPages;

    public TextReviewResponse() {
        this(null, null, null, null, 15, null);
    }

    public TextReviewResponse(Integer n3, Integer n4, Integer n7, ArrayList arrayList) {
        this.pageSize = n3;
        this.pageNumber = n4;
        this.totalPages = n7;
        this.productReviews = arrayList;
    }

    public /* synthetic */ TextReviewResponse(Integer n3, Integer n4, Integer n7, ArrayList arrayList, int n8, DefaultConstructorMarker defaultConstructorMarker) {
        int n10 = n8 & 1;
        Integer n14 = 0;
        if (n10 != 0) {
            n3 = n14;
        }
        if ((n10 = n8 & 2) != 0) {
            n4 = n14;
        }
        if ((n10 = n8 & 4) != 0) {
            n7 = n14;
        }
        if ((n8 &= 8) != 0) {
            arrayList = new ArrayList();
        }
        this(n3, n4, n7, arrayList);
    }

    public static /* synthetic */ TextReviewResponse copy$default(TextReviewResponse textReviewResponse, Integer n3, Integer n4, Integer n7, ArrayList arrayList, int n8, Object object) {
        int n10 = n8 & 1;
        if (n10 != 0) {
            n3 = textReviewResponse.pageSize;
        }
        if ((n10 = n8 & 2) != 0) {
            n4 = textReviewResponse.pageNumber;
        }
        if ((n10 = n8 & 4) != 0) {
            n7 = textReviewResponse.totalPages;
        }
        if ((n8 &= 8) != 0) {
            arrayList = textReviewResponse.productReviews;
        }
        return textReviewResponse.copy(n3, n4, n7, arrayList);
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

    public final ArrayList component4() {
        return this.productReviews;
    }

    public final TextReviewResponse copy(Integer n3, Integer n4, Integer n7, ArrayList arrayList) {
        TextReviewResponse textReviewResponse = new TextReviewResponse(n3, n4, n7, arrayList);
        return textReviewResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof TextReviewResponse;
        if (!bl3) {
            return false;
        }
        object = (TextReviewResponse)object;
        Serializable serializable = this.pageSize;
        Integer n3 = ((TextReviewResponse)object).pageSize;
        bl3 = Intrinsics.areEqual(serializable, n3);
        if (!bl3) {
            return false;
        }
        serializable = this.pageNumber;
        n3 = ((TextReviewResponse)object).pageNumber;
        bl3 = Intrinsics.areEqual(serializable, n3);
        if (!bl3) {
            return false;
        }
        serializable = this.totalPages;
        n3 = ((TextReviewResponse)object).totalPages;
        bl3 = Intrinsics.areEqual(serializable, n3);
        if (!bl3) {
            return false;
        }
        serializable = this.productReviews;
        object = ((TextReviewResponse)object).productReviews;
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

    public final ArrayList getProductReviews() {
        return this.productReviews;
    }

    public final Integer getTotalPages() {
        return this.totalPages;
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
        serializable = this.productReviews;
        if (serializable != null) {
            n8 = ((ArrayList)serializable).hashCode();
        }
        return n4 + n8;
    }

    public final void setProductReviews(ArrayList arrayList) {
        this.productReviews = arrayList;
    }

    public String toString() {
        Integer n3 = this.pageSize;
        Integer n4 = this.pageNumber;
        Integer n7 = this.totalPages;
        ArrayList arrayList = this.productReviews;
        StringBuilder stringBuilder = new StringBuilder("TextReviewResponse(pageSize=");
        stringBuilder.append(n3);
        stringBuilder.append(", pageNumber=");
        stringBuilder.append(n4);
        stringBuilder.append(", totalPages=");
        stringBuilder.append(n7);
        stringBuilder.append(", productReviews=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

