/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.data.repo.AddressRepo$deleteAddressNew$$inlined$map$1$2$1;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class AddressRepo$deleteAddressNew$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ String $requestID$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;
    final /* synthetic */ AddressRepo this$0;

    public AddressRepo$deleteAddressNew$$inlined$map$1$2(fs0_2 fs0_22, AddressRepo addressRepo, String string2) {
        this.$this_unsafeFlow = fs0_22;
        this.this$0 = addressRepo;
        this.$requestID$inlined = string2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof AddressRepo$deleteAddressNew$$inlined$map$1$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (AddressRepo$deleteAddressNew$$inlined$map$1$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new AddressRepo$deleteAddressNew$$inlined$map$1$2$1(this, (f80_0)var2_2);
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
            var1_1 = (dl2_2)var1_1;
            var9_9 = (il2_2)var1_1.b;
            var10_10 = var1_1.a;
            var11_11 = var10_10.d();
            if (var11_11 && var9_9 != null) {
                var1_1 = DataCallback.Companion.onSuccess(var9_9);
            } else {
                var6_6 = (int)var10_10.d();
                var10_10 = null;
                var12_12 = "AddressRepository";
                if (var6_6 != 0) {
                    var6_6 = R$string.something_wrong_msg;
                    var9_9 = hv3_0.K(var6_6);
                    var13_13 = yn3_0.a;
                    var13_13.l(var12_12);
                    var12_12 = "Data not present";
                    var10_10 = new Object[]{};
                    var13_13.a(var12_12, var10_10);
                } else {
                    var9_9 = var1_1.c;
                    if (var9_9 != null) {
                        var9_9 = var9_9.k();
                    } else {
                        var6_6 = 0;
                        var9_9 = null;
                    }
                    var13_14 = yn3_0.a;
                    var14_15 = "ErrorBody: ";
                    var12_12 = U4.a(var13_14, var12_12, var14_15, (String)var9_9);
                    var10_10 = new Object[]{};
                    var13_14.d(var12_12, var10_10);
                }
                var10_10 = this.this$0;
                var12_12 = this.$requestID$inlined;
                var1_1 = AddressRepo.access$handleApiError((AddressRepo)var10_10, (String)var9_9, (dl2_2)var1_1, var12_12);
            }
            var4_4.label = var7_7;
            var1_1 = var2_2.emit(var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

