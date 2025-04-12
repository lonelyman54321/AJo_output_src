/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.ril.ajio.services.data.ratings;

import android.net.Uri;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class UploadImageAttributes {
    private String fileName;
    private final String id;
    private Long imageId;
    private String imagePath;
    private Integer imagePosition;
    private int imageUploadProgressPercent;
    private String imageUploadStatus;
    private Uri imageUri;
    private boolean isCompressed;
    private boolean isImageLinkedToReview;
    private Long reviewId;
    private String viewType;

    public UploadImageAttributes() {
        this(null, null, null, null, false, null, 0, null, null, null, false, null, 4095, null);
    }

    public UploadImageAttributes(String string2, Uri uri, String string3, Integer n3, boolean bl2, String string4, int n4, Long l2, Long l3, String string5, boolean bl3, String string6) {
        Intrinsics.checkNotNullParameter(string6, "id");
        this.imagePath = string2;
        this.imageUri = uri;
        this.viewType = string3;
        this.imagePosition = n3;
        this.isCompressed = bl2;
        this.fileName = string4;
        this.imageUploadProgressPercent = n4;
        this.reviewId = l2;
        this.imageId = l3;
        this.imageUploadStatus = string5;
        this.isImageLinkedToReview = bl3;
        this.id = string6;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ UploadImageAttributes(String object, Uri object2, String string2, Integer object3, boolean bl2, String string3, int n3, Long l2, Long l3, String object4, boolean bl3, String string4, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        void var25_28;
        Long l4;
        Long l7;
        String string5;
        Object n7;
        String string6;
        Object uri;
        Object string7;
        int n8 = n4;
        int n10 = n4 & 1;
        Object string8 = null;
        if (n10 != 0) {
            n10 = 0;
            string7 = null;
        } else {
            string7 = object;
        }
        int n14 = n8 & 2;
        if (n14 != 0) {
            n14 = 0;
            uri = null;
        } else {
            uri = object2;
        }
        int n15 = n8 & 4;
        if (n15 != 0) {
            n15 = 0;
            string6 = null;
        } else {
            string6 = string2;
        }
        int n16 = n8 & 8;
        if (n16 != 0) {
            n16 = 0;
            n7 = null;
        } else {
            n7 = object3;
        }
        int bl4 = n8 & 0x10;
        boolean bl5 = false;
        if (bl4 != 0) {
            boolean bl6 = false;
        } else {
            boolean bl7 = bl2;
        }
        int n17 = n8 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string5 = null;
        } else {
            string5 = string3;
        }
        int n18 = n8 & 0x40;
        n18 = n18 != 0 ? 0 : n3;
        int n19 = n8 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            l7 = null;
        } else {
            l7 = l2;
        }
        int n20 = n8 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            l4 = null;
        } else {
            l4 = l3;
        }
        int n21 = n8 & 0x200;
        if (n21 == 0) {
            string8 = object4;
        }
        n21 = n8 & 0x400;
        if (n21 == 0) {
            bl5 = bl3;
        }
        String string9 = (n8 &= 0x800) != 0 ? UUID.randomUUID().toString() : string4;
        object = this;
        object2 = string7;
        string2 = uri;
        object3 = string6;
        l3 = l7;
        object4 = l4;
        this((String)string7, (Uri)uri, string6, (Integer)n7, (boolean)var25_28, string5, n18, l7, l4, (String)string8, bl5, string9);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ UploadImageAttributes copy$default(UploadImageAttributes uploadImageAttributes, String string2, Uri uri, String string3, Integer n3, boolean bl2, String string4, int n4, Long l2, Long l3, String string5, boolean bl3, String string6, int n7, Object object) {
        void var35_41;
        void var25_28;
        UploadImageAttributes uploadImageAttributes2 = uploadImageAttributes;
        int n8 = n7;
        int n10 = n7 & 1;
        String string7 = n10 != 0 ? uploadImageAttributes.imagePath : string2;
        int n14 = n8 & 2;
        Uri uri2 = n14 != 0 ? uploadImageAttributes2.imageUri : uri;
        int n15 = n8 & 4;
        String string8 = n15 != 0 ? uploadImageAttributes2.viewType : string3;
        int n16 = n8 & 8;
        Integer n17 = n16 != 0 ? uploadImageAttributes2.imagePosition : n3;
        int bl4 = n8 & 0x10;
        if (bl4 != 0) {
            boolean bl5 = uploadImageAttributes2.isCompressed;
        } else {
            boolean bl6 = bl2;
        }
        int n18 = n8 & 0x20;
        String string9 = n18 != 0 ? uploadImageAttributes2.fileName : string4;
        int n19 = n8 & 0x40;
        n19 = n19 != 0 ? uploadImageAttributes2.imageUploadProgressPercent : n4;
        int n20 = n8 & 0x80;
        Long l4 = n20 != 0 ? uploadImageAttributes2.reviewId : l2;
        int n21 = n8 & 0x100;
        Long l7 = n21 != 0 ? uploadImageAttributes2.imageId : l3;
        int n22 = n8 & 0x200;
        String string10 = n22 != 0 ? uploadImageAttributes2.imageUploadStatus : string5;
        int n24 = n8 & 0x400;
        if (n24 != 0) {
            boolean bl7 = uploadImageAttributes2.isImageLinkedToReview;
        } else {
            boolean bl8 = bl3;
        }
        String string11 = (n8 &= 0x800) != 0 ? uploadImageAttributes2.id : string6;
        string2 = string7;
        uri = uri2;
        string3 = string8;
        n3 = n17;
        bl2 = var25_28;
        string4 = string9;
        n4 = n19;
        l2 = l4;
        l3 = l7;
        string5 = string10;
        bl3 = var35_41;
        string6 = string11;
        return uploadImageAttributes.copy(string7, uri2, string8, n17, (boolean)var25_28, string9, n19, l4, l7, string10, (boolean)var35_41, string11);
    }

    public final String component1() {
        return this.imagePath;
    }

    public final String component10() {
        return this.imageUploadStatus;
    }

    public final boolean component11() {
        return this.isImageLinkedToReview;
    }

    public final String component12() {
        return this.id;
    }

    public final Uri component2() {
        return this.imageUri;
    }

    public final String component3() {
        return this.viewType;
    }

    public final Integer component4() {
        return this.imagePosition;
    }

    public final boolean component5() {
        return this.isCompressed;
    }

    public final String component6() {
        return this.fileName;
    }

    public final int component7() {
        return this.imageUploadProgressPercent;
    }

    public final Long component8() {
        return this.reviewId;
    }

    public final Long component9() {
        return this.imageId;
    }

    public final UploadImageAttributes copy(String string2, Uri uri, String string3, Integer n3, boolean bl2, String string4, int n4, Long l2, Long l3, String string5, boolean bl3, String string6) {
        Intrinsics.checkNotNullParameter(string6, "id");
        UploadImageAttributes uploadImageAttributes = new UploadImageAttributes(string2, uri, string3, n3, bl2, string4, n4, l2, l3, string5, bl3, string6);
        return uploadImageAttributes;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof UploadImageAttributes;
        if (n3 == 0) {
            return false;
        }
        object = (UploadImageAttributes)object;
        Object object2 = this.imagePath;
        Object object3 = ((UploadImageAttributes)object).imagePath;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.imageUri;
        object3 = ((UploadImageAttributes)object).imageUri;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.viewType;
        object3 = ((UploadImageAttributes)object).viewType;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.imagePosition;
        object3 = ((UploadImageAttributes)object).imagePosition;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.isCompressed;
        int n4 = ((UploadImageAttributes)object).isCompressed;
        if (n3 != n4) {
            return false;
        }
        object2 = this.fileName;
        object3 = ((UploadImageAttributes)object).fileName;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.imageUploadProgressPercent;
        n4 = ((UploadImageAttributes)object).imageUploadProgressPercent;
        if (n3 != n4) {
            return false;
        }
        object2 = this.reviewId;
        object3 = ((UploadImageAttributes)object).reviewId;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.imageId;
        object3 = ((UploadImageAttributes)object).imageId;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.imageUploadStatus;
        object3 = ((UploadImageAttributes)object).imageUploadStatus;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isImageLinkedToReview ? 1 : 0);
        n4 = (int)(((UploadImageAttributes)object).isImageLinkedToReview ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.id;
        object = ((UploadImageAttributes)object).id;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getId() {
        return this.id;
    }

    public final Long getImageId() {
        return this.imageId;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final Integer getImagePosition() {
        return this.imagePosition;
    }

    public final int getImageUploadProgressPercent() {
        return this.imageUploadProgressPercent;
    }

    public final String getImageUploadStatus() {
        return this.imageUploadStatus;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    public final Long getReviewId() {
        return this.reviewId;
    }

    public final String getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.imagePath;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.imageUri;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.viewType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imagePosition;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isCompressed ? 1 : 0);
        int n8 = 1237;
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.fileName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = this.imageUploadProgressPercent;
        n4 = (n4 + n3) * 31;
        object = this.reviewId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageUploadStatus;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isImageLinkedToReview ? 1 : 0);
        if (n7 != 0) {
            n8 = 1231;
        }
        n4 = (n4 + n8) * 31;
        return this.id.hashCode() + n4;
    }

    public final boolean isCompressed() {
        return this.isCompressed;
    }

    public final boolean isImageLinkedToReview() {
        return this.isImageLinkedToReview;
    }

    public final void setCompressed(boolean bl2) {
        this.isCompressed = bl2;
    }

    public final void setFileName(String string2) {
        this.fileName = string2;
    }

    public final void setImageId(Long l2) {
        this.imageId = l2;
    }

    public final void setImageLinkedToReview(boolean bl2) {
        this.isImageLinkedToReview = bl2;
    }

    public final void setImagePath(String string2) {
        this.imagePath = string2;
    }

    public final void setImagePosition(Integer n3) {
        this.imagePosition = n3;
    }

    public final void setImageUploadProgressPercent(int n3) {
        this.imageUploadProgressPercent = n3;
    }

    public final void setImageUploadStatus(String string2) {
        this.imageUploadStatus = string2;
    }

    public final void setImageUri(Uri uri) {
        this.imageUri = uri;
    }

    public final void setReviewId(Long l2) {
        this.reviewId = l2;
    }

    public final void setViewType(String string2) {
        this.viewType = string2;
    }

    public String toString() {
        String string2 = this.imagePath;
        Uri uri = this.imageUri;
        String string3 = this.viewType;
        Integer n3 = this.imagePosition;
        boolean bl2 = this.isCompressed;
        String string4 = this.fileName;
        int n4 = this.imageUploadProgressPercent;
        Long l2 = this.reviewId;
        Long l3 = this.imageId;
        String string5 = this.imageUploadStatus;
        boolean bl3 = this.isImageLinkedToReview;
        String string6 = this.id;
        StringBuilder stringBuilder = new StringBuilder("UploadImageAttributes(imagePath=");
        stringBuilder.append(string2);
        stringBuilder.append(", imageUri=");
        stringBuilder.append(uri);
        stringBuilder.append(", viewType=");
        stringBuilder.append(string3);
        stringBuilder.append(", imagePosition=");
        stringBuilder.append(n3);
        stringBuilder.append(", isCompressed=");
        stringBuilder.append(bl2);
        stringBuilder.append(", fileName=");
        stringBuilder.append(string4);
        stringBuilder.append(", imageUploadProgressPercent=");
        stringBuilder.append(n4);
        stringBuilder.append(", reviewId=");
        stringBuilder.append(l2);
        stringBuilder.append(", imageId=");
        stringBuilder.append(l3);
        stringBuilder.append(", imageUploadStatus=");
        stringBuilder.append(string5);
        stringBuilder.append(", isImageLinkedToReview=");
        stringBuilder.append(bl3);
        stringBuilder.append(", id=");
        stringBuilder.append(string6);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

