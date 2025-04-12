/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.NewPDPRepo$getProductDetails$$inlined$map$1$2$1;
import com.ril.ajio.services.data.Product.PDPServiceError;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class NewPDPRepo$getProductDetails$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ String $cohortIds$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public NewPDPRepo$getProductDetails$$inlined$map$1$2(fs0_2 fs0_22, String string2) {
        this.$this_unsafeFlow = fs0_22;
        this.$cohortIds$inlined = string2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = this;
        var4_4 = var2_2;
        var5_5 = var2_2 instanceof NewPDPRepo$getProductDetails$$inlined$map$1$2$1;
        if (!var5_5) ** GOTO lbl-1000
        var6_6 = var2_2;
        var6_6 = (NewPDPRepo$getProductDetails$$inlined$map$1$2$1)var2_2;
        var7_7 = var6_6.label;
        var8_8 = -1 << -1;
        var9_9 = var7_7 & var8_8;
        if (var9_9 != 0) {
            var6_6.label = var7_7 -= var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = new NewPDPRepo$getProductDetails$$inlined$map$1$2$1(var3_3, (f80_0)var4_4);
        }
        var4_4 = var6_6.result;
        var10_10 = j90_0.COROUTINE_SUSPENDED;
        var8_8 = var6_6.label;
        var9_9 = 1;
        if (var8_8 == 0) ** GOTO lbl24
        if (var8_8 == var9_9) {
            vl2_2.b(var4_4);
        } else {
            var4_4 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var4_4;
lbl24:
            // 1 sources

            vl2_2.b(var4_4);
            var4_4 = var3_3.$this_unsafeFlow;
            var11_11 = var1_1;
            var11_11 = (dl2_2)var1_1;
            var12_12 = (Product)var11_11.b;
            var13_13 = var11_11.a;
            var14_14 = var13_13.f;
            var15_15 = "usergroup";
            var14_14 = var14_14.a((String)var15_15);
            var16_16 = var13_13.d();
            if (var16_16 && var12_12 != null) {
                var11_11 = var12_12.getErrors();
                if (var11_11 != null) {
                    var11_11 = var12_12.getErrors();
                    Intrinsics.checkNotNull(var11_11);
                    var17_17 = var11_11.size();
                    if (var17_17 > 0) {
                        var11_11 = var12_12.getErrors();
                        Intrinsics.checkNotNull(var11_11);
                        var16_16 = false;
                        var15_15 = null;
                        var11_11 = var11_11.get(0);
                        Intrinsics.checkNotNull(var11_11);
                        var11_11 = (PDPServiceError)var11_11;
                        var18_18 = var11_11.getMessage();
                        if (var18_18 != null) {
                            var15_15 = ApiErrorRepo.INSTANCE;
                            var19_20 = var13_13.d;
                            var20_22 = 104;
                            var21_23 = "ProductDetails";
                            var22_25 = true;
                            ApiErrorRepo.logServiceErrorEvent$default((ApiErrorRepo)var15_15, var21_23, var18_18, var19_20, null, var22_25, null, null, var20_22, null);
                        }
                    }
                }
                var12_12.setUserGroup((String)var14_14);
                var13_13 = var3_3.$cohortIds$inlined;
                var12_12.setLastSavedCohort((String)var13_13);
                var13_13 = DataCallback.Companion;
                var12_12 = var13_13.onSuccess(var12_12);
            } else {
                var13_13 = ApiErrorRepo.INSTANCE;
                var19_21 = 24;
                var14_14 = "ProductDetails";
                var16_16 = true;
                var21_24 = null;
                var18_19 = null;
                var12_12 = ApiErrorRepo.handleApiError$default((ApiErrorRepo)var13_13, (dl2_2)var11_11, (String)var14_14, var16_16, null, null, var19_21, null);
            }
            var6_6.label = var9_9;
            var4_4 = var4_4.emit(var12_12, var6_6);
            if (var4_4 == var10_10) {
                return var10_10;
            }
        }
        return Unit.a;
    }
}

