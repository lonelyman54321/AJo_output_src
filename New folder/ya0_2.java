/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

/*
 * Renamed from ya0
 */
public final class ya0_2
implements Function0 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ i90_0 c;

    public /* synthetic */ ya0_2(c80 c802, ob0_1 ob0_12, yT1 yT12) {
        this.a = ob0_12;
        this.b = yT12;
        this.c = c802;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke() {
        var1_1 = this.a;
        Intrinsics.checkNotNullParameter(var1_1, "$viewModel");
        var2_2 = this.b;
        Intrinsics.checkNotNullParameter(var2_2, "$navController");
        var3_3 = this.c;
        Intrinsics.checkNotNullParameter(var3_3, "$coroutineScope");
        var4_4 = (Integer)var1_1.p.getValue();
        var6_6 = 200;
        var7_7 = 599;
        var5_5 = new c(var6_6, var7_7, 1);
        if (var4_4 == null) ** GOTO lbl-1000
        var8_8 = var4_4.intValue();
        if ((var8_8 = (int)var5_5.e(var8_8)) != 0) {
            var8_8 = 6;
            var5_5 = "fetch_coupon_error";
            e.p((e)var2_2, (String)var5_5, null, var8_8);
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new Object();
            var5_5 = "home";
            var2_2.o((String)var5_5, (Function1)var4_4);
        }
        var2_2 = new aa0_1(var1_1, null);
        Ae3.d(var3_3, null, null, (Function2)var2_2, 3);
        return Unit.a;
    }
}

