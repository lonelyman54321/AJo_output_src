/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1$2;
import kotlin.Unit;

public final class RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1
implements es0_2 {
    final /* synthetic */ zr1_1 $mutableRVStoreData$inlined;
    final /* synthetic */ zr1_1 $mutableRecentlyViewed$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1(es0_2 es0_22, zr1_1 zr1_12, zr1_1 zr1_13) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.$mutableRecentlyViewed$inlined = zr1_12;
        this.$mutableRVStoreData$inlined = zr1_13;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        zr1_1 zr1_12 = this.$mutableRecentlyViewed$inlined;
        zr1_1 zr1_13 = this.$mutableRVStoreData$inlined;
        RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1$2 recentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1$2 = new RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1$2((fs0_2)object, zr1_12, zr1_13);
        if ((object = es0_22.collect(recentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

