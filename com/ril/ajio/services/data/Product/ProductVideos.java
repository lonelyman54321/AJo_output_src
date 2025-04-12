/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ProductVideos
implements Serializable {
    private final int videoPosition;
    private final List videos;

    public ProductVideos(int n3, List list) {
        Intrinsics.checkNotNullParameter(list, "videos");
        this.videoPosition = n3;
        this.videos = list;
    }

    public static /* synthetic */ ProductVideos copy$default(ProductVideos productVideos, int n3, List list, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = productVideos.videoPosition;
        }
        if ((n4 &= 2) != 0) {
            list = productVideos.videos;
        }
        return productVideos.copy(n3, list);
    }

    public final int component1() {
        return this.videoPosition;
    }

    public final List component2() {
        return this.videos;
    }

    public final ProductVideos copy(int n3, List list) {
        Intrinsics.checkNotNullParameter(list, "videos");
        ProductVideos productVideos = new ProductVideos(n3, list);
        return productVideos;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ProductVideos;
        if (n3 == 0) {
            return false;
        }
        object = (ProductVideos)object;
        n3 = this.videoPosition;
        int n4 = ((ProductVideos)object).videoPosition;
        if (n3 != n4) {
            return false;
        }
        List list = this.videos;
        object = ((ProductVideos)object).videos;
        boolean bl3 = Intrinsics.areEqual(list, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int getVideoPosition() {
        return this.videoPosition;
    }

    public final List getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int n3 = this.videoPosition * 31;
        return ((Object)this.videos).hashCode() + n3;
    }

    public String toString() {
        int n3 = this.videoPosition;
        List list = this.videos;
        StringBuilder stringBuilder = new StringBuilder("ProductVideos(videoPosition=");
        stringBuilder.append(n3);
        stringBuilder.append(", videos=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

