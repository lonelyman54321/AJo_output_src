/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.FetchEmiPlansResponse;
import kotlin.Unit;

/*
 * Renamed from po2$a
 */
public final class po2$a_0
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ oo2_1 b;

    public po2$a_0(fs0_2 fs0_22, oo2_1 oo2_12) {
        this.a = fs0_22;
        this.b = oo2_12;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof po2$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (po2$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new po2$a$a(this, (f80_0)var2_2);
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
            var1_1 = (FetchEmiPlansResponse)var9_9.b;
            var2_2 = var9_9.a;
            var6_6 = (int)var2_2.d();
            if (var6_6 != 0 && var1_1 != null) {
                var10_10 = var1_1.getError();
                var11_11 = null;
                if (var10_10 != null) {
                    var10_10 = var10_10.getCode();
                } else {
                    var6_6 = 0;
                    var10_10 = null;
                }
                if (var10_10 != null) {
                    var10_10 = var1_1.getError();
                    if (var10_10 != null) {
                        var11_11 = var10_10.getDescription();
                    }
                    if (var11_11 != null) {
                        var10_10 = var1_1.getError();
                        if (var10_10 == null || (var10_10 = var10_10.getDescription()) == null) {
                            var10_10 = "";
                        }
                        this.b.getClass();
                        var11_11 = "FetchEmiPlansApi";
                        var12_13 = var2_2.d;
                        oo2_1.h(var12_13, var11_11, (String)var10_10);
                    }
                }
                var2_2 = DataCallback.Companion;
                var1_1 = var2_2.onSuccess(var1_1);
            } else {
                var11_12 = ApiErrorRepo.INSTANCE;
                var13_14 = "FetchEmiPlansApi";
                var14_15 = true;
                var15_16 = "single page checkout";
                var16_17 = "Forward";
                var1_1 = var11_12.handleApiError((dl2_2)var9_9, var13_14, var14_15, var15_16, var16_17);
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

