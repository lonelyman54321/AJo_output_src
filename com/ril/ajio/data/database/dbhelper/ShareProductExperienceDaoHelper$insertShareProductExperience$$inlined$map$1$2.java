/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1$2$1;
import com.ril.ajio.data.database.entity.ListShareProductExperience;
import com.ril.ajio.data.database.entity.ShareProductExperience;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.text.StringsKt;

public final class ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ String $products$inlined;
    final /* synthetic */ ShareProductExperience $shareProductExperience$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1$2(fs0_2 fs0_22, ShareProductExperience shareProductExperience, String string2) {
        this.$this_unsafeFlow = fs0_22;
        this.$shareProductExperience$inlined = shareProductExperience;
        this.$products$inlined = string2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new ShareProductExperienceDaoHelper$insertShareProductExperience$$inlined$map$1$2$1(this, (f80_0)var2_2);
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
            var9_9 = var1_1.shareProductExperienceDao();
            var10_10 = this.$shareProductExperience$inlined.getShortLink();
            var9_9 = var9_9.isShortLinkAvailable((String)var10_10);
            var10_10 = null;
            if (var9_9 == null) {
                var9_9 = var1_1.shareProductExperienceDao();
                var11_11 = this.$shareProductExperience$inlined;
                var12_13 = var9_9.insertShareProductExperience(var11_11);
                var9_9 = this.$products$inlined;
                var14_14 = ",";
                var6_6 = (int)StringsKt.F((CharSequence)var9_9, (CharSequence)var14_14, (boolean)var7_7);
                if (var6_6 != 0) {
                    var9_9 = this.$products$inlined;
                    var9_9 = fT1.a((String)var14_14, (String)var9_9);
                } else {
                    var9_9 = a.b(this.$products$inlined);
                }
                var14_14 = new Object();
                var9_9 = var9_9.iterator();
                while (var15_15 = var9_9.hasNext()) {
                    var16_16 = (String)var9_9.next();
                    var17_17 = new ListShareProductExperience();
                    var17_17.setCId(var12_13);
                    var17_17.setProductId(var16_16);
                    var17_17.setDeleted(false);
                    var14_14.add(var17_17);
                }
                var6_6 = var14_14.size();
                if (var6_6 > 0) {
                    var1_1 = var1_1.shareProductExperienceDao();
                    var1_1.insertProductsShared((ArrayList)var14_14);
                }
            } else {
                var1_1 = yn3_0.a;
                var1_1.l("SPEDaoHelper");
                var11_12 = var9_9.getShortLink();
                var18_18 = "isAvailable: ";
                var11_12 = kp1_0.c(var18_18, var11_12);
                var10_10 = new Object[]{};
                var1_1.a(var11_12, var10_10);
                var19_19 = var9_9.getId();
                var12_13 = var19_19;
            }
            var1_1 = new Long(var12_13);
            var4_4.label = var7_7;
            if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

