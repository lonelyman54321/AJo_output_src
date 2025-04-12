/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.services.data.user.UserProfileData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from my1
 */
public final class my1_1
implements Function1 {
    public final /* synthetic */ LoginActivityRevampNew a;

    public /* synthetic */ my1_1(LoginActivityRevampNew loginActivityRevampNew) {
        this.a = loginActivityRevampNew;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        block12: {
            block13: {
                var2_2 = false;
                var3_3 = null;
                var4_4 = 1;
                var1_1 = (DataCallback)var1_1;
                var5_5 = LoginActivityRevampNew.Companion;
                var5_5 = this.a;
                Intrinsics.checkNotNullParameter(var5_5, "this$0");
                var6_6 = cp_1.Companion;
                var7_7 = nn_2.b((cp$a)var6_6, (DataCallback)var1_1);
                if (var7_7 == 0) break block12;
                var5_5.stopLoader();
                var7_7 = 0;
                var6_6 = null;
                if (var1_1 == null || (var8_8 = var1_1.getStatus()) != 0) break block13;
                var1_1 = (UserProfileData)var1_1.getData();
                Intrinsics.checkNotNull(var1_1);
                var3_3 = var5_5.r0;
                var9_9 = "loginViewModel";
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                    var2_2 = false;
                    var3_3 = null;
                }
                var3_3 = var3_3.z.getPwd();
                var1_1.setPassword((String)var3_3);
                var3_3 = var5_5.r0;
                if (var3_3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                    var2_2 = false;
                    var3_3 = null;
                }
                var2_2 = var3_3.A;
                var10_12 = var5_5.r0;
                if (var10_12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                } else {
                    var6_6 = var10_12;
                }
                var9_9 = var6_6.B;
                var5_5.O2((UserProfileData)var1_1, var2_2, var9_9);
                break block12;
            }
            var8_8 = var1_1.getStatus();
            if (var8_8 != var4_4) break block12;
            var10_13 = var1_1.getError();
            var11_14 = "format(...)";
            if (var10_13 == null) ** GOTO lbl-1000
            var10_13 = var1_1.getError();
            if (var10_13 != null) {
                var10_13 = var10_13.errors;
            } else {
                var8_8 = 0;
                var10_13 = null;
            }
            if (var10_13 == null) ** GOTO lbl-1000
            var10_13 = var1_1.getError();
            if (var10_13 != null && (var10_13 = var10_13.errors) != null) {
                var8_8 = var10_13.size();
                var10_13 = var8_8;
            } else {
                var8_8 = 0;
                var10_13 = null;
            }
            Intrinsics.checkNotNull(var10_13);
            var8_8 = var10_13.intValue();
            if (var8_8 <= 0) ** GOTO lbl-1000
            var10_13 = var1_1.getError();
            if (var10_13 != null && (var10_13 = var10_13.errors) != null && (var10_13 = (DataError$ErrorMessage)CollectionsKt.N(0, (List)var10_13)) != null) {
                var6_6 = var10_13.getType();
            }
            if ((var7_7 = (int)(var10_13 = "RuntimeError").equalsIgnoreCase((String)var6_6)) != 0) {
                if ((var1_1 = var1_1.getError()) != null && (var1_1 = var1_1.errors) != null && (var1_1 = (DataError$ErrorMessage)var1_1.get(0)) != null && (var1_1 = var1_1.getMessage()) != null) {
                    var6_6 = StringCompanionObject.INSTANCE;
                    var7_7 = R$string.acc_error_message;
                    var6_6 = hv3_0.K(var7_7);
                    var10_13 = new Object[var4_4];
                    var10_13[0] = var1_1;
                    var9_10 = xh2_0.a((Object[])var10_13, var4_4, (String)var6_6, var11_14);
                    hv3_0.o0(0, (String)var1_1, var9_10);
                }
            } else lbl-1000:
            // 4 sources

            {
                var1_1 = StringCompanionObject.INSTANCE;
                var12_15 = R$string.acc_error_message;
                var1_1 = hv3_0.K(var12_15);
                var7_7 = R$string.something_wrong_msg;
                var6_6 = hv3_0.K(var7_7);
                var10_13 = new Object[var4_4];
                var10_13[0] = var6_6;
                var1_1 = xh2_0.a((Object[])var10_13, var4_4, (String)var1_1, var11_14);
                var4_4 = R$string.something_wrong_msg;
                var9_11 = hv3_0.K(var4_4);
                hv3_0.o0(0, var9_11, (String)var1_1);
            }
            var5_5.H2();
        }
        return Unit.a;
    }
}

