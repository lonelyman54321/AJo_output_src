/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper;
import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1$2$1;
import kotlin.Unit;

public final class ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ long $count$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;
    final /* synthetic */ ShareProductExperienceDaoHelper this$0;

    public ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1$2(fs0_2 fs0_22, ShareProductExperienceDaoHelper shareProductExperienceDaoHelper, long l2) {
        this.$this_unsafeFlow = fs0_22;
        this.this$0 = shareProductExperienceDaoHelper;
        this.$count$inlined = l2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new ShareProductExperienceDaoHelper$fetchCompositeSharedWithMe$$inlined$map$1$2$1(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.result;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.label;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = this.$this_unsafeFlow;
            var1_1 = (AppDataBase)var1_1;
            var9_9 = this.this$0;
            var10_10 = this.$count$inlined;
            var9_9 = ShareProductExperienceDaoHelper.access$buildQueryToFetch((ShareProductExperienceDaoHelper)var9_9, var10_10);
            var1_1 = var1_1.shareProductExperienceDao();
            var12_11 = new C53((String)var9_9);
            var1_1 = var1_1.fetchSharedWithMe(var12_11);
            var4_4.label = var7_7;
            var1_1 = var2_2.emit(var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

