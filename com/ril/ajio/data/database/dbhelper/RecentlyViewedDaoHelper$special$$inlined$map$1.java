/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper$special$$inlined$map$1$2;
import kotlin.Unit;

public final class RecentlyViewedDaoHelper$special$$inlined$map$1
implements es0_2 {
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public RecentlyViewedDaoHelper$special$$inlined$map$1(es0_2 es0_22) {
        this.$this_unsafeTransform$inlined = es0_22;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        RecentlyViewedDaoHelper$special$$inlined$map$1$2 recentlyViewedDaoHelper$special$$inlined$map$1$2 = new RecentlyViewedDaoHelper$special$$inlined$map$1$2((fs0_2)object);
        if ((object = es0_22.collect(recentlyViewedDaoHelper$special$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

