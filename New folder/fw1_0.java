/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from FW1
 */
public final class fw1_0
implements View.OnClickListener {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ fw1_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    /*
     * Unable to fully structure code
     */
    public final void onClick(View var1_1) {
        block43: {
            block40: {
                block41: {
                    block46: {
                        block45: {
                            block44: {
                                block42: {
                                    block39: {
                                        var2_2 = 1;
                                        var3_3 = 0;
                                        var4_4 = null;
                                        var5_5 = this.a;
                                        Intrinsics.checkNotNullParameter(var5_5, "this$0");
                                        var6_6 = new Bundle();
                                        var7_7 = var5_5.t;
                                        var8_8 = "cartViewModel";
                                        var9_9 = null;
                                        if (var7_7 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                                            var10_10 = 0;
                                            var7_7 = null;
                                            var11_11 = 0.0f;
                                        }
                                        if ((var7_7 = var7_7.S0) != null) {
                                            var7_7 = var7_7.getEntries();
                                        } else {
                                            var10_10 = 0;
                                            var7_7 = null;
                                            var11_11 = 0.0f;
                                        }
                                        if (var7_7 == null || (var10_10 = var7_7.isEmpty()) != 0) break block39;
                                        var7_7 = var5_5.t;
                                        if (var7_7 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                                            var10_10 = 0;
                                            var7_7 = null;
                                            var11_11 = 0.0f;
                                        }
                                        if ((var7_7 = var7_7.S0) != null) {
                                            var11_11 = var7_7.getBagTotal();
                                            var10_10 = (int)var11_11;
                                        } else {
                                            var10_10 = 0;
                                            var11_11 = 0.0f;
                                            var7_7 = null;
                                        }
                                        if (var10_10 > 0) ** GOTO lbl-1000
                                    }
                                    if ((var7_7 = var5_5.t) == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                                        var10_10 = 0;
                                        var7_7 = null;
                                        var11_11 = 0.0f;
                                    }
                                    if ((var10_10 = (var7_7 = var7_7.T0).size()) > 0) lbl-1000:
                                    // 2 sources

                                    {
                                        var7_7 = "non-empty";
                                    } else {
                                        var7_7 = "empty";
                                    }
                                    var6_6.putString("cart_status", (String)var7_7);
                                    var12_12 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                    var13_13 = ne_0.b((Bundle)var6_6);
                                    var14_14 = "bag screen";
                                    var15_15 = "Header Click";
                                    var16_16 = "Proceed to closet";
                                    var17_17 = 16;
                                    GTMEvents.pushButtonTapEvent$default((GTMEvents)var12_12, var15_15, var16_16, var14_14, var13_13, null, var17_17, null);
                                    var6_6 = var5_5.l;
                                    var18_18 = var6_6.getEC_USER_INTERACTION();
                                    var19_19 = var6_6.getEA_NAV_CLICK_HEADER();
                                    var20_20 = var6_6.getEN_NAV_CLICK();
                                    var7_7 = var5_5.F0;
                                    var12_12 = var5_5.G0;
                                    var21_21 = "closet";
                                    var22_22 = "bag screen";
                                    var23_23 = "bag screen";
                                    var24_24 = 1536;
                                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var6_6, var18_18, var19_19, var21_21, var20_20, var22_22, var23_23, (String)var7_7, null, (String)var12_12, false, null, var24_24, null);
                                    var25_25 = var5_5.Nb();
                                    if (var25_25 == 0 || (var25_25 = og1_1.c()) != 0) break block40;
                                    var25_25 = var5_5.qb();
                                    if (var25_25 == 0) break block41;
                                    var25_25 = var5_5.C0;
                                    if (var25_25 == 0) break block42;
                                    var5_5.O8();
                                    break block43;
                                }
                                var6_6 = var5_5.t;
                                if (var6_6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                                    var25_25 = 0;
                                    var6_6 = null;
                                    var26_26 = 0.0f;
                                }
                                if ((var6_6 = var6_6.S0) != null) {
                                    var6_6 = var6_6.getEntries();
                                } else {
                                    var25_25 = 0;
                                    var6_6 = null;
                                    var26_26 = 0.0f;
                                }
                                if (var6_6 != null && (var25_25 = var6_6.isEmpty()) == 0) {
                                    var25_25 = 0;
                                    var26_26 = 0.0f;
                                    var6_6 = null;
                                } else {
                                    var25_25 = 1;
                                    var26_26 = 1.4E-45f;
                                }
                                if (var25_25 != 0) break block44;
                                var6_6 = var5_5.t;
                                if (var6_6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                                    var25_25 = 0;
                                    var6_6 = null;
                                    var26_26 = 0.0f;
                                }
                                var6_6 = var6_6.S0;
                                var10_10 = 0;
                                var11_11 = 0.0f;
                                var7_7 = null;
                                if (var6_6 != null) {
                                    var26_26 = var6_6.getBagTotal();
                                } else {
                                    var25_25 = 0;
                                    var26_26 = 0.0f;
                                    var6_6 = null;
                                }
                                var25_25 = (int)((cfr_temp_0 = var26_26 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                if (var25_25 <= 0) break block44;
                                var6_6 = var5_5.x;
                                if (var6_6 != null) {
                                    var6_6 = var6_6.a;
                                } else {
                                    var25_25 = 0;
                                    var6_6 = null;
                                    var26_26 = 0.0f;
                                }
                                if (var6_6 != null) break block45;
                            }
                            if ((var6_6 = var5_5.t) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                                var25_25 = 0;
                                var6_6 = null;
                                var26_26 = 0.0f;
                            }
                            if ((var25_25 = (var6_6 = var6_6.T0).size()) <= 0) break block46;
                        }
                        if ((var6_6 = var5_5.x) != null && (var6_6 = var6_6.a) != null) {
                            var6_6 = var6_6.getProducts();
                        } else {
                            var25_25 = 0;
                            var6_6 = null;
                            var26_26 = 0.0f;
                        }
                        var6_6 = (Collection)var6_6;
                        if (var6_6 != null && (var25_25 = (int)var6_6.isEmpty()) == 0) {
                            var25_25 = 0;
                            var26_26 = 0.0f;
                            var6_6 = null;
                        } else {
                            var25_25 = 1;
                            var26_26 = 1.4E-45f;
                        }
                        if (var25_25 != 0) break block46;
                        var2_2 = var5_5.cb(15);
                        var4_4 = var5_5.D;
                        if (var4_4 == null) {
                            var4_4 = "cartRv";
                            Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                        } else {
                            var9_9 = var4_4;
                        }
                        var9_9.smoothScrollToPosition(var2_2);
                        break block43;
                    }
                    if ((var6_6 = var5_5.t) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                        var25_25 = 0;
                        var6_6 = null;
                        var26_26 = 0.0f;
                    }
                    if ((var6_6 = var6_6.S0) != null) {
                        var6_6 = var6_6.getEntries();
                    } else {
                        var25_25 = 0;
                        var6_6 = null;
                        var26_26 = 0.0f;
                    }
                    if (var6_6 != null && (var25_25 = (int)var6_6.isEmpty()) == 0) {
                        var25_25 = 0;
                        var26_26 = 0.0f;
                        var6_6 = null;
                    } else {
                        var25_25 = 1;
                        var26_26 = 1.4E-45f;
                    }
                    if (var25_25 == 0) ** GOTO lbl-1000
                    var6_6 = var5_5.t;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                    } else {
                        var9_9 = var6_6;
                    }
                    var6_6 = var9_9.S0;
                    if (var6_6 != null) {
                        var26_26 = var6_6.getBagTotal();
                        var25_25 = (int)var26_26;
                    } else {
                        var25_25 = 0;
                        var26_26 = 0.0f;
                        var6_6 = null;
                    }
                    if (var25_25 == 0) {
                        var5_5.Jb((boolean)var2_2);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var6_6 = StringCompanionObject.INSTANCE;
                        var25_25 = R$string.acc_error_message_page_load_fail;
                        var6_6 = hv3_0.K(var25_25);
                        var10_10 = R$string.no_product_in_closet;
                        var7_7 = hv3_0.K(var10_10);
                        var8_8 = new Object[var2_2];
                        var8_8[0] = var7_7;
                        var27_27 = xh2_0.a(var8_8, var2_2, (String)var6_6, "format(...)");
                        var3_3 = R$string.no_product_in_closet;
                        var4_4 = hv3_0.K(var3_3);
                        var5_5.kb((String)var4_4, var27_27);
                    }
                    break block43;
                }
                var27_28 = var5_5.q;
                if (var27_28 == null) {
                    var27_28 = "loginListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var27_28);
                } else {
                    var9_9 = var27_28;
                }
                var27_28 = "source - closet";
                var3_3 = 6;
                var9_9.z0(var3_3, (String)var27_28);
                break block43;
            }
            var5_5.Jb(false);
        }
    }
}

