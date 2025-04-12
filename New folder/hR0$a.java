/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import com.ril.ajio.services.data.Home.NavigationParent;
import kotlin.Unit;

public final class hR0$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ String b;

    public hR0$a(fs0_2 fs0_22) {
        this.a = fs0_22;
        this.b = "Fleek Home";
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof hR0$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (hR0$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new hR0$a$a(this, (f80_0)var2_2);
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
            var1_1 = (NavigationParent)var9_9.b;
            var2_2 = var9_9.a;
            var10_10 = var2_2.d();
            if (var10_10 && var1_1 != null) {
                var2_2 = new BottomNavigationData();
                var11_11 = var1_1.getData();
                var2_2.setData(var11_11);
                var2_2 = DataCallback.Companion;
                var1_1 = var2_2.onSuccess(var1_1);
            } else {
                var1_1 = DataCallback.Companion;
                var12_12 = ApiErrorRepo.INSTANCE;
                var13_13 = this.b;
                var14_14 = "Forward";
                var15_15 = "BackGround_FLEEK_BOTTOM_TABS_REQUEST";
                var16_16 = true;
                var2_2 = var12_12.getApiError((dl2_2)var9_9, var15_15, var16_16, var13_13, var14_14);
                var1_1 = var1_1.onFailed((DataError)var2_2);
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

