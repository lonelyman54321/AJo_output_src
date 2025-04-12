/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.TextView
 *  android.widget.Toast
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.cart.ConvenienceFeeConfig;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdp.data.KYPSettings;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

public final class cp$a {
    public static boolean A(UserInformation userInformation) {
        int n3;
        Intrinsics.checkNotNullParameter(userInformation, "userInformation");
        String string2 = userInformation.getCustomerUUID();
        boolean bl2 = userInformation.isUserOnline();
        if (!bl2) {
            string2 = userInformation.getUserId();
        }
        int n4 = 1;
        if (string2 != null && (n3 = string2.length()) != 0) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = 1;
        }
        return (n4 ^ n3) != 0;
    }

    public static String B(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string2 != null) {
            int n3 = string2.length();
            for (int i3 = 0; i3 < n3; ++i3) {
                char c2 = string2.charAt(i3);
                stringBuilder.append(c2);
                String string3 = "\u00a0";
                stringBuilder.append(string3);
            }
        }
        string2 = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static void C(Context context, String string2) {
        Object object = "utm_campaign";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        if (context != null) {
            object = h40_0.a;
            object = h40_0.R().getRestore_web_url();
            String string3 = "?utm_source=restore_your_mob&utm_medium=android&utm_campaign=";
            string2 = n1.a((String)object, string3, string2);
            object = CustomWebViewActivity.Companion;
            int n3 = 21;
            CustomWebViewActivity$a.b((CustomWebViewActivity$a)object, context, string2, n3);
        }
    }

    public static void D(FragmentManager object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object2);
        if (bl2) {
            object2 = new bp_2((FragmentManager)object);
            object = ((FragmentManager)object).o;
            ((ArrayList)object).add(object2);
        }
    }

    public static void E(Context context, String string2, View view) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(string2, "message");
        Toast toast = new Toast(context);
        toast.setDuration(0);
        int n3 = R$id.ltTvInfo;
        context = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(context, "findViewById(...)");
        ((TextView)context).setText((CharSequence)string2);
        toast.setView(view);
        toast.show();
    }

    public static String a() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.b("chat_silent_message_version_key");
    }

    public static JSONObject b() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("spc_assured_gift_json");
    }

    public static JSONArray c() {
        z40$a z40$a = z40_0.Companion;
        z40$a = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("comprehensive_brickcode_list").getJSONArray("brickCode");
        Intrinsics.checkNotNullExpressionValue(z40$a, "getJSONArray(...)");
        return z40$a;
    }

    public static KYPSettings d() {
        Object object = new Gson();
        Object object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.b("comprehensive_kyp_settings");
        object = ((Gson)object).fromJson((String)object2, KYPSettings.class);
        Intrinsics.checkNotNullExpressionValue(object, "fromJson(...)");
        return (KYPSettings)object;
    }

    public static cp_1 e() {
        cp_1 cp_12 = cp_1.a;
        if (cp_12 == null) {
            cp_12 = new Object();
            AJIOApplication.Companion.getClass();
            UserInformation userInformation = UserInformation.getInstance((Context)AJIOApplication$a.a());
            String string2 = "getInstance(...)";
            Intrinsics.checkNotNullExpressionValue(userInformation, string2);
            cp_1.a = cp_12;
        }
        cp_12 = cp_1.a;
        Intrinsics.checkNotNull(cp_12, "null cannot be cast to non-null type com.ril.ajio.utility.AppUtils");
        return cp_12;
    }

    public static String f(String string2) {
        if (string2 != null) {
            return qz2_0.u(mz3_0.J(string2));
        }
        return qz2_0.z();
    }

    public static void g(AjioTextView ajioTextView, String string2) {
        Intrinsics.checkNotNullParameter(ajioTextView, "view");
        Intrinsics.checkNotNullParameter(string2, "text");
        boolean bl2 = h40_0.a.d1();
        if (bl2 && (bl2 = h40_0.c1())) {
            bl2 = false;
            ajioTextView.setVisibility(0);
            string2 = hv3_0.f(string2);
            ajioTextView.setText(string2);
        }
    }

    public static boolean h() {
        boolean bl2;
        String string2 = "prod";
        Object object = "qa";
        if (string2 != object && string2 != (object = "qaregression")) {
            bl2 = false;
            object = null;
        } else {
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            string2 = "uat_hide_coach_mark";
            bl2 = ((ao0_0)object).a(string2);
        }
        return bl2;
    }

    public static boolean i() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("EnableInternalWalletOnCartAPI");
    }

    public static JSONObject j() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("cart_oos_improvement_json");
    }

    public static boolean k(CartEntry serializable) {
        boolean bl2;
        block12: {
            block11: {
                boolean bl3;
                boolean bl4;
                Boolean bl5;
                Serializable serializable2;
                bl2 = false;
                if (serializable != null && (serializable2 = ((CartEntry)serializable).getConvenienceFee()) != null && (serializable2 = ((ConvenienceFeePriceSplitUp)serializable2).getDelivery()) != null) {
                    serializable2 = ((ConvenienceFeePriceSplitUp$AmountData)serializable2).isFeeCharged();
                    bl5 = Boolean.TRUE;
                    bl4 = Intrinsics.areEqual(serializable2, bl5);
                } else {
                    bl4 = false;
                    serializable2 = null;
                }
                if (bl4) break block11;
                if (serializable != null && (serializable2 = ((CartEntry)serializable).getConvenienceFee()) != null && (serializable2 = ((ConvenienceFeePriceSplitUp)serializable2).getCOD()) != null) {
                    serializable2 = ((ConvenienceFeePriceSplitUp$AmountData)serializable2).isFeeCharged();
                    bl5 = Boolean.TRUE;
                    bl4 = Intrinsics.areEqual(serializable2, bl5);
                } else {
                    bl4 = false;
                    serializable2 = null;
                }
                if (bl4) break block11;
                if (serializable != null && (serializable2 = ((CartEntry)serializable).getConvenienceFee()) != null && (serializable2 = ((ConvenienceFeePriceSplitUp)serializable2).getRVP()) != null) {
                    serializable2 = ((ConvenienceFeePriceSplitUp$AmountData)serializable2).isFeeCharged();
                    bl5 = Boolean.TRUE;
                    bl4 = Intrinsics.areEqual(serializable2, bl5);
                } else {
                    bl4 = false;
                    serializable2 = null;
                }
                if (bl4) break block11;
                bl4 = h40_0.P1();
                if (!bl4) break block12;
                if (serializable != null && (serializable = ((CartEntry)serializable).getConvenienceFee()) != null && (serializable = ((ConvenienceFeePriceSplitUp)serializable).getPriorityDelivery()) != null) {
                    serializable = ((ConvenienceFeePriceSplitUp$AmountData)serializable).isFeeCharged();
                    serializable2 = Boolean.TRUE;
                    bl3 = Intrinsics.areEqual(serializable, serializable2);
                } else {
                    bl3 = false;
                    serializable = null;
                }
                if (!bl3) break block12;
            }
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean l(ArrayList var0) {
        Intrinsics.checkNotNullParameter(var0, "cartEntries");
        var0 = var0.iterator();
        block0: while (true) {
            var1_1 = false;
            var2_2 = null;
            while (var3_3 = var0.hasNext()) {
                var2_2 = (CartEntry)var0.next();
                if (var2_2 != null && (var4_4 = var2_2.getConvenienceFee()) != null && (var4_4 = var4_4.getDelivery()) != null) {
                    var4_4 = var4_4.isFeeCharged();
                    var5_5 = Boolean.TRUE;
                    var3_3 = Intrinsics.areEqual(var4_4, var5_5);
                } else {
                    var3_3 = false;
                    var4_4 = null;
                }
                if (!var3_3) {
                    if (var2_2 != null && (var4_4 = var2_2.getConvenienceFee()) != null && (var4_4 = var4_4.getCOD()) != null) {
                        var4_4 = var4_4.isFeeCharged();
                        var5_5 = Boolean.TRUE;
                        var3_3 = Intrinsics.areEqual(var4_4, var5_5);
                    } else {
                        var3_3 = false;
                        var4_4 = null;
                    }
                    if (!var3_3) {
                        if (var2_2 != null && (var4_4 = var2_2.getConvenienceFee()) != null && (var4_4 = var4_4.getRVP()) != null) {
                            var4_4 = var4_4.isFeeCharged();
                            var5_5 = Boolean.TRUE;
                            var3_3 = Intrinsics.areEqual(var4_4, var5_5);
                        } else {
                            var3_3 = false;
                            var4_4 = null;
                        }
                        if (!var3_3) {
                            if (var2_2 != null && (var4_4 = var2_2.getConvenienceFee()) != null && (var4_4 = var4_4.getRVP()) != null) {
                                var4_4 = var4_4.isFeeCharged();
                                var5_5 = Boolean.TRUE;
                                var3_3 = Intrinsics.areEqual(var4_4, var5_5);
                            } else {
                                var3_3 = false;
                                var4_4 = null;
                            }
                            if (!var3_3) {
                                var3_3 = h40_0.P1();
                                if (!var3_3) continue block0;
                                if (var2_2 != null && (var2_2 = var2_2.getConvenienceFee()) != null && (var2_2 = var2_2.getPriorityDelivery()) != null) {
                                    var2_2 = var2_2.isFeeCharged();
                                    var4_4 = Boolean.TRUE;
                                    var1_1 = Intrinsics.areEqual(var2_2, var4_4);
                                } else {
                                    var1_1 = false;
                                    var2_2 = null;
                                }
                                if (var1_1) ** break;
                                continue block0;
                            }
                        }
                    }
                }
                var1_1 = true;
            }
            break;
        }
        return var1_1;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean m(CartEntry var0) {
        block24: {
            block25: {
                block26: {
                    block23: {
                        block22: {
                            var1_1 = false;
                            if (var0 != null && (var2_2 = var0.getConvenienceFee()) != null && (var2_2 = var2_2.getDelivery()) != null) {
                                var2_2 = var2_2.isFeeCharged();
                                var3_3 = Boolean.FALSE;
                                var4_4 = Intrinsics.areEqual(var2_2, var3_3);
                            } else {
                                var4_4 = false;
                                var2_2 = null;
                            }
                            var5_5 = null;
                            if (var4_4) break block22;
                            if (var0 != null && (var2_2 = var0.getConvenienceFee()) != null && (var2_2 = var2_2.getDelivery()) != null) {
                                var2_2 = var2_2.isFeeCharged();
                            } else {
                                var4_4 = false;
                                var2_2 = null;
                            }
                            if (var2_2 != null) ** GOTO lbl-1000
                        }
                        if (var0 != null && (var2_2 = var0.getConvenienceFee()) != null && (var2_2 = var2_2.getCOD()) != null) {
                            var2_2 = var2_2.isFeeCharged();
                            var6_6 = Boolean.FALSE;
                            var4_4 = Intrinsics.areEqual(var2_2, var6_6);
                        } else {
                            var4_4 = false;
                            var2_2 = null;
                        }
                        if (var4_4) break block23;
                        if (var0 != null && (var2_2 = var0.getConvenienceFee()) != null && (var2_2 = var2_2.getCOD()) != null) {
                            var2_2 = var2_2.isFeeCharged();
                        } else {
                            var4_4 = false;
                            var2_2 = null;
                        }
                        if (var2_2 != null) ** GOTO lbl-1000
                    }
                    if (var0 != null && (var2_2 = var0.getConvenienceFee()) != null && (var2_2 = var2_2.getRVP()) != null) {
                        var2_2 = var2_2.isFeeCharged();
                        var6_6 = Boolean.FALSE;
                        var4_4 = Intrinsics.areEqual(var2_2, var6_6);
                    } else {
                        var4_4 = false;
                        var2_2 = null;
                    }
                    if (!var4_4) {
                        if (var0 != null && (var2_2 = var0.getConvenienceFee()) != null && (var2_2 = var2_2.getRVP()) != null) {
                            var2_2 = var2_2.isFeeCharged();
                        } else {
                            var4_4 = false;
                            var2_2 = null;
                        }
                        ** if (var2_2 == null) goto lbl-1000
                    }
                    ** GOTO lbl-1000
lbl-1000:
                    // 3 sources

                    {
                        var4_4 = false;
                        var2_2 = null;
                        ** GOTO lbl52
                    }
lbl-1000:
                    // 2 sources

                    {
                        var4_4 = true;
                    }
lbl52:
                    // 2 sources

                    var7_7 = h40_0.P1();
                    if (!var7_7) break block24;
                    if (!var4_4) break block25;
                    if (var0 != null && (var2_2 = var0.getConvenienceFee()) != null && (var2_2 = var2_2.getPriorityDelivery()) != null) {
                        var2_2 = var2_2.isFeeCharged();
                        var6_6 = Boolean.FALSE;
                        var4_4 = Intrinsics.areEqual(var2_2, var6_6);
                    } else {
                        var4_4 = false;
                        var2_2 = null;
                    }
                    if (var4_4) break block26;
                    if (var0 != null && (var0 = var0.getConvenienceFee()) != null && (var0 = var0.getPriorityDelivery()) != null) {
                        var5_5 = var0.isFeeCharged();
                    }
                    if (var5_5 != null) break block25;
                }
                var1_1 = true;
            }
            var4_4 = var1_1;
        }
        return var4_4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String n() {
        m80_0.Companion.getClass();
        Object object = m80_0.d;
        if (object == null) return "";
        object = s80_0.valueOf((String)object);
        int[] nArray = cp$a$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        String string2 = ")";
        String string3 = "(";
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 == n4) {
                    n3 = R$string.refundable;
                    object = hv3_0.K(n3);
                    return cP.a(string3, (String)object, string2);
                }
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            n3 = R$string.non_refundable;
            object = hv3_0.K(n3);
            return cP.a(string3, (String)object, string2);
        }
        n3 = R$string.partially_refundable;
        object = hv3_0.K(n3);
        return cP.a(string3, (String)object, string2);
    }

    public static boolean o() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("offer_new_ui_toggle");
    }

    public static boolean p() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("is_customertype_query_passed");
    }

    public static JSONObject q() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("assured_gifts_flags");
    }

    public static boolean r() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_cluster_param");
    }

    public static boolean s() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_revamped_savedUPI");
    }

    public static boolean t() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("egift_card_redemption_flow_enable");
    }

    public static boolean u() {
        m80_0.Companion.getClass();
        return m80_0.c;
    }

    public static boolean v() {
        boolean bl2;
        Boolean bl3;
        boolean bl4;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "ConvenienceFeeConfig";
        int n3 = ((String)(object = ((ao0_0)object).b((String)object2))).length();
        if (!n3) {
            bl4 = false;
            object = null;
        } else {
            object2 = ConvenienceFeeConfig.class;
            object = (ConvenienceFeeConfig)JsonUtils.fromJson((String)object, (Class)object2);
        }
        n3 = 0;
        object2 = null;
        if (object != null) {
            bl3 = ((ConvenienceFeeConfig)object).getMasterFlag();
            Boolean bl5 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(bl3, bl5);
        } else {
            bl2 = false;
            bl3 = null;
        }
        if (bl2) {
            if (object != null) {
                object = ((ConvenienceFeeConfig)object).isConvFeeOrderDetailEnable();
                bl3 = Boolean.TRUE;
                bl4 = Intrinsics.areEqual(object, bl3);
            } else {
                bl4 = false;
                object = null;
            }
            if (!bl4) {
                n3 = 1;
            }
        }
        return n3 != 0;
    }

    public static boolean w() {
        boolean bl2;
        Boolean bl3;
        boolean bl4;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "ConvenienceFeeConfig";
        int n3 = ((String)(object = ((ao0_0)object).b((String)object2))).length();
        if (!n3) {
            bl4 = false;
            object = null;
        } else {
            object2 = ConvenienceFeeConfig.class;
            object = (ConvenienceFeeConfig)JsonUtils.fromJson((String)object, (Class)object2);
        }
        n3 = 0;
        object2 = null;
        if (object != null) {
            bl3 = ((ConvenienceFeeConfig)object).getMasterFlag();
            Boolean bl5 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(bl3, bl5);
        } else {
            bl2 = false;
            bl3 = null;
        }
        if (bl2) {
            if (object != null) {
                object = ((ConvenienceFeeConfig)object).isConvFeeOrderDetailEnable();
                bl3 = Boolean.TRUE;
                bl4 = Intrinsics.areEqual(object, bl3);
            } else {
                bl4 = false;
                object = null;
            }
            if (bl4) {
                n3 = 1;
            }
        }
        return n3 != 0;
    }

    public static boolean x(String string2) {
        if (string2 != null) {
            return Intrinsics.areEqual(string2, "PRODUCTQUALITY");
        }
        return false;
    }

    public static boolean y() {
        boolean bl2;
        Object object = VX0.a(AJIOApplication.Companion);
        if (object != null) {
            object = ((UserInformation)object).getCustomerUUID();
        } else {
            bl2 = false;
            object = null;
        }
        bl2 = TextUtils.isEmpty((CharSequence)object);
        return !bl2;
    }

    public static boolean z(String string2) {
        Object object;
        int n3;
        String string3;
        if (string2 != null) {
            string3 = "@";
            n3 = StringsKt.O(string2, string3, 0, false, 6) + 1;
            string2 = string2.substring(n3);
            object = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object);
        } else {
            string2 = null;
        }
        object = h40_0.a;
        object = h40_0.B();
        string3 = "valid_email_list_ril_employee_benefits";
        n3 = (int)(object.has(string3) ? 1 : 0);
        if (n3 != 0) {
            object = h40_0.B().getJSONArray(string3);
            Intrinsics.checkNotNull(object);
        } else {
            object = new JSONArray();
        }
        return ai0_2.d(string2, (JSONArray)object);
    }
}

