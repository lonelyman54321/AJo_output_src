/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CG2
 */
public final class cg2_1
implements Function1 {
    public final /* synthetic */ gg2_1 a;

    public /* synthetic */ cg2_1(gg2_1 gg2_12) {
        this.a = gg2_12;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        block3: {
            block4: {
                var1_1 = (DataCallback)var1_1;
                var2_2 = this.a;
                Intrinsics.checkNotNullParameter(var2_2, "this$0");
                var3_3 = cp_1.Companion;
                var4_4 = nn_2.b((cp$a)var3_3, (DataCallback)var1_1);
                if (var4_4 == 0) break block3;
                var4_4 = var1_1.getStatus();
                if (var4_4 != 0) break block4;
                if ((var1_1 = (ReferralConfigCash)var1_1.getData()) == null) ** GOTO lbl-1000
                var2_2.getClass();
                var3_3 = var1_1.getReferee();
                if (var3_3 != null && (var3_3 = var3_3.getTotalBonus()) != null) {
                    var5_5 = var3_3.floatValue();
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = 0;
                    var5_5 = 0.0f;
                    var3_3 = null;
                }
                var2_2.t = var5_5;
                if (var1_1 != null && (var1_1 = var1_1.getReferrer()) != null && (var1_1 = var1_1.getTotalBonus()) != null) {
                    var2_2.u = var6_6 = var1_1.floatValue();
                }
                break block3;
            }
            var2_2.u = var6_7 = -1.0f;
            var2_2.t = var6_7;
        }
        return Unit.a;
    }
}

