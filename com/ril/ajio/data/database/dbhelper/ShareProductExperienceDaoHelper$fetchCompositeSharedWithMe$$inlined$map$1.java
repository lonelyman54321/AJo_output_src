/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper;
import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1$2;
import kotlin.Unit;

public final class ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1
implements es0_2 {
    final /* synthetic */ long $count$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;
    final /* synthetic */ ShareProductExperienceDaoHelper this$0;

    public ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1(es0_2 es0_22, ShareProductExperienceDaoHelper shareProductExperienceDaoHelper, long l2) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.this$0 = shareProductExperienceDaoHelper;
        this.$count$inlined = l2;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        ShareProductExperienceDaoHelper shareProductExperienceDaoHelper = this.this$0;
        long l2 = this.$count$inlined;
        ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1$2 shareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1$2 = new ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1$2((fs0_2)object, shareProductExperienceDaoHelper, l2);
        if ((object = es0_22.collect(shareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

