/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.reviewRatings;

import com.ril.ajio.services.data.reviewRatings.ImageMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ProductReview {
    private final String createdDate;
    private final String helpfulContent;
    private final ImageMap imageMap;
    private Boolean isMarkedHelpful;
    private final Boolean isVerified;
    private Integer pageNumber;
    private final Double rating;
    private final Integer reviewId;
    private final String reviewStatus;
    private final String reviewText;
    private final String reviewerName;
    private Integer totalPages;

    public ProductReview() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public ProductReview(String string2, String string3, ImageMap imageMap, Double d2, Integer n3, String string4, String string5, Boolean bl2, Boolean bl3, String string6, Integer n4, Integer n7) {
        this.createdDate = string2;
        this.helpfulContent = string3;
        this.imageMap = imageMap;
        this.rating = d2;
        this.reviewId = n3;
        this.reviewText = string4;
        this.reviewerName = string5;
        this.isVerified = bl2;
        this.isMarkedHelpful = bl3;
        this.reviewStatus = string6;
        this.pageNumber = n4;
        this.totalPages = n7;
    }

    public /* synthetic */ ProductReview(String object, String string2, ImageMap object2, Double object3, Integer object4, String object5, String string3, Boolean object6, Boolean bl2, String object7, Integer object8, Integer n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        String string4;
        Object object9;
        ImageMap imageMap;
        Object object10;
        int n7;
        Object object11;
        int n8;
        Boolean bl3;
        int n10;
        int n14;
        int n15 = n4;
        int n16 = n4 & 1;
        String string5 = "";
        Object object12 = n16 != 0 ? string5 : object;
        int n17 = n15 & 2;
        String string6 = n17 != 0 ? string5 : string2;
        int n18 = n15 & 4;
        if (n18 != 0) {
            n14 = 7;
            n10 = 0;
            bl3 = null;
            n8 = 0;
            object11 = null;
            n7 = 0;
            object10 = null;
            object9 = imageMap;
            imageMap = new ImageMap(null, null, null, n14, null);
        } else {
            imageMap = object2;
        }
        int n19 = n15 & 8;
        if (n19 != 0) {
            double d2 = 0.0;
            object9 = d2;
        } else {
            object9 = object3;
        }
        n8 = n15 & 0x10;
        object11 = n8 != 0 ? Integer.valueOf(0) : object4;
        n7 = n15 & 0x20;
        object10 = n7 != 0 ? string5 : object5;
        n14 = n15 & 0x40;
        if (n14 == 0) {
            string5 = string3;
        }
        n14 = n15 & 0x80;
        Object object13 = n14 != 0 ? Boolean.FALSE : object6;
        n10 = n15 & 0x100;
        bl3 = n10 != 0 ? Boolean.FALSE : bl2;
        int n20 = n15 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string4 = null;
        } else {
            string4 = object7;
        }
        int n21 = n15 & 0x400;
        Object object14 = n21 != 0 ? Integer.valueOf(0) : object8;
        Integer n22 = (n15 &= 0x800) != 0 ? Integer.valueOf(0) : n3;
        object = this;
        string2 = object12;
        object2 = string6;
        object3 = imageMap;
        object4 = object9;
        object5 = object11;
        string3 = object10;
        object6 = string5;
        bl2 = object13;
        object7 = bl3;
        object8 = string4;
        n3 = object14;
        this((String)object12, string6, imageMap, (Double)object9, (Integer)object11, (String)object10, string5, (Boolean)object13, bl3, string4, (Integer)object14, n22);
    }

    public static /* synthetic */ ProductReview copy$default(ProductReview productReview, String string2, String string3, ImageMap imageMap, Double d2, Integer n3, String string4, String string5, Boolean bl2, Boolean bl3, String string6, Integer n4, Integer n7, int n8, Object object) {
        ProductReview productReview2 = productReview;
        int n10 = n8;
        int n14 = n8 & 1;
        String string7 = n14 != 0 ? productReview.createdDate : string2;
        int n15 = n10 & 2;
        String string8 = n15 != 0 ? productReview2.helpfulContent : string3;
        int n16 = n10 & 4;
        ImageMap imageMap2 = n16 != 0 ? productReview2.imageMap : imageMap;
        int n17 = n10 & 8;
        Double d5 = n17 != 0 ? productReview2.rating : d2;
        int n18 = n10 & 0x10;
        Integer n19 = n18 != 0 ? productReview2.reviewId : n3;
        int n20 = n10 & 0x20;
        String string9 = n20 != 0 ? productReview2.reviewText : string4;
        int n21 = n10 & 0x40;
        String string10 = n21 != 0 ? productReview2.reviewerName : string5;
        int n22 = n10 & 0x80;
        Boolean bl4 = n22 != 0 ? productReview2.isVerified : bl2;
        int n24 = n10 & 0x100;
        Boolean bl5 = n24 != 0 ? productReview2.isMarkedHelpful : bl3;
        int n25 = n10 & 0x200;
        String string11 = n25 != 0 ? productReview2.reviewStatus : string6;
        int n26 = n10 & 0x400;
        Integer n27 = n26 != 0 ? productReview2.pageNumber : n4;
        Integer n28 = (n10 &= 0x800) != 0 ? productReview2.totalPages : n7;
        string2 = string7;
        string3 = string8;
        imageMap = imageMap2;
        d2 = d5;
        n3 = n19;
        string4 = string9;
        string5 = string10;
        bl2 = bl4;
        bl3 = bl5;
        string6 = string11;
        n4 = n27;
        n7 = n28;
        return productReview.copy(string7, string8, imageMap2, d5, n19, string9, string10, bl4, bl5, string11, n27, n28);
    }

    public final String component1() {
        return this.createdDate;
    }

    public final String component10() {
        return this.reviewStatus;
    }

    public final Integer component11() {
        return this.pageNumber;
    }

    public final Integer component12() {
        return this.totalPages;
    }

    public final String component2() {
        return this.helpfulContent;
    }

    public final ImageMap component3() {
        return this.imageMap;
    }

    public final Double component4() {
        return this.rating;
    }

    public final Integer component5() {
        return this.reviewId;
    }

    public final String component6() {
        return this.reviewText;
    }

    public final String component7() {
        return this.reviewerName;
    }

    public final Boolean component8() {
        return this.isVerified;
    }

    public final Boolean component9() {
        return this.isMarkedHelpful;
    }

    public final ProductReview copy(String string2, String string3, ImageMap imageMap, Double d2, Integer n3, String string4, String string5, Boolean bl2, Boolean bl3, String string6, Integer n4, Integer n7) {
        ProductReview productReview = new ProductReview(string2, string3, imageMap, d2, n3, string4, string5, bl2, bl3, string6, n4, n7);
        return productReview;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ProductReview;
        if (!bl3) {
            return false;
        }
        object = (ProductReview)object;
        Object object2 = this.createdDate;
        Object object3 = ((ProductReview)object).createdDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.helpfulContent;
        object3 = ((ProductReview)object).helpfulContent;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageMap;
        object3 = ((ProductReview)object).imageMap;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.rating;
        object3 = ((ProductReview)object).rating;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewId;
        object3 = ((ProductReview)object).reviewId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewText;
        object3 = ((ProductReview)object).reviewText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewerName;
        object3 = ((ProductReview)object).reviewerName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isVerified;
        object3 = ((ProductReview)object).isVerified;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isMarkedHelpful;
        object3 = ((ProductReview)object).isMarkedHelpful;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reviewStatus;
        object3 = ((ProductReview)object).reviewStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageNumber;
        object3 = ((ProductReview)object).pageNumber;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalPages;
        object = ((ProductReview)object).totalPages;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final String getHelpfulContent() {
        return this.helpfulContent;
    }

    public final ImageMap getImageMap() {
        return this.imageMap;
    }

    public final Integer getPageNumber() {
        return this.pageNumber;
    }

    public final Double getRating() {
        return this.rating;
    }

    public final Integer getReviewId() {
        return this.reviewId;
    }

    public final String getReviewStatus() {
        return this.reviewStatus;
    }

    public final String getReviewText() {
        return this.reviewText;
    }

    public final String getReviewerName() {
        return this.reviewerName;
    }

    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.createdDate;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.helpfulContent;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageMap;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ImageMap)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.rating;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewerName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isVerified;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isMarkedHelpful;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reviewStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageNumber;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalPages;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isMarkedHelpful() {
        return this.isMarkedHelpful;
    }

    public final Boolean isVerified() {
        return this.isVerified;
    }

    public final void setMarkedHelpful(Boolean bl2) {
        this.isMarkedHelpful = bl2;
    }

    public final void setPageNumber(Integer n3) {
        this.pageNumber = n3;
    }

    public final void setTotalPages(Integer n3) {
        this.totalPages = n3;
    }

    public String toString() {
        CharSequence charSequence = this.createdDate;
        String string2 = this.helpfulContent;
        ImageMap imageMap = this.imageMap;
        Double d2 = this.rating;
        Integer n3 = this.reviewId;
        String string3 = this.reviewText;
        String string4 = this.reviewerName;
        Boolean bl2 = this.isVerified;
        Boolean bl3 = this.isMarkedHelpful;
        String string5 = this.reviewStatus;
        Integer n4 = this.pageNumber;
        Integer n7 = this.totalPages;
        charSequence = og_1.a("ProductReview(createdDate=", (String)charSequence, ", helpfulContent=", string2, ", imageMap=");
        ((StringBuilder)charSequence).append(imageMap);
        ((StringBuilder)charSequence).append(", rating=");
        ((StringBuilder)charSequence).append(d2);
        ((StringBuilder)charSequence).append(", reviewId=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", reviewText=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", reviewerName=");
        vw0_1.a(bl2, string4, ", isVerified=", ", isMarkedHelpful=", (StringBuilder)charSequence);
        xi0_2.a(bl3, ", reviewStatus=", string5, ", pageNumber=", (StringBuilder)charSequence);
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(", totalPages=");
        ((StringBuilder)charSequence).append(n7);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

