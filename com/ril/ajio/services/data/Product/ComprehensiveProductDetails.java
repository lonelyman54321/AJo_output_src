/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ComprehensiveProductDetails {
    private List images;
    private List videos;

    public ComprehensiveProductDetails(List list, List list2) {
        Intrinsics.checkNotNullParameter(list, "images");
        Intrinsics.checkNotNullParameter(list2, "videos");
        this.images = list;
        this.videos = list2;
    }

    public static /* synthetic */ ComprehensiveProductDetails copy$default(ComprehensiveProductDetails comprehensiveProductDetails, List list, List list2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = comprehensiveProductDetails.images;
        }
        if ((n3 &= 2) != 0) {
            list2 = comprehensiveProductDetails.videos;
        }
        return comprehensiveProductDetails.copy(list, list2);
    }

    public final List component1() {
        return this.images;
    }

    public final List component2() {
        return this.videos;
    }

    public final ComprehensiveProductDetails copy(List list, List list2) {
        Intrinsics.checkNotNullParameter(list, "images");
        Intrinsics.checkNotNullParameter(list2, "videos");
        ComprehensiveProductDetails comprehensiveProductDetails = new ComprehensiveProductDetails(list, list2);
        return comprehensiveProductDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ComprehensiveProductDetails;
        if (!bl3) {
            return false;
        }
        object = (ComprehensiveProductDetails)object;
        List list = this.images;
        List list2 = ((ComprehensiveProductDetails)object).images;
        bl3 = Intrinsics.areEqual(list, list2);
        if (!bl3) {
            return false;
        }
        list = this.videos;
        object = ((ComprehensiveProductDetails)object).videos;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getImages() {
        return this.images;
    }

    public final List getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int n3 = ((Object)this.images).hashCode() * 31;
        return ((Object)this.videos).hashCode() + n3;
    }

    public final void setImages(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.images = list;
    }

    public final void setVideos(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.videos = list;
    }

    public String toString() {
        List list = this.images;
        List list2 = this.videos;
        StringBuilder stringBuilder = new StringBuilder("ComprehensiveProductDetails(images=");
        stringBuilder.append(list);
        stringBuilder.append(", videos=");
        stringBuilder.append(list2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

