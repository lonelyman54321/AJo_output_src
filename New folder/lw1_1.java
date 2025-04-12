/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.Cart;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from lW1
 */
public final class lw1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lw1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        block35: {
            block36: {
                block34: {
                    var2_2 = 0;
                    var3_3 = null;
                    var4_4 = 1;
                    var5_5 = this.b;
                    var6_6 = "this$0";
                    var7_7 = this.a;
                    switch (var7_7) {
                        default: {
                            var8_8 = var1_1;
                            var8_8 = (Throwable)var1_1;
                            var5_5 = (yx3)var5_5;
                            Intrinsics.checkNotNullParameter(var5_5, (String)var6_6);
                            var1_1 = var5_5.e;
                            var9_10 = ApiErrorRepo.INSTANCE;
                            Intrinsics.checkNotNull(var8_8);
                            var3_3 = ApiErrorRepo.handleApiException$default(var9_10, (Throwable)var8_8, "PlpNewUserBanner", false, null, null, 24, null);
                            var1_1.k(var3_3);
                            return Unit.a;
                        }
                        case 1: {
                            var1_1 = (DataCallback)var1_1;
                            var5_5 = (bv2_0)var5_5;
                            Intrinsics.checkNotNullParameter(var5_5, (String)var6_6);
                            var5_5.j.k(var1_1);
                            return Unit.a;
                        }
                        case 0: 
                    }
                    var1_1 = (DataCallback)var1_1;
                    var5_5 = (ex1_0)var5_5;
                    Intrinsics.checkNotNullParameter(var5_5, (String)var6_6);
                    var6_6 = cp_1.Companion;
                    var10_12 = nn_2.b((cp$a)var6_6, (DataCallback)var1_1);
                    if (var10_12 == 0) break block35;
                    var5_5.Xa();
                    var5_5.K0 = var4_4;
                    Intrinsics.checkNotNull(var1_1);
                    var10_12 = var1_1.getStatus();
                    if (var10_12 != 0) break block36;
                    var1_1 = (Cart)var1_1.getData();
                    var5_5.Wa((Cart)var1_1);
                    var6_6 = h40_0.a;
                    var10_12 = (int)h40_0.J1();
                    var7_7 = 0;
                    var11_13 = null;
                    if (var10_12 == 0) ** GOTO lbl51
                    if (var1_1 != null) {
                        var6_6 = var1_1.getCartValueLimitNew();
                    } else {
                        while (true) {
                            var10_12 = 0;
                            var6_6 = null;
                            break block34;
                            break;
                        }
lbl51:
                        // 1 sources

                        if (var1_1 == null) ** continue;
                        var6_6 = var1_1.getCartValueLimit();
                    }
                }
                if (var6_6 != null) {
                    var9_11 = var6_6.getType();
                } else {
                    var12_14 = 0;
                    var9_11 = null;
                }
                var12_14 = kotlin.text.b.i((String)var9_11, "CommerceCartModificationError", (boolean)var4_4);
                var8_9 = "cartViewModel";
                if (var12_14 == 0) ** GOTO lbl-1000
                if (var6_6 != null) {
                    var9_11 = var6_6.getReason();
                } else {
                    var12_14 = 0;
                    var9_11 = null;
                }
                var13_15 = "MAX_CART_VALUE_LIMIT";
                var12_14 = kotlin.text.b.i((String)var9_11, (String)var13_15, (boolean)var4_4);
                if (var12_14 != 0) {
                    var9_11 = var5_5.t;
                    if (var9_11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var8_9);
                        var12_14 = 0;
                        var9_11 = null;
                    }
                    var9_11.i1 = var4_4;
                    var9_11 = StringCompanionObject.INSTANCE;
                    var12_14 = R$string.acc_error_message_page_load_fail;
                    var9_11 = hv3_0.K(var12_14);
                    var13_15 = var6_6 != null ? var6_6.getErrorMessage() : null;
                    var14_16 = new Object[var4_4];
                    var14_16[0] = var13_15;
                    var13_15 = "format(...)";
                    var9_11 = xh2_0.a(var14_16, var4_4, (String)var9_11, (String)var13_15);
                    if (var6_6 != null) {
                        var6_6 = var6_6.getErrorMessage();
                    } else {
                        var10_12 = 0;
                        var6_6 = null;
                    }
                    var5_5.kb((String)var6_6, (String)var9_11);
                } else lbl-1000:
                // 2 sources

                {
                    if ((var6_6 = var5_5.t) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var8_9);
                        var10_12 = 0;
                        var6_6 = null;
                    }
                    var6_6.i1 = false;
                }
                if (var1_1 != null) {
                    var6_6 = ((fc0_2)var5_5.O0.getValue()).b;
                    var9_11 = var5_5.getViewLifecycleOwner();
                    var13_15 = new cz_1(var4_4, var5_5, var1_1);
                    var15_17 = new eX1$d((Function1)var13_15);
                    var6_6.e((mu1_1)var9_11, (F62)var15_17);
                    var5_5.Eb();
                    var5_5.Db((Cart)var1_1);
                    var15_17 = var5_5.t;
                    if (var15_17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var8_9);
                        var4_4 = 0;
                        var15_17 = null;
                    }
                    if ((var15_17 = var15_17.S0) != null) {
                        var15_17 = var15_17.getEntries();
                    } else {
                        var4_4 = 0;
                        var15_17 = null;
                    }
                    if (var15_17 != null && (var4_4 = (int)var15_17.isEmpty()) == 0) {
                        var5_5.Cb();
                    } else {
                        var5_5.Za(false);
                    }
                    ex1_0.yb();
                    var5_5.rb();
                    var5_5.zb();
                    var5_5.Gb();
                    var2_2 = (int)h40_0.Q1();
                    if (var2_2 != 0 && (var15_17 = (var3_3 = var5_5.a).m()) != null && (var4_4 = var15_17.length()) > 0) {
                        var15_17 = var5_5.t;
                        if (var15_17 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var8_9);
                            var4_4 = 0;
                            var15_17 = null;
                        }
                        if ((var4_4 = (int)var15_17.c()) == 0 && !(var16_18 = Intrinsics.areEqual(var1_1 = var1_1.getPinCode(), var15_17 = var3_3.m()))) {
                            var1_1 = var3_3.m();
                            var15_17 = "";
                            if (var1_1 == null) {
                                var1_1 = var15_17;
                            }
                            var5_5.c1 = var1_1;
                            var16_18 = ap_0.b();
                            if (var16_18) {
                                var1_1 = var5_5.t;
                                if (var1_1 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var8_9);
                                } else {
                                    var11_13 = var1_1;
                                }
                                var1_1 = String.valueOf(var3_3.m());
                                var11_13.h((String)var1_1, (String)var15_17);
                            }
                        }
                    }
                }
                break block35;
            }
            var2_2 = var1_1.getStatus();
            if (var2_2 == var4_4) {
                var3_3 = var1_1.getError();
                Intrinsics.checkNotNull(var3_3);
                var3_3 = var3_3.getErrorMessage().getType();
                var6_6 = "CartError";
                var2_2 = (int)kotlin.text.b.i((String)var3_3, (String)var6_6, (boolean)var4_4);
                if (var2_2 != 0) {
                    var5_5.fb();
                } else {
                    var3_3 = var1_1.getError();
                    var2_2 = (int)var5_5.Ua((DataError)var3_3);
                    if (var2_2 == 0) {
                        var5_5.Ya((DataCallback)var1_1);
                    }
                }
            }
        }
        return Unit.a;
    }
}

