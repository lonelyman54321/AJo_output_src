/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.entity.SharedWithMe;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Y23$c$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ w23_0 b;

    public Y23$c$a(fs0_2 fs0_22, w23_0 w23_02) {
        this.a = fs0_22;
        this.b = w23_02;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof Y23$c$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (Y23$c$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new Y23$c$a$a(this, (f80_0)var2_2);
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
            var1_1 = (List)var1_1;
            for (var9_9 = var1_1.size() - var7_7; (var6_6 = -1) < var9_9; var9_9 += -1) {
                var10_10 = (SharedWithMe)var1_1.get(var9_9);
                var11_11 = var10_10.getShareProductExperience();
                if (var11_11 == null) continue;
                this.b.getClass();
                w23_0.d((SharedWithMe)var10_10);
                var11_11 = var10_10.getShareProductExperience();
                Intrinsics.checkNotNull(var11_11);
                var12_12 = var11_11.isLinkExpired();
                if (var12_12) {
                    var1_1.remove(var9_9);
                    continue;
                }
                var6_6 = (var10_10 = var10_10.getProductsShared()).size();
                if (var6_6 != 0) continue;
                var1_1.remove(var9_9);
            }
            var4_4.b = var7_7;
            var2_2 = this.a;
            if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

