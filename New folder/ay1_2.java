/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.login.activity.LoginActivityRevamp;
import com.ril.ajio.services.data.Product.QuickViewProduct;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.data.user.UserProfileData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from ay1
 */
public final class ay1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ay1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        block27: {
            block28: {
                var2_2 = "format(...)";
                var3_3 = 0;
                var4_4 = null;
                var5_5 = "this$0";
                var6_6 = this.b;
                var7_7 = null;
                var8_8 = 1;
                var9_9 = this.a;
                var1_1 = (DataCallback)var1_1;
                switch (var9_9) {
                    default: {
                        var6_6 = (ex1_0)var6_6;
                        Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
                        var5_5 = cp_1.Companion;
                        var10_10 = nn_2.b((cp$a)var5_5, (DataCallback)var1_1);
                        if (var10_10 != 0) {
                            var6_6.Xa();
                            Intrinsics.checkNotNull(var1_1);
                            var10_10 = var1_1.getStatus();
                            if (var10_10 == 0) {
                                var1_1 = (QuickViewProduct)var1_1.getData();
                                Intrinsics.checkNotNull(var1_1);
                                var1_1.setCartImages();
                                var2_2 = var6_6.t;
                                var5_5 = "cartViewModel";
                                if (var2_2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                    var11_12 = 0;
                                    var2_2 = null;
                                }
                                var11_12 = var2_2.f1;
                                var6_6.Lb();
                                var6_6 = var6_6.t;
                                if (var6_6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                    var6_6 = null;
                                }
                                var6_6.getClass();
                                Intrinsics.checkNotNullParameter(var1_1, "data");
                                var5_5 = md3_0.c((jD3)var6_6);
                                var7_7 = new ox1_1((wx1_1)var6_6, (QuickViewProduct)var1_1, var11_12, null);
                                var12_16 = 3;
                                Ae3.d((i90_0)var5_5, null, null, var7_7, var12_16);
                            } else {
                                var3_3 = var1_1.getStatus();
                                if (var3_3 == var8_8 && (var12_17 = var6_6.Ua((DataError)(var1_1 = var1_1.getError()))) == 0) {
                                    var1_1 = StringCompanionObject.INSTANCE;
                                    var12_17 = R$string.acc_error_message_page_load_fail;
                                    var1_1 = hv3_0.K(var12_17);
                                    var3_3 = R$string.something_wrong_msg;
                                    var4_4 = hv3_0.K(var3_3);
                                    var5_5 = new Object[var8_8];
                                    var5_5[0] = var4_4;
                                    var1_1 = xh2_0.a((Object[])var5_5, var8_8, (String)var1_1, (String)var2_2);
                                    var11_13 = R$string.something_wrong_msg;
                                    var2_2 = hv3_0.K(var11_13);
                                    var6_6.kb((String)var2_2, (String)var1_1);
                                }
                            }
                        }
                        return Unit.a;
                    }
                    case 0: 
                }
                var6_6 = (LoginActivityRevamp)var6_6;
                Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
                var5_5 = cp_1.Companion;
                var10_11 = nn_2.b((cp$a)var5_5, (DataCallback)var1_1);
                if (var10_11 == 0) break block27;
                var6_6.stopLoader();
                if (var1_1 == null || (var10_11 = var1_1.getStatus()) != 0) break block28;
                var2_2 = var6_6.q0;
                var5_5 = "loginViewModel";
                if (var2_2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                    var11_14 = false;
                    var2_2 = null;
                }
                var2_2.J = var1_1 = (UserProfileData)var1_1.getData();
                var1_1 = var6_6.q0;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                    var12_18 = false;
                    var1_1 = null;
                }
                if ((var1_1 = var1_1.J) != null) {
                    var2_2 = var6_6.q0;
                    if (var2_2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                    } else {
                        var4_4 = var2_2;
                    }
                    var2_2 = var4_4.z.getPwd();
                    var1_1.setPassword((String)var2_2);
                }
                var1_1 = ((UserInformation)var6_6.K0.getValue()).getUserEmailId();
                var2_2 = var6_6.getUserViewModel();
                var11_14 = var2_2.p();
                if (var11_14 && !(var11_14 = TextUtils.isEmpty((CharSequence)var1_1))) {
                    var2_2 = mz3_0.u("User_Type");
                    var4_4 = var6_6.getUserViewModel();
                    Intrinsics.checkNotNull(var1_1);
                    var4_4.o((String)var1_1, (String)var2_2);
                }
                break block27;
            }
            var10_11 = var1_1.getStatus();
            if (var10_11 != var8_8) break block27;
            var5_5 = var1_1.getError();
            if (var5_5 == null) ** GOTO lbl-1000
            var5_5 = var1_1.getError();
            if (var5_5 != null) {
                var5_5 = var5_5.errors;
            } else {
                var10_11 = 0;
                var5_5 = null;
            }
            if (var5_5 == null) ** GOTO lbl-1000
            var5_5 = var1_1.getError();
            if (var5_5 != null && (var5_5 = var5_5.errors) != null) {
                var10_11 = var5_5.size();
                var5_5 = var10_11;
            } else {
                var10_11 = 0;
                var5_5 = null;
            }
            Intrinsics.checkNotNull(var5_5);
            var10_11 = var5_5.intValue();
            if (var10_11 <= 0) ** GOTO lbl-1000
            var5_5 = var1_1.getError();
            if (var5_5 != null && (var5_5 = var5_5.errors) != null && (var5_5 = (DataError$ErrorMessage)var5_5.get(0)) != null) {
                var4_4 = var5_5.getType();
            }
            if ((var3_3 = (int)(var5_5 = "RuntimeError").equalsIgnoreCase((String)var4_4)) != 0) {
                if ((var1_1 = var1_1.getError()) != null && (var1_1 = var1_1.errors) != null && (var1_1 = (DataError$ErrorMessage)var1_1.get(0)) != null && (var1_1 = var1_1.getMessage()) != null) {
                    var4_4 = StringCompanionObject.INSTANCE;
                    var3_3 = R$string.acc_error_message;
                    var4_4 = hv3_0.K(var3_3);
                    var5_5 = new Object[var8_8];
                    var5_5[0] = var1_1;
                    var2_2 = xh2_0.a((Object[])var5_5, var8_8, (String)var4_4, (String)var2_2);
                    hv3_0.o0(0, (String)var1_1, (String)var2_2);
                }
            } else lbl-1000:
            // 4 sources

            {
                var1_1 = StringCompanionObject.INSTANCE;
                var12_19 = R$string.acc_error_message;
                var1_1 = hv3_0.K(var12_19);
                var3_3 = R$string.something_wrong_msg;
                var4_4 = hv3_0.K(var3_3);
                var5_5 = new Object[var8_8];
                var5_5[0] = var4_4;
                var1_1 = xh2_0.a((Object[])var5_5, var8_8, (String)var1_1, (String)var2_2);
                var11_15 = R$string.something_wrong_msg;
                var2_2 = hv3_0.K(var11_15);
                hv3_0.o0(0, (String)var2_2, (String)var1_1);
            }
            if ((var1_1 = var6_6.A0) != null) {
                var1_1.h();
            }
            if ((var1_1 = var6_6.A0) != null) {
                var1_1.f();
            }
            if ((var1_1 = var6_6.A0) != null) {
                var1_1.e();
            }
            tj2_2.Companion.getClass();
            var1_1 = tj2$a_0.a();
            var1_1.getClass();
            var2_2 = "pincode";
            var4_4 = "";
            Intrinsics.checkNotNullParameter(var4_4, (String)var2_2);
            var1_1.a = var4_4;
            var1_1 = var6_6.A0;
            if (var1_1 != null) {
                var1_1.d();
            }
            var1_1 = var6_6.getAppPreferences();
            var2_2 = "LOCATION_DATA";
            var1_1.putPreference((String)var2_2, (String)var4_4);
            var1_1 = var6_6.getAppPreferences();
            var1_1.B();
        }
        return Unit.a;
    }
}

