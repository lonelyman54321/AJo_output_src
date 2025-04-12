/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1$2;
import com.ril.ajio.data.database.entity.ShareProductExperience;
import kotlin.Unit;

public final class ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1
implements es0_2 {
    final /* synthetic */ String $products$inlined;
    final /* synthetic */ ShareProductExperience $shareProductExperience$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1(es0_2 es0_22, ShareProductExperience shareProductExperience, String string2) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.$shareProductExperience$inlined = shareProductExperience;
        this.$products$inlined = string2;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        ShareProductExperience shareProductExperience = this.$shareProductExperience$inlined;
        String string2 = this.$products$inlined;
        ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1$2 shareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1$2 = new ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1$2((fs0_2)object, shareProductExperience, string2);
        if ((object = es0_22.collect(shareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

