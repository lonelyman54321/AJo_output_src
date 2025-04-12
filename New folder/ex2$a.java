/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;

public final class ex2$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;

    public ex2$a(fs0_2 fs0_22) {
        this.a = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof ex2$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (ex2$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new ex2$a$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.b;
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
            var9_9 = var1_1;
            var9_9 = (dl2_2)var1_1;
            var1_1 = (CartOrder)var9_9.b;
            var2_2 = var9_9.a;
            var6_6 = (int)var2_2.d();
            if (var6_6 != 0 && var1_1 != null) {
                var2_2 = DataCallback.Companion;
                var1_1 = var2_2.onSuccess(var1_1);
            } else {
                var10_10 = var2_2.d();
                var2_2 = null;
                if (var10_10 != 0) {
                    var10_10 = R$string.pdp_details_not_available;
                    var1_1 = hv3_0.K(var10_10);
                    var11_11 = yn3_0.a;
                    var12_13 = "Data not present";
                    var2_2 = new Object[]{};
                    var11_11.a((String)var12_13, var2_2);
                } else {
                    var1_1 = var9_9.c;
                    if (var1_1 != null) {
                        var1_1 = var1_1.k();
                    } else {
                        var10_10 = 0;
                        var1_1 = null;
                    }
                    var11_12 = yn3_0.a;
                    var12_13 = kp1_0.c("ErrorBody: ", (String)var1_1);
                    var2_2 = new Object[]{};
                    var11_12.d((String)var12_13, var2_2);
                }
                var12_13 = ApiErrorRepo.INSTANCE;
                var13_14 = 48;
                var14_15 = "OrderDetails";
                var15_16 = true;
                var1_1 = ApiErrorRepo.handleApiError$default((ApiErrorRepo)var12_13, (String)var1_1, (dl2_2)var9_9, var14_15, var15_16, null, null, var13_14, null);
            }
            var4_4.b = var7_7;
            var2_2 = this.a;
            var1_1 = var2_2.emit(var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

