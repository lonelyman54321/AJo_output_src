/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1$2;
import com.ril.ajio.data.database.entity.ProductExperience;
import kotlin.Unit;

public final class RecentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1
implements es0_2 {
    final /* synthetic */ zr1_1 $mutableRVStoreData$inlined;
    final /* synthetic */ zr1_1 $mutableRecentlyViewed$inlined;
    final /* synthetic */ ProductExperience $recentlyViewed$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public RecentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1(es0_2 es0_22, zr1_1 zr1_12, ProductExperience productExperience, zr1_1 zr1_13) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.$mutableRecentlyViewed$inlined = zr1_12;
        this.$recentlyViewed$inlined = productExperience;
        this.$mutableRVStoreData$inlined = zr1_13;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        zr1_1 zr1_12 = this.$mutableRecentlyViewed$inlined;
        ProductExperience productExperience = this.$recentlyViewed$inlined;
        zr1_1 zr1_13 = this.$mutableRVStoreData$inlined;
        RecentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1$2 recentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1$2 = new RecentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1$2((fs0_2)object, zr1_12, productExperience, zr1_13);
        if ((object = es0_22.collect(recentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

