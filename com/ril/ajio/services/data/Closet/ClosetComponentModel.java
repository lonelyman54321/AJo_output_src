/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Closet;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ClosetComponentModel {
    private final List closetItemsInOrder;
    private final long closetLatestMillis;
    private final HashMap closetPriceFromDb;
    private final boolean isPriceDrop;

    public ClosetComponentModel(List list, HashMap hashMap, long l2, boolean bl2) {
        this.closetItemsInOrder = list;
        this.closetPriceFromDb = hashMap;
        this.closetLatestMillis = l2;
        this.isPriceDrop = bl2;
    }

    public static /* synthetic */ ClosetComponentModel copy$default(ClosetComponentModel closetComponentModel, List list, HashMap object, long l2, boolean bl2, int n3, Object object2) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = closetComponentModel.closetItemsInOrder;
        }
        if ((n4 = n3 & 2) != 0) {
            object = closetComponentModel.closetPriceFromDb;
        }
        object2 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            l2 = closetComponentModel.closetLatestMillis;
        }
        long l3 = l2;
        n7 = n3 & 8;
        if (n7 != 0) {
            bl2 = closetComponentModel.isPriceDrop;
        }
        object = closetComponentModel;
        n4 = (int)(bl2 ? 1 : 0);
        return closetComponentModel.copy(list, (HashMap)object2, l3, bl2);
    }

    public final List component1() {
        return this.closetItemsInOrder;
    }

    public final HashMap component2() {
        return this.closetPriceFromDb;
    }

    public final long component3() {
        return this.closetLatestMillis;
    }

    public final boolean component4() {
        return this.isPriceDrop;
    }

    public final ClosetComponentModel copy(List list, HashMap hashMap, long l2, boolean bl2) {
        ClosetComponentModel closetComponentModel = new ClosetComponentModel(list, hashMap, l2, bl2);
        return closetComponentModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof ClosetComponentModel;
        if (!object2) {
            return false;
        }
        object = (ClosetComponentModel)object;
        Object object3 = this.closetItemsInOrder;
        Object object4 = ((ClosetComponentModel)object).closetItemsInOrder;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.closetPriceFromDb;
        object4 = ((ClosetComponentModel)object).closetPriceFromDb;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        long l2 = this.closetLatestMillis;
        long l3 = ((ClosetComponentModel)object).closetLatestMillis;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        object2 = this.isPriceDrop;
        boolean bl3 = ((ClosetComponentModel)object).isPriceDrop;
        if (object2 != bl3) {
            return false;
        }
        return bl2;
    }

    public final List getClosetItemsInOrder() {
        return this.closetItemsInOrder;
    }

    public final long getClosetLatestMillis() {
        return this.closetLatestMillis;
    }

    public final HashMap getClosetPriceFromDb() {
        return this.closetPriceFromDb;
    }

    public int hashCode() {
        int n3;
        List list = this.closetItemsInOrder;
        int n4 = 0;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        n3 *= 31;
        HashMap hashMap = this.closetPriceFromDb;
        if (hashMap != null) {
            n4 = ((Object)hashMap).hashCode();
        }
        n3 = (n3 + n4) * 31;
        long l2 = this.closetLatestMillis;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = (int)(l2 ^= l3);
        n3 = (n3 + n8) * 31;
        n4 = (int)(this.isPriceDrop ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final boolean isPriceDrop() {
        return this.isPriceDrop;
    }

    public String toString() {
        List list = this.closetItemsInOrder;
        HashMap hashMap = this.closetPriceFromDb;
        long l2 = this.closetLatestMillis;
        boolean bl2 = this.isPriceDrop;
        StringBuilder stringBuilder = new StringBuilder("ClosetComponentModel(closetItemsInOrder=");
        stringBuilder.append(list);
        stringBuilder.append(", closetPriceFromDb=");
        stringBuilder.append(hashMap);
        stringBuilder.append(", closetLatestMillis=");
        stringBuilder.append(l2);
        stringBuilder.append(", isPriceDrop=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

