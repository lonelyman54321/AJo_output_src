/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.myaccount.order.imps.d;
import com.ril.ajio.services.data.Order.IfscResponse;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from P4
 */
public final class p4_0
implements F62 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ p4_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onChanged(Object var1_1) {
        var2_2 = 0;
        var3_3 = null;
        var4_4 = 0;
        var5_5 = null;
        var6_6 = true;
        var7_7 /* !! */  = "this$0";
        var8_8 = this.b;
        var9_9 = this.a;
        switch (var9_9) {
            default: {
                var10_10 /* !! */  = var1_1;
                var10_10 /* !! */  = (DataCallback)var1_1;
                var11_12 = d.Companion;
                var8_8 = (d)var8_8;
                Intrinsics.checkNotNullParameter(var8_8, (String)var7_7 /* !! */ );
                var7_7 /* !! */  = cp_1.Companion;
                var12_13 = nn_2.b((cp$a)var7_7 /* !! */ , (DataCallback)var10_10 /* !! */ );
                if (var12_13 == 0) ** GOTO lbl188
                var7_7 /* !! */  = var8_8.y;
                if (var7_7 /* !! */  != null) {
                    var7_7 /* !! */ .stopLoader();
                }
                hv3_0.S(var8_8.getActivity());
                var7_7 /* !! */  = var8_8.M;
                if (var7_7 /* !! */  != null) {
                    ai0_2.i((View)var7_7 /* !! */ );
                }
                if (var10_10 /* !! */  == null) ** GOTO lbl188
                var12_13 = var10_10 /* !! */ .getStatus();
                var11_12 = "IMPS";
                var13_14 = "ifsc_api_request";
                var14_15 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ReturnImpsActivity";
                var15_16 = "";
                var16_17 = 8;
                if (var12_13 != 0) ** GOTO lbl119
                var8_8.A = var7_7 /* !! */  = (IfscResponse)var10_10 /* !! */ .getData();
                if (var7_7 /* !! */  != null) {
                    Intrinsics.checkNotNull(var7_7 /* !! */ );
                    var7_7 /* !! */  = var7_7 /* !! */ .getImps();
                    var12_13 = (int)var7_7 /* !! */ .booleanValue();
                    if (var12_13 == 0) {
                        var8_8.A = null;
                        var17_18 = var8_8.D;
                        if (var17_18 != null) {
                            var17_18.setVisibility(0);
                        }
                        if ((var5_5 = var8_8.M) != null) {
                            ai0_2.B((View)var5_5);
                        }
                        if ((var5_5 = var8_8.M) != null) {
                            var17_18 = "IMPS is not supported by your bank. Try with some other bank's account";
                            var5_5.setText((CharSequence)var17_18);
                        }
                        if ((var5_5 = var8_8.M) != null) {
                            ai0_2.a((View)var5_5);
                        }
                        if ((var5_5 = var8_8.v) != null) {
                            var5_5.setText((CharSequence)var15_16);
                        }
                        if ((var5_5 = var8_8.v) != null) {
                            var5_5.setVisibility(var16_17);
                        }
                        if ((var5_5 = var8_8.E) != null) {
                            var5_5.setVisibility(var16_17);
                        }
                    } else {
                        var7_7 /* !! */  = var8_8.A;
                        if (var7_7 /* !! */  != null) {
                            var7_7 /* !! */  = var7_7 /* !! */ .getBranch();
                        } else {
                            var12_13 = 0;
                            var7_7 /* !! */  = null;
                        }
                        if (var7_7 /* !! */  != null && (var12_13 = (int)kotlin.text.b.k((CharSequence)var7_7 /* !! */ )) == 0) {
                            var7_7 /* !! */  = var8_8.A;
                            var15_16 = var7_7 /* !! */  != null ? (var7_7 /* !! */  = var7_7 /* !! */ .getBranch()) : null;
                        }
                        if ((var7_7 /* !! */  = var8_8.A) != null) {
                            var7_7 /* !! */  = var7_7 /* !! */ .getCity();
                        } else {
                            var12_13 = 0;
                            var7_7 /* !! */  = null;
                        }
                        var10_10 /* !! */  = ", ";
                        if (var7_7 /* !! */  != null && (var12_13 = (int)kotlin.text.b.k((CharSequence)var7_7 /* !! */ )) == 0) {
                            var7_7 /* !! */  = var8_8.A;
                            if (var7_7 /* !! */  != null) {
                                var7_7 /* !! */  = var7_7 /* !! */ .getCity();
                            } else {
                                var12_13 = 0;
                                var7_7 /* !! */  = null;
                            }
                            var15_16 = n1.a((String)var15_16, (String)var10_10 /* !! */ , (String)var7_7 /* !! */ );
                        }
                        if ((var7_7 /* !! */  = var8_8.A) != null) {
                            var7_7 /* !! */  = var7_7 /* !! */ .getState();
                        } else {
                            var12_13 = 0;
                            var7_7 /* !! */  = null;
                        }
                        if (var7_7 /* !! */  != null && (var12_13 = (int)kotlin.text.b.k((CharSequence)var7_7 /* !! */ )) == 0) {
                            var7_7 /* !! */  = var8_8.A;
                            if (var7_7 /* !! */  != null) {
                                var7_7 /* !! */  = var7_7 /* !! */ .getState();
                            } else {
                                var12_13 = 0;
                                var7_7 /* !! */  = null;
                            }
                            var15_16 = n1.a((String)var15_16, (String)var10_10 /* !! */ , (String)var7_7 /* !! */ );
                        }
                        if ((var7_7 /* !! */  = var8_8.v) != null) {
                            var7_7 /* !! */ .setText((CharSequence)var15_16);
                        }
                        if ((var7_7 /* !! */  = var8_8.v) != null) {
                            var7_7 /* !! */ .setVisibility(0);
                        }
                        if ((var7_7 /* !! */  = var8_8.E) != null) {
                            var7_7 /* !! */ .setVisibility(0);
                        }
                        if ((var7_7 /* !! */  = var8_8.D) != null) {
                            var7_7 /* !! */ .setVisibility(var16_17);
                        }
                        if ((var12_13 = fd0_0.c((AjioEditText)(var7_7 /* !! */  = var8_8.m))) == 0 || (var12_13 = fd0_0.c((AjioEditText)(var7_7 /* !! */  = var8_8.o))) == 0 || (var12_13 = fd0_0.c((AjioEditText)(var7_7 /* !! */  = var8_8.q))) == 0) {
                            var17_18 = var8_8.requireActivity();
                            Intrinsics.checkNotNull(var17_18, var14_15);
                            var17_18 = (ReturnImpsActivity)var17_18;
                            var17_18.y2(false);
                        } else {
                            var5_5 = var8_8.requireActivity();
                            Intrinsics.checkNotNull(var5_5, var14_15);
                            var5_5 = (ReturnImpsActivity)var5_5;
                            var5_5.y2(var6_6);
                        }
                    }
                    var5_5 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var17_18 = var8_8.x;
                    if (var17_18 != null) {
                        var3_3 = var17_18.i;
                    }
                    var17_18 = "success";
                    var5_5.pushEvent(var13_14, (String)var17_18, var3_3, (String)var11_12);
                }
                ** GOTO lbl188
lbl119:
                // 1 sources

                var12_13 = var10_10 /* !! */ .getStatus();
                if (var12_13 != var6_6) ** GOTO lbl188
                var7_7 /* !! */  = AnalyticsManager.Companion.getInstance().getGtmEvents();
                var18_20 = var8_8.x;
                var18_20 = var18_20 != null ? var18_20.i : null;
                var19_21 = "failure";
                var7_7 /* !! */ .pushEvent(var13_14, var19_21, var18_20, (String)var11_12);
                var8_8.A = null;
                var3_3 = var8_8.v;
                if (var3_3 != null) {
                    var3_3.setVisibility(var16_17);
                }
                if ((var3_3 = var8_8.E) != null) {
                    var3_3.setVisibility(var16_17);
                }
                if ((var3_3 = var8_8.D) != null) {
                    var3_3.setVisibility(0);
                }
                if ((var3_3 = var8_8.M) != null) {
                    ai0_2.i((View)var3_3);
                }
                if ((var3_3 = var8_8.M) != null) {
                    var3_3.setText((CharSequence)var15_16);
                }
                if ((var2_2 = var8_8.G) == 0) ** GOTO lbl178
                var3_3 = var10_10 /* !! */ .getError();
                if (var3_3 == null) ** GOTO lbl-1000
                var3_3 = var10_10 /* !! */ .getError();
                Intrinsics.checkNotNull(var3_3);
                var3_3 = var3_3.getError();
                if (var3_3 != null) {
                    var3_3 = var10_10 /* !! */ .getError();
                    Intrinsics.checkNotNull(var3_3);
                    var3_3 = var3_3.getError().getDescription();
                    var2_2 = (int)TextUtils.isEmpty((CharSequence)var3_3);
                    if (var2_2 == 0) {
                        var3_3 = var8_8.M;
                        if (var3_3 != null) {
                            ai0_2.B((View)var3_3);
                        }
                        if ((var3_3 = var8_8.M) != null) {
                            var7_7 /* !! */  = "Please enter valid IFSC code";
                            var3_3.setText((CharSequence)var7_7 /* !! */ );
                        }
                        if ((var3_3 = var8_8.M) != null) {
                            ai0_2.a((View)var3_3);
                        }
                        var20_22 = (var3_3 = var8_8.q) != null && (var3_3 = var3_3.getText()) != null && (var3_3 = var3_3.toString()) != null && (var3_3 = StringsKt.m0((CharSequence)var3_3).toString()) != null ? var3_3 : var15_16;
                        var21_23 = var8_8.Ra();
                        var18_20 = "bank form";
                        var19_21 = "IMPS";
                        var22_24 = "IFSC Code : Please enter valid IFSC code";
                        var23_25 = "formErrorEvent";
                        var24_26 = "formErrorEvent";
                        GAEcommerceEvents.pushIfscEvent(var22_24, (String)var18_20, var19_21, var21_23, var23_25, var24_26, (String)var20_22);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = StringCompanionObject.INSTANCE;
                    var2_2 = R$string.acc_error_message;
                    var3_3 = hv3_0.K(var2_2);
                    var7_7 /* !! */  = "Please try again after some time";
                    var10_10 /* !! */  = new Object[var6_6];
                    var10_10 /* !! */ [0] = var7_7 /* !! */ ;
                    var10_10 /* !! */  = Arrays.copyOf(var10_10 /* !! */ , (int)var6_6);
                    var3_3 = String.format((String)var3_3, var10_10 /* !! */ );
                    var10_10 /* !! */  = "format(...)";
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var10_10 /* !! */ );
                    mq0_2.b((String)var7_7 /* !! */ , (String)var3_3);
                }
lbl178:
                // 3 sources

                if ((var2_2 = fd0_0.c((AjioEditText)(var3_3 = var8_8.m))) == 0 || (var2_2 = fd0_0.c((AjioEditText)(var3_3 = var8_8.o))) == 0 || (var2_2 = fd0_0.c((AjioEditText)(var3_3 = var8_8.q))) == 0) {
                    var3_3 = var8_8.requireActivity();
                    Intrinsics.checkNotNull(var3_3, var14_15);
                    var3_3 = (ReturnImpsActivity)var3_3;
                    var3_3.y2(false);
                } else {
                    var3_3 = var8_8.requireActivity();
                    Intrinsics.checkNotNull(var3_3, var14_15);
                    var3_3 = (ReturnImpsActivity)var3_3;
                    var3_3.y2(var6_6);
                }
lbl188:
                // 6 sources

                return;
            }
            case 0: 
        }
        var5_5 = var1_1;
        var5_5 = (DataCallback)var1_1;
        var8_8 = (s4_0)var8_8;
        Intrinsics.checkNotNullParameter(var8_8, (String)var7_7 /* !! */ );
        var8_8.getClass();
        var17_19 /* !! */  = cp_1.Companion;
        var6_6 = nn_2.b(var17_19 /* !! */ , (DataCallback)var5_5);
        if (var6_6) {
            var17_19 /* !! */  = var8_8.n;
            if (var17_19 /* !! */  != null) {
                var17_19 /* !! */ .stopLoader();
            }
            Intrinsics.checkNotNull(var5_5);
            var4_4 = var5_5.getStatus();
            if (var4_4 == 0) {
                var5_5 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                var7_7 /* !! */  = "Set As Default Address";
                var10_11 = "Set Default Address Button";
                var5_5.pushButtonTapEvent((String)var7_7 /* !! */ , var10_11, "addressbook screen");
                var5_5 = var8_8.getLayoutInflater();
                var6_6 = R$layout.layout_toast;
                var3_3 = var5_5.inflate((int)var6_6, null);
                var5_5 = var8_8.requireContext();
                Intrinsics.checkNotNullExpressionValue(var5_5, "requireContext(...)");
                Intrinsics.checkNotNull(var3_3);
                var6_6 = R$string.default_address_updated;
                var17_19 /* !! */  = hv3_0.K((int)var6_6);
                cp$a.E((Context)var5_5, (String)var17_19 /* !! */ , (View)var3_3);
                var8_8.Oa();
            }
        }
    }
}

