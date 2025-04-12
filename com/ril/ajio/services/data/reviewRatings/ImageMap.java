/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.reviewRatings;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ImageMap {
    private final List intermediateSize;
    private final ArrayList largeSize;
    private ArrayList thumbnail;

    public ImageMap() {
        this(null, null, null, 7, null);
    }

    public ImageMap(List list, ArrayList arrayList, ArrayList arrayList2) {
        this.intermediateSize = list;
        this.largeSize = arrayList;
        this.thumbnail = arrayList2;
    }

    public ImageMap(List list, ArrayList arrayList, ArrayList arrayList2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = mz0_2.a;
        }
        if ((n4 = n3 & 2) != 0) {
            arrayList = new ArrayList();
        }
        if ((n3 &= 4) != 0) {
            arrayList2 = new ArrayList();
        }
        this(list, arrayList, arrayList2);
    }

    public static /* synthetic */ ImageMap copy$default(ImageMap imageMap, List list, ArrayList arrayList, ArrayList arrayList2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = imageMap.intermediateSize;
        }
        if ((n4 = n3 & 2) != 0) {
            arrayList = imageMap.largeSize;
        }
        if ((n3 &= 4) != 0) {
            arrayList2 = imageMap.thumbnail;
        }
        return imageMap.copy(list, arrayList, arrayList2);
    }

    public final List component1() {
        return this.intermediateSize;
    }

    public final ArrayList component2() {
        return this.largeSize;
    }

    public final ArrayList component3() {
        return this.thumbnail;
    }

    public final ImageMap copy(List list, ArrayList arrayList, ArrayList arrayList2) {
        ImageMap imageMap = new ImageMap(list, arrayList, arrayList2);
        return imageMap;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ImageMap;
        if (!bl3) {
            return false;
        }
        object = (ImageMap)object;
        List list = this.intermediateSize;
        List list2 = ((ImageMap)object).intermediateSize;
        bl3 = Intrinsics.areEqual(list, list2);
        if (!bl3) {
            return false;
        }
        list = this.largeSize;
        list2 = ((ImageMap)object).largeSize;
        bl3 = Intrinsics.areEqual(list, list2);
        if (!bl3) {
            return false;
        }
        list = this.thumbnail;
        object = ((ImageMap)object).thumbnail;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getIntermediateSize() {
        return this.intermediateSize;
    }

    public final ArrayList getLargeSize() {
        return this.largeSize;
    }

    public final ArrayList getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        int n3;
        int n4;
        List list = this.intermediateSize;
        int n7 = 0;
        if (list == null) {
            n4 = 0;
            list = null;
        } else {
            n4 = ((Object)list).hashCode();
        }
        n4 *= 31;
        ArrayList arrayList = this.largeSize;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        n4 = (n4 + n3) * 31;
        arrayList = this.thumbnail;
        if (arrayList != null) {
            n7 = arrayList.hashCode();
        }
        return n4 + n7;
    }

    public final void setThumbnail(ArrayList arrayList) {
        this.thumbnail = arrayList;
    }

    public String toString() {
        List list = this.intermediateSize;
        ArrayList arrayList = this.largeSize;
        ArrayList arrayList2 = this.thumbnail;
        StringBuilder stringBuilder = new StringBuilder("ImageMap(intermediateSize=");
        stringBuilder.append(list);
        stringBuilder.append(", largeSize=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", thumbnail=");
        stringBuilder.append(arrayList2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

